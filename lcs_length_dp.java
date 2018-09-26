/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int[][] store = new int[101][101];
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0){
		int l1 = s.nextInt();
		int l2 = s.nextInt();
		String in1 = s.next();
		String in2 = s.next();
		 
		for(int i=0;i<l1;i++)
		    for(int j=0;j<l2;j++)
		        store[i][j]=-1;
		int ans = lcs(in1,in2,l1-1,l2-1);
		System.out.println(ans);
		t--;
		}
	}
	public static int lcs(String s1,String s2,int l1,int l2){
	    
	    //base case
	    if(l1==-1 || l2==-1)
	        return 0;
	    //DP
	    else if(store[l1][l2]==-1){
	        if(s1.charAt(l1)==s2.charAt(l2))
	            store[l1][l2] = lcs(s1,s2,l1-1,l2-1)+1;
	        else{
	            store[l1][l2]= Math.max(lcs(s1,s2,l1-1,l2),lcs(s1,s2,l1,l2-1));
	        }
	    }
	    return store[l1][l2];
	}
}

