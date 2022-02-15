package idk;

import idk.node.Node;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static idk.MainClass2ElectricBoogaloo.ReturnState.*;
import static idk.TokenState.*;

public class MainClass2ElectricBoogaloo {
    //MARKER 1
    static Pattern end = Pattern.compile("\\G(.*)?");
    enum ReturnState {
        REDUCE,
        SHIFT,
        ERROR
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //Most cases the first list will be empty, its everything before, the second item is a higher level abstraction of itself and the third item / second list is everything after.
    static Map<TokenState, Set<Triple<List<TokenState>, TokenState, List<TokenState>>>> mapping = new LinkedHashMap<>();
    static Map<TokenState, Set<List<TokenState>>> invertedMap = new LinkedHashMap<>();
    static {
//        mapping.put(INT_LIT, Set.of(new Triple<>(List.of(), PRIMITIVE_TYPE, List.of())));
//        mapping.put(PRIMITIVE_TYPE, Set.of(
//                new Triple<>(List.of(), VAR_DEC, List.of(ID)),
//                new Triple<>(List.of(), VAR_DEC, List.of(VAR_ASSIGNMENT))));
        /*
        Remember that if this doesn't work, we have to code it so it only takes an action when its certian it CAN take an action.
         */
        invertedMap.put(FINISHED_FILE, Set.of(List.of(CODE_BLOCK))); //TODO::doesn't actually work i don't think? is okay for now just doesn't do the whole "can have more than one" thing.
        invertedMap.put(CODE_BLOCK, Set.of(List.of(VAR_ASSIGNMENT, SEMICOLON), List.of(VARIABLE_DEC)));
        invertedMap.put(FINAL_VALUE, Set.of(List.of(SUM)));
        invertedMap.put(SUM, Set.of(List.of(SUM_ADD, SUM), List.of(PRODUCT)));
        invertedMap.put(PRODUCT, Set.of(List.of(PRODUCT_MULTI, PRODUCT), List.of(VALUE)));
        invertedMap.put(SUM_ADD, Set.of(List.of(SUM, ADD_OP)));
        invertedMap.put(PRODUCT_MULTI, Set.of(List.of(PRODUCT, MULTI_OP)));
        invertedMap.put(VALUE, Set.of(List.of(LITERAL_VALUE)));
        invertedMap.put(VARIABLE_DEC, Set.of(List.of(PRIMITIVE_TYPE, ID, SEMICOLON), List.of(PRIMITIVE_TYPE, VAR_ASSIGNMENT, SEMICOLON)));
        invertedMap.put(PRIMITIVE_TYPE, Set.of(List.of(INT_LIT)));
        invertedMap.put(VAR_ASSIGNMENT, Set.of(List.of(ID, EQUALS_LIT, FINAL_VALUE)));

        for(TokenState state : TokenState.values()) {
            mapping.put(state, new LinkedHashSet<>());
        }

        for(TokenState parentState : invertedMap.keySet()) {
            for(List<TokenState> list : invertedMap.get(parentState)) {
                for(int i = 0; i < list.size(); i++) {
                    mapping.get(list.get(i)).add(Triple.of(list.subList(0, i), parentState, list.subList(i+1, list.size())));
                }
            }
        }
        for(TokenState state : mapping.keySet()) {
            System.out.println(state + " : " + mapping.get(state));
        }
    }
    
    static List<Pair<TokenState, String>> pairList = new ArrayList<>();
    static String input = "int hi = 5 + 6 * 10 + 8;";
    static int realMaxLength;
    static Matcher matcher = end.matcher(input);
    static List<Node> nodeList = new ArrayList<>();
    public static void main(String[] args) {
        

        Pair<TokenType, String> pair;
        String input = MainClass2ElectricBoogaloo.input;
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
            Stack<TokenState> stack = new Stack<>();
            Stack<State2> stack2 = new Stack<>();
            stack2.push(new State2(pairList.get(i).first()));
            stack.push(pairList.get(i).first());
            pairPosToStates.put(i, stack);
            firstRoundPairPosToStates.put(i, stack.peek());
            pairStackMap.put(new Pair<>(i, pairList.get(i).first()), stack2);
            nonParentedNodes.add(Pair.of(i, pairList.get(i).first()));
            nodeList.add(new Node(Node.EMPTY_NODE, pairList.get(i).first()));
        }
        realMaxLength = pairPosToStates.size();
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
            System.out.println("doing thing6");
            //doThing4();
//            doThing5();
            //doThing6();
            doThing7();
    }

