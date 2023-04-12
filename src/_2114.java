//        sentence는 공백 문자 하나로 분리된 단어들의 리스트이다.
//        문자열 배열인 sentence가 주어진다.
//        가장 많은 단어를 가진 sentence의 단어 개수를 반환한다.

public class _2114 {
    public static class Solution {
        public int mostWordsFound(String[] sentences) {
            int max = 0;

            for(String sentence : sentences) {
                int wordCount = sentence.split(" ").length;
                if (wordCount > max)
                    max = wordCount;
            }

            return max;
        }
    }
}
