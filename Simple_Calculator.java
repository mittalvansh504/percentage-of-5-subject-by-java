import java.util.*;

public class Simple_Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of Maths:- ");
        int a = sc.nextInt();
        System.out.print("Enter the marks of English:- ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of Physics:- ");
        int c = sc.nextInt();
        System.out.print("Enter the marks of Chemistry:- ");
        int d = sc.nextInt();
        System.out.print("Enter the marks of Hindi:- ");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        double per = sum/5;
        System.out.println("The sum of five subject is:- " + sum);
        System.out.println("The percentage of student is:- " + per);
    }
}