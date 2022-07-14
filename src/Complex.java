import java.util.Scanner;

public class Complex {
    double real;
    double image;

    Complex() {
        Scanner input = new Scanner(System.in);
        double real = input.nextDouble();
        double image = input.nextDouble();
        Complex(real, image);
    }

    public void Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    //Let's write the getters and setters of real and image parts

    double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    //Let's start writting the operations

    Complex add(Complex z) {
        double real2 = z.getReal();
        double image2 = z.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }

    Complex sub(Complex z) {
        double real2 = z.getReal();
        double image2 = z.getImage();
        double newReal = real - real2;
        double newImage = image - image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }

    Complex mul(Complex z) {
        double real2 = z.getReal();
        double image2 = z.getImage();
        double newReal = real * real2 - image * image2;
        double newImage = image * image2 + image * image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }

    Complex div(Complex z) {
        double real2 = z.getReal();
        double image2 = z.getImage();
        double newReal = (real * real2 + image * image2) / (real2 * real2 + image2 * image2);
        double newImage = (real * real2 - image * image2) / (real2 * real2 + image2 * image2);
        Complex result = new Complex(newReal, newImage);
        return result;
    }

    Complex conjugate(Complex z) {
        return new Complex(this.real, -this.image);
    }

    public double mod(Complex z) {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.image, 2));
    }

    Complex square(Complex z) {
        double _real = this.real * this.real - this.image * this.image;
        double _image = 2 * this.real * this.image;
        return new Complex(_real, _image);
    }

    Complex sin(Complex z) {
        double x = Math.exp(z.image);
        double x_inv = 1 / x;
        double r = Math.sin(z.real) * (x + x_inv) / 2;
        double i = Math.cos(z.real) * (x - x_inv) / 2;
        return new Complex(r, i);
    }

    public double Taylor(double z) {
        double result = 0.0;
        for (int n = 0; n <= 8; ++n) {
            double temp = 2 * n + 1;
            result += Math.pow(-1, n) * Math.pow(z, temp) / factorial(temp);
        }
        return result;
    }

    public double factorial(double temp) {
        long A = 1;
        for (int a = 1; a <= temp; a++) {
            A *= a;
        }
        return A;
    }

    //Let's show our complex numbers
    public void print() {
        if (image > 0) {
            System.out.println(real + " + " + image);
        } else if (image < 0) {
            System.out.println(real + " + " + image + "i");
        } else {
            System.out.println(real);
        }
    }

}


