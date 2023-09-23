package myexceptions;

import emuns.CodigoEnum;

/**
 *
 * @author HELPNET
 */
public class RestauranteException extends Exception{

    private int errorCode;
    
    public RestauranteException() {
    }

   
    public RestauranteException(String msg, CodigoEnum codigoEnum) {
        super(msg);
        this.errorCode = codigoEnum.getCode();
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    
}
