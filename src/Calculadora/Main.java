package Calculadora;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.net.URL;

public class Main extends Application {
	Button BTipo, B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, Bpunto;
	Button BSumar, BRestar, BMultiplicar, BDividir, BPotencia, BRaiz, BModulo, BIgual, BBorrar;
	Scene miEscena;
	Pane contenedor;
	Label resultado, titulo;
	int alto=350;
	int ancho=360;
	int aux, ans, estado=-1;
	double operador, operando, res;
	
	public static void main (String [] args) {
		
		Application.launch(args);
		
	}
	
	@Override
	public void start(Stage escenario) {
		//BOTON TIPO CALCULADORA
		
		BTipo = new Button();
		BTipo.setTranslateX(0);
		BTipo.setTranslateY(20);
		BTipo.setBorder(new Border(new BorderStroke(Color.DODGERBLUE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY
				, BorderWidths.DEFAULT)));
		BTipo.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		AsignarImg();
		BTipo.setOnAction(e -> {
			
			estado = estado*-1;
			cambiarTipo();
			
		});
		
		//TITULO
		
		titulo = new Label ("C A L C U L A D O R A   S I M P L E");
		titulo.setTranslateX(20);
		titulo.setTranslateY(20);
		titulo.setMinWidth(ancho);
		titulo.setMinHeight(28);
		titulo.setFont(Font.font("Times new roman",FontWeight.THIN,14));
		titulo.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		titulo.setAlignment(Pos.CENTER);
		titulo.setTextFill(Color.WHITE);
		
		//BOTONES NUMEROS
		
		B1 = new Button(" 1 ");
		B1.setTranslateX(160);
		B1.setTranslateY(100);
		B1.setMinWidth(50);
		B1.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B1.setBorder(new Border(new BorderStroke(Color.WHITE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, 
				BorderWidths.DEFAULT)));
		B1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B1.setTextFill(Color.DODGERBLUE);
		
		B1.setOnAction(e -> {
			aux = 1;
			mostrarNum();

		});
		
		B2 = new Button(" 2 ");
		B2.setTranslateX(220);
		B2.setTranslateY(100);
		B2.setMinWidth(50);
		B2.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B2.setBorder(new Border(new BorderStroke(Color.WHITE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, 
				BorderWidths.DEFAULT)));
		B2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B2.setTextFill(Color.DODGERBLUE);
		
		B2.setOnAction(e -> {
			aux = 2;
			mostrarNum();
		});
		
		B3 = new Button(" 3 ");
		B3.setTranslateX(280);
		B3.setTranslateY(100);
		B3.setMinWidth(50);
		B3.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B3.setBorder(new Border(new BorderStroke(Color.WHITE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, 
				BorderWidths.DEFAULT)));
		B3.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B3.setTextFill(Color.DODGERBLUE);

		B3.setOnAction(e -> {
			aux = 3;
			mostrarNum();
		});
		
		B4 = new Button(" 4 ");
		B4.setTranslateX(160);
		B4.setTranslateY(150);
		B4.setMinWidth(50);
		B4.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B4.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B4.setTextFill(Color.DODGERBLUE);

		B4.setOnAction(e -> {
			aux = 4;
			mostrarNum();
		});
		
		B5 = new Button(" 5 ");
		B5.setTranslateX(220);
		B5.setTranslateY(150);
		B5.setMinWidth(50);
		B5.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B5.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B5.setTextFill(Color.DODGERBLUE);

		B5.setOnAction(e -> {
			aux = 5;
			mostrarNum();
		});
		
		B6 = new Button(" 6 ");
		B6.setTranslateX(280);
		B6.setTranslateY(150);
		B6.setMinWidth(50);
		B6.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B6.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B6.setTextFill(Color.DODGERBLUE);

		B6.setOnAction(e -> {
			aux = 6;
			mostrarNum();
		});
		
		B7 = new Button(" 7 ");
		B7.setTranslateX(160);
		B7.setTranslateY(200);
		B7.setMinWidth(50);
		B7.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B7.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B7.setTextFill(Color.DODGERBLUE);

		B7.setOnAction(e -> {
			aux = 7;
			mostrarNum();
		});
		
		B8 = new Button(" 8 ");
		B8.setTranslateX(220);
		B8.setTranslateY(200);
		B8.setMinWidth(50);
		B8.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B8.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B8.setTextFill(Color.DODGERBLUE);

		B8.setOnAction(e -> {
			aux = 8;
			mostrarNum();
		});
		
		B9 = new Button(" 9 ");
		B9.setTranslateX(280);
		B9.setTranslateY(200);
		B9.setMinWidth(50);
		B9.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B9.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B9.setTextFill(Color.DODGERBLUE);

		B9.setOnAction(e -> {
			aux = 9;
			mostrarNum();
		});
		
		B0 = new Button(" 0 ");
		B0.setTranslateX(220);
		B0.setTranslateY(250);
		B0.setMinWidth(50);
		B0.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		B0.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		B0.setTextFill(Color.DODGERBLUE);
		
		B0.setOnAction(e -> {
			aux = 0;
			mostrarNum();
		});
		
		Bpunto = new Button(" . ");
		Bpunto.setTranslateX(160);
		Bpunto.setTranslateY(250);
		Bpunto.setMinWidth(50);
		Bpunto.setFont(Font.font("Times new roman",FontWeight.THIN,20));
		Bpunto.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		Bpunto.setTextFill(Color.DODGERBLUE);

		Bpunto.setOnAction(e -> {
			aux = 10;
			mostrarNum();
		});
		
		//BOTONES OPERACIONES
		
		BSumar = new Button(" + ");
		BSumar.setTranslateX(30);
		BSumar.setTranslateY(145);
		BSumar.setMinWidth(40);
		BSumar.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BSumar.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		BSumar.setTextFill(Color.WHITE);

		BSumar.setOnAction(e -> {
			aux = 11;
			ans = 1;
			mostrarNum();
		});
		
		BRestar = new Button(" - ");
		BRestar.setTranslateX(80);
		BRestar.setTranslateY(145);
		BRestar.setMinWidth(40);
		BRestar.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BRestar.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		BRestar.setTextFill(Color.WHITE);

		BRestar.setOnAction(e -> {
			aux = 12;
			ans = 2;
			mostrarNum();
		});
		
		BMultiplicar = new Button(" x ");
		BMultiplicar.setTranslateX(30);
		BMultiplicar.setTranslateY(180);
		BMultiplicar.setMinWidth(40);
		BMultiplicar.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BMultiplicar.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		BMultiplicar.setTextFill(Color.WHITE);

		BMultiplicar.setOnAction(e -> {
			aux = 13;
			ans = 3;
			mostrarNum();
		});
		
		BDividir = new Button(" / ");
		BDividir.setTranslateX(80);
		BDividir.setTranslateY(180);
		BDividir.setMinWidth(40);
		BDividir.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BDividir.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		BDividir.setTextFill(Color.WHITE);

		BDividir.setOnAction(e -> {
			aux = 14;
			ans = 4;
			mostrarNum();
		});
		
		BPotencia = new Button(" ^ ");
		BPotencia.setTranslateX(50000);
		BPotencia.setTranslateY(215);
		BPotencia.setMinWidth(40);
		BPotencia.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BPotencia.setBackground(new Background(new BackgroundFill(Color.DARKGREY, CornerRadii.EMPTY, Insets.EMPTY)));
		BPotencia.setTextFill(Color.DARKGREY);

		BPotencia.setOnAction(e -> {
			aux = 15;
			ans = 5;
			mostrarNum();
		});
		
		BRaiz = new Button(" \u221A ");
		BRaiz.setTranslateX(50000);
		BRaiz.setTranslateY(215);
		BRaiz.setMinWidth(40);
		BRaiz.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BRaiz.setBackground(new Background(new BackgroundFill(Color.DARKGREY, CornerRadii.EMPTY, Insets.EMPTY)));
		BRaiz.setTextFill(Color.DARKGREY);

		BRaiz.setOnAction(e -> {
			aux = 16;
			ans = 6;
			mostrarNum();
		});
		
		BModulo = new Button(" % ");
		BModulo.setTranslateX(50000);
		BModulo.setTranslateY(250);
		BModulo.setMinWidth(40);
		BModulo.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BModulo.setBackground(new Background(new BackgroundFill(Color.DARKGREY, CornerRadii.EMPTY, Insets.EMPTY)));
		BModulo.setTextFill(Color.DARKGREY);

		BModulo.setOnAction(e -> {
			aux = 17;
			ans = 7;
			mostrarNum();
		});
		
		//CAMPO 
		
		resultado = new Label ();
		resultado.setTranslateX(30);
		resultado.setTranslateY(60);
		resultado.setMinWidth(B3.getMinWidth()+B3.getTranslateX()-resultado.getTranslateX());
		resultado.setMaxWidth(B3.getMinWidth()+B3.getTranslateX()-resultado.getTranslateX());
		resultado.setMinHeight(28);
		resultado.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		resultado.setBorder(new Border(new BorderStroke(Color.DODGERBLUE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, 
				BorderWidths.DEFAULT)));
		resultado.setFont(Font.font("Times new roman",FontWeight.THIN,16));
		resultado.setAlignment(Pos.CENTER_RIGHT);
		resultado.setTextFill(Color.DARKGREY);
		
		//Another Bottoms 
		
		BIgual = new Button(" = ");
		BIgual.setTranslateX(80);
		BIgual.setTranslateY(250);
		BIgual.setMinWidth(40);
		BIgual.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BIgual.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		BIgual.setTextFill(Color.WHITE);
		BIgual.setOnAction(e -> Resultado());

		BBorrar = new Button(" C ");
		BBorrar.setTranslateX(30);
		BBorrar.setTranslateY(110);
		BBorrar.setMinWidth(BRestar.getMinWidth()+BRestar.getTranslateX()-BBorrar.getTranslateX());
		BBorrar.setMaxWidth(BRestar.getMinWidth()+BRestar.getTranslateX()-BBorrar.getTranslateX());
		BBorrar.setMinHeight(28);
		BBorrar.setFont(Font.font("Times new roman",FontWeight.THIN,15));
		BBorrar.setBorder(new Border(new BorderStroke(Color.DODGERBLUE,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, 
				BorderWidths.DEFAULT)));
		BBorrar.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		BBorrar.setTextFill(Color.WHITE);
		BBorrar.setOnAction(e -> resultado.setText(""));
        
	    contenedor = new Pane();
	
	    contenedor.getChildren().addAll(titulo, BTipo, B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, Bpunto, 
	    		BBorrar, BSumar, BRestar, BMultiplicar, BDividir, BPotencia, BRaiz, BModulo, BIgual, resultado);

		miEscena = new Scene(contenedor,Color.WHITE);
		
		escenario.setTitle("Calculadora");
		escenario.getIcons().add(new Image("/Imagenes/calculadora.png"));
		escenario.setMinWidth(ancho);
		escenario.setMinHeight(alto);
		escenario.setScene(miEscena);
		escenario.show();
	}
	
