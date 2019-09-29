package br.com.justnewcars.Veiculo;

//<editor-fold defaultstate="collapsed" desc="imports...">
//import ...
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author joshu, 28/09/2019, 20:49:49
 * Last update: -
 *///</editor-fold>
public enum TipoVeiculo {
    
    //<editor-fold defaultstate="collapsed" desc="constants...">
    
    //</editor-fold>
    //0                1               2                3                   4             5
    HATCH("HATCH"), SEDAN("SEDAN"), PICAPE("PICAPE"), MINIVAN("MINIVAN"), PERUA("PERUA"), SUV("SUV");
    private String texto;
    
    private TipoVeiculo(String texto){
    this.texto = texto;}
    
    public String getTexto(){
    return texto;}

    //<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="constructor...">
    
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="getter methods...">
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static methods...">
    
    //</editor-fold>
    
}
