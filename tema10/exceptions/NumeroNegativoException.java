package exceptions;

public class NumeroNegativoException extends Exception {
    
    public NumeroNegativoException(){
        
    }
    public NumeroNegativoException(String message){
        super(message);
    }
}