	public void cambiarTipo() {
		CalSimple cs = new CalSimple();
		CalAritmetica ca = new CalAritmetica();
		
		switch(estado) {
		
			case -1:
				titulo.setText(cs.setTitulo());
				BPotencia.setBackground(new Background(new BackgroundFill(Color.DARKGREY, CornerRadii.EMPTY, Insets.EMPTY)));
				BPotencia.setTextFill(Color.DARKGREY);
				BPotencia.setTranslateX(50000);
				BRaiz.setBackground(new Background(new BackgroundFill(Color.DARKGREY, CornerRadii.EMPTY, Insets.EMPTY)));
				BRaiz.setTextFill(Color.DARKGREY);
				BRaiz.setTranslateX(50000);
				BModulo.setBackground(new Background(new BackgroundFill(Color.DARKGREY, CornerRadii.EMPTY, Insets.EMPTY)));
				BModulo.setTextFill(Color.DARKGREY);
				BModulo.setTranslateX(50000);	
			break;
				
			case 1:
				titulo.setText(ca.setTitulo());
				BPotencia.setTextFill(Color.WHITE);
				BPotencia.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
				BPotencia.setTranslateX(30);
				BPotencia.setTranslateY(215);
				BRaiz.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
				BRaiz.setTextFill(Color.WHITE);
				BRaiz.setTranslateX(80);
				BRaiz.setTranslateY(215);
				BModulo.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
				BModulo.setTextFill(Color.WHITE);
				BModulo.setTranslateX(30);
				BModulo.setTranslateY(250);
			break;
		}
	}
	
