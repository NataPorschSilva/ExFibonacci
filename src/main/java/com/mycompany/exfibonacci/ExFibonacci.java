
package com.mycompany.exfibonacci;

public class ExFibonacci {

    public static void main(String[] args) {
        
      int n = 0;
      int primeiroTermo = 0;
      int segundoTermo = 1;
              
        System.out.println("Os primeiros " + n + " números da " + "sequência de FIbonacci são:");
        System.out.println(primeiroTermo + " " + segundoTermo + " ");
        
        for (int i = 3; i<= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.println(proximoTermo +" ");
            
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        
        
    }
}
