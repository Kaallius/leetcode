import java.util.ArrayList;
import java.util.List;

public class _1431 {
    public static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            // 사탕을 가지고 있는 n명의 아이들
            // candies[i] 는 i번째 아이가 가진 사탕의 개수
            // extraCandies 는 내가 가진 사탕의 개수
            // 내가 사탕을 i번째 아이에게 사탕을 줄 때 사탕이 가장 많으면 result[i]는 true
            // 사탕이 가장 많은 아이는 둘 이상이 될 수 있다.
            int n = candies.length;
            List<Boolean> result = new ArrayList<Boolean>(n);

            // 최대값 구하기
            int max = candies[0];
            for(int i = 1; i < n; i++) {
                if (max < candies[i])
                    max = candies[i];
            }

            // 사탕 주면 해당 아이의 사탕이 가장 많은지 판단
            for(int i = 0; i < n; i++) {
                if (max <= candies[i] + extraCandies)
                    result.add(true);
                else
                    result.add(false);
            }

            return result;
        }
    }
}
