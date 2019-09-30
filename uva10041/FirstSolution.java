import java.util.*;
class Main {
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
      
      if(people%2==0){
        vito=(peopleArray[people/2]+peopleArray[people/2-1])/2;
      }else{
        vito=peopleArray[people/2];
      }
      for(int j=0;j<people;j++){
        total+=Math.abs(vito-peopleArray[j]);
      }
      System.out.println(total);
    }
  }
}