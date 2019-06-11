package Entity;

import java.util.ArrayList;

public class Albuns {

    private String nome;
    private double anoLancamento;
    private int numeroMusica;
    private ArrayList<Musica> musicas;
    private ArrayList<AutorBanda> autorBandas;

    public Albuns(String nome, double anoLancamento, int numeroMusica) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.numeroMusica = numeroMusica;
    }

    public ArrayList<AutorBanda> getAutorBandas() {
        return autorBandas;
    }

    public void setAutorBandas(ArrayList<AutorBanda> autorBandas) {
        this.autorBandas = autorBandas;
    }

    /*public void addMusicas(String nomeMusica, String compo, String duracao){
        musicas.add(new Musica(nomeMusica, compo, duracao));
    }*/
    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(double anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNumeroMusica() {
        return numeroMusica;
    }

    public void setNumeroMusica(int numeroMusica) {
        this.numeroMusica = numeroMusica;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", numeroMusica=" + numeroMusica +
                ", musicas=" + musicas +
                ", autorBandas=" + autorBandas;
    }

    public String otoString() {
        return "\nNome=" + nome;
    }
}
