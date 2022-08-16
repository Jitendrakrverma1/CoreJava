// class with multiple constructor
class CTest8
{
    CTest8(int x){
    System.out.println("The value of x:"+x);
    }
    CTest8(int y, int z){
   System.out.println("The value of y:"+y);
   System.out.println("The value of z:"+z);
    }
}


public class DemoCons8 {
    public static void main(String[] args){       
        CTest8 ob1 = new CTest8(111);
        CTest8 ob2 = new CTest8(12,12);
    }
}
