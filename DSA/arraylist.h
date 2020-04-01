#ifndef ARRAYLIST_H
#define   ARRAYLIST_H
#include <stdio.h>
#define Max 10
typedef int elemtype;
typedef struct {
    elemtype *data;
    int length;
    int CAP;
}sqlist;

void initial_sqlist(sqlist *sl){
    sl->data = (elemtype *)malloc(sizeof(elemtype)*Max);
    sl->length = 0;
    sl->CAP = Max;
}

void insert_sqlist(sqlist *sl, int pos, elemtype e){
    // 假设pos位置是 0 开始的

    // pos 合法性 检测 pos<0 pos>length+1
    // length >= cap
    // length == 0 one-off-error 0-based, 1-based
    for(int i = sl->length; i>=pos; i--)
        sl->data[i+1] = sl->data[i];
    sl->data[pos] = e;
    sl->length++;
}


void display_sqlist(sqlist sl){
    for(int i=0; i< sl.length; i++){
        printf("%d\t",sl.data[i]);
    }
    printf("\n");
}

elemtype del_sqlist(sqlist *sl, int pos){
    elemtype e = sl->data[pos];
    for(int i=pos; i<sl->length; i++)
        sl->data[i] = sl->data[i+1];
    sl->length--;
    return e;
}

int search_sqlist(sqlist sl, elemtype e){
    for(int i=0;i<sl.length; i++)
        if( sl.data[i] == e)
            return 1;

    return 0;
}

#endif