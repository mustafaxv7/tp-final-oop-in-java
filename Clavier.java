public class Clavier extends Peripheral{
    private int nbTouches;
    private float puissance;

    public Clavier (String id, String model, int nbT, float puissance) {
        super(id, model);
        this.nbTouches = nbT;
        this.puissance = puissance;
    }
    
    @Override
    public float calculerPuissance() {
        return this.puissance;
    }
    
    public void set_nbTouches(int nbTouches){
        this.nbTouches = nbTouches;
    }

    public int get_nbTouches(){
        return this.nbTouches;
    }

    public void set_puissance(float puissance){
        this.puissance = puissance;
    }

    public float get_puissance(){
        return this.puissance;
    }
    
}