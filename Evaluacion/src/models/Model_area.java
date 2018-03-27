package models;


public class Model_area {
    private double perimBase=0;
    private double altura=0;
    private double areaBase=0;
    
    private double areaAlCuadrado=0;
   
    private double perimBasePira=0;
    private double aplat=0;
    private double areaBasePira=0;

    /**
     * @return the perimBase
     */
    public double getPerimBase() {
        return perimBase;
    }

    /**
     * @param perimBase the perimBase to set
     */
    public void setPerimBase(double perimBase) {
        this.perimBase = perimBase;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the areaBase
     */
    public double getAreaBase() {
        return areaBase;
    }

    /**
     * @param areaBase the areaBase to set
     */
    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    /**
     * @return the areaAlCuadrado
     */
    public double getAreaAlCuadrado() {
        return areaAlCuadrado;
    }

    /**
     * @param areaAlCuadrado the areaAlCuadrado to set
     */
    public void setAreaAlCuadrado(double areaAlCuadrado) {
        this.areaAlCuadrado = areaAlCuadrado;
    }

    /**
     * @return the perimBasePira
     */
    public double getPerimBasePira() {
        return perimBasePira;
    }

    /**
     * @param perimBasePira the perimBasePira to set
     */
    public void setPerimBasePira(double perimBasePira) {
        this.perimBasePira = perimBasePira;
    }

    /**
     * @return the aplat
     */
    public double getAplat() {
        return aplat;
    }

    /**
     * @param aplat the aplat to set
     */
    public void setAplat(double aplat) {
        this.aplat = aplat;
    }

    /**
     * @return the areaBasePira
     */
    public double getAreaBasePira() {
        return areaBasePira;
    }

    /**
     * @param areaBasePira the areaBasePira to set
     */
    public void setAreaBasePira(double areaBasePira) {
        this.areaBasePira = areaBasePira;
    }
    
    public double AreaPrisma(){
        return this.perimBase*altura+2*areaBase;
    }

    public double AreaCubo(){
        return this.areaAlCuadrado*areaAlCuadrado*6;
    }
    public double AreaPiramide(){
        return this.perimBasePira*aplat/2+areaBasePira;
    }
    public double getAreaPrisma(){
        return this.AreaPrisma();
    }
    public double getAreaCubo(){
        return this.AreaCubo();
    }
    public double getAreaPiramide(){
        return this.AreaPiramide();
    }
}
