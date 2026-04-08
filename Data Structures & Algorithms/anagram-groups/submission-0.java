class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> counts = new HashMap<>();
        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String newString = new String(chars);

            counts.putIfAbsent(newString, new ArrayList<>());
            counts.get(newString).add(s);

        }
        return new ArrayList<>(counts.values());
    }
}
