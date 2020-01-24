#include<stdio.h>
int calc_total(int *arr,int size){
	int i=0,sum=0;
	arr[5]=100;
	for(;i<size;i++){
		sum=sum+arr[i];
	}
	return sum;
}

float calc_avg(int arr[10],int size){
	int i=0;
	float sum=0;
	for(;i<size;i++){
		sum=sum+arr[i];
	}
//	printf("%f sum ",sum);
	return  sum/size;
}

int calc_max(int *arr,int size){
	int max,i=0;
	for(max=arr[i];i<size;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}
	return max;
}


int main(){
	int marks[6];
	int i,total,max,min;
	float avg;
	printf("enter the marks of the student");
	for(i=0;i<6;i++){
		scanf("%d",&marks[i]);
	}
	total=calc_total(marks,6);
	avg=calc_avg(marks,6);
	max=calc_max(marks,6);
	printf("Total: %d Max Marks %d : Average Marks %f",total,max,avg);
	return 0;
}
