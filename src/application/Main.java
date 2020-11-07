package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		//fondo para encajar a los botones
        HBox root = new HBox(10);
        root.setAlignment(Pos.CENTER);
        
        //Botones
        Button  boton1 = new Button("ROJO");
        Button  boton2 = new Button("AZUL");
        Button  boton3 = new Button("AMARILLO");
        root.getChildren().addAll(boton1, boton2, boton3);  
        
        //Acciones de los botones
        boton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
            	update("Rojo");
            	root.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
            }
        });
        
        
        boton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
            	update("Azul");
            	root.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));
            }
        });
        
        
        boton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
            	update("Amarillo");
            	root.setBackground(new Background(new BackgroundFill(Color.YELLOW,null,null)));
            }
        });

        Label anunci = new Label("ANUNCIO 1");
		ImageView anuncio = new ImageView(new Image("file:///anuncio2.png"));
		
		root.getChildren().add(anuncio);
        
        
        //Configuraciones de la ventana
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("TAREA 01");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void update(String color){
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
