public class ConsoException extends Exception {
    private double diff;
    public ConsoException(String message, double diff) {
        super(message);
        this.diff = diff;
    }

    public double getDiff(){
        return this.diff;
    }
}
    
    
