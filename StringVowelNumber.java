import java.util.Scanner;
public class StringVowelNumber {
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    int len = str.length();
    int Vcount = 0, Ccount=0, scount=0, sum=0 ,special=0;
    for(int i=0; i<=len-1; i++) 
    {
        char ch = str.charAt(i);
        if(ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='i'|| ch=='I'|| ch=='o'||ch=='O'||
                ch=='u'|| ch=='U') 
        {
            Vcount++;
        }
        else if((ch>='a'||ch>='A') && (ch<='z'|| ch<='Z')) 
        {
            Ccount++;
        }
        else if(ch>='0' && ch<='9')
         {
           sum++;
    
        }
        else if(ch== ' '){
            scount++;
        }
        else {
            special++;
        }
    }
    System.out.println("Vowel count is:"+Vcount);
    System.out.println("Consonant count is:"+Ccount);
    System.out.println("Number count is:"+sum);
    System.out.println("Space or other count :"+scount);
    System.out.println("Special symbol :"+special);
    s.close();
    }
  }


