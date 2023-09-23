
package emuns;

/**
 *
 * Enum - Contine los codigo de error del aplicativo
 */
public enum CodigoEnum {
    //CONSTANTE
    
    SINTAXIS_SQL_ERROR_CODE(100);
    
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    private CodigoEnum(int code){
        this.code = code;
    }
}
