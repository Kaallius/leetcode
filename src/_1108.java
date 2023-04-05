public class _1108 {
    public static class Solution {
        public String defangIPaddr(String address) {
            // 비슷한 메소드로 replaceAll("정규식", "바꿀 문자열") 이므로 "정규식"에 "." 적으면 원하는 결과 X
            return address.replace(".", "[.]");
        }
    }
}
