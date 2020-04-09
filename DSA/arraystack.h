#ifndef ARRAYSTACK_H
#define ARRAYSTACK_H
#include <stdlib.h>
#define CAP 10
typedef int elemtype;
typedef struct 
{
    elemtype *data;
    int top; // only operate at the position 'top'
    int SIZE;
}arraystack;

void initial_stack(arraystack *s){
    s->data = (elemtype *)malloc(sizeof(elemtype)*CAP);
    s->top = 0;
    s->SIZE = CAP;
}

int isEmpty(arraystack *s){
    if(s->top==0)
        return 1;
    return 0;
}

void push(arraystack *s, elemtype e){
    if(s->top >= s->SIZE) //robust
        return;
    s->data[s->top++] = e;
    // s->data[s->top] = e; top++;
}

elemtype pop(arraystack *s){

    return s->data[--s->top];
    // --s->top ; return s->data[s->top];
}

elemtype peek(arraystack *s){
    return s->data[s->top-1];
}

#endif