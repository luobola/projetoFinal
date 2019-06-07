package controle;


import Entity.Albuns;
import Entity.AutorBanda;
import Entity.Musica;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cadastro {

    @FXML
    private TextField tfNomeBanda;
    @FXML
    private TextField tfCidadeOrigem;
    @FXML
    private TextField tfAnoNascimento;
    @FXML
    private TextField tfNomeAlbum;
    @FXML
    private TextField tfAnoLancamento;
    @FXML
    private TextField tfNumeroDeMusicas;



    @FXML
    private Button btMusicas;

    @FXML
    private TextField tfNomeMusica;
    @FXML
    private TextField tfCompositores;
    @FXML
    private TextField tfDuracao;
    @FXML
    private DatePicker dpDuracao;



    @FXML
    public Musica addMusics(){

        String nomeMusica = tfNomeMusica.getText();
        String compositor = tfCompositores.getText();
        String duracao = tfDuracao.getText();

        if (!verificaDuracao(duracao)){
           mensagem("Formato de Hora Inválido!!");
           return null;
        }
        String[] tokens = duracao.split(":");
        int minuto = Integer.valueOf(tokens[0]);
        int segundo = Integer.valueOf(tokens[1]);

        LocalDateTime duration = LocalDateTime.from(dpDuracao.getValue().atTime(minuto, segundo));

        Musica mus = new Musica(nomeMusica, compositor, duration);

        return mus;
    }

    private boolean verificaDuracao(String duracao){

        Pattern pattern = Pattern.compile("\\d\\d:\\d\\d");
        Matcher m = pattern.matcher(duracao);

        return m.find();
    }
    private void mensagem(String msg){
        Alert a = new Alert(Alert.AlertType.INFORMATION, msg);
        a.showAndWait();
    }

    @FXML
    public AutorBanda coletaInformacao(){
        String nome = tfNomeBanda.getText();
        String cidadeOrigem = tfCidadeOrigem.getText();
        double anoNascimento = Double.parseDouble(tfAnoNascimento.getText());

        AutorBanda ab = new AutorBanda(nome, cidadeOrigem, anoNascimento);

        return ab;
    }

    @FXML
    public Albuns coletaInfoAlbum(){
        String nomeAlbum = tfNomeAlbum.getText();
        Integer anoLancamento = Integer.parseInt(tfAnoLancamento.getText());
        Integer numeroMusicas = Integer.parseInt(tfNumeroDeMusicas.getText());


        Albuns ab = new Albuns(nomeAlbum, anoLancamento, numeroMusicas);
        return ab;
    }





}