	public void mostrarNum() {
		
		switch (aux) {
			case 0:
				resultado.setText(resultado.getText() + "0");
			break;
			
			case 1:
				resultado.setText(resultado.getText() + "1");
			break;
			
			case 2:
				resultado.setText(resultado.getText() + "2");
			break;
			
			case 3:
				resultado.setText(resultado.getText() + "3");
			break;
			
			case 4:
				resultado.setText(resultado.getText() + "4");
			break;
			
			case 5:
				resultado.setText(resultado.getText() + "5");
			break;
			
			case 6:
				resultado.setText(resultado.getText() + "6");
			break;
			
			case 7:
				resultado.setText(resultado.getText() + "7");
			break;
			
			case 8:
				resultado.setText(resultado.getText() + "8");
			break;
			
			case 9:
				resultado.setText(resultado.getText() + "9");
			break;
			
			case 10:
				resultado.setText(resultado.getText() + ".");
			break;
			
			case 11:
				operador = Double.parseDouble(resultado.getText());
				resultado.setText("");
				resultado.setText(resultado.getText() + " + ");
				resultado.setText("");
			break;
			
			case 12:
				operador = Double.parseDouble(resultado.getText());
				resultado.setText("");
				resultado.setText(resultado.getText() + " - ");
				resultado.setText("");
			break;
			
			case 13:
				operador = Double.parseDouble(resultado.getText());
				resultado.setText("");
				resultado.setText(resultado.getText() + " * ");
				resultado.setText("");
			break;
			
			case 14:
				operador = Double.parseDouble(resultado.getText());
				resultado.setText("");
				resultado.setText(resultado.getText() + " / ");
				resultado.setText("");
			break;
			
			case 15:
				operador = Double.parseDouble(resultado.getText());
				resultado.setText("");
				resultado.setText(resultado.getText() + " ^ ");
				resultado.setText("");
			break;
			
			case 16:
				operador = Double.parseDouble(resultado.getText());
				resultado.setText("");
				resultado.setText(resultado.getText() + " \u221A ");
				resultado.setText("");
			break;
			
			case 17:
				operador = Double.parseDouble(resultado.getText());
				resultado.setText("");
				resultado.setText(resultado.getText() + " % ");
				resultado.setText("");
			break;
		}
	}
	
