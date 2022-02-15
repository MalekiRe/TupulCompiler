package idk;

import javax.swing.plaf.synth.SynthUI;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static idk.ParsingState.*;

public class MainClass {
    /*
    FINISHED_VALUE ::= SUM
    SUM ::= SUM - SUM | SUM + SUM
    SUM ::= PRODUCT
    PRODUCT ::= PRODUCT * PRODUCT | PRODUCT/PRODUCT
    PRODUCT ::= VALUE
    VALUE ::= LITERAL_VALUE

    5 + 6 * 7 + 8


    VALUE

    PRODUCT

    PRODUCT +

    SUM +

    SUM + VALUE

    SUM + PRODUCT

    SUM + PRODUCT * VALUE

    SUM + PRODUCT * PRODUCT

    SUM + PRODUCT +

    SUM + SUM +

    SUM + VALUE

    SUM + PRODUCT

    SUM + SUM

    SUM

    FINISHED_VALUE


     */
    //MARKER 1
    static Pattern end = Pattern.compile("\\G(.*)?");

//    static Map<ParsingState, Set<List<ParsingState>>> mapping = new LinkedHashMap<>();
//
//    static Map<ParsingState, Set<List<ParsingState>>> trueMap = new LinkedHashMap<>();
    static {
//        mapping.put(INT_LIT, Set.of(List.of(PRIMITIVE_TYPE)));
//        mapping.put(PRIMITIVE_TYPE, Set.of(List.of(VAR_DEC))); //INCOMPLETE
//        mapping.put(VAR_DEC, Set.of(List.of(CODE_BLOCK))); //INCOMPLETE
//        mapping.put(ID, Set.of(List.of(VAR_DEC))); //INCOMPLETE
//
//
//        trueMap.put(CODE_BLOCK, Set.of(List.of(VAR_DEC)));
//        trueMap.put(VAR_DEC, Set.of(List.of(PRIMITIVE_TYPE, ID)));
//        trueMap.put(PRIMITIVE_TYPE, Set.of(List.of(INT_LIT)));
    }
    //Most cases the first list will be empty, its everything before, the second item is a higher level abstraction of itself and the third item / second list is everything after.
    static Map<ParsingState, Set<Triple<List<ParsingState>, ParsingState, List<ParsingState>>>> mapping = new LinkedHashMap<>();
    static Map<ParsingState, Set<Triple<List<ParsingState>, ParsingState, List<ParsingState>>>> invertedMapping = new LinkedHashMap<>();
    static {
//        mapping.put(INT_LIT, Set.of(new Triple<>(List.of(), PRIMITIVE_TYPE, List.of())));
//        mapping.put(PRIMITIVE_TYPE, Set.of(
//                new Triple<>(List.of(), VAR_DEC, List.of(ID)),
//                new Triple<>(List.of(), VAR_DEC, List.of(VAR_ASSIGNMENT))));
        mapping.put(VAR_ASSIGNMENT, Set.of(Triple.of(List.of(), CODE_BLOCK, List.of(SEMICOLON))));

        for(ParsingState state : mapping.keySet()) {
            invertedMapping.put(state, new HashSet<>());
        }
        for(ParsingState state : mapping.keySet()) {
            for(Triple<List<ParsingState>, ParsingState, List<ParsingState>> anotherTemp : mapping.get(state)) {
                Set<Triple<List<ParsingState>, ParsingState, List<ParsingState>>> mySet = invertedMapping.get(anotherTemp.second());
                if(mySet == null) {
                    System.out.println(anotherTemp.second());
                }
                mySet.add(new Triple<>(anotherTemp.first(), state, anotherTemp.third()));
            }
        }
    }

