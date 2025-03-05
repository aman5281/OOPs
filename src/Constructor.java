public class Constructor {
    public static void main(String[] args) {

        Complex c2 = new Complex(10);
        Complex c1 = new Complex(5,6);
        c1.prnt();
        c2.prnt();
    }
}

class Complex{

    int a,b;

    public Complex(int real){           // Constructor Overload
        a=real;
        b=15;
    }
    public Complex(int real, int imaginary){
        a = real;
        b = imaginary;
    }

    void prnt(){
        System.out.println(a+" + "+ b+"i");
    }
}