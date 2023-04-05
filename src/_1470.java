public class _1470 {
    public static class Solution {
        // In-Place 알고리즘으로 풀어볼 것
        public int[] shuffle(int[] nums, int n) {
            int[] arr = new int[2 * n];
            int countX = 0;
            int countY = 0;

            for(int i = 0; i < arr.length; i++) {
                if(i % 2 == 0) {
                    arr[i] = nums[countX];
                    countX++;
                }
                else {
                    arr[i] = nums[countY + n];
                    countY++;
                }
            }
            return arr;
        }
    }
}
