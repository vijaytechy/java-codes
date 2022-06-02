import java.util.*;
public class loop {
    public static void  main(String[] args) {
        int m,n,a,b,sum,sub,mult,div,mod;
        Scanner ab = new Scanner(System.in);
        m = ab.nextInt();
        Scanner bc = new Scanner(System.in);
        n = bc.nextInt();

        //a=10;
        //b=20;
        sum=(m+n);
        sub=m-n;
        mult=m*n;
        div=m/n;
        mod=m%n;

        System.out.println("for sum press 1");
        System.out.println("for div press 2");
        System.out.println("for mult press 3");
        System.out.println("for mod press 4");
        System.out.println("for sub press 5 ");
        int x;
        Scanner choice = new Scanner(System.in);
        x = choice.nextInt();
        switch(x) {
            case 1:
                System.out.println("sum is " + sum);
                break;
            case 2:
                System.out.println("div is " + div);
                break;
            case 3:
                System.out.println("mult is  " + mult);
                break;
            case 4:
                System.out.println("mod is  " + mod);
                break;
            case 5:
                System.out.println("sub is" + sub);
                break;
            default:
                System.out.println("invalid choice");
        }


    }

}

