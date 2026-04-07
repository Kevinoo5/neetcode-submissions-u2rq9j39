class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letters.put(c, letters.getOrDefault(c, 0)+1);
            }
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            Integer cur = letters.get(c);
            if (cur == null || cur == 0) return false;
            letters.put(c, cur - 1);
        }

        return true;
        }
}
