//
// Created by malek on 2/23/22.
//
#include <malloc.h>
#include "nodetree.h"

NodeList *createNodeList() {
    NodeList *returnList = malloc(sizeof(NodeList));
    returnList->listStart = NULL;
    returnList->size = 0;
}

//Excepts a malloced node
NodeList *addItemToNodeList(NodeList *nodeList, Node* node) {
    nodeList->size++;
    nodeList->listStart = realloc(nodeList->listStart, sizeof(Node*)*nodeList->size);
    nodeList->listStart[nodeList->size-1] = node;
}

Node *createNode(Phrase phrase) {
    Node *returnNode = malloc(sizeof(Node));
    returnNode->phrase = phrase;
    returnNode->childNodes = createNodeList();
    return returnNode;
}

NodeList* replaceNodesWithNode(NodeList *nodeList, size_t numToPop, Node *node) {
    //printf("size is : %zu\n", nodeList->size);
    //printf("num to pop is : %zu\n", numToPop);
    for(size_t i = nodeList->size - 1; i >= nodeList->size - numToPop; i--) {
        //printf("i is : %zu\n", i);
        addItemToNodeList(node->childNodes, nodeList->listStart[i]);
        if(i == 0) {
            break;
        }
    }
    nodeList->listStart[nodeList->size-numToPop] = node;
    nodeList->size -= numToPop-1;
    return nodeList;
}

NodeList *popNode(NodeList *nodeList) {
    nodeList->size--;
    return nodeList;
}

NodeList *popNodeN(NodeList *nodeList, size_t amount) {
    nodeList->size -= amount;
    return nodeList;
}



void printNodeTree(Node *node, size_t layerDeep) {
    if(layerDeep != 0) {
        for(int i = 0; i < layerDeep; i++) {
            printf(" |");
        }
        printf("-");
    }
    printf("%s\n", getStrRep(node->phrase));
    for(size_t i = 0; i < node->childNodes->size; i++) {
        printNodeTree(node->childNodes->listStart[i], layerDeep+1);
    }
}
