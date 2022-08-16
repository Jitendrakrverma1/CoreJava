import java.util.Scanner;
//create a subclass
class CTest6{
    // create one constructor
  CTest6(int x){
    System.out.println("===constructor====");
    System.out.println("the value of x:"+x);
  }
  // create one instance method
  void dis(int y){
    System.out.println("===instance method==");
    System.out.println("the value of y : "+y);
  }
}
// main class
public class DemoConstructor5 {
    public static void main(String []args){
   Scanner ob = new Scanner(System.in);
   System.out.println("Enter the value of v1:");
   int v1 = ob.nextInt();
   System.out.println("Enter the value of v2:");
   int v2 = ob.nextInt();
   CTest6 s = new CTest6(v1);
   s.dis(v2);
  ob.close();
    }
}
