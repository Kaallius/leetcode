import java.util.HashSet;
import java.util.Set;

public class _771 {
    public static class Solution {
        public int numJewelsInStones(String jewels, String stones) {
            int[] alps = new int[52];
            int count = 0;
            for (int i = 0; i < stones.length(); i++) {
                char ch = stones.charAt(i);
                // ch가 소문자
                if (ch >= 'a' && ch <= 'z')
                    alps[ch - 'a']++;
                    // ch가 대문자
                else if (ch >= 'A' && ch <= 'Z')
                    alps[ch - 'A' + 26]++;
            }

            for (int i = 0; i < jewels.length(); i++) {
                char ch = jewels.charAt(i);
                // ch가 소문자
                if (ch >= 'a' && ch <= 'z')
                    count += alps[ch - 'a'];
                    // ch가 대문자
                else if (ch >= 'A' && ch <= 'Z')
                    count += alps[ch - 'A' + 26];
            }

            return count;

        }
    }
}
