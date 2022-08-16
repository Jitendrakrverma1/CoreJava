class CTest4{
    // create a instance variable
    String name;
    int age;
   // create a constructor
    CTest4(){
          System.out.println("Called a constructor");     
    }
}

//main class
public class DemoConstructor3 {
    public static void main(String[] args) {
        CTest4 ob = new CTest4();
        System.out.println("Username is:"+ob.name);
        System.out.println("UserAge is:"+ob.age);
    }
}
