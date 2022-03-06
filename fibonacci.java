import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklar
        int fn,fn1,fn2,n;
        int awal=1;

        //input
        System.out.print("mau mencari fibonacci ke ? ");
        n = input.nextInt();

        fn2=0;
        fn1=1;
        fn=1;

        for (int i = 1; i <=n; i++) {
            System.out.println("nilai fibonacci ke "+ i +" = "+fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }

        while (awal <=n) {
            System.out.println(" nilai fibonacci ke "+ awal++ +" = "+fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }

        do {
            System.out.println(" nilai fibonacci ke "+ awal++ +" = "+fn);
        fn = fn1 + fn2;
        fn2 = fn1;
        fn1 = fn;
        } while (awal<=n);

        input.close();
    }
}
