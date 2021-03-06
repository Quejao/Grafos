/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Mateus Torres
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Grafo grafo = new Grafo();
        
        Vertice verticeGOIO = new Vertice("Goioerê");
        Vertice verticeCM = new Vertice("Campo Mourão");
        Vertice verticeMGA = new Vertice("Maringá");
        Vertice verticeLOND = new Vertice("Londrina");

        Aresta arestaGOIOxCM = new Aresta(110, verticeGOIO, verticeCM);
        Aresta arestaCMxMGA = new Aresta(120, verticeCM, verticeMGA);
        Aresta arestaMGAxLOND = new Aresta(100, verticeMGA, verticeLOND);
        Aresta arestaMGAxGOIO = new Aresta(150, verticeMGA, verticeGOIO);
        
        ArrayList<Aresta> arestas = new ArrayList<>();
        arestas.add(arestaGOIOxCM);
        arestas.add(arestaCMxMGA);
        arestas.add(arestaMGAxLOND);
        arestas.add(arestaMGAxGOIO);
        
        grafo.insereListaAdjacencia(arestas);
        
//        grafo.removeMapVertice("Maringá");
        
        grafo.printListaAdjacencia();
        
//        grafo.criaMatrizAdj();
//        grafo.printaMatrizAdj();
        
    }

}
