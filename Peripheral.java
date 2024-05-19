public abstract class Peripheral {
    public String id;
    public String model;

    public Peripheral(String id, String model){
        this.id = id;
        this.model = model;
    }
    public abstract float calculerPuissance();
}
