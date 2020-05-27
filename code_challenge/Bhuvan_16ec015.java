import java.util.Scanner;
public class Bhuvan_16ec015
{
    public static Scanner s = new Scanner(System.in);
    public static String username, password;
    public static void main(String args[])
    {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        if(username.equals("Micheal"))
        {
            boolean flag = false;
            for (int i=0;i<3 ;i++) {
                if(login()){
                    flag = true;
                    System.out.println("You have successfully login");
                    break;
                }
            }
            if (!flag) {
                System.out.println("Access Denied");
            }
        } else {
            System.out.println("Wrong username");
        }

    }
    public static boolean login()
    {
        System.out.print("Enter password:");
        password = s.nextLine();
        if(password.equals("e3$WT89x"))
        {
           return true;
        }
        return false;
    }
}