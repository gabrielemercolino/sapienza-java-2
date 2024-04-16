package lez2;

public class Lez2 {
    public static void main(String[] args) {
        // espressioni();
        // bisestile(2024);

        
    }

    public static void espressioni(){
        int k = 10;
        int j = k+20;
        int h;

        System.out.print("k == ");
        System.out.println(k);
        System.out.println("j == " + j);
        System.out.print("h == ");
        //System.out.println(h);

        String s1 = "una stringa";
        String s2 = " e un'altra stringa";
        String s3 = s1+s2;
        System.out.println(s3);

        double d = j+5.3;
        System.out.println("d == " + d);
        boolean b = (d == 35.3) && (j == 30);
        System.out.println("b == " + b);
    }

    public static void bisestile(int anno){
        boolean bBisestile;
        bBisestile = anno % 4 == 0;
        bBisestile = bBisestile && (anno % 100 != 0);
        bBisestile = bBisestile || (anno % 400 == 0);

        System.out.printf("L'anno %s e' bisestile? %s\n", anno, bBisestile);
    }
}
