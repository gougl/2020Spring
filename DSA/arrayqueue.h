#ifndef ARRAYQUEUE_H
#define ARRAYQUEUE_H

#include <stdlib.h>
#define Max 10
typedef int elemtype;
typedef struct{
    elemtype *data;
    int rear, front;
    int SIZE;
}arrayqueue;

void initial_queue(arrayqueue *q){
    q->data = (elemtype *)malloc(sizeof(elemtype)*Max);
    q->rear = q->front = 0;
    q->SIZE = Max;
}

void enqueue(arrayqueue *q, elemtype e){
    q->data[q->rear++] = e;
}

elemtype outqueue(arrayqueue *q){
    return q->data[q->front++];
}

void print(){
    ;
}
#endif