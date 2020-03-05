/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1_2;

/**
 *
 * @author udesc
 */
public class ArCondicionado {
    
    private Compressor compressor;
    private Sensor sensor;
    private Ventilador ventilador;
    
    public ArCondicionado() {
        compressor = new Compressor();
        sensor = new Sensor();
        ventilador = new Ventilador();
    }
    
    public void imprimirElementos() {
        System.out.println("Ar-Condicionado composto por:");
        compressor.imprimirNome();
        sensor.imprimirNome();
        ventilador.imprimirNome();
    }
    
}
