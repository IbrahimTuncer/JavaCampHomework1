//Kendisi hariç pozitif bölenlerinin toplamı kendisine eşit olan sayıya denir.

package camphomework_1;

import java.util.Scanner;


public class PerfectNumber {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int top=0;
        for (int i = 1; i <a; i++) {
            if(a%i==0){
            top+=i;
            }
        }
        if(top==a){
            System.out.println(a+":is a perfect number");
        }
        else{
            System.out.println(a+":isn't a perfect number.");
        }
    }
    
}
