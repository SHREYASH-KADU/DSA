/*
6
F
E F
D E F
C D E F
B C D E F
A B C D E F
*/

#include <iostream>

using namespace std;

int main()
{
	int n;
	cin>>n;
	
	for(int i =1 ; i<=n ; i++)
	{
		for(int j=1; j<=i;j++)
		{
			char ch = 'A' + n-i + j-1;
			cout<<ch<<" ";
		}
		cout<<endl;	
	} 

	return 0;
}

