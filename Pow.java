package homeWork2WithLeetcode;

public class Pow {

        public double myPow(double x, int n) {
            if (n < 0){
                return 1.0 / calcPow(x, n);
            }
            else {
                return calcPow(x, n);
            }

        }
        public double calcPow(double x, int n){
            if (n == 0) return 1;

            if (n == 1 || x == 1) return x;

            if (n % 2 == 0){
                return calcPow( x * x, n /2);
            }
            return x * calcPow( x * x, n /2);
        }

}
