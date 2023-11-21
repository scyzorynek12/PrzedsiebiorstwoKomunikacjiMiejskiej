package pl.Gornik;

public class Bilet {
    private int numerBiletu;
    private String typBiletu;
    private double cenaBiletu;

    public Bilet(String typBiletu, double cenaBiletu) {
        this.typBiletu = typBiletu;
        this.cenaBiletu = cenaBiletu;
    }

    public String getTypBiletu() {
        return typBiletu;
    }

    public void setCenaBiletu(double cenaBiletu) {
        this.cenaBiletu = cenaBiletu;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                " typBiletu = '" + typBiletu + '\'' +
                ", cenaBiletu = " + cenaBiletu +
                '}';
    }

    public static double UstawCene(String typBiletu){
        double cenaBiletu = 0;
        if (typBiletu.equalsIgnoreCase("Ulgowy")) {
            cenaBiletu = 1.60;
        }
            else if (typBiletu.equalsIgnoreCase("Normalny")){
                cenaBiletu = 2.40;
        }
            else if (typBiletu.equalsIgnoreCase("Miesieczny")){
                cenaBiletu = 38.20;
        }
        return cenaBiletu;
    }
}
