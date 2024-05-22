import java.util.Scanner;
class FibonacciSeries{
    static int n1=0,n2=1,n3=0;
    static void printSeries(int count){
        if (count>0) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printSeries(count-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the count:");
        int c=sc.nextInt();
        System.out.println("Fibonaccie Series wihtout recursion: ");
        System.out.print(a+" "+b);
        for(int i=2;i<c;++i){
            int c1=a+b;
            System.out.print(" "+c1);
            a=b;
            b=c1;
        }
        System.out.println(" ");
        sc.close();
        //--------------------------------------------------------------->
        int count=10;
        System.out.println("Fibonaccie Series with recursion: ");
        System.out.print(n1+" "+n2);
        printSeries(count-2);
    }
}