package Metodos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;

public class VistaPdf extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPdf frame = new VistaPdf();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPdf() {
		
		TextArea textAreaPruebaPdf = new TextArea();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(49, 11, 333, 272);
		contentPane.add(panel);
		
		textFieldBuscar = new JTextField();
		textFieldBuscar.setColumns(10);
		textFieldBuscar.setBounds(34, 22, 164, 20);
		panel.add(textFieldBuscar);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ************************** BUSCA RUTA PARA GUARDAR Y GENERAR PDF ***************//
						
						JFileChooser dlg= new JFileChooser();
						int option = dlg.showSaveDialog(btnNewButton);
						if (option == JFileChooser.APPROVE_OPTION) {
						File f=dlg.getSelectedFile();
						textFieldBuscar.setText(f.toString());
						}
						
				
			}
		});
		btnNewButton.setBounds(215, 21, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// ------------------------GENERO EL PDF ----------------------//	
				String ruta = textFieldBuscar.getText();
				String contenido = textAreaPruebaPdf.getText();
		

				try{
					FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
					Document doc = new Document(); 
					
					PdfWriter.getInstance(doc, archivo);
					doc.open();
					doc.add(new Paragraph (contenido));
					
					doc.close();
					
					JOptionPane.showMessageDialog(null, "PDF Creado Correctamente");
					Metodo metodo = new Metodo();
					metodo.imprimir(ruta+".pdf");

				} catch (Exception error){
					JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
				}
				
				
				
			}
		});
		btnGenerar.setBounds(216, 238, 89, 23);
		panel.add(btnGenerar);
		
		
		textAreaPruebaPdf.setBounds(38, 61, 266, 160);
		panel.add(textAreaPruebaPdf);
	}

}
