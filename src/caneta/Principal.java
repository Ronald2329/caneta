/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caneta;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args){
        
        Caneta caneta = new Caneta();
        
        String modelo = JOptionPane.showInputDialog("Informe o modelo da caneta:\n");
        caneta.modelo = modelo;
        
        String cor = JOptionPane.showInputDialog("Informe a cor:\n");
        caneta.cor = cor;
        
        String ponta = JOptionPane.showInputDialog("Informe a ponta  da caneta:\n");
        caneta.ponta = Float.parseFloat(ponta);
        
        String carga = JOptionPane.showInputDialog("Informe a carga da caneta");
        caneta.carga = Integer.parseInt(carga);
        
        caneta.tampada = true;
        int erro = caneta.Tampar();
        
        if(erro > 0){
            JOptionPane.showConfirmDialog(null, "A caneta já está tampada!!!\n");
           
        }
        erro = caneta.Destampar();
        
        if(erro == 0) {
            JOptionPane.showConfirmDialog(null, "A caneta já está destampada!!!\n");
        }
        
        JOptionPane.showConfirmDialog(null,"O modelo da caneta é: "+caneta.modelo+"\n"
                                           + "E a cor é: "+caneta.cor+"\n"
                                           + "A ponta é: "+caneta.ponta+"\n"
                                           + "E a carga: "+caneta.carga);
    }
    
    
}
