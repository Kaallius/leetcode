public class _1689 {
    public static class Solution {
        public int minPartitions(String n) {
            // 적어도 가장 큰 digit만큼 더해주어야한다.
            int res = 0;
            for (int i = 0; i < n.length(); i++)
                res = Math.max(res, n.charAt(i) - '0');

            return res;
        }
    }
}

