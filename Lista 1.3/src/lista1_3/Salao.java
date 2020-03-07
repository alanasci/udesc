/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_3;

/**
 *
 * @author udesc
 */
class Salao {
    
    private Mesa mesa = new Mesa();
    
    public void imprimirElementos() {
        System.out.println("    Salão, possuí:");
        mesa.imprimirElementos();
    }
    
}
