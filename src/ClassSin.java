import java.util.Scanner;

public class ClassSin {
    public static long factorial(int number){
        long result = 1;
        for(int factor = 1; factor<= number; factor++){
            result *= factor;
        }
        return result;
    }

    static double p(double z1, double z2, int n){
        double PT = Math.pow(-1,n)*(Math.pow(z1 - z2,2*n+1)/factorial(2*n+1));
        return PT;
    }

    static double sum(double z1, double z2, int n){
        double sum = 0.0;
        for (int i = 0; i <= n; i++){
            sum += p(z1, z2, n);
        }
        return sum;
    }

    static double r(double z1, int n){
        double rn = Math.pow(z1, n+1)/factorial(n+1);
        return Math.abs(rn);
    }
}
