package Graphs;

class FibMemoization{
    // private Vector<Integer> memo=new Vector();
    private int memoize[];
    FibMemoization(int n){
        this.memoize=new int[n+1];
        for(int i=0;i<=n;i++){
            this.memoize[i]=-1;
        }
        this.memoize[0]=0;
        this.memoize[1]=1;
    }
    public int fibonacci(int n) {
        if(n==0){
            return this.memoize[0];
        }
        else if(n==1){
            return this.memoize[1];
        }
        else if(this.memoize[n]==-1) {
            if(this.memoize[n-1]==-1)
                this.memoize[n-1]=fibonacci(n-1);
            if(this.memoize[n-2]==-1)
                this.memoize[n-2]=fibonacci(n-2);
            this.memoize[n] = this.memoize[n - 2] +this.memoize[n-1];
        }
        return memoize[n];
    }
}
public class FibonacciSeriesMemoization {
    public static void main(String[] args) {
        FibMemoization fdp=new FibMemoization(5);
        int ans= fdp.fibonacci(5);
        System.out.println(ans);
    }
}


