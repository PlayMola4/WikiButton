package com.example.wikibutton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        /*GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Bienvenido");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Nombrae: ");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label userAge = new Label("Edad: ");
        grid.add(userAge, 0, 2);

        TextField userTextFieldAge = new TextField();
        grid.add(userTextFieldAge, 1, 2);

        Button btnAceptar = new Button("Aceptar");

        Label info = new Label();
        grid.add(info, 0, 4);

        btnAceptar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Datos aceptados");
                info.setText("Datos aceptados");
            }
        });

        Button btnCancelar = new Button("Cancelar");

        btnCancelar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Datos cancelados y borrados");
                userTextField.setText("");
                userTextFieldAge.setText("");
                info.setText("Datos borrados");
            }
        });

        grid.add(btnAceptar, 0, 3);
        grid.add(btnCancelar, 1, 3);
        grid.setHalignment(btnAceptar, HPos.LEFT);
        grid.setHalignment(btnCancelar, HPos.RIGHT);


        primaryStage.setTitle("Nombre y Edad");
        primaryStage.setScene(scene);
        primaryStage.show();*/

        //--------------------------------------------------------------//
        //--------------------------------------------------------------//
        //--------------------------------------------------------------//

        // Ponemos el titulo de la aplicacion
        /*primaryStage.setTitle("Creando un Boton Simple");

        // Creamos el boton
        Button b = new Button("Boton Simple");

        // Creamos un StackPane
        StackPane r = new StackPane();

        // Añadimos el boton
        r.getChildren().add(b);

        // Creamos una escnea
        Scene sc = new Scene(r, 200, 200);

        // Añadimos la escena
        primaryStage.setScene(sc);

        primaryStage.show();*/

        //--------------------------------------------------------------//
        //--------------------------------------------------------------//
        //--------------------------------------------------------------//

        /*primaryStage.setTitle("Creando un Boton Simple #2");

        Button b = new Button("button");
        b.setLayoutX(100);
        b.setLayoutY(100);

        Pane r = new Pane();

        Label l = new Label("Boton no seleccionado");
        l.setLayoutX(100);
        l.setLayoutY(150);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l.setText("Boton seleccionado");
            }
        };

        b.setOnAction(event);

        r.getChildren().add(b);
        r.getChildren().add(l);

        Scene sc = new Scene(r, 250, 250);

        primaryStage.setScene(sc);

        primaryStage.show();
    }*/

        //--------------------------------------------------------------//
        //--------------------------------------------------------------//
        //--------------------------------------------------------------//


        /*primaryStage.setTitle("Creando un boton con imagen");

        FileInputStream input = new FileInputStream("D:\\2DAM\\Desarrollo de interfaces\\Tema1\\coche.jpg");

        Image i = new Image(input);

        ImageView iw = new ImageView(i);

        Button b = new Button("", iw);

        TilePane r = new TilePane();

        Label l = new Label("Boton no seleccionado");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l.setText("Boton seleccionado");
            }
        };

        b.setOnAction(event);*/

        //--------------------------------------------------------------//
        //--------------------------------------------------------------//
        //--------------------------------------------------------------//

        /*StackPane root = new StackPane();
        primaryStage.setTitle("Boton cancelar");

        Button cancelButton = new Button("Cancelar");
        cancelButton.setCancelButton(true);
        cancelButton.setOnAction(actionEvent -> {
            System.out.println("Boton cancelar pulsado");
        });

        root.getChildren().add(cancelButton);

        Scene sc = new Scene(root, 250, 250);

        primaryStage.setScene(sc);

        primaryStage.show();*/

        //--------------------------------------------------------------//
        //--------------------------------------------------------------//
        //--------------------------------------------------------------//

        /*StackPane root = new StackPane();
        primaryStage.setTitle("Boton Default/Aceptar");

        Button defaultButton = new Button("Cancelar");
        defaultButton.setDefaultButton(true);
        defaultButton.setOnAction(actionEvent -> {
            System.out.println("Boton Default/Aceptar pulsado");
        });

        root.getChildren().add(defaultButton);

        Scene sc = new Scene(root, 250, 250);

        primaryStage.setScene(sc);

        primaryStage.show();*/

    }
    public static void main(String[] args) {
        launch(args);
    }
}