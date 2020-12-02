package Metodos;
import java.awt.print.PrinterJob;
import java.util.*;

import javax.swing.JOptionPane;

import java.awt.Desktop;

public class Metodo {
	
	public double valienteNoaillesAdaptadoVariableFrente(double frente){
		double resultado=0;
		
		if(frente <= 6){
			resultado = frente*0.8;
		}else if (6<frente && frente<=8.5){
			double exponencia = Math.pow(frente, 2);
			resultado = -0.032*exponencia + 0.544*frente - 1.312;
		}else if (8.6<=frente && frente<=15){
			resultado = 1;
		}else if (15.1<=frente && frente<=30){
			resultado = 1 - 0.01 *(frente-15);
		}else if (30.1<=frente && frente<=60){
			double exponencia = Math.pow(frente, -0.2442);
			resultado = 1.9504*exponencia;
		}
		return resultado;
		
	}
	
	public void imprimir(String rutaDoc)
	{
	       PrinterJob job = PrinterJob.getPrinterJob();
	       job.printDialog();
	       String impresora=job.getPrintService().getName();
	 
	       //ESTE ES TU CÓDIGO
	       java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
	       java.io.File fichero = new java.io.File(rutaDoc);
	       JOptionPane.showMessageDialog(null, "Se ha imprimido correctamente.");
	       if (desktop.isSupported(Desktop.Action.PRINT)){
	            try {
	              try{
	                 Process pr = Runtime.getRuntime().exec("Rundll32 printui.dll,PrintUIEntry /y /n \""+impresora+"\"");
	                  }catch(Exception ex){
	                    System.out.println("Ha ocurrido un error al ejecutar el comando. Error: "+ex);
	                  }
	            desktop.print(fichero);
	           } catch (Exception e){
	System.out.print("El sistema no permite imprimir usando la clase Desktop");
	e.printStackTrace();
	}
	}else{
	System.out.print("El sistema no permite imprimir usando la clase Desktop");
	}
	}
	

}
