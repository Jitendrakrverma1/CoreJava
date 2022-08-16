// create a subclass
class CTest3{
   // create one static block
    static{
    System.out.println("this is static block");
   }
    // create one instance block
    {
        System.out.println("Instance block");
    }
    // create one constructor
    CTest3(){
       System.out.println("This is constructor");
    }
}
// main class
public class DemoConstructor {
    public static void main(String[] args) {
       CTest3 ob = new CTest3(); 
    }
}
