package idk.node;

import idk.TokenState;

import java.util.ArrayList;
import java.util.List;

import static idk.MainClass2ElectricBoogaloo.*;

public class Node {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";

    TokenState tokenState;
    public String originalString = null;
    public static final Node EMPTY_NODE = new Node(null, null);
    Node leftNode;
    List<Node> rightNodes = new ArrayList<>();
    public Node(Node tempNode, TokenState state) {
        this.leftNode = tempNode;
        this.tokenState = state;
    }
    public Node(Node tempNode, TokenState state, String originalString) {
        this(tempNode, state);
        this.originalString = originalString;
    }

    public void addRightNode(Node tempNode) {
        this.rightNodes.add(tempNode);
    }
    public List<Node> getRightNodes() {
        return rightNodes;
    }
    public Node getLeftNode() {
        return leftNode;
    }
    public TokenState getTokenState() {
        return tokenState;
    }
    public boolean contains(Node node) {
        return leftNode.equals(node) || rightNodes.contains(node);
    }
    public boolean contains(TokenState tokenState) {
        return getTokenState().equals(tokenState);
    }
    public String toString() {
        return ANSI_GREEN + printNodeTree(3) + ANSI_RESET;
    }
    public static String getAnsiBackground(int i) {
        return switch (i % 4) {
            case 0 -> ANSI_BLUE_BACKGROUND;
            case 1 -> ANSI_CYAN_BACKGROUND;
            case 2 -> ANSI_PURPLE_BACKGROUND;
            case 3 -> ANSI_GREEN_BACKGROUND;
            default -> ANSI_RED_BACKGROUND;
        };
    }
    public ArrayList<Node> allChildNodes() {
        if(this.leftNode == null) {
            return null;
        }
        ArrayList<Node> list = new ArrayList<>(rightNodes);
        list.add(leftNode);
        return list;
    }
    public String printNodeTree(int layer) {
        if(this.tokenState == null) {
            return "";
        }
        if(this.leftNode == null || this.leftNode == EMPTY_NODE) {
            if(this.originalString != null) {
                return ANSI_YELLOW + tokenState + ":" + originalString + ANSI_GREEN;
            }
            return ANSI_YELLOW + tokenState + ANSI_GREEN;
        }
        String s = tokenState + ANSI_RESET + getAnsiBackground(layer) + "[" + ANSI_RESET + ANSI_GREEN;
        s += this.leftNode.printNodeTree(layer+1);
        if(this.rightNodes == null || this.rightNodes.size() == 0) {
            return s + ANSI_RESET + getAnsiBackground(layer) + "]" + ANSI_RESET + ANSI_GREEN;
        }
        s += ", ";
        for(int i = 0; i < this.rightNodes.size(); i++) {
                s += this.rightNodes.get(i).printNodeTree(layer+1) + ", ";
        }
        return s + ANSI_RESET + getAnsiBackground(layer) + "]" + ANSI_RESET + ANSI_GREEN;
    }

}
