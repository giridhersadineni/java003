#include<stdio.h>
int main(){
	int a,b;
	printf("Enter 2 Numbers");
	scanf("%d%d",&a,&b);
	printf("The division of %d by %d is %d leaving remainder %d",a,b,a/b,a%b);
	return 0;
}
