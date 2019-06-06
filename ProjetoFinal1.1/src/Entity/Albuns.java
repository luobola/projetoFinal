package Entity;

import java.util.ArrayList;

public class Albuns {

    private String nome;
    private double anoLancamento;
    private int numeroMusica;
    private ArrayList<Musica> musicas;
    private ArrayList<AutorBanda> autorBandas;

    public Albuns(String nome, double anoLancamento, int numeroMusica, ArrayList<Musica> musicas, ArrayList<AutorBanda> autorBandas) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.numeroMusica = numeroMusica;
        this.musicas = musicas;
        this.autorBandas = autorBandas;
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

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public ArrayList<AutorBanda> getAutorBandas() {
        return autorBandas;
    }

    public void setAutorBandas(ArrayList<AutorBanda> autorBandas) {
        this.autorBandas = autorBandas;
    }

    @Override
    public String toString() {
        return "\nAlbuns" +
                "\nNome=" + nome +
                "\nAno De Lancamento=" + anoLancamento +
                "\nNúmero de Musicas=" + numeroMusica +
                "\nMúsicas=" + musicas +
                "\nAutor/Bandas=" + autorBandas;
    }
}
