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
class Lanchonete {
    
    private Salao salao = new Salao();
    private Cardapio cardapio = new Cardapio();
    
    public void imprimirElementos() {
        System.out.println("A Lanchonete é formada por:");
        salao.imprimirElementos();
        cardapio.imprimirElementos();
    }
    
}
