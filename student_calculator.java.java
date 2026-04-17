import java.util.*;
class student_gradescalci{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);

            //marks should be <=100
            System.out.print("enter sub1 marks");
            int s1=sc.nextInt();
            System.out.println("enter sub2 marks");
            int s2=sc.nextInt();
            System.out.println("enter sub3 marks");
            int s3=sc.nextInt();
            System.out.println("enter sub4 marks");
            int s4=sc.nextInt();
            System.out.println("enter sub5 marks");
            int s5=sc.nextInt();
            //total maks
            int sum=(s1+s2+s3+s4+s5);
            System.out.println("total marks="+sum);
            //average
            int average=(sum)/5;
            System.out.println("average="+average);
            
            //grade system
            if (average>=90){
                System.out.println("grade=A");

            }
            if(average<90 && average>=80){
                System.out.println("grade=B");
            }
            if(average<80 && average>=70){
                System.out.println("grade=C");
            
            }
            if(average<70 && average>=60){
                System.out.println("grade=D");
            }
            if(average<60 && average>=50){
                System.out.println("grade=E");
            }
            if(average<50){
                System.out.println("Fail");
            }

        }
    }
}