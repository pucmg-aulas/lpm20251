/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pucmg.lpm20251;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danil
 */
public class Lpm20251 {

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    
    public static int fibPD(int n, Map<Integer, Integer> memo){
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 1) {
            return n;
        }
        int result = fibPD((n - 1), memo) + fibPD((n - 2), memo);
        memo.put(n, result);
        return result;
    
    }

    public static void main(String[] args) {
        
        //Exemplo de Uso
        int n = 54;
        Map<Integer, Integer> m = new HashMap();
        //System.out.println("Fibonacci de {"+ n +"} (Recursivo):" + fib(n));
        System.out.println("Fibonacci de {"+ n +"} (Memoization):" + fibPD(n, m));
    }
}
