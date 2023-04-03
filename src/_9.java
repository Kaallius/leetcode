public class _9 {
    public static class Solution {
        public boolean isPalindrome(int x) {
            if ( x < 0)
                return false;

            String str = Integer.toString(x);
            int last = str.length();
            for(int i = 0; i <= last / 2; i++) {
                if(str.charAt(i) != str.charAt(last -1 - i))
                    return false;
            }

            return true;
        }
    }
}

// pairs of indices
// length = 5
// 0, 4
// 1, 3
// 2, 2 -> of course, they are same.

// length = 6
// 0, 5
// 1, 4
// 2, 3

// iteration = length / 2