package javaapplication13;

import java.util.Scanner;

public class JavaApplication13 {

    public static void main(String[] args) {
        MyList ml = new MyList();
        boolean arKartotiLoopa = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ivesk skaiciu:");
            String s = sc.nextLine();
            if (s != "") {
                try {
                    double d = Double.parseDouble(s);
//                    System.out.println(d);
                    ml.add(d);
                } catch (NumberFormatException nfe) {
                    System.out.println("Ivesk skaiciu, debile");
                }
            } else {
                System.out.println("Suma: " + ml.getSum());
                arKartotiLoopa = false;
            }
        } while (arKartotiLoopa);

    }
}
