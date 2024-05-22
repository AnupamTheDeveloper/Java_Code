import java.util.Scanner;
public class CheckPrime {
    static void primeCheck(int n){
        int i,m,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println("It is not prime");
        }
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                System.out.println("It is not prime");
                flag=1;
                break;
                }
            }
            if (flag==0) {
                System.out.println("It is prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        primeCheck(num);
        sc.close();
    }
}
