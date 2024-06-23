import java.util.Scanner;
class StudentGradeTracker
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SUBJECTS :");
        int n=s.nextInt();
        int[] marks=new int[n];
        int flag=1;
        int count=1;
        float average;
        int total=0;
        while(flag==1){
            System.out.println("ENTER STUDENT "+count+"  MARKS FOR "+n+" SUBJECTS : ");
            for(int i=0;i<n;i++){
                marks[i]=s.nextInt();
            }
            int highest=marks[0];
            int smallest=marks[0];
            total=0;
            for(int i=0;i<n;i++)
            {
                total+=marks[i];
            }
            average=(float)total/n;
            System.out.println("AVERAGE SCORE OF STUDENT "+count+" is :"+average);
            for(int i=0;i<n;i++)
            {
                if(marks[i]<smallest)
                {
                    smallest=marks[i];
                }
                if(marks[i]>highest)
                {
                    highest=marks[i];
                }
            }
            System.out.println("HIGHEST SCORE OF STUDENT "+count+" is :"+highest);
            System.out.println("SMALLEST SCORE OF STUDENT "+count+" is :"+smallest);
            System.out.println("DO YOU WANT TO CONTINUE THE TRACKING OF MARKS OF ANOTHER STUDENT (1/0)");
            System.out.println("ENTER 1 TO CONTINUE AND 0 FOR TERMINATION");
            flag=s.nextInt();
            count++;
        }
        s.close();
    }
}