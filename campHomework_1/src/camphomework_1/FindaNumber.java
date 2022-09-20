package camphomework_1;

import java.util.Scanner;


public class FindaNumber {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] numbers=new int[]{1,3,5,7,9};
        int wantedNum=scan.nextInt();
        for (int i = 0; i <numbers.length; i++) {
            if(wantedNum==numbers[i]){
                System.out.println("Wanted number is in "+i+". indis");
                return;
            }
            else{}
        }
        System.out.println("Wanted number not found in this array.");
    }
    
}