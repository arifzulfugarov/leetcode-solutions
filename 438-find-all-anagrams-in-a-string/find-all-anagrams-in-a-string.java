class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) return res;

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> pCount = new HashMap<>();

        for (char c : p.toCharArray()) {
            pCount.put(c, pCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < p.length(); i++) {

            char c = s.charAt(i);
            sCount.put(c, sCount.getOrDefault(c, 0) + 1);
        }

        if (sCount.equals(pCount)) res.add(0);

        for (int i = p.length(); i < s.length(); i++) {
            char addChar = s.charAt(i);
            char removeChar = s.charAt(i - p.length());

            sCount.put(addChar, sCount.getOrDefault(addChar, 0) + 1);

            if (sCount.get(removeChar) == 1) {
                sCount.remove(removeChar);
            } else {
                sCount.put(removeChar, sCount.get(removeChar) - 1);
            }

            if (sCount.equals(pCount)) {
                res.add(i - p.length() + 1);
            }

        }

        return res;

    }
}