import java.util.Scanner;

public class casting {
    public static void main(String args[]){
        double number=23.0;
        int numbInt=15;
        double number2=number + numbInt;
        System.out.println(number2);
        int numberINT=23;
        int number3=numberINT + (int)19.89;
        System.out.println(number2);
        System.out.println(number3);

        // take input from user
       try {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String data=sc.nextLine();
        System.out.println(data);

       } catch (Exception e) {
        System.out.println("Enter only Integer Number");
        System.out.println(e);
       }finally{
        System.out.println("this is will print each time");
       }


    }
}
