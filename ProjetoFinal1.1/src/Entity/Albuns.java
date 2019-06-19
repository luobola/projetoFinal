package Entity;

import java.util.ArrayList;

public class Albuns {

    private String nome;
    private double anoLancamento;
    private int numeroMusica;
    private ArrayList<Musica> musicas = new ArrayList<>();
    private ArrayList<AutorBanda> autorBandas = new ArrayList<>();

    public Albuns(String nome, double anoLancamento, int numeroMusica, ArrayList<Musica> musicas) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.numeroMusica = numeroMusica;
        this.musicas = musicas;
    }

    public ArrayList<AutorBanda> getAutorBandas() {
        return new ArrayList<>(autorBandas);
    }

    public void setAutorBandas(ArrayList<AutorBanda> autorBandas) {
        this.autorBandas = autorBandas;
    }

    public ArrayList<Musica> getMusicas() {
        return new ArrayList<>(musicas);
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
        return "Albuns{" +
                "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", numeroMusica=" + numeroMusica +
                ", musicas=" + musicas +
                ", autorBandas=" + autorBandas +
                '}';
    }

    public String otoString() {
        return "\nNome=" + nome;
    }
}
