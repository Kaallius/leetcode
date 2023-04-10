public class _2413 {
    public static class Solution {
        public int smallestEvenMultiple(int n) {
            // 양의 정수 n이 주어질 때 2와 n의 최소공배수를 구하시오.
            // 비트 연산자로 푼 경우도 있다.
            // return n << (n & 1);
            // return n << 1 // 홀수인 경우
            // return n << 0 // 짝수인 경우
            return (n % 2 == 0) ? n : 2 * n;
        }
    }
}
