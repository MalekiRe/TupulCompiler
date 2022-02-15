package idk.node;

import idk.TokenState;

import java.util.List;

public class Node {
    TokenState tokenState;
    Node leftNode;
    List<Node> rightNodes;
    Node (Node tempNode) {
        this.leftNode = tempNode;
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
}
