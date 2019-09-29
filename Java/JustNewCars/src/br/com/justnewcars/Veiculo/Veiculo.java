package br.com.justnewcars.Veiculo;

//<editor-fold defaultstate="collapsed" desc="imports...">
import br.com.justnewcars.classe.Loja.StatusDoVeiculo;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: Representar umVeiculo no Sistema
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author joshu, 28/09/2019, 19:07:35 Last update: -
 *///</editor-fold>
public class Veiculo extends Object {

    //<editor-fold defaultstate="collapsed" desc="attributes...">
    public String marca;// 15
    private String modelo;// 30
    private TipoVeiculo tipo;
    private int ano;
    private String chassi;
    private StatusDoVeiculo status;

    //public static final int ANO_LIMITE_MAX= ? == ano atual + 1;
    //<editor-fold defaultstate="collapsed" desc="main attributes...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    public static final int QTD_CHAR_MARCA = 20;
    public static final int QTD_CHAR_MODELO = 30;
    public static final int ANO_LIMITE_MIN = 1940;
    public static final int ANO_ERRO = -1;
    public static final int CHASSI_TOTAL_CHARS = 17;
    public static final String CHASSI_ERRO = "ERRO";

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    //</editor-fold>
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors...">
    public Veiculo(String marca, String modelo, TipoVeiculo tipo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setTipo(tipo);
        setAno(ano);
        chassi = CHASSI_ERRO;
        status = StatusDoVeiculo.NALOJA;

    }

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
        } else {
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
                .append("]")
                .append(", chassi:")
                .append(chassi)
                .append("]")
                .append(", Status:")
                .append(status)
                .append("]");

        textoFinal.append("]");
        return textoFinal.toString();
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    private String limparELimitarString(String texto, int qtdMaxChar) {
        //Remover espacos em branco 
        texto = texto.trim();
        //transformar tudo para maiusculo
        texto = texto.toUpperCase();
        //limitar em 20 chars
        if (texto.length() > QTD_CHAR_MARCA) {
            texto = texto.substring(0, qtdMaxChar);
        }
        return texto;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static methods...">
    public static int getAnoLimiteMax() {
        return Calendar.getInstance().get(Calendar.YEAR) + 1;
    }

    public StatusDoVeiculo getStatus() {
        return status;
    }
    
    public void setStatus(StatusDoVeiculo status){
    this.status = status;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        chassi = chassi.trim().toUpperCase();

        if (chassi.length() == CHASSI_TOTAL_CHARS) {
            Pattern zeroNoPrimeiroDigito = Pattern.compile("^0");
            Matcher matcherZero = zeroNoPrimeiroDigito.matcher(chassi);

            Pattern espacoNoChassi = Pattern.compile(" ");
            Matcher matcherEspaco = espacoNoChassi.matcher(chassi);

            Pattern repeticaoMaisDe6Vezes = Pattern.compile("^.{4,}([0-9A-Z])\\1{5,}");
            Matcher matcherRepetir = repeticaoMaisDe6Vezes.matcher(chassi);

            Pattern caracteresiIoOqQ = Pattern.compile("[iIoOqQ]");
            Matcher matcherCaract = caracteresiIoOqQ.matcher(chassi);

            Pattern ultimos6Numericos = Pattern.compile("[0-9]{6}$");
            Matcher matcherUltimos = ultimos6Numericos.matcher(chassi);

            if (matcherZero.find() || matcherEspaco.find()
                    || matcherRepetir.find() || matcherCaract.find()
                    || !matcherUltimos.find()) {
                this.chassi = CHASSI_ERRO;
            } else {

                this.chassi = chassi;
            }
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="main methods...">
    //</editor-fold>
    //</editor-fold>
}//class
