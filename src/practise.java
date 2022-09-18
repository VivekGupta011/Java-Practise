import java.util.Scanner;

public class practise {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount you have!");
        int money=sc.nextInt();
        //let pen=10 and book=40

        if(money <10)
            System.out.println("you can't buy anything");
        
        else if(money >10 && money < 40)
            System.out.println("you can buy one thing!");
        
        else
        System.out.println("you can buy both!");

        


    }
    
}
