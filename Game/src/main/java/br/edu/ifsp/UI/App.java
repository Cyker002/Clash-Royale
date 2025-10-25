package br.edu.ifsp.UI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        HBox container = new HBox();

        Label txt = new Label( "Teste" );

        container.getChildren().addAll( txt );
        container.setAlignment( Pos.CENTER );

        Scene cena = new Scene( container, 1820, 980 );


        stage.setScene( cena );
        stage.setTitle( ":: Clash Royale ::" );
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}