import java.util.Scanner;
public class question_5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A and B");

        int A=sc.nextInt();
        int B=sc.nextInt();
        int ans=1;
        if(A<1||A>100||B<1||B>1000){System.out.println("Invalid Values");}
        else{

        for(int i=1;i<=B;i++){
            ans=ans*A;
        }

        System.out.print(ans);
    }



    }
}