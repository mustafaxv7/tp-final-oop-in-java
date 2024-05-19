public class test {
    public void testConfiguration() {
        UC UC0 = new UC(2, 16, 150);
        Moniteur MN = new Moniteur("MN", "Model1", 2, 18, 1700);
        Clavier KB = new Clavier("KB", "Model2", 102, 5);

        PC Pc0 = new PC(UC0, new Peripheral[]{MN, KB});
        try {
            double conso = Pc0.calConsoElec(5);
            System.out.println("La consommation électrique de Pc0 est de " + conso + "W pour 5 heures.");
        } catch (ConsoException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDiff());
        }
        
    }
    public static void main(String [] args){
        test t = new test();
        t.testConfiguration();
    }
}
