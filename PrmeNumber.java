
public class PrmeNumber {
    public static void main(String[] args) {
        // System.out.println("enter the number");
        for ( int i = 1; i <=100; i++) 
        {
            boolean k = true;
            for (int j = 2; j <=i-1; j++) {
                if (i%j==0) 
                {
                    k = false;
                    break;
                } 
            }
            if (k==true) {
                // System.out.print("prime number");
                System.out.print(i+" ");
            }
        }
    }
}
