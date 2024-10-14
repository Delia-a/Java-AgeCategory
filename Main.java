import java.util.Scanner;
public class Main
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Unesite godine");
        
        int starost = scan.nextInt();
        
        if(starost <= 13 && starost >= 1){
            System.out.println("Djeca");
        }else if(starost > 13 && starost <= 35){
            System.out.println("Mladi");
        }else if(starost > 35 && starost <= 65){
            System.out.println("Srednje godine");
        }else if(starost > 65 && starost <=110){
            System.out.println("Stari");
        }else if(starost <= 0){
            System.out.println("Greska");
        }else if(starost > 110){
            System.out.println("Greska");
        }
        }
}


