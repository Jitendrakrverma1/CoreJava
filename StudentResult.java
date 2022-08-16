import java.util.Scanner;

class Marks{ //subclass for calculate total marks
    int totMarks( int hindi, int maths, int english, int science, int sanskrit,int art ){
       int totMarks = hindi + maths + english + science + sanskrit + art ;
       return totMarks;
    }
}
class Percentage{  //subclass for calculate percentage
        String calculate(float per){
            if (per>=80 && per<=100) {
                return "distinction";
            }
            else if(per>=70 && per<80){
                return "FirstClass";
            }
            else if(per>=60 && per<70){
                return "SecondClass";
            }
            else if(per>=35 && per<60){
                return "ThirdClass";
            }
            else{
                return "Fail";
            }
        }
}
    
public class StudentResult {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            //Reading Subjects Marks
            System.out.print("Enter the of Subject Hindi : ");
            int hindi=s.nextInt();
            System.out.print("Enter the of Subject Maths : ");
            int maths=s.nextInt();
            System.out.print("Enter the of Subject English : ");
            int english=s.nextInt();
            System.out.print("Enter the of Subject Science : ");
            int science=s.nextInt();
            System.out.print("Enter the of Subject Sanskrit : ");
            int sanskrit=s.nextInt();
            System.out.print("Enter the of Subject Art : ");
            int art=s.nextInt();
            //Print Subjects Marks
            System.out.println("-------Marks of Student as Follows-------");
            System.out.println("Subject Name     Marks");
            System.out.println("    Hindi        " +hindi);
            System.out.println("    Math         " +maths);
            System.out.println("   English       " +english);
            System.out.println("   Science       " +science);
            System.out.println("   Sanskrit      " +sanskrit);
            System.out.println("    Art          " +art);
            //calculating Total Marks
            Marks m = new Marks();
            int totMarks = m.totMarks(hindi,maths,english,science,sanskrit,art);
            System.out.println("Your Total Marks:"+totMarks);
            //calculating percentage
            float per = (float)totMarks/6;
            System.out.println("Your Total percentage:"+per);
            Percentage p = new Percentage();
            String result = p.calculate(per);
            System.out.println(result);
            s.close();
    }
}

