// Loading data to object(using object referece variable)
import java.util.Scanner;
class BookDetails  //subclass
{
    // instance variable memory in object
    String bCode, bName, bAuthor;
    float bPrice;
    int bQty;
}
public class DemoCons12   // mainclass
 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BookDetails bd = new BookDetails();
        System.out.println("Enter book code:");
        String g =s.nextLine();
        g = bd.bCode;
        // or bd.bCode = s.nextLine();
        System.out.println("Enter book Name:");
        bd.bName=s.nextLine();
        System.out.println("Enter book author:");
        bd.bAuthor=s.nextLine();
        System.out.println("Enter book price:");
        bd.bPrice=s.nextFloat();
        System.out.println("Enter book Qty:");
        bd.bQty=s.nextInt();
        System.out.println("===BookDetails===");
        System.out.println("BookCode:"+g);
        System.out.println("Book Name:"+bd.bName);
        System.out.println("Book Author:"+bd.bAuthor);
        System.out.println("Book Price:"+bd.bPrice);
        System.out.println("Book Qty:"+bd.bQty);
        s.close();
    }
}
