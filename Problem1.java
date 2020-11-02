/**
 *  Time Complexity: O(S.length + T.length)
 *  Space Complexity: O(T.length)
 */

class Solution {
    public String customSortString(String S, String T) {
        int[] bucket = new int[26];
        for (char c : T.toCharArray()) {
            bucket[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            for (int i = 0; i < bucket[c - 'a']; i++) {
                sb.append(c);
            }
            bucket[c - 'a'] = 0;
        }
        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                sb.append((char) (i + 'a'));
            }
        }
        
        return sb.toString();
    }
}