#ifndef MAX_H
#define MAX_H

#include <stdio.h>

int max(int a, int b){
	if(a>=b)
		return a;
	return b;
}

void print(){
    printf("this is from max.h\n");
}

int* getAddress(int *a, int *b){
    if(*a <= *b)
        return a;
    return b;

}

void swap(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}
#endif