    public static void printThingsInOrder(int pos) {
        System.out.println(ANSI_BLUE + "printing things of size : " + pos + ANSI_RESET);
        System.out.println("size of nodelist is : " + nodeList.size());
        for(int i = 0; i <= pos; i++) {
            System.out.println(nodeList.get(i));
        }

    }
    public static void doThing7() {
        IntegerWrapper pos = new IntegerWrapper(0);
        ReturnState currentState = ReturnState.REDUCE;
        while(currentState != ReturnState.ERROR) {
            switch (currentState) {
                case SHIFT -> {
                    currentState = acceptToken(pos);
                    printThingsInOrder(pos.integer);
                }
                case REDUCE -> {
//                    globalFlag++;
//                    if(globalFlag == 80) {
//                        return;
//                    }
                    currentState = doReduceLoop(pos);
                    if(currentState != SHIFT) {
                        printThingsInOrder(pos.integer);
                    }
                }
            }
        }
    }
    public static ReturnState doReduceLoop(IntegerWrapper pos) {
        //We priortize shifting over reducing.
        for(int i = 0; i <= pos.integer; i++) {
            switch (tryToReduce(i, pos)) {
                case NEEDS_OTHER_REDUCTION -> {
                    System.out.println("needs other reduction");
                }
                case ERROR -> {
                    System.out.println("error");
                    return ReturnState.ERROR;
                }
                case SUCCESSFUL_REDUCTION -> {
                    System.out.println("succesful reduction");
                    return REDUCE;
                }
                case NEEDS_SHIFT -> {
                    System.out.println("needs shift");
                    return SHIFT;
                }
            }
        }
        return ReturnState.ERROR;
    }

