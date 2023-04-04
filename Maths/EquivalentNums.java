import java.util.*;
//import java.lang.*;
import java.io.*;

// Given a,b  if a pow x == b pow y for some integer x and y ,
// then a and b is said to be equivalent 
// so print yes or no for given a ,b to check if they are equivalent

class EquivalentNums
{
    static int N = (int)1e6 + 1;
    public static void main(String[] args) throws java.lang.Exception
    {
        FastReader fr = new FastReader();
	    //BufferedWriter output = new BufferedWriter( new OutputStreamWriter(System.out) );
        
        //prime factors
        boolean [] isPrime = new boolean[N];
        int [] hp = new int[N];
        // true=> not prime
        // false => prime
        
        for(int i=2 ; i<N ; i++)
        {
            if(!isPrime[i])
            {
                for(int j = i ; j<N ; j+=i)
                {
                    
                    isPrime[j] = true;
                    hp[j] = i;      
                }
            }
        }
        
        int tc = fr.nextInt();

        while (tc-- > 0) 
        {
            //output.write(tc + "\n");
            int a = fr.nextInt();
            int b = fr.nextInt();
            int A = a;
            int B = b;
            boolean flag = true;
            float ratio = 0.0f;

            HashMap<Integer , Integer> map1 = new HashMap<>();
            HashMap <Integer,Integer> map2 = new HashMap<>();

            while(a > 1)
            {
                int pf = hp[a];
                while((a%pf) == 0)
                {
                    a = a/pf;
                    if(map1.containsKey(pf)==true)
                    {
                        int freq = map1.get(pf)+1;
                        map1.put(pf,freq);
                    }
                    else
                    {
                        map1.put(pf,1);
                    }
                }
            }

            while(b > 1)
            {
                int pf = hp[b];
                while((b%pf) == 0)
                {
                    b = b/pf;
                    if(map2.containsKey(pf)==true)
                    {
                        int freq = map2.get(pf)+1;
                        map2.put(pf,freq);
                    }
                    else
                    {
                        map2.put(pf,1);
                    }
                }
            }
            
            if(A == B)
            {
                flag = true;
            }
            else if(!isPrime[A] && !isPrime[B])
            {
                flag = false;
            }
            else
            {
                if(map1.size() == map2.size())
                {
                    for(int x : map1.keySet())
                    {
                        if(map2.containsKey(x))
                        {
                            if(ratio == 0.0f)
                            {
                                ratio = (float)map1.get(x) / (float)map2.get(x);
                            }
                            else
                            {
                                if( ( (float)map1.get(x) / (float)map2.get(x) ) != ratio )
                                {
                                    flag = false;
                                    break;
                                }
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
                else
                {
                    flag = false;
                }
            }
            
            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
        }

        //output.flush();
    }
    
    static class FastReader {
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