	public void Resultado() {
		CalAritmetica c = new CalAritmetica(operador, operando);
		operando = Double.parseDouble(resultado.getText());
		
		switch (ans) {
			case 1:
				res = c.Sumar(operador, operando);
				String res1 = String.valueOf(res);
				resultado.setText("");
				resultado.setText(res1);
			break;
			
			case 2:
				res = c.Restar(operador, operando);
				String res2 = String.valueOf(res);
				resultado.setText("");
				resultado.setText(res2);
			break;
			
			case 3:
				res = c.Multiplicar(operador, operando);
				String res3 = String.valueOf(res);
				resultado.setText("");
				resultado.setText(res3);
			break;
			
			case 4:
				res = c.Divivir(operador, operando);
				String res4 = String.valueOf(res);
				resultado.setText("");
				resultado.setText(res4);
			break;
			
			case 5:
				res = c.Exponencial(operador, operando);
				String res5 = String.valueOf(res);
				resultado.setText("");
				resultado.setText(res5);
			break;
			
			case 6:
				res = c.Racionar(operador, operando);
				String res6 = String.valueOf(res);
				resultado.setText("");
				resultado.setText(res6);
			break;
			
			case 7:
				res = c.Modulo(operador, operando);
				String res7 = String.valueOf(res);
				resultado.setText("");
				resultado.setText(res7);
			break;
		}
	}
	
	public void AsignarImg(){
		URL rutaImagen = getClass().getResource("/Imagenes/tipo.png");
		Image imgTipo = new Image(rutaImagen.toString(), 18, 18, true, true);
		BTipo.setGraphic(new ImageView (imgTipo));
	}
}



