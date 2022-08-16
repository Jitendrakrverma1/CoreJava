public class IgnorePrimeNumber {
    public static void main(String[] args) {
        int j,num;
        System.out.println("**** Number Without Prime Number****");
        for ( num = 1; num <=100; num++) {
          if (num==0 || num==1) {
            System.out.print(num + " ");
            continue;
          }  
          for ( j = 2; j <num-1; j++){
              if (num%j==0){
                  System.out.print(num + " ");
                  break;
              } 
            } 
        }
     }
 }
