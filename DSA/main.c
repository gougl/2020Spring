#include <stdio.h>
#include <stdlib.h>
#include "max.h"
#include "arraylist.h"
typedef int elemtype;
typedef struct {
	char *name;
	int *test;
	int sex;
	double height;
	double weight;
}person;
int main(){
	person p1,p2;
	// 结构体内的指针，是否分配空间
	p1.test = (int *)malloc(sizeof(int));
	*p1.test = 10;

	person *ptr_struct = &p1;
	printf("%d\n",*ptr_struct->test);

	// 结构体指针的使用
	person *ptr2_stru = (person *)malloc(sizeof(person));
	ptr2_stru->sex = 1;
	ptr2_stru->test = (int *)malloc(sizeof(int));
	*ptr2_stru->test = 20;
	printf("%d\n",*ptr2_stru->test);

	printf("first program!\n");
	int a = 5, b=7;
	swap(&a,&b);
	printf("%d,%d\n", a,b);
	int *t = getAddress(&a,&b);
	printf("%d\n", *t);
	print();

	//int room;
	//printf("%d\n",sizeof(double));
	// 动态生成数组
	// 指针变量， 动态分配内存
	//int *p = (int *)malloc(sizeof(int) * 10);

	//p = (int *)realloc(p, sizeof(int) * 20);
	//静态数组，数组名，常量
	//int arr[10];
	//wrong 
	// arr = realloc()
	//printf("%d\n%d\n",p[0],p[1]);

	//动态生成二维数组
	// int TwoDarray[3][3];
	// int row =3, col = 5;
	// int **twoD = (int **)malloc(sizeof(int*) * row);
	// for(int i=0;i<row;i++)
	// 	twoD[i] = (int *) malloc(sizeof(int) * col);



	// sqlist
	sqlist sa;
	initial_sqlist(&sa);
	insert_sqlist(&sa, 0, 1);
	insert_sqlist(&sa, 0, 2);
	insert_sqlist(&sa, 0, 3);	
	display_sqlist(sa);
	printf("the deleted elem is :%d\n", del_sqlist(&sa, 0));
	display_sqlist(sa);
	printf("find 3 is or not: %d\n ", search_sqlist(sa, 3));
	return 0;
	
}

// 不要将所有函数写在同一个文件中
// int *a; *a =4;
// 动态数组和静态数组，区别
// 指针和函数，参数，返回值
// 增删改查
