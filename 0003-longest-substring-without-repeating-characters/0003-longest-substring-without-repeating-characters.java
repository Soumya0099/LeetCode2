class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int max = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();

        // for (int i = 0; i < n; i++) {
        //     int[] seen = new int[256];
        //     for (int j = i; j < n; j++) {
        //         char c = s.charAt(j);
        //         if (seen[c] == 1) {
        //             break;
        //         } else {
        //             max = Math.max(j - i + 1, max);
        //             seen[c] = 1;
        //         }
        //     }
        // }

        for (int i = 0; i < n; i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max = Math.max(i - left + 1, max);
        }

        return max;

    }
}