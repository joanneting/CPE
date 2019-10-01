package tw.com.ntub.uva10041;
import java.util.*;
class SecondSolution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int caseNumber=input.nextInt();
    int[] peopleArray;
  
    for(int i=0;i<caseNumber;i++){
      int people=input.nextInt();
      peopleArray=new int[people];
       int total=0;
      for(int j=0;j<people;j++){
        peopleArray[j]=input.nextInt();
      }
      int vito=0;
      Arrays.sort(peopleArray);     
      vito=peopleArray[people/2];
      for(int j=0;j<people;j++){
        total+=Math.abs(vito-peopleArray[j]);
      }
      System.out.println(total);
    }
  }
}