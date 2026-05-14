class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sublists = new ArrayList<List<String>>();
        int count = 0;
        Map<HashMap<Character, Integer>, Integer> anagramMap = new HashMap<HashMap<Character, Integer>, Integer>();
        for (String s : strs) {
            HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();
            for (char c : s.toCharArray()) {
                letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
            }
            if (!anagramMap.containsKey(letterMap)) {
                anagramMap.put(letterMap, count);
                List<String> list = new ArrayList<String>();
                list.add(s); 
                sublists.add(list);
                count++;           
            } else {
                sublists.get(anagramMap.get(letterMap)).add(s);
            }
        } 
        return sublists;
    }
}
