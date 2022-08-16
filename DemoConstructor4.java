class CTest7{
    String name;
    int age;
    CTest7(String name, int age ){
           this.name = name;
           this.age = age;
    } 
}
public class DemoConstructor4 {
    public static void main(String[] args) {
        CTest7 ob = new CTest7("jitendra", 23);
        System.out.println("Useername:"+ob.name + "  "+ "UserAge:"+ob.age);
    }
}