    static ReduceState checkBeforeList(List<TokenState> beforeList, int pos, int max) {
        pos -= 1;
        for (int i = 0; i < beforeList.size(); i++) {
            if (!nodeList.get(pos - i).contains(beforeList.get(i))) {
                return ReduceState.NEEDS_OTHER_REDUCTION;
            }
        }
        return ReduceState.SUCCESSFUL_REDUCTION;
    }
    static ReduceState checkAfterList(List<TokenState> afterList, int pos, int max) {
        pos += 1;
        for(int i = 0; i < afterList.size(); i++) {
            //We can check if it contains the correct thing!
            System.out.println(" position is : " + pos+i + " pairPosStates is : " + nodeList.get(pos+i));
            if(!nodeList.get(pos+i).contains(afterList.get(i))) {
                System.out.println("falseness is for : " + nodeList.get(pos+i));
                return ReduceState.NEEDS_OTHER_REDUCTION;
            }
        }
        return ReduceState.SUCCESSFUL_REDUCTION;
    }
    public static ReduceState tripleMatches(Triple<List<TokenState>, TokenState, List<TokenState>> testTriple, int position, int max) {
        ReduceState beforeReduceState = checkBeforeList(testTriple.first(), position, max);
        if (checkBeforeList(testTriple.first(), position, max) == ReduceState.SUCCESSFUL_REDUCTION) {
            return checkAfterList(testTriple.third(), position, max);
        }
        return beforeReduceState;
    }
    public static ReduceState tryToReduce(int position, IntegerWrapper max) {
        TokenState tokenState = nodeList.get(position).getTokenState();
        Set<Triple<List<TokenState>, TokenState, List<TokenState>>> tripleSet = mapping.get(tokenState);
        //We try to get a working triple, if any one of the triples in the set needs more info, we return that we need more info.
        //Two triples should never accept the entire thing If they do then error, this is an issue with my grammar.
        //If we have exactly one working then we return Reduce, otherwise we tell it Error.
        Triple<List<TokenState>, TokenState, List<TokenState>> workingTriple = null;
        System.out.println(layerAddition(2) + "trying to reduce the state " + tokenState);
        for(Triple<List<TokenState>, TokenState, List<TokenState>> testTriple : tripleSet) {
            //Basically, if we want to do this we need to say that if there are not enough tokens, we know for sure that we need to shift
            //If there are enough tokens, but we don't have a single successful reduction then we need more reduction on other tokens
            //Finally, if it actually works then we want to make sure two of them don't work, cause if two of them work, we want to return that it needs more reduction.
            //We never encounter ReduceState.ERROR here.

            //This is our check for if there are not enough tokens
            System.out.println(layerAddition(10) + "possible mutation is : " + testTriple);
            if(testTriple.third().size() + position > max.integer) {
                return ReduceState.NEEDS_SHIFT;
            }
            //And this is our check for if there are not enough items for before.
            if(position - testTriple.first().size() < 0) {
                continue;
            }
            ReduceState state = tripleMatches(testTriple, position, max.integer);
            if(state == ReduceState.SUCCESSFUL_REDUCTION) {
                if(workingTriple == null) {
                    workingTriple = testTriple;
                }
                else {
                    return ReduceState.NEEDS_OTHER_REDUCTION;
                }
            }
        }
        if(workingTriple != null) {
            //TODO add code to add everything from it to the top of the list.
            addTripleToEverything(workingTriple, position, max);
            return ReduceState.SUCCESSFUL_REDUCTION;
        }

        return ReduceState.NEEDS_OTHER_REDUCTION;
    }
    static int globalFlag = 0;
    enum ReduceState {
        NEEDS_OTHER_REDUCTION,
        SUCCESSFUL_REDUCTION,
        NEEDS_SHIFT,
        ERROR
    }
    public static ReturnState acceptToken(IntegerWrapper pos) {
        pos.integer++;
        if(pos.integer > pairList.size()) {
            return ReturnState.ERROR;
        }
        return ReturnState.REDUCE;
    }
//    public static void doThing6() {
//        int pos = 0;
//        ReturnState returnState = ReturnState.REDUCE;
//        while(returnState != ReturnState.ERROR) {
//            switch (returnState) {
//                case SHIFT -> {
//                    pos++;
//                    returnState = acceptToken(pos);
//                    printThingsInOrder(pos);
//                }
//                case REDUCE -> {
//                    returnState = reduce(pos);
//                    if(returnState == ReturnState.REDUCE) {
//                        printThingsInOrder(pos);
//                    }
//                }
//                default -> throw new IllegalStateException("Unexpected value: " + returnState);
//            }
//        }
//    }
//    public static ReturnState reduce(int max) {
//        ReturnState actualReturnState = ReturnState.ERROR;
//        for(int i = 0; i <= max; i++) {
//            ReturnState state = attemptReduce(i, max);
//            if(state == ReturnState.SHIFT) {
//                System.out.println("reduce needs new token for : " + pairPosToStates.get(i));
//                if(actualReturnState != ReturnState.REDUCE) {
//                    actualReturnState = ReturnState.SHIFT;
//                }
//            }
//            if(state == ReturnState.REDUCE) {
//                System.out.println("reduce worked for : " + pairPosToStates.get(i));
//                actualReturnState = ReturnState.REDUCE;
//            }
//            if(state == ReturnState.ERROR) {
//                //System.out.println("");
//            }
//        }
//        return actualReturnState;
//    }
//    public static ReturnState attemptReduce(int pos, int max) {
//        TokenState tokenState = pairPosToStates.get(pos).peek();
//        Set<Triple<List<TokenState>, TokenState, List<TokenState>>> tripleSet = mapping.get(tokenState);
//
//
//        //We try to get a working triple, if any one of the triples in the set needs more info, we return that we need more info.
//        //Two triples should never accept the entire thing If they do then error, this is an issue with my grammar.
//        //If we have exactly one working then we return Reduce, otherwise we tell it Error.
//
//
//        Triple<List<TokenState>, TokenState, List<TokenState>> workingTriple = null;
//        for(Triple<List<TokenState>, TokenState, List<TokenState>> testTriple : tripleSet) {
//            ReturnState state = tripleMatches(testTriple, pos, max);
//            if(state == ReturnState.SHIFT) {
//                System.out.println(layerAddition(3) + " returning shift from attempted reduce for " + testTriple);
//                return ReturnState.SHIFT;
//            }
//            if(state == ReturnState.REDUCE) {
//                if(workingTriple != null) {
//                    System.out.println(layerAddition(3) + " returning shift because too many options for  " + testTriple);
//                    return ReturnState.SHIFT;
//                }
//                workingTriple = testTriple;
//            }
//            //if its error we just keep going.
//        }
//        if(workingTriple != null) {
//            //TODO add code to add everything from it to the top of the list.
//            addTripleToEverything(workingTriple, pos, max);
//            return ReturnState.REDUCE;
//        }
//        return ReturnState.ERROR;
//    }
//    public static ReturnState tripleMatches(Triple<List<TokenState>, TokenState, List<TokenState>> testTriple, int pos, int max) {
//        if(checkBeforeList(testTriple.first(), pos, max) == ReturnState.REDUCE) {
//            return checkAfterList(testTriple.third(), pos, max);
//        }
//        return ReturnState.ERROR;
//    }
//    static ReturnState checkBeforeList(List<TokenState> beforeList, int pos, int max) {
//        if(pos-beforeList.size() < 0) {
//            return ReturnState.ERROR;
//        }
//        pos -= 1;
//        for(int i = 0; i < beforeList.size(); i++) {
//            if(!pairPosToStates.get(pos-i).contains(beforeList.get(i))) {
//                return ReturnState.ERROR;
//            }
//        }
//        return ReturnState.REDUCE;
//    }
//    static ReturnState checkAfterList(List<TokenState> afterList, int pos, int max) {
//        if(afterList.size() + pos > max) { //TODO might need to be max-1 or max+1 or something i don't know
//            System.out.println(layerAddition(10) + "pos is : " + pos);
//            System.out.println(layerAddition(10) + "afterlist size + pos is : " + (afterList.size()+pos) + " and realMaxLength is : " + realMaxLength + " for : " + pairList.get(pos));
//            if(afterList.size()+pos >= realMaxLength) {
//                return ReturnState.ERROR;
//            }
//            return ReturnState.SHIFT;
//        }
//        pos += 1;
//        for(int i = 0; i < afterList.size(); i++) {
//            //We can check if it contains the correct thing!
//            System.out.println(" position is : " + pos+i + " pairPosStates is : " + pairPosToStates.get(pos+i));
//            if(!pairPosToStates.get(pos+i).contains(afterList.get(i))) {
//                System.out.println("falseness is for : " + pairPosToStates.get(pos+i));
//                return ReturnState.ERROR;
//            }
//        }
//        return ReturnState.REDUCE;
//    }
//    public static ReturnState acceptToken(int pos) {
//        if(pos > pairList.size()) {
//            return ReturnState.ERROR;
//        }
//        return ReturnState.REDUCE;
//    }
//    public static void doThing5() {
//        int pos = 0;
//        printThingsInOrder(0);
//        while(pos < pairList.size()) {
//            while(reduce(pos)) {
//                printThingsInOrder(pos);
//            }
//            System.out.println("accepting new token of : " +  pairPosToStates.get(pos+1).peek());
//            pos++;
//        }
//    }
//    public static boolean reduce(int max) {
//        for(int i = max; i != -1; i--) {
//            if(attemptReduce(i, max)) {
//                System.out.println("reduce worked for : " + pairPosToStates.get(i));
//                return true;
//            }
//        }
//        System.out.println("");
//        return false;
//    }
//    public static boolean attemptReduce(int pos, int max) {
//        //If you have one exactly production
//        TokenState tokenState = pairPosToStates.get(pos).peek();
//        if(containsExactlyOneMatch(tokenState, pos, max)) {
//            return true;
//        }
//        return false;
//    }
//    public static boolean containsExactlyOneMatch(TokenState state, int pos, int max) {
//        Set<Triple<List<TokenState>, TokenState, List<TokenState>>> tripleSet = mapping.get(state);
//        Triple<List<TokenState>, TokenState, List<TokenState>> workingTriple = null;
//        for(Triple<List<TokenState>, TokenState, List<TokenState>> testTriple : tripleSet) {
//            if(tripleMatches(testTriple, pos, max)) {
//                if(workingTriple == null) {
//                    workingTriple = testTriple;
//                } else {
//                    return false;
//                }
//            }
//        }
//        if(workingTriple != null) {
//            //TODO add code to add everything from it to the top of the list.
//            addTripleToEverything(workingTriple, pos, max);
//            return true;
//        }
//        return false;
//    }
    public static void addTripleToEverything(Triple<List<TokenState>, TokenState, List<TokenState>> triple, int pos, IntegerWrapper max) {
        State2 newState = new State2(triple.second());
        System.out.println(ANSI_YELLOW + "adding " + triple + ANSI_RESET);
        Node tempNode = nodeList.get(pos);
        Node newTempNode = new Node(tempNode, triple.second());
        addToBeforeList(newTempNode, triple.first(), pos, newState, max);
        addToAfterList(newTempNode, triple.third(), pos, newState, max);
        int adjustedInt = triple.third().size() > 0 ? triple.third().size()+1 : 0;
        System.out.println("max before : " + max.integer);
        max.integer = max.integer - triple.third().size() - triple.first().size();
        System.out.println("max after : " + max.integer);
        System.out.println(layerAddition(15) + "Sublist is : " + nodeList.subList(pos-triple.first().size(), pos+triple.third().size()));
        nodeList.removeAll(nodeList.subList(pos-triple.first().size(), pos+triple.third().size()));
        nodeList.set(pos-triple.first().size(), newTempNode);
        System.out.println("working triple found was : " + triple + " for : " + pos);
    }
    public static void addToBeforeList(Node node, List<TokenState> beforeList, int pos, State2 state, IntegerWrapper max) {
        if(pos-beforeList.size() < 0) {
            System.out.println("encountering invalid in beforelist");
            callInvalid();
            return;
        }
        pos -= 1;
        for(int i = 0; i < beforeList.size(); i++) {
            node.addRightNode(nodeList.get(pos-i));
        }
        //max.integer = max.integer - beforeList.size();
    }
    public static void addToAfterList(Node node, List<TokenState> afterList, int pos, State2 state, IntegerWrapper max) {
        if(afterList.size() + pos > max.integer) { //TODO might need to be max-1 or max+1 or something i don't know\
            System.out.println("encountering invalid in afterList");
            System.out.println("after list size is : " + afterList.size());
            System.out.println("pos is : " + pos);
            System.out.println("max size is : " + max.integer);
           callInvalid();
           return;
        }
        pos += 1;
        for(int i = 0; i < afterList.size(); i++) {
            node.addRightNode(nodeList.get(pos+i));
        }
        //max.integer = max.integer - afterList.size();
    }
//    public static boolean tripleMatches(Triple<List<TokenState>, TokenState, List<TokenState>> testTriple, int pos, int max) {
//        return checkBeforeList(testTriple.first(), pos, max) && checkAfterList(testTriple.third(), pos, max);
//    }
//    static boolean checkBeforeList(List<TokenState> beforeList, int pos, int max) {
//        if(pos-beforeList.size() < 0) {
//            return false;
//        }
//        pos -= 1;
//        for(int i = 0; i < beforeList.size(); i++) {
//            if(!pairPosToStates.get(pos-i).contains(beforeList.get(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
//    static boolean checkAfterList(List<TokenState> afterList, int pos, int max) {
//        if(afterList.size() + pos > max) { //TODO might need to be max-1 or max+1 or something i don't know
//            return false;
//        }
//        pos += 1;
//        for(int i = 0; i < afterList.size(); i++) {
//            //We can check if it contains the correct thing!
//            System.out.println(" position is : " + pos+i + " pairPosStates is : " + pairPosToStates.get(pos+i));
//            if(!pairPosToStates.get(pos+i).contains(afterList.get(i))) {
//                System.out.println("falseness is for : " + pairPosToStates.get(pos+i));
//                return false;
//            }
//        }
//        return true;
//    }
    static int global = 0;
    static int determineStartPositionOfTriple(Triple<List<TokenState>, TokenState, List<TokenState>> triple) {
        return triple.first().size();
    }
//    static void printInvertedMap() {
//        for(TokenState state : invertedMapping.keySet()) {
//            System.out.println("printing state : " + state);
//            for(Triple<List<TokenState>, TokenState, List<TokenState>> triple : invertedMapping.get(state)) {
//                System.out.println(layerAddition(1) + "<triple>");
//                System.out.println(layerAddition(1) + "before");
//                for(TokenState state1 : triple.first()) {
//                    System.out.println(layerAddition(2) + state1);
//                }
//                System.out.println(layerAddition(1) + "main : " + triple.second());
//                System.out.println(layerAddition(1) + "after");
//                for(TokenState state1 : triple.third()) {
//                    System.out.println(layerAddition(2) + state1);
//                }
//                System.out.println(layerAddition(1) + "</triple>");
//            }
//        }
//    }
//    static Map<Integer, Pair<TokenState, List<Pair<TokenState, Integer>>>> newProperTree = new HashMap<>();
//    public static void printNewProperTree()
//        for(Integer val : newProperTree.keySet()) {
//            System.out.println(newProperTree.get(val));
//        }
//    }



//    static Triple<List<TokenState>, TokenState, List<TokenState>> findMatch(TokenState current, TokenState above) {
//        for(Triple<List<TokenState>, TokenState, List<TokenState>> triple : invertedMapping.get(above)) {
//            if(triple.second() == current) {
//                return triple;
//            }
//        }
//        return null;
//    }

