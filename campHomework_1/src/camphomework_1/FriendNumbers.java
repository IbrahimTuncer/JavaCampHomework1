package camphomework_1;

import java.util.Scanner;


public class FriendNumbers {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int total=0;
        int total2=0;
        for (int i =1; i < a; i++) {
            if(a%i==0){
            total+=i;
            }
        }
        for (int i = 1; i <b; i++) {
            if(b%i==0){
            total2+=i;
            }
        }
        if(total==b && total2==a){
            System.out.println("These numbers are friend numbers.");
        }
        else{
            System.out.println("These numbers aren't friend numbers.");
        }
    }
    
}