import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.NumeroNegativoException;
import raizCuadrada.RaizCuadrada;

public class Main {
    public static void main(String[] args) throws Exception {
        menu();
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        
        do{
            switch(opcion){
                case 1:
                    //boolean continuar = true;
                    //do{
                        try{
                            Scanner teclado2 = new Scanner(System.in);
                            RaizCuadrada raiz = new RaizCuadrada();
                            raiz.raizCuadrada(teclado2);
                            //continuar = false;
                        }catch (InputMismatchException e){
                            System.out.println("Valor introducido incorrecto. Intentelo de nuevo");
                        }catch(NumeroNegativoException e){
                            System.out.println(e.getMessage());
                        }
                    //}while(continuar);
                break;
                case 2:
                break;
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