    static List<Pair<ParsingState, String>> pairList = new ArrayList<>();
    static String input = "int hi = 5 + 6;";
    static Matcher matcher = end.matcher(input);
    public static void main(String[] args) {

        HashMap<ParsingState, ParsingState> connections = new HashMap<>();

        Pair<TokenType, String> pair;
        String input = MainClass.input;
        Matcher matcher = end.matcher(input);
        do {
            pair = getNextToken(matcher);
            if(pair == null) {
                System.out.println("finished");
                break;
            }

            if(pair.second().length() != 0) {
                System.out.println("Token type is : " + pair.first() + ", and it is : " + pair.second());
                //System.out.println("Terminal type is : " + getTerminalType(pair));
            }
        } while(pair.second().length() != 0);
        doThings();
        for(int i = 0; i < pairList.size(); i++) {
            System.out.println(pairList.get(i));
            Stack<ParsingState> stack = new Stack<>();
            Stack<State> stack2 = new Stack<>();
            stack2.push(new State(pairList.get(i).first()));
            stack.push(pairList.get(i).first());
            pairPosToStates.put(i, stack);
            firstRoundPairPosToStates.put(i, stack.peek());
            pairStackMap.put(new Pair<>(i, pairList.get(i).first()), stack2);
            nonParentedNodes.add(Pair.of(i, pairList.get(i).first()));
        }
//        boolean valid = doThing2(0);
//
//        for(int i = 0; i < pairPosToStates.size(); i++) {
//            while (valid && !flag) {
//                valid = doThing2(i);
//            }
//            flag = false;
//        }

        for(int i = 0; i < pairPosToStates.size(); i++) {
            for(int i2 = 0; i2 < pairPosToStates.get(i).size(); i2++) {
                System.out.println(layerAddition(i2+4) + pairPosToStates.get(i).get(i2));
            }
            System.out.println("next");
        }
//        for(int i = 0; i < firstRoundPairPosToStates.size(); i++) {
//            doThing2(i);
//        }
            System.out.println("doing thing4");
            doThing4();
        recursivlyPrintThing(nonParentedNodes.get(0), 0);
    }
    static void setupPrintableTree() {

    }
    static void recursivlyPrintThing(Pair<Integer, ParsingState> thingToPrint, int offset) {
        System.out.println(layerAddition(offset) + thingToPrint);

    }

    static int global = 0;
    static int determineStartPositionOfTriple(Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple) {
        return triple.first().size();
    }
    static void printInvertedMap() {
        for(ParsingState state : invertedMapping.keySet()) {
            System.out.println("printing state : " + state);
            for(Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple : invertedMapping.get(state)) {
                System.out.println(layerAddition(1) + "<triple>");
                System.out.println(layerAddition(1) + "before");
                for(ParsingState state1 : triple.first()) {
                    System.out.println(layerAddition(2) + state1);
                }
                System.out.println(layerAddition(1) + "main : " + triple.second());
                System.out.println(layerAddition(1) + "after");
                for(ParsingState state1 : triple.third()) {
                    System.out.println(layerAddition(2) + state1);
                }
                System.out.println(layerAddition(1) + "</triple>");
            }
        }
    }
//    static Map<Integer, Pair<ParsingState, List<Pair<ParsingState, Integer>>>> newProperTree = new HashMap<>();
//    public static void printNewProperTree()
//        for(Integer val : newProperTree.keySet()) {
//            System.out.println(newProperTree.get(val));
//        }
//    }



//    static Triple<List<ParsingState>, ParsingState, List<ParsingState>> findMatch(ParsingState current, ParsingState above) {
//        for(Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple : invertedMapping.get(above)) {
//            if(triple.second() == current) {
//                return triple;
//            }
//        }
//        return null;
//    }

    public static Map<Pair<Integer, ParsingState>, Pair<Integer, ParsingState>> printableTree = new HashMap<>();

    public static Map<Pair<Integer, ParsingState>, State> pairStateMap = new HashMap<>();
    public static List<Pair<Integer, ParsingState>> nonParentedNodes = new ArrayList<>();
    static Map<Integer, Stack<ParsingState>> pairPosToStates = new HashMap<>();

    static Map<Integer, ParsingState> firstRoundPairPosToStates = new HashMap<>();

    static Map<Pair<Integer, ParsingState>, Stack<State>> pairStackMap = new HashMap<>();

//    public static boolean flag = false;
//    public static Optional<ParsingState> doThing2(int pos) {
//        //We want to get the next level up abstraction
//        return doThing3(pos, firstRoundPairPosToStates.get(pos));
//    }
    public static void doThing4() {
        int pos = 0;
        while(pos != pairList.size()) {
            while(reduce()) {
                System.out.println("current non parent nodes are ");
                for(int i = 0; i < nonParentedNodes.size(); i++) {
                    System.out.println("       nonParent : " + i +" is : " + nonParentedNodes.get(i));
                }
            }
            //Advance
            pos++;
            System.out.println("advancing");
        }
        for(int i = 0; i < nonParentedNodes.size(); i++) {
            System.out.println("non parent node number " + i +" is : " + nonParentedNodes.get(i));
        }
    }

