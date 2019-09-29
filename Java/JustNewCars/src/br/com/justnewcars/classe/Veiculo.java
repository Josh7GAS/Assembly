package br.com.justnewcars.classe;

//<editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: Representar umVeiculo no Sistema
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author joshu, 28/09/2019, 19:07:35
 * Last update: -
 *///</editor-fold>
public class Veiculo extends Object {
    
    //<editor-fold defaultstate="collapsed" desc="attributes...">
    public String marca;// 15
    private String modelo;// 30
    private TipoVeiculo tipo;
    private int ano;
    
    public static final int QTD_CHAR_MARCA=20;
    public static final int QTD_CHAR_MODELO=30;
    public static final int ANO_LIMITE_MIN=1940;
    public static final int ANO_ERRO= -1;
    //public static final int ANO_LIMITE_MAX= ? == ano atual + 1;
                            
    //<editor-fold defaultstate="collapsed" desc="main attributes...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    
    public Veiculo(String marca, String modelo, TipoVeiculo tipo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setAno(ano);
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
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = limparELimitarString(marca, QTD_CHAR_MARCA);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = limparELimitarString(modelo, QTD_CHAR_MODELO);
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        
        if (ano >= ANO_LIMITE_MIN && ano <= getAnoLimiteMax()) {
            this.ano = ano;    
        }else{
        this.ano = ANO_ERRO;
    }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="override methods...">
    public String toString() {
        StringBuffer textoFinal = new StringBuffer();
        textoFinal
                .append(Veiculo.class.getSimpleName())
                .append("[")
                .append(" marca: ")
                .append(marca)
                .append(", ")
                .append(" modelo: ")
                .append(modelo)
                .append(", ")
                .append("Tipo:")
                .append(tipo.getTexto())
                .append(", ")
                .append(" Ano:")
                .append(ano)
                
                .append("]");

        
        textoFinal.append("]");
        return textoFinal.toString();
    }
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    private String limparELimitarString(String texto, int qtdMaxChar){
         //Remover espacos em branco 
        texto = texto.trim();
        //transformar tudo para maiusculo
        texto = texto.toUpperCase();
        //limitar em 20 chars
        if (texto.length()>QTD_CHAR_MARCA) {
            texto = texto.substring(0, qtdMaxChar);
        }
        return texto;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="static methods...">
    public static int getAnoLimiteMax(){
        return Calendar.getInstance().get(Calendar.YEAR)+1;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="main methods...">
    
    //</editor-fold>
    
    //</editor-fold>

   
        
}//class
