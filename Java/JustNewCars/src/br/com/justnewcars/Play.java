package br.com.justnewcars;

//<editor-fold defaultstate="collapsed" desc="imports...">
import br.com.justnewcars.Veiculo.ManipuladorDeVeiculos;
import br.com.justnewcars.Veiculo.TipoVeiculo;
import br.com.justnewcars.Veiculo.Veiculo;
import br.com.justnewcars.classe.Loja.StatusDoVeiculo;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author joshu, 28/09/2019, 18:46:56
 * Last update: -
 *///</editor-fold>
public class Play {
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Honda", "Fit", TipoVeiculo.HATCH, 2017);
        Veiculo veiculo2 = new Veiculo("Honda", "civic", TipoVeiculo.SEDAN, 2016);
        Veiculo veiculo3 = new Veiculo("GM", "Classic", TipoVeiculo.SEDAN, 2017);
        
        veiculo1.setChassi("6mmtw8d425t006276");
        veiculo1.setStatus(StatusDoVeiculo.NALOJA);
       
        
        
        ManipuladorDeVeiculos manipulador = new ManipuladorDeVeiculos();
        manipulador.addVeiculos(veiculo1, veiculo2,veiculo2, veiculo1);
       
        
        System.out.println(manipulador);
        
        System.out.println(
        manipulador.removeVeiculo(veiculo3)
        );
//        veiculo1.setAno(2000);
        
    
        
                
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    
    //</editor-fold>
    
}//class
