package raizCuadrada;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.NumeroNegativoException;

public class RaizCuadrada {

    public void raizCuadrada(Scanner teclado) throws NumeroNegativoException, InputMismatchException{
        System.out.println("Introducir un valor: ");
        int valor = teclado.nextInt();
        
        if(valor < 0){
            throw new NumeroNegativoException("La raiz cuadrada de un número negativo no esta definida");
        }
        if(valor >= 0){
            double resultado = Math.sqrt(valor);
            System.out.println(String.format("El resultado de √%d = %.2f", valor, resultado));
        }
        
    }
    
}
