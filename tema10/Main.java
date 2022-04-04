import java.util.InputMismatchException;
import java.util.Scanner;

import calculadora.Operacion;
import exceptions.NumeroNegativoException;
import exceptions.OperadorNoValidoException;
import raizCuadrada.RaizCuadrada;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do{
            menu();
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    try{
                        Scanner teclado2 = new Scanner(System.in);
                        RaizCuadrada raiz = new RaizCuadrada();
                        raiz.raizCuadrada(teclado2);
                    }catch(InputMismatchException e){
                        System.out.println("Introduce un valor válido");
                    }catch(NumeroNegativoException e){
                        System.out.println(e.getMessage());    
                    }
                break;
                case 2:
                    Scanner teclado3 = new Scanner(System.in);
                    try{
                        Operacion operacion = new Operacion();
                        operacion.operandos(teclado3);
                    }catch(InputMismatchException ex){
                        System.out.println("El resultado desborda la capacidad de esta calculadora.");
                    }catch(ArithmeticException ex){
                        System.out.println("La división por cero no esta definida");
                    }catch(OperadorNoValidoException ex){
                        System.out.println(ex.getMessage());
                    }
                break;

                default: 
                    System.out.println("Programa finalizado, gracias.");
            }
        }while(opcion != 3);
    }

    public static void menu(){
        System.out.println("Elige un ejercicio: ");
        System.out.println("1.- Calcular raiz cuadrada");
        System.out.println("2.- Calculadora");
        System.out.println("3.- Salir");

    }
}
