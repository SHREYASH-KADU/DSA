/*
6
     1
    121
   12321
  1234321
 123454321
12345654321

*/

#include <iostream>

using namespace std;

int main()
{
	int n;
	cin>>n;
	
	for(int i =1 ; i<=n ; i++)
	{
		for(int j=1; j<=n-i;j++)
		{
			cout<<" ";
		}
		for(int k=1; k<=i ;k++)
		{
			cout<<k;
		}
		for(int k= i-1; k>0 ;k--)
		{
			cout<<k;
		}
		for(int j=1; j<=n-i;j++)
		{
			cout<<" ";
		}
		cout<<endl;	
	} 
	return 0;
}

