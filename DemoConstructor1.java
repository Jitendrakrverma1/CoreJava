class CTest1 // subclass
{ 
    int x=20;  // Instance variable memory in object.
  CTest1() // constructor
  {
       System.out.println("this is constructor in subclass");
       System.out.println("The value of x:"+x);
  }
  void disp(){
    System.out.println("== Instance method disp()===");
    System.out.println("The value of x:"+x);
  }
}
//main class
public class DemoConstructor1 {
    public static void main(String[] args) {
        CTest1 ob  = new CTest1();
        ob.disp();
    }
}
