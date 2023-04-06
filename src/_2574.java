public class _2574 {
    public static class Solution{
        public int[] leftRightDifference(int[] nums) {
            int[] answer = new int[nums.length];
            int[] left = new int[nums.length];
            int[] right = new int[nums.length];

            int sum = 0;

            for(int i = 0; i < nums.length; i++) {
                left[i] = sum;
                sum += nums[i];
            }

            sum = 0;
            for(int i = nums.length - 1; i >= 0; i--) {
                right[i] = sum;
                sum += nums[i];
            }

            for(int i = 0; i < nums.length; i++)
                answer[i] = Math.abs(left[i] - right[i]);

            return answer;
        }
    }
}
