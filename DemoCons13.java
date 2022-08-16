// using setter and getter method
import java.util.Scanner;
class UserLogin{
    String UserName;
    long PhNo;
    void SetUserName(String UN ){
        UserName = UN;
    }
    String getUserName(){
      return UserName;
    }
    void setPhNo(long Ph){
        PhNo = Ph;
    }
    long getPhNo(){
        return PhNo;
    }
}
public class DemoCons13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        UserLogin Ul = new UserLogin();
        System.out.println("enter the username:");
       String g = s.nextLine();
          Ul.SetUserName(g);
        //  or
        // Ul.SetUserName(s.nextLine());
        System.out.println("enter the PhNo:");
        Ul.setPhNo(s.nextLong());
        System.out.println("===User Login Details====");
        System.out.println("UserName:"+Ul.getUserName());
        System.out.println("PhNo;"+Ul.getPhNo());
        s.close();
    }
}
