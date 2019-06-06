package Entity;

import java.util.ArrayList;

public class Itens {

    private String tipo;
    private ArrayList<Albuns> albuns;
    private int posicao;

    public Itens(String tipo, ArrayList<Albuns> albuns, int posicao) {
        this.tipo = tipo;
        this.albuns = albuns;
        this.posicao = posicao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Albuns> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(ArrayList<Albuns> albuns) {
        this.albuns = albuns;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "\n\nItens" +
                "\nTipo=" + tipo + '\'' +
                "\nAlbuns=" + albuns +
                "\nPosicao=" + posicao;
    }
}