    public static Map<Pair<Integer, TokenState>, Pair<Integer, TokenState>> printableTree = new HashMap<>();

    public static Map<Pair<Integer, TokenState>, State2> pairStateMap = new HashMap<>();
    public static List<Pair<Integer, TokenState>> nonParentedNodes = new ArrayList<>();
    static Map<Integer, Stack<TokenState>> pairPosToStates = new HashMap<>();

    static Map<Integer, TokenState> firstRoundPairPosToStates = new HashMap<>();

    static Map<Pair<Integer, TokenState>, Stack<State2>> pairStackMap = new HashMap<>();

//    public static boolean flag = false;
//    public static Optional<TokenState> doThing2(int pos) {
//        //We want to get the next level up abstraction
//        return doThing3(pos, firstRoundPairPosToStates.get(pos));
//    }
    public static void printNonParentNodesInOrder() {
        Map<Integer, TokenState> tempMap = new HashMap<>();
        for(int i = 0; i < nonParentedNodes.size(); i++) {
            tempMap.put(nonParentedNodes.get(i).first(), nonParentedNodes.get(i).second());
        }
        nonParentedNodes.clear();
        for(int i = 0; i < tempMap.size(); i++) {
            nonParentedNodes.add(Pair.of(i, tempMap.get(i)));
            System.out.println("non parent node number " + i +" is : " + nonParentedNodes.get(i));
        }
    }
//    public static void doThing4() {
//        int pos = 0;
//        while(pos != pairList.size()) {
//            while(reduce()) {
//                System.out.println("current non parent nodes are ");
//                printNonParentNodesInOrder();
//            }
//            //Advance
//            pos++;
//            System.out.println("advancing");
//        }
//        printNonParentNodesInOrder();
//    }
//
//    public static boolean reduce() {
//        System.out.println("trying to reduce");
//        global++;
//        if(global >= 10) {
//            System.exit(-1);
//        }
//        for(int i = 0; i < nonParentedNodes.size(); i++) {
//            Pair<Integer, TokenState> tryThis = nonParentedNodes.get(i);
//            if(tryThis.second() == FINISHED_FILE) {
//                return false;
//            }
//            if(attemptReduction(tryThis)) {
//                return true;
//            }
//            else {
//                System.out.println("failed on : " + tryThis);
//            }
//        }
//        return false;
//    }
//    public static boolean attemptReduction(Pair<Integer, TokenState> pair) {
//        System.out.println(layerAddition(2) + "attempting reduction for " + pair);
//        Set<Triple<List<TokenState>, TokenState, List<TokenState>>> tripleSet = mapping.get(pair.second());
//        Set<Triple<List<TokenState>, TokenState, List<TokenState>>> workingTriples = new HashSet<>();
//        for(Triple<List<TokenState>, TokenState, List<TokenState>> triple : tripleSet) {
//            if(tripleMatches(pair, triple)) {
//                workingTriples.add(triple);
//                System.out.println(layerAddition(4) + "working triple is : " + triple);
//            }
//            if(workingTriples.size() > 1) {
//                System.out.println(layerAddition(4) + "unable to determime triple");
//                return false;
//            }
//        }
//        if(workingTriples.size() == 1) {
//            for(Triple<List<TokenState>, TokenState, List<TokenState>> onlyTriple : workingTriples) {
//                State2 newState = new State2(onlyTriple.second());
//                //TODO THIS IS THE ISSUE.
//                //how do we determine the proper position.
//                System.out.println("in working triples");
//                removeNonParentNode(pair);
//                nonParentedNodes.add(Pair.of(pair.first(), newState.get()));
//                System.out.println("in lists");
//                pairStateMap.put(Pair.of(pair.first(), pairPosToStates.get(pair.first()).peek()), newState);
//                pairPosToStates.get(pair.first()).push(newState.state);
//                addToBeforeList(onlyTriple.first(), pair.first(), newState);
//                addToAfterList(onlyTriple.third(), pair.first(), newState);
//                System.out.println("attempted reduction worked. it was on " + pair + " converting to " + onlyTriple);
//                return true;
//            }
//        }
//        if(workingTriples.size() == 0) {
//            System.out.println(layerAddition(2) + "error number of possible combos is 0 for " + pair);
//            return false;
//        }
//        return false;
//    }
//    public static void removeNonParentNode(Pair<Integer, TokenState> pair) {
//        System.out.println("removing non parent node : " + pair);
//        nonParentedNodes.remove(pair);
//    }
//    public static void addToBeforeList(List<TokenState> beforeList, int pos, State2 state) {
//        if(pos-beforeList.size() < 0) {
//            invalid();
//            return;
//        }
//        pos -= 1;
//        for(int i = 0; i < beforeList.size(); i++) {
//            removeNonParentNode(Pair.of(pos-i, pairPosToStates.get(pos-i).peek()));
//            pairStateMap.put(Pair.of(pos-i, pairPosToStates.get(pos-i).peek()), state);
//            pairPosToStates.get(pos-i).push(state.state);
//        }
//    }
//    public static void addToAfterList(List<TokenState> afterList, int pos, State2 state) {
//        if(afterList.size() + pos > pairList.size()) {invalid();
//           return;
//        }
//        pos += 1;
//        for(int i = 0; i < afterList.size(); i++) {
//            //We can check if it contains the correct thing!
//            if(pairPosToStates.get(pos+i).contains(afterList.get(i))) {
//                removeNonParentNode(Pair.of(pos+i, pairPosToStates.get(pos-i).peek()));
//                pairStateMap.put(Pair.of(pos+i, pairPosToStates.get(pos+i).peek()), state);
//                pairPosToStates.get(pos+i).push(state.state);
//            }
//        }
//    }
//    public static boolean tripleMatches(Pair<Integer, TokenState> pair, Triple<List<TokenState>, TokenState, List<TokenState>> triple) {
//        System.out.println(layerAddition(6) + "trying " + triple + " for " + pair);
//        return checkBeforeList(triple.first(), pair.first()) && checkAfterList(triple.third(), pair.first());
//    }
//    static boolean checkBeforeList(List<TokenState> beforeList, int pos) {
//        if(pos-beforeList.size() < 0) {
//            return false;
//        }
//        pos -= 1;
//        for(int i = 0; i < beforeList.size(); i++) {
//            if(!pairPosToStates.get(pos-i).contains(beforeList.get(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
//    static boolean checkAfterList(List<TokenState> afterList, int pos) {
//        if(afterList.size() + pos > pairList.size()) {
//            return false;
//        }
//        pos += 1;
//        for(int i = 0; i < afterList.size(); i++) {
//            //We can check if it contains the correct thing!
//            System.out.println(" position is : " + pos+i + " pairPosStates is : " + pairPosToStates.get(pos+i));
//            if(!pairPosToStates.get(pos+i).contains(afterList.get(i))) {
//                System.out.println("falseness is for : " + pairPosToStates.get(pos+i));
//                return false;
//            }
//        }
//        return true;
//    }
//    public static Optional<TokenState> doThing3(int pos, TokenState TokenState) {
//        //Our big issue here is figuring out how to combine trees together.
//        Stack<State> states = pairStackMap.get(Pair.of(pos, TokenState));
//        State topOfStackState = states.peek();
//        if(topOfStackState.get() == MULTI_CODE_BLOCK) {
//            System.out.println("Reached MULTI_CODE_BLOCK");
//            return Optional.of(MULTI_CODE_BLOCK);
//        }
//        Set<Triple<List<TokenState>, TokenState, List<TokenState>>> tripleSet = mapping.get(topOfStackState.get());
//        System.out.println("for current state : " + topOfStackState.get());
//        for(Triple<List<TokenState>, TokenState, List<TokenState>> triple : tripleSet) {
//            System.out.println(layerAddition(4) + "abstract state : " + triple.second() + ", adjusted pos : " + determineIntegerKey(pos, triple));
//            TokenState higherAbstraction = triple.second();
//            List<TokenState> beforeList = triple.first();
//            List<TokenState> afterList = triple.third();
//        }
//        return null;
//    }
    //This code will have to determine the literals that make the thing up in order to determine the length.
    public static int determineIntegerKey (int pos, Triple<List<TokenState>, TokenState, List<TokenState>> triple) {
        return pos - determineStartPositionOfTriple(triple);
    }


//    public static boolean doThing2(int pos) {
//
//
//        //In the middle of the triple is the abstractier thing, to the left and right are all the tokens that must be true too.
//        Stack<TokenState> TokenStates = pairPosToStates.get(pos);
//        //topState is the one we care about and want to check if any of its higher ups are valid.
//        TokenState topState = TokenStates.peek();
//        //This is the set of all the possible higher abstractions that topState could have.
//        Set<Triple<List<TokenState>, TokenState, List<TokenState>>> tripleSet = mapping.get(topState);
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
//        for(Triple<List<TokenState>, TokenState, List<TokenState>> triple : tripleSet) {
//            TokenState higherAbstraction = triple.second();
//            List<TokenState> beforeList = triple.first();
//            List<TokenState> afterList = triple.third();
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
//    static boolean checkBeforeList(List<TokenState> beforeList, int pos) {
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
//    static boolean checkAfterList(List<TokenState> afterList, int pos) {
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

//    static Map<Pair<TokenState, String>, TokenState> pairToStateMap = new HashMap<>();
//    static Map<State, Set<Pair<TokenState, String>>> stateToManyPairMap = new HashMap<>();
//
//    public static boolean doThings2(int pos) {
//        Pair<TokenState, String> currentPair = pairList.get(pos);
//        //We get all the possible things it maps too.
//        Set<Triple<List<TokenState>, TokenState, List<TokenState>>> tripleSet = mapping.get(currentPair.first());
//        System.out.println("size is : " + tripleSet.size());
//        for(Triple<List<TokenState>, TokenState, List<TokenState>> triple : tripleSet) {
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
//    public static boolean doesAfterHandMatch(List<TokenState> TokenStateList, int pos) {
//        if(TokenStateList.size() + pos > pairList.size()) {
//            return false;
//        }
//        for(int i = 0; i < TokenStateList.size(); i++) {
//            Pair<TokenState, String> currentPair = pairList.get(pos);
//            //If we have it and it doesn't match, then it can't be true.
//            if(pairToStateMap.containsKey(currentPair)) {
//                if(pairToStateMap.get(currentPair) != TokenStateList.get(i)) {
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
//    public static boolean doesBeforeHandMatch(List<TokenState> TokenStateList, int pos) {
//        if(pos-TokenStateList.size() < 0) {
//            return false;
//        }
//        for(int i = TokenStateList.size(); i != 0; i++) {
//            if(i < 0) {
//                System.err.println("hit the back of our tokens, can't be it");
//                return false;
//            }
//            Pair<TokenState, String> currentPair = pairList.get(pos);
//            if(!pairToStateMap.containsKey(currentPair)) {
//                return false;
//            }
//            if(pairToStateMap.get(currentPair) != TokenStateList.get(i)) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static void doThings() {
        //We can take a token pair, and turn it into its terminal TokenState.
        //We want to then figure out what next level up it is, for example an 'int' is always primitive type
        //However, some things have multiple, like a primitive type could be a return type or a variable declaration.
        //We assembly a list of the things it could possibly be associated with. Then we look forwards to see which thing it has to be, until we know.
        //Then we do that on the next token.
        //However, the next token could actually be directly associated with one or more of the higher level constructs.
        //This presents an issue, we must figure out a way to store multiple things it is associated with, and add to them.
        //We cannot just use a map, because TokenState is an enum, and so it is not diff instances of it.
        //TODO:: for now we are going to have a wrapper around TokenState that is State object.
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
    static HashMap<String, TokenState> terminalMap = new HashMap<>();
    static {
        terminalMap.put(";", SEMICOLON);
        terminalMap.put("+", ADD_OP);
//        terminalMap.put("-", SUB_OP);
//        terminalMap.put("/", DIV_OP);
        terminalMap.put("*", MULTI_OP);
        terminalMap.put("int", INT_LIT);
//        terminalMap.put("char", CHAR_LIT);
//        terminalMap.put("double", DOUBLE_LIT);
//        terminalMap.put("!", NOT_OP);
//        terminalMap.put(",", COMMA);
//        terminalMap.put("==", EQUALS_EQUALS);
        terminalMap.put("=", EQUALS_LIT);
//        terminalMap.put("(", LEFT_PAREN);
//        terminalMap.put(")", RIGHT_PAREN);
    }
    public static TokenState getTerminalType(Pair<TokenType, String> val) {
        if(val.first() == TokenType.ID) {
            return ID;
        }
        if(val.first() == TokenType.VALUE) {
            return LITERAL_VALUE;
        }
        if(terminalMap.containsKey(val.second())) {
            return terminalMap.get(val.second());
        }
        System.err.println("error passed an invalid pair " + val);
        System.exit(-1);
        return null;
    }
    public static boolean doKeywordMatch(TokenState state, String s) {
        return switch (state) {
            case PRIMITIVE_TYPE -> s.equals("int") || s.equals("char") || s.equals("double");
            default -> false;
        };
    }
    static void callInvalid() {
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
