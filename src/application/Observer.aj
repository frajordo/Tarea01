import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import javafx.scene.layout.Background;

public aspect Observer{
	File file = new File("log.txt");
	String txt= Calendar.getInstance().getTime().toString();
	pointcut success(Background bg,HBox root) : call(void setBackground(Background)) && args(bg) && target(root);
	before(Background bg, HBox root) throws IOException : success(bg, root){
		Color color=(Color) bg.getFills().get(0).getFill();
		String x=color.toString();
		System.out.println("La pantalla ha sido cambiada al color "+x);
		FileWriter writer= new FileWriter(file,true);
		writer.write("Se ha cambiado el color del fondo al color "+x+" a las "+txt+"\n");
		writer.close();
	}
			
}