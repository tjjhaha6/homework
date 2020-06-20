public class Fibonacci {

    public static int of(int n){
        if(n==1) return 1;
        else if(n==2) return 1;
        return of(n-1)+of(n-2);
    }

    public static void main(String[] args){
        int i=1, ans;
        while((ans=Fibonacci.of(i++))<200){
            System.out.println(ans);
        }
    }
}
