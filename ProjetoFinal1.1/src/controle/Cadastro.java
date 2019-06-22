package controle;


import Entity.Albuns;
import Entity.AutorBanda;
import Entity.Musica;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;


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
    private ListView<Musica> ltvMusica;
    @FXML
    private TextArea verDescricao;
    @FXML
    private Text txtQtdMusicas;

    public Cadastro() throws FileNotFoundException {
    }

    public ListView<Musica> getLtvMusica() {
        return ltvMusica;
    }

    public TextArea getVerDescricao() {
        return verDescricao;
    }

    public Text getTxtQtdMusicas() {
        return txtQtdMusicas;
    }

    Albuns albuns;

    @FXML
    private void acaoClickLista() {
        Musica m = ltvMusica.getSelectionModel().getSelectedItem();
        Dialog<ButtonType> dialog = new Dialog<>();

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("listMusic.fxml"));
            Parent content = loader.load();
            dialog.getDialogPane().setContent(content);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
            Optional<ButtonType> resultado = dialog.showAndWait();

            if (resultado.isPresent() && resultado.get() == ButtonType.APPLY) {
                if (m != null)
                atualizaTela();
                verDescricao.setText(m.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public AutorBanda coletaInformacao(){
        String nome = tfNomeBanda.getText();
        String cidadeOrigem = tfCidadeOrigem.getText();
        Integer anoNascimento = Integer.parseInt(tfAnoNascimento.getText());

        AutorBanda ab = new AutorBanda(nome, cidadeOrigem, anoNascimento);

        //System.out.println(ab.toString());


        return ab;
    }

    @FXML
    public Albuns coletaInfoAlbum(){

        String nomeAlbum = tfNomeAlbum.getText();
        Integer anoLancamento = Integer.parseInt(tfAnoLancamento.getText());
        Integer numeroMusicas = Integer.parseInt(tfNumeroDeMusicas.getText());


        Albuns ab = new Albuns(nomeAlbum, anoLancamento, numeroMusicas,addMusics());
        System.out.println(ab.toString());
        return ab;
    }

    @FXML
    public ArrayList<Musica> addMusics(){

        ArrayList<Musica> musicas = new ArrayList<Musica>();
        String nomeMusica = tfNomeMusica.getText();
        String compositor = tfCompositores.getText();
        String duracao = tfDuracao.getText();


        musicas.add(new Musica(nomeMusica, compositor, duracao));

        return musicas;
    }

    public void atualizaTela() {
        atualizaLista();
        getTxtQtdMusicas().setText("Total de Pessoas:" + albuns.getMusicas().size());
    }

    private void atualizaLista(){
        getLtvMusica().getItems().clear();
        getLtvMusica().getItems().addAll(albuns.getMusicas());
    }

    @FXML
    public void acaoAdcionaMusica(){
        Dialog<ButtonType> dialog = new Dialog<>();

        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cadastroMusica.fxml"));
            Parent content = loader.load();
            dialog.getDialogPane().setContent(content);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
            Optional<ButtonType> resultado = dialog.showAndWait();

            if (resultado.isPresent() && resultado.get() == ButtonType.APPLY) {
                Cadastro control = loader.getController();
                addMusics();
                // cadastro.atualizaTela();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
