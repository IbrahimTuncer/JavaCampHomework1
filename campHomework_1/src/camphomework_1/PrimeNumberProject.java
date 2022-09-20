package camphomework_1;

import java.util.Scanner;


public class PrimeNumberProject {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        boolean asal=false;
        for (int i =2; i <a; i++) {
            if(a==2){
            asal=true;
            }
            else{
            if(a%i==0){
            asal=false;
            System.out.println(a+" sayisi asal değildir.");
            break;
            }
            else {
                asal=true;
            }
            }
                
        }
        if(asal){
           System.out.println(a+" sayisi asaldir");
        }
    }
}
