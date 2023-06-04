import java.util.Scanner;

public class question_7 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();

        if(A<1||A>1000){System.out.println("Invalid Input");}
        
        else{
            int sum=0;
            int i=1;
            while(i<=A){
                sum=sum+i;
            
                i=i+2;
            }


            System.out.println(sum);
               





        }
        



    }
    
}
