class Solution {
    public static String sortStr(String s) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        return new String(ss);
    }
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String i : string_list) {
            String key = sortStr(i);
            if(map.containsKey(key)){
                map.get(key).add(i);
            }
            else{
                ArrayList<String> arr = new ArrayList<>();
                arr.add(i);
                map.put(key, arr);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(ArrayList<String> aa : map.values()) {
            ans.add(aa);
        }
        return ans;
    }
}
