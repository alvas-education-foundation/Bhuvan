import java.util.Scanner;
public class Verif
{
    public static void main(String args[])
    {
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();
        if(username.equals("Micheal") && password.equals("e3$WT89x"))
        {
            System.out.println("You have successfully login");
        }
        else {
            for (int i = 0; i < 3; i++) {
                
                password = s.nextLine();
                if (password.equals("e3$WT89x")) {
                    System.out.println("Welcome User!");
                } 
              }
         System.out.println("Access Denied!");
    }
}
}