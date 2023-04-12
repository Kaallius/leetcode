public class _2396 {
    public static class Solution {
        public boolean isStrictlyPalindromic(int n) {

            for(int i = 2; i <= n-2; i++) {
                int tmp = n; // 2 ~ n-2 진수로 표현한 n을 구하기 위함
                String chkNum = "";
                while(tmp != 0) {
                    chkNum = (tmp % i) + chkNum;
                    tmp /= i;
                }

                for(int j=0; j <= (chkNum.length()-1) / 2; j++) {
                    if(chkNum.charAt(j) != chkNum.charAt(chkNum.length()-1 -j))
                        return false; // 팰린드롬이 아닌 경우 false 반환
                }
            }

            return true;
        }
    }
}

// n이 strictly palindromic 이려면 2 ~ n-2 진법으로 나타낸 n이 모두 팰린드롬이어야한다.
// 처음 생각한 방식.
// 1. n을 2 ~ n-2 진법으로 변환
// 2. 변환한 값이 팰린드롬인지 검사


// * 다른 접근 방식 *
// n = 4일 때
// n-2 진법으로 n을 표현하면 ... 100 -> 팰린드롬이 될 수 없다.

// n > 4일 때,
// n-1 진법으로 n을 표현하면... 11
// n-2 진법으로 n을 표현하면... 12 -> 팰린드롬이 될 수 없다.
// 그러므로 범위 내의 n은 strictly palindromic 일 수 없다.