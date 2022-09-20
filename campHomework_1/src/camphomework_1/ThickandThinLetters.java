package camphomework_1;

import java.util.Scanner;


public class ThickandThinLetters {

    
    public static void main(String[] args) {
        char letter='ü';  //Türkçe karakter olduğundan ö,ü gibi harflerde hata alıyoruz :). (Büyük Ü küçüğe dönüştürülemiyor so.)
        if(letter<97){
        letter=(char) ((char)letter+32);
        }
        if(letter=='a'||letter=='ı'||letter=='o'||letter=='u'){
            System.out.println(letter+":Kalın sesli harftir.");
        }
        else if(letter=='e'||letter=='i'||letter=='ö'||letter=='ü'){
            System.out.println(letter+":İnce sesli harftir");
        }
        else{
            System.out.println("Girilen harf sesli harf değildir.");
        }
    }
    
}
