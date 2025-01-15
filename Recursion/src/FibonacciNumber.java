public class FibonacciNumber {
    public static void main(String[] args) {
        // fibo(N) = fibo(N - 1) + fibo(N - 2)  --> common sense
        int ans = fibo(8);
        System.out.println(ans);
    }

    static int fibo(int n) {
        //base condition
        if (n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2); // this is not tail recursion.
        // bcs here is addition of 2 function calls and
        // then return its addition, it's not depend on single function.

    }

}







/*
1.  Break it down into smaller problem
2.  if we get formula -> it is recurrence relation.
    fibo(N) = fibo(N - 1) + fibo(N - 2)  -> {recurrence relation for fibonacci series}
3.  The base condition is represented by ans we already have.
    (ans which is already given)
    in case of fibonacci series ->
    we know that f(0) = 0, f(1) = 1


*/