public class UC {
    private double frq_cpu;
    private int capacity_ram;
    private float puissance;

    public UC (double d, int capRAM, float puiss) {
        this.frq_cpu = d;
        this.capacity_ram = capRAM;
        this.puissance = puiss;
    }

    public void set_frq_cpu(double frq_cpu){
        this.frq_cpu = frq_cpu;
    }

    public double get_frq_cpu(){
        return this.frq_cpu;
    }

    public void set_capacity_ram(int capacity_ram){
        this.capacity_ram = capacity_ram;
    }

    public int get_capacity_ram(){
        return this.capacity_ram;
    }

    public void set_puissance(float puissance){
        this.puissance = puissance;
    }

    public float get_puissance(){
        return this.puissance;
    }
}