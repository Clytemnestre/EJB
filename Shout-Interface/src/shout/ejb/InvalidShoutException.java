
package shout.ejb;

public class InvalidShoutException extends Exception {

    // construcor == ALT + insert > contructor > Exception(message)
    public InvalidShoutException(String message) {
        super(message);
    }
    
}
