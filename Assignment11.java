import java.util.Scanner;
// creating subclass
class Greatest{
    int greater( int x, int y, int z)
    {
        if(x>y && x>z){
            return x;
        }
        else if(y>x && y>z){
            return y;
        }
        else{
            return z;
        }
    }
}
class Smallest{
    int smaller(int x, int y, int z)
    {
        if(x<y && x<z){
            return x;
        }
        else if(y<x && y<z){
            return y;
        }
        else{
            return z;
        }
    }
}
public class Assignment11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s.nextInt();
        System.out.println("Enter second number:");
        int b = s.nextInt();
        System.out.println("Enter third Number:");
        int c = s.nextInt();
        System.out.println("Enter your choice:");
        System.out.println("1.Greatest\n2.Smaller");
        System.out.println("choose options:");
        int choice = s.nextInt();
        s.close();
        switch(choice){
            case 1:
                   Greatest gr = new Greatest();
                   int r1 = gr.greater(a, b, c);
                   System.out.println("Greatest number:"+r1);
                   break;
            case 2:
                   Smallest sm = new Smallest();
                   int r2 = sm.smaller(a, b, c);
                   System.out.println("smallest number:"+r2);
                   break;
            default:
                   System.out.println("Invalid options......");
                   break;              
        }
    }
}
/*
 output:=
 Enter first number:
33
Enter second number:
45
Enter third Number:
44
Enter your choice:
1.Greatest
2.Smaller
choose options:
1
Greatest number:45
 */
