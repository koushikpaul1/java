package test.aptus;
// if the number is equal to sum of its factors 6=1+2+3

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());

            String out_ = properPositiveDivisors(N);
            System.out.println("");
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String properPositiveDivisors(int N){
    	int m=N/2;
    	int res=0;
    	for(int i=1;i<=m;i++) {
    		if (N%i==0) res=res+i;       			
    	}
    	if(res==N)
        return "Yes";
    	else {return "No";}
    }
}