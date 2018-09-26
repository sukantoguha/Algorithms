class Solution {
    int store [][];
    public int longestPalindromeSubseq(String s) {
        store = new int[s.length()][s.length()];
        //Arrays.fill(store,-1);
        return lps(s,0,s.length()-1);
    }
    public int lps(String s,int x,int y){
        if(store[x][y]==0){
            if(x==y)
                return store[x][y]=1;
            else if(x+1==y){
                if(s.charAt(x)==s.charAt(y))
                    return store[x][y]=2;
                else
                    return store[x][y]=1;
            } 
            else{
                if(s.charAt(x)==s.charAt(y))
                    return store[x][y] = lps(s,x+1,y-1)+2;
                else{
                    return store[x][y] = Math.max(lps(s,x+1,y),lps(s,x,y-1));
                }
            }
        }
        return store[x][y];
    }
}        }