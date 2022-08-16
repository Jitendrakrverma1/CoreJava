// using constructor
import java.util.Scanner;
class CusDetails{
    String name;
    long bal,phno;
// making constructor
   CusDetails(String Name, long Bal, long Phno){
    name = Name;
    bal = Bal;
    phno = Phno;
   } 
void getdetails(){
    System.out.println("==customer details===");
    System.out.println("customer name:"+name);
    System.out.println("customer bal:"+bal);
    System.out.println("customer phno:"+phno);
}
}
public class Assignment12b {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter name:");    
    String g = s.nextLine();
    System.out.println("enter bal:"); 
    long b = s.nextLong();
    System.out.println("enter phno:");
    long p = s.nextLong();
  CusDetails c = new CusDetails(g, b, p);
  c.getdetails();
 s.close();
    }
}
