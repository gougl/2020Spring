#ifndef LINKEDLIST_H
#define LINKEDLIST_H
#include <stdio.h>
#include <stdlib.h>
typedef int elemtype;
typedef struct node{
    elemtype data;
    struct node *next;
}linkedlist;

void initial_linkedlist(linkedlist *ls){
    ls->next = NULL;
}

void insert_head(linkedlist *ls, elemtype e){
    linkedlist *s = (linkedlist *)malloc(sizeof(linkedlist));
    s->data = e;

    s->next = ls->next;
    ls->next = s;

}

void display_linkedlist(linkedlist ls){
    linkedlist *p = ls.next;
    while(p){
        printf("%d\t",p->data);
        p = p->next;
    }
}

elemtype del_head(linkedlist *ls){
    linkedlist *p = ls->next;
    ls->next = ls->next->next;
    return p->data;
}

#endif