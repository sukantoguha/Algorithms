//168. Excel Sheet Column Title
class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        
        int div = n;
        //reverse sb at the end, so add this mod element to start of string np np
        
        while(div>0){
            //this div--
            div--;
            int mo = div%26+'A';
            char mod = (char)mo;
            //System.out.println(mo);
            //System.out.println(mod);
            sb.append(mod);
            div = div/26;
        }
        //System.out.println(div);
        return sb.reverse().toString();
    }
}