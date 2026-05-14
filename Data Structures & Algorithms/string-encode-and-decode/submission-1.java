class Solution {

    public String encode(List<String> strs) {
        String o = "";
        for (String s : strs) { 
            o += s.length() + ",";
        }
        o += "#";
        for (String s : strs) {
            o += s;
        }

        return o;
    }

    public List<String> decode(String str) {
        List<Integer> lens = new ArrayList<>();
        List<String> o = new ArrayList<>();

        int i = 0;
        while (str.charAt(i) != '#') {
            char c = str.charAt(i);
            String length = "";
            while (c != ',') {
                length += c;
                i++;
                c = str.charAt(i);
            }
            lens.add(Integer.parseInt(length));
            i++;
        }

        i++; 

        for (Integer l : lens) {
            o.add(str.substring(i, i + l));
            i += l;
        }
    
        return o;
    }
}
