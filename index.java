import java.util.*;

public class index{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
                                                     // to find the even Or Odd number 
        // System.out.println("enter the value ");
        // int number = sc.nextInt();
        if(number % 2 == 0){
           System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }

                                                  // to find the great value between three 
        // int  a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater ");
        }else if(b>a && b>c){
             System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }

        char  a = sc.next().charAt(0);                           //this is how to take char as input 
        if(Character.isUpperCase(a)){
            System.out.println("1");
        } else if(Character.isLowerCase(a)){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }
    }
}
