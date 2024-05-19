public class PC {
    private UC uc;
    private Peripheral[] peripheriques;

    public PC(UC uc, Peripheral[] peripheriques) {
        this.uc = uc;
        this.peripheriques = peripheriques;
    }

    public PC(PC pc) {
        this.uc = pc.uc;
        this.peripheriques = pc.peripheriques;
    }

    public double calConsoElec(double duree) throws ConsoException {
        double puissanceTotale = this.uc.get_puissance();
        for (Peripheral peripherique : this.peripheriques) {
            puissanceTotale += peripherique.calculerPuissance();
        }
        
        double consommation = puissanceTotale * duree;
        if (consommation > 1000) {
            throw new ConsoException("La consommation électrique dépasse 1000W.", consommation - 1000);
        }
        
        return consommation;
    }
}


