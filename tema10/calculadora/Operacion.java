package calculadora;

import exceptions.DesbordaCapacidadException;

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
}
