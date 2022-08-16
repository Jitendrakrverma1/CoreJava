import java.util.Scanner;
// creating subclass
class Addition{
    int add(int x, int y){
        return x+y;
    }
}
class Substraction{
    int sub(int x, int y){
        return x-y;
    }
}
class Multiplication{
    int mul(int x, int y){
        return x*y;
    }
}
class Division{
    float div(int x, int y){
        return x-y;
    }
}
class Modulo{
    int mod(int x, int y){
        return x%y;
    }
}
public class Assignment10{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s.nextInt();
        System.out.println("Enter second Number:");
        int b = s.nextInt();
        System.out.println("Enter your choice");
        System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod");
        System.out.println("choose options:");
        int choice = s.nextInt();
        s.close();
        switch(choice){
            case 1:
                   Addition ad = new Addition();
                   int r1 = ad.add(a, b);
                   System.out.println("Sum of two number:"+r1);
                   break;
            case 2:
                   Substraction sb = new Substraction();
                   int r2 = sb.sub(a, b);
                   System.out.println("Substraction of two number:"+r2);
                   break;       
            case 3:
                   Multiplication ml = new Multiplication();
                   int r3 = ml.mul(a, b);
                   System.out.println("Multiplication of two number:"+r3);
                   break;
            case 4:
                   Division div = new Division();
                   float r4 = div.div(a, b);
                   System.out.println("Division of two number:"+r4);
                   break;
            case 5:
                   Modulo md = new Modulo();
                   int r5 =md.mod(a, b);
                   System.out.println("Modulo of two number:"+r5);
                   break;
            default:
                    System.out.println("Invalid operations........"); 
                    break;                           
        }
    }
}