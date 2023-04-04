import java.util.*;
//import java.lang.*;
import java.io.*;
class DivisorsSieve
{
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
	    
	static int N =(int) (1e6 +1);
	public static void main (String[] args) throws java.lang.Exception
	{
        FastReader fr = new FastReader();
        ArrayList<ArrayList<Integer>> divisors = new ArrayList<>();
        divisors.add(new ArrayList<>());
		for(int i = 1; i*i<= N ; i++)
		{
			for(int j= i ; j < N ; j+=i)
			{
                divisors.add(new ArrayList<>());
				divisors.get(j).add(i);
			}
		}
        int num = fr.nextInt();
        System.out.println(divisors.get(num));

	}
	
}