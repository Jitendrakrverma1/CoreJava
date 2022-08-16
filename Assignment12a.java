import java.util.Scanner;
class CustomerDetails{
    String name;
    long balance,phno;
    void setCustomerName(String Name){
        name = Name;
    }
    String getCustomerName(){
      return name;
    }
    void setCustomerBlance(long Balance){
        balance = Balance;
    }
    long getCustomerBlance(){
        return balance;
    }
    void setCustomerPhno(long Phno){
        phno = Phno;
    }
    long getCustomerPhno(){
        return phno;
    }
}
public class Assignment12a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CustomerDetails C = new CustomerDetails();        
        System.out.println("===Customer Details===");
        System.out.println("Enter customer name:");
        C.setCustomerName(s.nextLine());
        System.out.println("enter customer balance:");
        C.setCustomerBlance(s.nextLong());
        System.out.println("enter customer phno:");
        C.setCustomerPhno(s.nextLong());
        System.out.println("customer name:"+C.getCustomerName());
        System.out.println("customer balance:"+C.getCustomerBlance());
        System.out.println("customer phno:"+C.getCustomerPhno());
        s.close();
    }
}
