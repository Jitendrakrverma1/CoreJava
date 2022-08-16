//create subclass
class Btest1{
    static int x = 20;
    static{
        System.out.println("==subclass static block===");
        System.out.println("the value of x:"+x);
    }
}
// main class
public class DemoBlock1 {
    static int z = 10;
    public static void main(String[] args) {
        Btest1.x = 500;
        System.out.println("==main() method==");
        System.out.println("the value of z:"+z);
        System.out.println("the value of x:"+Btest1.x);
    }
    // create mainclass static block
    static{
        System.out.println("==main class static block==");
        System.out.println("The value of z;"+z);
    }
}
