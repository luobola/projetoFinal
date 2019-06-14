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
    public  Albuns (){
        musicas = new ArrayList<>();
    }

    public void cadastrarMusica(Musica m){
        musicas.add(m);
    }

    public void lista(Musica m){
        musicas.add(m);
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
        return  "\nNome=" + nome +
                "\nAno De Lancamento=" + anoLancamento +
                "\nNumero De Musica=" + numeroMusica +
                "\nMusicas=" + musicas +
                "\nAutor/Bandas=" + autorBandas;
    }

    public String otoString() {
        return "\nNome=" + nome;
    }
}
