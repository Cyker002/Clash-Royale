package br.edu.ifsp.main;

import java.util.ArrayList;

public class Deck {

    // atributos específicos de um deck
    private ArrayList<Carta> cartas = new ArrayList<>();

    // construtor padrao (vazio)
    public Deck(){}

    // metodo getter
    public double getCustoMedio() {
        double custo = 0.0;
        for( Carta c : cartas ){
            custo += c.getCustoElixir();
        }
        if( cartas.isEmpty() ){
            return 0.0;
        } else {
            return ( custo / cartas.size() );
        }
    }

    // metodos especificos de um deck
    public void adicionarCarta ( Carta carta ){

        if( cartas.size() < 8 ){
            if( !cartas.contains(carta) ){
                cartas.add(carta);
            }
        }

    }

    public void removerCarta ( Carta carta ){

        if( cartas.contains(carta) ){
            cartas.remove(carta);
        } else {
            System.out.println( "O deck nao contem essa carta!" );
        }

    }

}
