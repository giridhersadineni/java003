#include<stdio.h>
int calc_total(int m1,int m2,int m3,int m4){
	return m1+m2+m3+m4;
}

float calc_avg(int m1,int m2,int m3,int m4){
	return (m1+m2+m3+m4)/4;
}

int calc_max(int m1,int m2,int m3,int m4){
	int big=m1;
	if(m2>big)
	big=m2;
	if(m3>big)
	big=m3;
	if(m4>big)
	big=m4;
	return m4;
}


int main(){
	int a,b,c,d;
	int total,max,min;
	float avg;
	printf("enter the marks of the student");
	scanf("%d%d%d%d",&a,&b,&c,&d);
	total=calc_total(a,b,c,d);
	max=calc_max(a,b,c,d);
	avg=calc_avg(a,b,c,d);
	printf("Total: %d Max Marks %d : Average Marks %f",total,max,avg);
	return 0;
}
