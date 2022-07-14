import java.util.Scanner;

public class MainClass {

    public static void main(String [] args){
        //Auto generated the sub methods
        System.out.println("Put the real and image parts of Z1 ");
        Complex Z1 = new Complex();
        System.out.println("Put the real and the image parts of Z2 ");
        Complex Z2 = new Complex();

        //All operations
        Complex result_add = Z1.add(Z2);
        Complex result_sub = Z1.sub(Z2);
        Complex result_mul = Z1.mul(Z2);
        Complex result_div = Z1.div(Z2);
        Complex result_conj = Z1.conjugate(Z1);
        Complex result_square = Z1.square(Z1);
        //Complex result_mod = Z1.mod(Z1);
        //Complex result_sin = Z1.sin(Z1);

        System.out.println("The sum of z1 and z2 is: ");
        result_add.print();
        System.out.println("The subtraction of z1 and z2 is: ");
        result_sub.print();
        System.out.println("The multiplication of z1 and z2 is: ");
        result_mul.print();
        System.out.println("The division of z1 and z2 is: ");
        result_div.print();
        System.out.println("The conjugate of z1 is: ");
        result_conj.print();
        System.out.println("The square of z1: ");
        result_square.print();
        //result_sin.print();
        //Z1.mod(Z1);

    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Put the value Z: ");
        double Z = sc.nextDouble();
        SinusClass T = new SinusClass();
        T.Sinus((int) Z);
*/
        Scanner sc = new Scanner(System.in);
        double z2 = 0;
        System.out.println("Give Z. ");
        double z1 = sc.nextDouble();
        System.out.println("Give E. ");
        double e = sc.nextDouble();
        System.out.println("Give N. ");
        int n = sc.nextInt();
        int i = 0;
        System.out.println("SinZ equal: " + ClassSin.sum(z1,z2,n));
        while((ClassSin.r(z1, i)<e) && i<n) {
            i++;
            //System.out.println("N is : " + i);
            //System.out.println("P is : " + ClassSin.p(z1, z2, n));
            //System.out.println("P is : " + ClassSin.sum(z1, z2, n));
            //System.out.println("E is : " + ClassSin.r(z1, n));
            // For the Class Mysin
        }
    }
}
