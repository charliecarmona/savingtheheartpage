package models;


public class Model_volumen {
    private double alturaPris=0;
    private double areabPris=0;
    
    private double areaLad=0;
    
    private double alturaPira=0;
    private double areaBPira=0;

    /**
     * @return the alturaPris
     */
    public double getAlturaPris() {
        return alturaPris;
    }

    /**
     * @param alturaPris the alturaPris to set
     */
    public void setAlturaPris(double alturaPris) {
        this.alturaPris = alturaPris;
    }

    /**
     * @return the areabPris
     */
    public double getAreabPris() {
        return areabPris;
    }

    /**
     * @param areabPris the areabPris to set
     */
    public void setAreabPris(double areabPris) {
        this.areabPris = areabPris;
    }

    /**
     * @return the areaLad
     */
    public double getAreaLad() {
        return areaLad;
    }

    /**
     * @param areaLad the areaLad to set
     */
    public void setAreaLad(double areaLad) {
        this.areaLad = areaLad;
    }

    /**
     * @return the alturaPira
     */
    public double getAlturaPira() {
        return alturaPira;
    }

    /**
     * @param alturaPira the alturaPira to set
     */
    public void setAlturaPira(double alturaPira) {
        this.alturaPira = alturaPira;
    }

    /**
     * @return the areaBPira
     */
    public double getAreaBPira() {
        return areaBPira;
    }

    /**
     * @param areaBPira the areaBPira to set
     */
    public void setAreaBPira(double areaBPira) {
        this.areaBPira = areaBPira;
    }
    
    public double VolumenCubo(){
       return this.areaLad*areaLad*areaLad;
    }
    public double VolumenPrisma(){
        return this.areabPris+alturaPris;
    }
    public double VolumenPiramide(){
        return this.areaBPira*alturaPira/3;
    }
}
