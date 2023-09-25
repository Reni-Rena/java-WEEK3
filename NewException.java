public class NewException extends Exception {

    public NewException() {
        this("Input value has not alowed");
    }
    public NewException(String msg) {
        super(msg);
    }
}