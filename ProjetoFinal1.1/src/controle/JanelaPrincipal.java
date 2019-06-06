package controle;

import Entity.AutorBanda;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

import java.io.IOException;
import java.util.Optional;

public class JanelaPrincipal {


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
