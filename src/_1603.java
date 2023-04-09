public class _1603 {
    public static class ParkingSystem {

        int big;
        int medium;
        int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }
        // 변수를 배열로, 메서드 return을 조건문으로 작성하는 법도 있다.

        // big, medium, small은 각각 1, 2, 3이다.
        public boolean addCar(int carType) {
            switch (carType) {
                case 1: {
                    if (big != 0) {
                        big -= 1;
                        return true;
                    }
                    break;
                }
                case 2: {
                    if (medium != 0) {
                        medium -= 1;
                        return true;
                    }
                    break;
                }
                case 3: {
                    if (small != 0) {
                        small -= 1;
                        return true;
                    }
                    break;
                }
            }
            return false;
        }
    }
}