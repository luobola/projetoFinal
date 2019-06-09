package Entity;

import java.time.LocalDateTime;

public class Musica {


    private String nome;
    private String compositor;
    private LocalDateTime duracao;

    public Musica(String nome, String compositor, LocalDateTime duracao) {
        this.nome = nome;
        this.compositor = compositor;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public LocalDateTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalDateTime duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String otoString() {
        return  "\nNome='" + nome +
                "\nCompositor=" + compositor +
                "\nDuracao=" + duracao;
    }
}
