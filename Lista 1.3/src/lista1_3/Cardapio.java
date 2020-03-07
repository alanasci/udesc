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
class Cardapio {
    
    protected Produto produto = new Produto();
    
    public void imprimirElementos() {
        System.out.println("    Cardápio, apresenta:");
        produto.imprimirNome();
    }
    
}
