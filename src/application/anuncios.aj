package application;

import java.util.Iterator;

import javafx.event.ActionEvent;
import javafx.scene.layout.HBox;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public aspect anuncios {
	boolean flag = false;
	Label anuncio = new Label();
	
	before(ActionEvent e):  execution(void handle(ActionEvent)) && args(e){
		int nbutton = Integer.parseInt(thisJoinPointStaticPart.getSignature().toString().substring(22,23));
		HBox root = (HBox)((Node)e.getSource()).getScene().getRoot();
		
		
		if (!flag) {
			anuncio = new Label();
			root.getChildren().add(anuncio);
			flag = true;
		}
		
		System.out.print(nbutton);
		String text_anuncio="";
		switch(nbutton) {
		case 1:
			text_anuncio="VISITA EL RESTAURANTE \n'SHUING GANHG' ";break;
		case 2:
			text_anuncio="PASTILLAS PARA SER FELIZ: \nLLAME AL 09545345235";break;
		case 3:
			text_anuncio="DESCARGA MOBILE LEGENDS\nwww.mobilelegends.com";break;
		}
		anuncio.setText(text_anuncio);
	}
	

	
}