    public static boolean reduce() {
        System.out.println("trying to reduce");
        global++;
        if(global >= 10) {
            System.exit(-1);
        }
        for(int i = 0; i < nonParentedNodes.size(); i++) {
            Pair<Integer, ParsingState> tryThis = nonParentedNodes.get(i);
            if(tryThis.second() == MULTI_CODE_BLOCK) {
                return false;
            }
            if(attemptReduction(tryThis)) {
                return true;
            }
            else {
                System.out.println("failed on : " + tryThis);
            }
        }
        return false;
    }
    public static boolean attemptReduction(Pair<Integer, ParsingState> pair) {
        System.out.println(layerAddition(2) + "attempting reduction");
        Set<Triple<List<ParsingState>, ParsingState, List<ParsingState>>> tripleSet = mapping.get(pair.second());
        Set<Triple<List<ParsingState>, ParsingState, List<ParsingState>>> workingTriples = new HashSet<>();
        for(Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple : tripleSet) {
            if(tripleMatches(pair, triple)) {
                workingTriples.add(triple);
                System.out.println(layerAddition(4) + "working triple is : " + triple);
            }
            if(workingTriples.size() > 1) {
                System.out.println(layerAddition(4) + "unable to determime triple");
                return false;
            }
        }
        if(workingTriples.size() == 1) {
            for(Triple<List<ParsingState>, ParsingState, List<ParsingState>> onlyTriple : workingTriples) {
                State newState = new State(onlyTriple.second());
                //TODO THIS IS THE ISSUE.
                //how do we determine the proper position.
                System.out.println("in working triples");
                removeNonParentNode(pair);
                nonParentedNodes.add(Pair.of(pair.first(), newState.get()));
                System.out.println("in lists");
                pairStateMap.put(Pair.of(pair.first(), pairPosToStates.get(pair.first()).peek()), newState);
                pairPosToStates.get(pair.first()).push(newState.state);
                addToBeforeList(onlyTriple.first(), pair.first(), newState);
                addToAfterList(onlyTriple.third(), pair.first(), newState);
                System.out.println("attempted reduction worked. it was on " + pair + " converting to " + onlyTriple);
                return true;
            }
        }
        if(workingTriples.size() == 0) {
            System.out.println(layerAddition(2) + "error number of possible combos is 0 for " + pair);
            return false;
        }
        return false;
    }
    public static void removeNonParentNode(Pair<Integer, ParsingState> pair) {
        System.out.println("removing non parent node : " + pair);
        nonParentedNodes.remove(pair);
    }
    public static void addToBeforeList(List<ParsingState> beforeList, int pos, State state) {
        if(pos-beforeList.size() < 0) {
            invalid();
            return;
        }
        pos -= 1;
        for(int i = 0; i < beforeList.size(); i++) {
            removeNonParentNode(Pair.of(pos-i, pairPosToStates.get(pos-i).peek()));
            pairStateMap.put(Pair.of(pos-i, pairPosToStates.get(pos-i).peek()), state);
            pairPosToStates.get(pos-i).push(state.state);
        }
    }
    public static void addToAfterList(List<ParsingState> afterList, int pos, State state) {
        if(afterList.size() + pos > pairList.size()) {invalid();
           return;
        }
        pos += 1;
        for(int i = 0; i < afterList.size(); i++) {
            //We can check if it contains the correct thing!
            if(pairPosToStates.get(pos+i).contains(afterList.get(i))) {
                removeNonParentNode(Pair.of(pos+i, pairPosToStates.get(pos-i).peek()));
                pairStateMap.put(Pair.of(pos+i, pairPosToStates.get(pos+i).peek()), state);
                pairPosToStates.get(pos+i).push(state.state);
            }
        }
    }
    public static boolean tripleMatches(Pair<Integer, ParsingState> pair, Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple) {
        System.out.println(layerAddition(6) + "trying " + triple + " for " + pair);
        return checkBeforeList(triple.first(), pair.first()) && checkAfterList(triple.third(), pair.first());
    }
    static boolean checkBeforeList(List<ParsingState> beforeList, int pos) {
        if(pos-beforeList.size() < 0) {
            return false;
        }
        pos -= 1;
        for(int i = 0; i < beforeList.size(); i++) {
            if(!pairPosToStates.get(pos-i).contains(beforeList.get(i))) {
                return false;
            }
        }
        return true;
    }
    static boolean checkAfterList(List<ParsingState> afterList, int pos) {
        if(afterList.size() + pos > pairList.size()) {
            return false;
        }
        pos += 1;
        for(int i = 0; i < afterList.size(); i++) {
            //We can check if it contains the correct thing!
            System.out.println(" position is : " + pos+i + " pairPosStates is : " + pairPosToStates.get(pos+i));
            if(!pairPosToStates.get(pos+i).contains(afterList.get(i))) {
                System.out.println("falseness is for : " + pairPosToStates.get(pos+i));
                return false;
            }
        }
        return true;
    }
//    public static Optional<ParsingState> doThing3(int pos, ParsingState parsingState) {
//        //Our big issue here is figuring out how to combine trees together.
//        Stack<State> states = pairStackMap.get(Pair.of(pos, parsingState));
//        State topOfStackState = states.peek();
//        if(topOfStackState.get() == MULTI_CODE_BLOCK) {
//            System.out.println("Reached MULTI_CODE_BLOCK");
//            return Optional.of(MULTI_CODE_BLOCK);
//        }
//        Set<Triple<List<ParsingState>, ParsingState, List<ParsingState>>> tripleSet = mapping.get(topOfStackState.get());
//        System.out.println("for current state : " + topOfStackState.get());
//        for(Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple : tripleSet) {
//            System.out.println(layerAddition(4) + "abstract state : " + triple.second() + ", adjusted pos : " + determineIntegerKey(pos, triple));
//            ParsingState higherAbstraction = triple.second();
//            List<ParsingState> beforeList = triple.first();
//            List<ParsingState> afterList = triple.third();
//        }
//        return null;
//    }
    //This code will have to determine the literals that make the thing up in order to determine the length.
    public static int determineIntegerKey (int pos, Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple) {
        return pos - determineStartPositionOfTriple(triple);
    }


//    public static boolean doThing2(int pos) {
//
//
//        //In the middle of the triple is the abstractier thing, to the left and right are all the tokens that must be true too.
//        Stack<ParsingState> parsingStates = pairPosToStates.get(pos);
//        //topState is the one we care about and want to check if any of its higher ups are valid.
//        ParsingState topState = parsingStates.peek();
//        //This is the set of all the possible higher abstractions that topState could have.
//        Set<Triple<List<ParsingState>, ParsingState, List<ParsingState>>> tripleSet = mapping.get(topState);
//        //We want to loop through all these abstractions, find one that fits, if it does we return true.
//        //Wait, would this cause errors where two differnet things are totally valid syntax but do differnet things.
//        //TODO::this might break everything which means this way of going about it is bad look at comment above.
//
//        if(topState == MULTI_CODE_BLOCK) {
//            flag = true;
//            return true;
//        }
//
//        if(tripleSet == null) {
//            System.err.println("triple set is null with position : " + pos + ", and top state : " + topState);
//            System.exit(-1);
//            return true;
//        }
//        //System.out.println("doing thing for state : " + topState);
//        for(Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple : tripleSet) {
//            ParsingState higherAbstraction = triple.second();
//            List<ParsingState> beforeList = triple.first();
//            List<ParsingState> afterList = triple.third();
//            //Temporarily we put the current possible higher abstraction on our stack so other logic can see it and be like "yes good"
//            //We remove this if this isn't the proper one.
//            pairPosToStates.get(pos).push(higherAbstraction);
//            boolean beforeListValid = checkBeforeList(beforeList, pos);
//            boolean afterListValid = checkAfterList(afterList, pos);
//            if(beforeListValid && afterListValid) {
//                //TODO::this division hack is hacky and won't work once you get large enough things but in theory we should never reach that.\
//
//                return true;
//            }
//            pairPosToStates.get(pos).pop();
//        }
//
//        return false;
//    }
//    //TODO::IMPLEMENT THIS
//    static boolean checkBeforeList(List<ParsingState> beforeList, int pos) {
//        if(pos-beforeList.size() < 0) {
//            return false;
//        }
//        pos -= 1;
//        for(int i = 0; i < beforeList.size(); i++) {
//            if(pairPosToStates.get(pos-i).contains(beforeList.get(i))) {
//                continue;
//            }
//            if(!doThing2(pos-i)){
//                return false;
//            }
//        }
//        return true;
//    }
//    static boolean checkAfterList(List<ParsingState> afterList, int pos) {
//        if(afterList.size() + pos > pairList.size()) {
//            return false;
//        }
//        pos += 1;
//        for(int i = 0; i < afterList.size(); i++) {
//            //We can check if it contains the correct thing!
//            if(pairPosToStates.get(pos+i).contains(afterList.get(i))) {
//                continue;
//            }
//            //If it doesn't we try to give it every possibility
//            if(!doThing2(pos+i)) {
//                return false;
//            }
//        }
//        return true;
//    }

//    static Map<Pair<ParsingState, String>, ParsingState> pairToStateMap = new HashMap<>();
//    static Map<State, Set<Pair<ParsingState, String>>> stateToManyPairMap = new HashMap<>();
//
//    public static boolean doThings2(int pos) {
//        Pair<ParsingState, String> currentPair = pairList.get(pos);
//        //We get all the possible things it maps too.
//        Set<Triple<List<ParsingState>, ParsingState, List<ParsingState>>> tripleSet = mapping.get(currentPair.first());
//        System.out.println("size is : " + tripleSet.size());
//        for(Triple<List<ParsingState>, ParsingState, List<ParsingState>> triple : tripleSet) {
//            //TODO:: we need to make sure that our current state is added to this list otherwise infinite loop.
//
//            pairToStateMap.put(currentPair, triple.second());
//
//            //First we check if all the tokens beforehand match THIS IS THE ONE THAT JUST DOES CHECKING AND NO SETTING.
//            boolean beforeHandMatch = doesBeforeHandMatch(triple.first(), pos);
//            //Then we check if our current token matches the current state TODO:: possibly unneeded? Actually unneeded am adding it
//            //Then we check if all the tokens after match
//            boolean afterHandMatch = doesAfterHandMatch(triple.third(), pos);
//            System.out.println(triple.second());
//            System.out.println("beforeHandMatches : " + beforeHandMatch);
//            System.out.println("afterHandMatches : " + afterHandMatch);
//            if(beforeHandMatch && afterHandMatch) {
//                return true;
//            }
//            //If assuming the current pair matched up to this thing was false, then we wanna remove it so it doesn't muck everything up.
//            pairToStateMap.remove(currentPair);
//        }
//        return false;
//    }
//    public static boolean doesAfterHandMatch(List<ParsingState> parsingStateList, int pos) {
//        if(parsingStateList.size() + pos > pairList.size()) {
//            return false;
//        }
//        for(int i = 0; i < parsingStateList.size(); i++) {
//            Pair<ParsingState, String> currentPair = pairList.get(pos);
//            //If we have it and it doesn't match, then it can't be true.
//            if(pairToStateMap.containsKey(currentPair)) {
//                if(pairToStateMap.get(currentPair) != parsingStateList.get(i)) {
//                    return false;
//                }
//            }
//            //However, if we don't have it, well we gotta go get it!
//            if(!doThings2(pos + i)) {
//                //And if we get it and it doesn't end up working out, then we know this doesn't work out.
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // Checks if all the tokens match or if they aren't in the list then we figure out what they are.
//    public static boolean doesBeforeHandMatch(List<ParsingState> parsingStateList, int pos) {
//        if(pos-parsingStateList.size() < 0) {
//            return false;
//        }
//        for(int i = parsingStateList.size(); i != 0; i++) {
//            if(i < 0) {
//                System.err.println("hit the back of our tokens, can't be it");
//                return false;
//            }
//            Pair<ParsingState, String> currentPair = pairList.get(pos);
//            if(!pairToStateMap.containsKey(currentPair)) {
//                return false;
//            }
//            if(pairToStateMap.get(currentPair) != parsingStateList.get(i)) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static void doThings() {
        //We can take a token pair, and turn it into its terminal ParsingState.
        //We want to then figure out what next level up it is, for example an 'int' is always primitive type
        //However, some things have multiple, like a primitive type could be a return type or a variable declaration.
        //We assembly a list of the things it could possibly be associated with. Then we look forwards to see which thing it has to be, until we know.
        //Then we do that on the next token.
        //However, the next token could actually be directly associated with one or more of the higher level constructs.
        //This presents an issue, we must figure out a way to store multiple things it is associated with, and add to them.
        //We cannot just use a map, because ParsingState is an enum, and so it is not diff instances of it.
        //TODO:: for now we are going to have a wrapper around ParsingState that is State object.
        Pair<TokenType, String> tempPair;
        while(true) {
            tempPair = getNextToken(matcher);
            if(tempPair == null) {
                System.out.println("finished");
                return;
            }
            pairList.add(new Pair<>(getTerminalType(tempPair), tempPair.second()));
        }

    }
    public static String layerAddition(int layerDown) {
        String s = "";
        for(int i = 0; i < layerDown; i++) {
            s += " ";
        }
        return s;
    }
    static HashMap<String, ParsingState> terminalMap = new HashMap<>();
    static {
        terminalMap.put(";", SEMICOLON);
        terminalMap.put("+", ADD);
        terminalMap.put("-", SUB);
        terminalMap.put("/", DIV);
        terminalMap.put("*", MULTIPLY);
        terminalMap.put("int", INT_LIT);
        terminalMap.put("char", CHAR_LIT);
        terminalMap.put("double", DOUBLE_LIT);
        terminalMap.put("!", NOT_OP);
        terminalMap.put(",", COMMA);
        terminalMap.put("==", EQUALS_EQUALS);
        terminalMap.put("=", EQUALS_LIT);
        terminalMap.put("(", LEFT_PAREN);
        terminalMap.put(")", RIGHT_PAREN);
    }
    public static ParsingState getTerminalType(Pair<TokenType, String> val) {
        if(val.first() == TokenType.ID) {
            return ID;
        }
        if(val.first() == TokenType.VALUE) {
            return LIT_VAL;
        }
        if(terminalMap.containsKey(val.second())) {
            return terminalMap.get(val.second());
        }
        System.err.println("error passed an invalid pair " + val);
        System.exit(-1);
        return null;
    }
    public static boolean doKeywordMatch(ParsingState state, String s) {
        return switch (state) {
            case RETURN_LIT -> s.equals("return");
            case PRIMITIVE_TYPE -> s.equals("int") || s.equals("char") || s.equals("double");
            default -> false;
        };
    }
    static void invalid() {
        System.err.println("encountered invalid token");
        System.exit(-1);
    }
    static Pattern space = Pattern.compile("\\G\\s");
    static Pattern number = Pattern.compile("\\G(\\d+\\.?\\d*)");
    static Pattern string = Pattern.compile("\\G((^\")(.*)(\"$))");
    static Pattern symbol = Pattern.compile("\\G((\\+)|-|==|=|\\*|/|\\{|}|\\(|\\)|!|\\[|]|;)");
    static Pattern keyword = Pattern.compile("\\G(((static)|(public)|(void)|(int)|(char)|(double)|(class)|(function))\\s)");
    static Pattern id = Pattern.compile("\\G[a-zA-Z_][a-zA-Z0-9_]*");
    static Pair<TokenType, String> getNextToken(Matcher mat) {
        mat.usePattern(space);
        mat.find();

        mat.usePattern(string);
        if(mat.find()) return new Pair<>(TokenType.VALUE, mat.group());

        mat.usePattern(number);
        if(mat.find()) return new Pair<>(TokenType.VALUE, mat.group());

        mat.usePattern(symbol);
        if(mat.find()) return new Pair<>(TokenType.SYMBOL, mat.group());

        mat.usePattern(keyword);
        if(mat.find()) return new Pair<>(TokenType.KEYWORD, mat.group().strip());

        mat.usePattern(id);
        if(mat.find()) return new Pair<>(TokenType.ID, mat.group());

        return null;
    }
}
