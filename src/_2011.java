public class _2011 {
    public static class Solution{
        public int finalValueAfterOperations(String[] operations) {
            int x = 0;

            for(int i = 0; i < operations.length; i++) {
                if(operations[i].charAt(1) == '+')
                    x += 1;
                else if(operations[i].charAt(1) == '-')
                    x -= 1;
            }

            return x;
        }
    }
}

// 처음에 시도한 방법
//
//    public static int finalValueAfterOperations(String[] operations) {
//        int x = 0;
//
//        for(int i = 0; i < operations.length; i++) {
//            if (operations[i].equals("X++") || operations[i].equals("++X"))
//                x += 1;
//            else if (operations[i].equals("X--") || operations[i].equals("--X"))
//                x -= 1;
//        }
//        return x;
//    }