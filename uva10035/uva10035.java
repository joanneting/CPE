import java.util.Scanner;
import java.lang.Math.*;
public class Main{
  public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    int firstInt=0;
    int lastInt=0;
    firstInt=input.nextInt();
    lastInt = input.nextInt();
    while((firstInt)!=0 || (lastInt) != 0){
    
      int count=0;
      int carry=0;
      while(firstInt > 0 || lastInt >0 ){
        count+=(firstInt%10+lastInt%10+carry>=10)?1:0;
        carry=(firstInt%10+lastInt%10+carry>=10)?1:0;
        firstInt/=10;
        lastInt/=10;
      }
      System.out.println(count!=0?(count==1?(count +" carry operation."):(count +" carry operations.")):("No carry operation."));
      firstInt=input.nextInt();
      lastInt = input.nextInt();
    }
  }
}


