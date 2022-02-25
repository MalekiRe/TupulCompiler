//
// Created by malek on 2/23/22.
//

#ifndef MLANG_NODETREE_H
#define MLANG_NODETREE_H

#include "phrase.h"

typedef struct nodeList NodeList;
typedef struct nodeObj Node;
struct nodeObj {
    Phrase phrase;
    NodeList *childNodes;

};

struct nodeList {
    Node** listStart;
    size_t size;
};
Node *createNode(Phrase phrase);
NodeList *addItemToNodeList(NodeList *nodeList, Node* node);
NodeList *popNode(NodeList *nodeList);
NodeList *popNodeN(NodeList *nodeList, size_t amount);
NodeList *createNodeList();
NodeList* replaceNodesWithNode(NodeList *nodeList, size_t numToPop, Node *node);
void printNodeTree(Node *node, size_t layerDeep);
#endif //MLANG_NODETREE_H
