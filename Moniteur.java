public class Moniteur extends Peripheral{
    private int consommationClass;
    private int dimension;
    private int resolutionMax;

    public Moniteur (String id, String model, int consommation, int dim, int resMax) {
        super(id,model);
        this.consommationClass = consommation;
        this.dimension = dim;
        this.resolutionMax = resMax;
    }

    @Override
    public float calculerPuissance() {
        return  (float) ((this.consommationClass * this.dimension) + ( this.resolutionMax * 0.015));
    }

    public void set_consommation_class(int consommationClass){
        this.consommationClass = consommationClass;
    }

    public int get_consommation_class(){
        return this.consommationClass;
    }

    public void set_dimension(int dimension){
        this.dimension = dimension;
    }

    public int get_dimension(){
        return this.dimension;
    }

    public void set_resolutionMax(int resolutionMax){
        this.resolutionMax = resolutionMax;
    }

    public int get_resolutionMax(){
        return this.resolutionMax;
    }
}
