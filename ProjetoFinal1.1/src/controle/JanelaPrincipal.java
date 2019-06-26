package controle;

import Entity.Albuns;
import Entity.AutorBanda;
import Entity.Musica;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import java.io.IOException;
import java.util.Optional;

public class JanelaPrincipal {

    Albuns albuns;
    Cadastro cadastro;


    @FXML
    private void acaoCadastraBanda(){
        Dialog<ButtonType> dialog = new Dialog<>();

        try{
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(getClass().getResource("cadastroBanda.fxml"));

            Parent content = loader.load();
            dialog.getDialogPane().setContent(content);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> resultado = dialog.showAndWait();

            if(resultado.isPresent() && resultado.get() == ButtonType.APPLY){
                Cadastro controle = loader.getController();

                AutorBanda autorBanda = controle.coletaInformacao();
                //autorBanda.toString();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void acaoCadastraAlbuns(){
        Dialog<ButtonType> dialog = new Dialog<>();

        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cadastroAlbuns.fxml"));
            Parent content = loader.load();
            dialog.getDialogPane().setContent(content);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
            Optional<ButtonType> resultado = dialog.showAndWait();

            if (resultado.isPresent() && resultado.get() == ButtonType.APPLY){
                Cadastro controle = loader.getController();
                Albuns albuns = controle.coletaInfoAlbum();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    private void sair(){
        Platform.exit();
    }

}
