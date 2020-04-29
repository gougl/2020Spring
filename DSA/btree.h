#ifndef BTREE_H
#define BTREE_H
#include <stdio.h>
#include <stdlib.h>
// node include: *lchild, data, *rchild;
typedef int elemtype;
typedef struct bnode{
    elemtype data;
    struct bnode *lchild, *rchild;
}btnode;

//initial a binary tree
void initialize_leafnode(btnode *bt, int data){
    bt->data = data;
    bt->lchild = NULL;
    bt->rchild = NULL;
}

void set_lchild(btnode *bt, int data){
    if(bt->lchild){
        printf("current node's left child is exists\n");
        return;
    }
    btnode *lchild = (btnode *)malloc(sizeof(btnode));
    lchild->data = data;
    lchild->lchild = NULL;
    lchild->rchild = NULL;
    bt->lchild = lchild;

}

void set_rchild(btnode *bt, int data){
     if(bt->rchild){
        printf("current node's right child is exists\n");
        return;
    }
    btnode *rchild = (btnode *)malloc(sizeof(btnode));
    rchild->data = data;
    rchild->lchild = NULL;
    rchild->rchild = NULL;
    bt->rchild = rchild;
   
}

void preorder(btnode *t){
    if(t){
        printf("%d\t", t->data);
        preorder(t->lchild);
        preorder(t->rchild);
    }
}

void inorder(btnode *t){
    if(t){
        inorder(t->lchild);
        printf("%d\t", t->data);
        inorder(t->rchild);
    }
}

void postorder(btnode *t){
    if(t){
        postorder(t->lchild);
        postorder(t->rchild);
        printf("%d\t",t->data);
    }
}

btnode* create_btree(){
    btnode *t = (btnode *)malloc(sizeof(btnode));
    elemtype data;
    scanf("%d", &data);
    if(data == 0)
        t = NULL;
    else{
        t->data = data;
        t->lchild = create_btree();
        t->rchild = create_btree();
    }
    return t;
}

// count_leaf
// lchild == rchild == null

int count_leaf(btnode *bt){
    
    if(bt == NULL)
        return 0;
    if(bt->lchild == NULL && bt->rchild == NULL)
        return 1;
    else{
        return count_leaf(bt->lchild) + count_leaf(bt->rchild);
    }
    
}

// level
int level(btnode *bt){
    int m, n;
    if(!bt)
        return 0;
    else{
        m = level(bt->lchild);
        n = level(bt->rchild);
        return (m>=n)? m+1 : n+1;
    }
}

#endif