import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
                int mynumber = (int)(Math.random()*100);

        int usernumber;
        do {
            System.out.println("guess my number");
             usernumber = sc.nextInt();

             if(usernumber==mynumber) {
                System.out.println("woohoooooo ....!! its the correct number");
                break;
             } else if (usernumber > mynumber) {
                System.out.println("its too high");
             } else {
                System.out.println("its too low");
             }

            }  while(usernumber >=0);    
            System.out.println("My number was : ");
            System.out.println(mynumber);

    }  
}