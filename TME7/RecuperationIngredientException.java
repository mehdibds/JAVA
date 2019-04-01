public class RecuperationIngredientException extends Exception{

    protected String message ;
    public RecuperationIngredientException(String message){
        this.message = message;
    }
    
    public String toString(){
        return message;
    }
}