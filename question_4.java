import java.util.Scanner;

public class question_4 {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);

    int N=sc.nextInt();


    int i=1;

    if(N<1||N>100){System.out.println("Invalid Input");}
    else{
    while(i<=10){
    System.out.println(N+" "+"*"+" "+i+" "+"="+" "+N*i ); 
     i++;


    }
    
    
    }
    
}
}