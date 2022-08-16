// create as subclass
class  Btest2{
    int a =10;
    static int  b = 20;
   // create instance blocck
    {
        a++;
        b++;
      System.out.println("=== subclass Instance block==");
      System.out.println("The value of a:"+a);
      System.out.println("The value of b:"+b);

    }
}
public class DemoBlock2 {
    public static void main(String[] args) {
        Btest2 ob1 = new Btest2();
        Btest2 ob2 = new Btest2();
    }
}
