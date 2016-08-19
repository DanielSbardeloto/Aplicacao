package br.edu.uricer;

import java.util.ArrayList;
import static java.util.Collections.max;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Sequencia {
    
    private int minimo;
    private int maximo;
    private int total;
    private int media;
    
    private List<Integer> numero = new ArrayList<>();
    
    public Sequencia(int[] numeros){
        for(int i : numeros){
        numero.add(i);
        }
    }
    
    public int valorMinimo(){
        return Collections.max(numero);
    }
    public int valorMaximo(){
        return Collectios.min(numero);
    }
    public int numeroDeElementos(){
        return numero.size();
    }
    
    public double media(){
        int soma = 0;
        
        for(int i: numero){
            soma += i;
        }
        
        return (double) soma/(double) numero.size();
    }
    
}
