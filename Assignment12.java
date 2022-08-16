// using object reference
import java.util.Scanner;
class CustomerDetails{
    String name;
    long blance,phNo;
}
public class Assignment12 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     CustomerDetails c = new CustomerDetails(); 
     System.out.println("======CostomerDtails====="); 
     System.out.println("Enter the name of Customer:");
     c.name = s.nextLine();
     System.out.println("Enter the customer balance:");
     c.blance = s.nextLong();
     System.out.println("Enter the customer phNo:");
     c.phNo = s.nextLong();
     System.out.println("Customer name:"+c.name);
     System.out.println("Customer balance:"+c.blance);
     System.out.println("Customer phNo:"+c.phNo);
     s.close();


        System.out.println();
    }
}
