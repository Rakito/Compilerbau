#include <stdio.h>


int main(char* argv, int* argc)
{
	calcFac();
	return 0;
}

void calcFac()
{
	printf("%d\n", fac(5));
}

int fac(int n)
{
	if (n == 1) return 0;
	if (n == 0) return 1;
	
	return n * fac(n - 1);
}