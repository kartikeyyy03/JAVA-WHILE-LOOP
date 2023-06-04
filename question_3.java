import java.util.Scanner;

public class question_3{

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    int N=sc.nextInt();

    if(N<1||N>1000){System.out.println("Invalid input");}
    else{

        
        int sum=0;
        
        int i=1;

        while (i <= N) { 
           
            sum = sum+ i;
            i++;
    }    
        System.out.println(sum);



    }

    
    
}


}