package br.com.justnewcars.classe.Loja;

//<editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author joshu, 29/09/2019, 14:50:59 Last update: -
 *///</editor-fold>
public enum StatusDoVeiculo {

    //<editor-fold defaultstate="collapsed" desc="attributes...">
    //<editor-fold defaultstate="collapsed" desc="main attributes...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    //0                           1                    2                        3                     
    VAZIO("VAZIO"), ENCOMENDADO("ENCOMENDADO"), NALOJA("NA_LOJA"), RESEVADO("RESERVADO"), VENDIDO("VENDIDO");
    private String texto;

    private StatusDoVeiculo(String texto) {
        this.texto = texto;
    }
    
    public String getTexto(){
    return texto;
    }
}
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="static attributes...">
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
//</editor-fold>
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="constructors...">
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="methods...">
//<editor-fold defaultstate="collapsed" desc="getter and setter methods...">
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="override methods...">
//</editor-fold>    
//<editor-fold defaultstate="collapsed" desc="auxiliary methods...">
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="static methods...">
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="main methods...">
//</editor-fold>
//</editor-fold>
