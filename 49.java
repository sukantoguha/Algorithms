//Goood for practising how maps work
// Imp concept - store the sorted string as key in Map
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> ans = new ArrayList<>();
        HashMap <String,List<String>> map = new HashMap<>();
        for(String x:strs){
            char c[] = x.toCharArray();
            Arrays.sort(c);
            String temp = String.valueOf(c);
            if(!map.containsKey(temp))
                map.put(temp,new ArrayList<String>());
            map.get(temp).add(x);
        }
        return new ArrayList<List<String>>(map.values());
     
    }
}