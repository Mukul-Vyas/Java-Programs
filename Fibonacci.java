public class Fibonacci {

    public static void printfibbonacci(int a,int b,int n){
        if(n==0){
            return;
        }

        int c=a+b;
        System.out.println(c);
        printfibbonacci(b,c,n-1);
    }


    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printfibbonacci(a,b,n-2);
    }
}

