package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.DesbordaCapacidadException;
import exceptions.OperadorNoValidoException;

public class Operacion {
    
    public int sumar(int x, int y) throws DesbordaCapacidadException{
        
        return x+y;
    }

    public int restar(int x, int y) throws DesbordaCapacidadException{
        return x-y;
    }

    public int multiplicar(int x, int y) throws DesbordaCapacidadException{
        return x*y;
    }

    public double dividir(int x, int y){
        return x/y;
    }

    public int resto(int x, int y){
        return x%y;
    }

    public void operandos(Scanner teclado) throws DesbordaCapacidadException, InputMismatchException, OperadorNoValidoException{
        System.out.println("Introducir un número entero: ");
        int a = teclado.nextInt();
        System.out.println("¿operador? (+ - * / ó %)");
        String operador = teclado.next();
        if(operador != "+" || operador != "-" || operador != "*" || operador != "/" || operador != "%"){
            throw new OperadorNoValidoException("Operador no válido");
        }
        System.out.println("Introducir un número entero: ");
        int b = teclado.nextInt();
        if(operador.equals("+")){
            System.out.println(String.format("%d + %d = %d",a,b,this.sumar(a, b)));
        }
        if(operador.equals("*")){
            System.out.println(String.format("%d x %d = %d",a,b,this.multiplicar(a, b)));
        }
        if(operador.equals("-")){
            System.out.println(String.format("%d - %d = %d",a,b,this.restar(a, b)));
        }
        if(operador.equals("/")){
            System.out.println(String.format("%d / %d = %2.f",a,b,this.dividir(a, b)));
        }
        if(operador.equals("%")){
            System.out.println(String.format("%d % %d = %d",a,b,this.resto(a, b)));
        }
    }
}
