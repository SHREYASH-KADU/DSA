import java.util.*;
//import java.lang.*;
import java.io.*;
class ComDiv
{
 	static int N =(int) (1e6 +1);
    public static void main(String[] args)throws java.lang.Exception
    {
        FastReader fr = new FastReader();
		BufferedWriter output = new BufferedWriter( new OutputStreamWriter(System.out) );
		
		int [] countDivs = new int[N];
		for(int i = 1; i< N ; i++)
		{
			for(int j= i ; j < N ; j+=i)
			{
                countDivs[j]++;
			}
		}
        int tc = fr.nextInt();
        while (tc-- > 0) 
        {
        	int a = fr.nextInt();
        	int b = fr.nextInt();
        	int num = gcd(a,b);
            output.write(countDivs[num]+ "\n");
        }

        output.flush();
    }
    static int gcd(int a  , int b)
	{
		if(a==0)
		{
			return b;
		}
		return gcd(b%a ,a );
	}
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}