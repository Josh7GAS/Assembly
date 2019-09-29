package br.com.justnewcars.Veiculo;

//<editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: Facilita a Manipula;'aode um Array de Carros servindo como se
 * fosse um "Banco de Dados"
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author joshu, 28/09/2019, 22:30:19 Last update: -
 *///</editor-fold>
public class ManipuladorDeVeiculos {

    //<editor-fold defaultstate="collapsed" desc="attributes...">
    private List<Veiculo> veiculos;
    //<editor-fold defaultstate="collapsed" desc="main attributes...">

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    //</editor-fold>
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructors...">
    public ManipuladorDeVeiculos() {
        veiculos = new ArrayList<>();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="methods...">
    //<editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="override methods...">
    @Override
    public String toString() {
        StringBuffer textoFinal = new StringBuffer();
        textoFinal
                .append(ManipuladorDeVeiculos.class.getSimpleName())
                .append("[")
                .append("Qtd of veiculos")
                .append(lengthOfVeiculos());

        for (int count = 0; count < lengthOfVeiculos(); count++) {
            //se for o ultimo elemento nao colaca ","
            if (count + 1 == lengthOfVeiculos()) {
                textoFinal.append(getVeiculo(count));
            } else {
                textoFinal
                        .append(getVeiculo(count))
                        .append(", ");
            }

        }

        textoFinal.append("]");
        return textoFinal.toString();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="static methods...">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="main methods...">
    public int lengthOfVeiculos() {
        return veiculos.size();
    }

    public void addVeiculo(Veiculo novoVeiculo) {
        veiculos.add(novoVeiculo);
    }

    public void addVeiculos(Veiculo... listaDeVeiculos) {
        veiculos.addAll(Arrays.asList(listaDeVeiculos));
    }

    public Veiculo getVeiculo(int indiceVeiculo) {
        if (lengthOfVeiculos() > 0 && indiceVeiculo >= 0 && indiceVeiculo < lengthOfVeiculos()) {
            return veiculos.get(indiceVeiculo);
        }
        return null;
    }

    public boolean removeVeiculo(int indiceVeiculo) {
        if (lengthOfVeiculos() > 0 && indiceVeiculo >= 0 && indiceVeiculo < lengthOfVeiculos()) {
            Veiculo temp = veiculos.remove(indiceVeiculo);
            if (temp != null) {
                return true;
            }
            return false;
        }

        return false;
    }

    public boolean removeVeiculo(Veiculo veiculoParaRemover) {
        return veiculos.remove(veiculoParaRemover);
    }
    //</editor-fold>

    //</editor-fold>
    public void addVeiculo(Veiculo veiculo1, Veiculo veiculo2, Veiculo veiculo20, Veiculo veiculo3) {
    }

    public void updateVeiculo(int indiceVeiculo, Veiculo novoVeiculo) {
        if (lengthOfVeiculos() > 0 && indiceVeiculo >= 0 && indiceVeiculo < lengthOfVeiculos()) {
            removeVeiculo(indiceVeiculo);
            veiculos.add(indiceVeiculo, novoVeiculo);

        }
    
    }

    public Veiculo searchFirst(String modelo) {
        for (Veiculo elementoAtual : veiculos) {
            if (elementoAtual.getModelo().equals(modelo)) {
                return elementoAtual;
             
            }
        }
        return null;
    }
    
    public List<Veiculo> searchAll(String modelo){
    List<Veiculo> encontrados = new ArrayList<>();
    
        for (Veiculo elementoAtual : encontrados) {
            encontrados.add(elementoAtual);            
        }
        
        if (encontrados.size() == 0) {
            return null;
        }
        
        return encontrados;
    }

}//class
