package Metodos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFrente;
	private JTextField textFieldArea;
	private JTextField textFieldFrenteLM;
	private JTextField textFieldFondoLM;
	private JTextField textFieldFrenteAnt1;
	private JTextField textFieldAreaAnt1;
	private JTextField textFieldFrenteAnt2;
	private JTextField textFieldAreaAnt2;
	private JTextField textFieldFrenteAnt3;
	private JTextField textFieldAreaAnt3;
	private JTextField textFieldPrecioAnt1;
	private JTextField textFieldPrecioAnt2;
	private JTextField textFieldPrecioAnt3;
	private JTextField textFieldFrenteAnt4;
	private JTextField textFieldAreaAnt4;
	private JTextField textFieldPrecioAnt4;
	Metodo metodo = new Metodo();
	Icon img = new ImageIcon(getClass().getResource("/Img/uy2.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		
		JComboBox comboBoxFondo = new JComboBox();
		comboBoxFondo.setBackground(new Color(245, 222, 179));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoteProblema = new JLabel("LOTE PROBLEMA");
		lblLoteProblema.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoteProblema.setBounds(49, 17, 170, 32);
		contentPane.add(lblLoteProblema);
		
		JLabel lblLoteMedial = new JLabel("LOTE MEDIAL");
		lblLoteMedial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoteMedial.setBounds(632, 48, 170, 32);
		contentPane.add(lblLoteMedial);
		
		JLabel lblFrente = new JLabel("Frente:");
		lblFrente.setBounds(82, 60, 46, 14);
		contentPane.add(lblFrente);
		
		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setBounds(82, 110, 46, 14);
		contentPane.add(lblFondo);
		
		JLabel lblrea = new JLabel("\u00C1rea:");
		lblrea.setBounds(82, 85, 46, 14);
		contentPane.add(lblrea);
		
		textFieldFrente = new JTextField();
		textFieldFrente.setBounds(122, 57, 86, 20);
		contentPane.add(textFieldFrente);
		textFieldFrente.setColumns(10);
		
		textFieldArea = new JTextField();
		textFieldArea.setBounds(122, 85, 86, 20);
		contentPane.add(textFieldArea);
		textFieldArea.setColumns(10);
		
		JLabel lblFondoLP = new JLabel("");
		lblFondoLP.setBounds(122, 110, 86, 20);
		lblFondoLP.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(lblFondoLP);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(20, 17, 574, 122);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_6 = new JLabel("Frente:");
		label_6.setForeground(new Color(0, 102, 0));
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(195, 64, 75, 14);
		panel.add(label_6);
		
		JLabel label_10 = new JLabel("Coeficientes:");
		label_10.setForeground(new Color(0, 102, 0));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(230, 39, 102, 14);
		panel.add(label_10);
		
		JLabel lblFteCoef = new JLabel("");
		lblFteCoef.setForeground(new Color(0, 102, 0));
		lblFteCoef.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblFteCoef.setBounds(280, 58, 86, 20);
		panel.add(lblFteCoef);
		
		JLabel label_17 = new JLabel("Fondo:");
		label_17.setForeground(new Color(0, 102, 0));
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setBounds(195, 86, 75, 14);
		panel.add(label_17);
		
		JLabel lblFdoCoef = new JLabel("");
		lblFdoCoef.setForeground(new Color(0, 102, 0));
		lblFdoCoef.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblFdoCoef.setBounds(280, 80, 86, 20);
		panel.add(lblFdoCoef);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(389, 19, 10, 81);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(205, 19, 10, 81);
		panel.add(separator_3);
		
		JLabel lblTasacin = new JLabel("Tasaci\u00F3n:");
		lblTasacin.setForeground(new Color(204, 0, 0));
		lblTasacin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTasacin.setBounds(435, 39, 102, 14);
		panel.add(lblTasacin);
		
		JLabel lblTasaciónTotal = new JLabel("");
		lblTasaciónTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTasaciónTotal.setForeground(new Color(204, 0, 0));
		lblTasaciónTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTasaciónTotal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblTasaciónTotal.setBounds(437, 57, 115, 32);
		panel.add(lblTasaciónTotal);
		
		JLabel lblUsd = new JLabel("USD");
		lblUsd.setForeground(new Color(204, 0, 0));
		lblUsd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsd.setBounds(409, 64, 33, 14);
		panel.add(lblUsd);
		
		JLabel label_1 = new JLabel("Frente:");
		label_1.setBounds(665, 85, 46, 14);
		contentPane.add(label_1);
		
		textFieldFrenteLM = new JTextField();
		textFieldFrenteLM.setColumns(10);
		textFieldFrenteLM.setBounds(705, 82, 86, 20);
		contentPane.add(textFieldFrenteLM);
		
		JLabel lblFondo_2 = new JLabel("Fondo:");
		lblFondo_2.setBounds(665, 110, 46, 14);
		contentPane.add(lblFondo_2);
		
		textFieldFondoLM = new JTextField();
		textFieldFondoLM.setColumns(10);
		textFieldFondoLM.setBounds(705, 110, 86, 20);
		contentPane.add(textFieldFondoLM);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 222, 179));
		panel_1.setBounds(599, 51, 238, 91);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 222, 179));
		panel_2.setBounds(20, 150, 817, 303);
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAntecedentesLotes = new JLabel("ANTECEDENTES - LOTES:");
		lblAntecedentesLotes.setBounds(260, 0, 268, 32);
		panel_2.add(lblAntecedentesLotes);
		lblAntecedentesLotes.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textFieldFrenteAnt1 = new JTextField();
		textFieldFrenteAnt1.setBounds(90, 75, 86, 20);
		textFieldFrenteAnt1.setColumns(10);
		panel_2.add(textFieldFrenteAnt1);
		
		JLabel label_3 = new JLabel("Frente:");
		label_3.setBounds(50, 78, 46, 14);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("\u00C1rea:");
		label_4.setBounds(50, 106, 46, 14);
		panel_2.add(label_4);
		
		textFieldAreaAnt1 = new JTextField();
		textFieldAreaAnt1.setBounds(90, 103, 86, 20);
		textFieldAreaAnt1.setColumns(10);
		panel_2.add(textFieldAreaAnt1);
		
		JLabel label_5 = new JLabel("Fondo");
		label_5.setBounds(50, 140, 46, 14);
		panel_2.add(label_5);
		
		JLabel lblFondoAnt1 = new JLabel("");
		lblFondoAnt1.setBounds(90, 134, 86, 20);
		lblFondoAnt1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.add(lblFondoAnt1);
		
		JLabel label_7 = new JLabel("Frente:");
		label_7.setBounds(206, 78, 46, 14);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("\u00C1rea:");
		label_8.setBounds(206, 106, 46, 14);
		panel_2.add(label_8);
		
		textFieldFrenteAnt2 = new JTextField();
		textFieldFrenteAnt2.setBounds(246, 75, 86, 20);
		textFieldFrenteAnt2.setColumns(10);
		panel_2.add(textFieldFrenteAnt2);
		
		textFieldAreaAnt2 = new JTextField();
		textFieldAreaAnt2.setBounds(246, 103, 86, 20);
		textFieldAreaAnt2.setColumns(10);
		panel_2.add(textFieldAreaAnt2);
		
		JLabel label_9 = new JLabel("Fondo");
		label_9.setBounds(206, 140, 46, 14);
		panel_2.add(label_9);
		
		JLabel lblFondoAnt2 = new JLabel("");
		lblFondoAnt2.setBounds(246, 134, 86, 20);
		lblFondoAnt2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.add(lblFondoAnt2);
		
		JLabel label_11 = new JLabel("Frente:");
		label_11.setBounds(363, 78, 46, 14);
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel("\u00C1rea:");
		label_12.setBounds(363, 106, 46, 14);
		panel_2.add(label_12);
		
		textFieldFrenteAnt3 = new JTextField();
		textFieldFrenteAnt3.setBounds(403, 75, 86, 20);
		textFieldFrenteAnt3.setColumns(10);
		panel_2.add(textFieldFrenteAnt3);
		
		textFieldAreaAnt3 = new JTextField();
		textFieldAreaAnt3.setBounds(403, 103, 86, 20);
		textFieldAreaAnt3.setColumns(10);
		panel_2.add(textFieldAreaAnt3);
		
		JLabel label_13 = new JLabel("Fondo");
		label_13.setBounds(363, 134, 46, 14);
		panel_2.add(label_13);
		
		JLabel lblFondoAnt3 = new JLabel("");
		lblFondoAnt3.setBounds(403, 134, 86, 20);
		lblFondoAnt3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.add(lblFondoAnt3);
		
		JLabel lblPrecioUsd = new JLabel("Precio USD:");
		lblPrecioUsd.setBounds(21, 168, 86, 14);
		panel_2.add(lblPrecioUsd);
		
		textFieldPrecioAnt1 = new JTextField();
		textFieldPrecioAnt1.setBounds(90, 165, 86, 20);
		textFieldPrecioAnt1.setColumns(10);
		panel_2.add(textFieldPrecioAnt1);
		
		textFieldPrecioAnt2 = new JTextField();
		textFieldPrecioAnt2.setBounds(246, 165, 86, 20);
		textFieldPrecioAnt2.setColumns(10);
		panel_2.add(textFieldPrecioAnt2);
		
		JLabel lblPrecioUsd_1 = new JLabel("Precio USD:");
		lblPrecioUsd_1.setBounds(177, 168, 86, 14);
		panel_2.add(lblPrecioUsd_1);
		
		textFieldPrecioAnt3 = new JTextField();
		textFieldPrecioAnt3.setBounds(403, 165, 86, 20);
		textFieldPrecioAnt3.setColumns(10);
		panel_2.add(textFieldPrecioAnt3);
		
		JLabel lblPrecioUsd_2 = new JLabel("Precio USD:");
		lblPrecioUsd_2.setBounds(335, 168, 86, 14);
		panel_2.add(lblPrecioUsd_2);
		
		JLabel lblAntecedenteN = new JLabel("Antecedente N\u00BA 1 ");
		lblAntecedenteN.setBounds(50, 50, 102, 14);
		lblAntecedenteN.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblAntecedenteN);
		
		JLabel lblAntecedenteN_1 = new JLabel("Antecedente N\u00BA 2");
		lblAntecedenteN_1.setBounds(206, 50, 102, 14);
		lblAntecedenteN_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblAntecedenteN_1);
		
		JLabel lblAntecedenteN_2 = new JLabel("Antecedente N\u00BA 3");
		lblAntecedenteN_2.setBounds(363, 50, 102, 14);
		lblAntecedenteN_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblAntecedenteN_2);
		
		JLabel lblCoeficientes = new JLabel("Coeficientes:");
		lblCoeficientes.setForeground(new Color(0, 102, 0));
		lblCoeficientes.setBounds(40, 193, 102, 14);
		lblCoeficientes.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblCoeficientes);
		
		JLabel label_18 = new JLabel("Frente:");
		label_18.setForeground(new Color(0, 102, 0));
		label_18.setBounds(5, 218, 75, 14);
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(label_18);
		
		JLabel lblFondo_1 = new JLabel("Fondo:");
		lblFondo_1.setForeground(new Color(0, 102, 0));
		lblFondo_1.setBounds(5, 240, 75, 14);
		lblFondo_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblFondo_1);
		
		JLabel lblPrecioAjuste = new JLabel("Ajuste:");
		lblPrecioAjuste.setForeground(new Color(0, 102, 0));
		lblPrecioAjuste.setBounds(5, 263, 75, 14);
		lblPrecioAjuste.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblPrecioAjuste);
		
		JLabel lblCoefFte1 = new JLabel("");
		lblCoefFte1.setForeground(new Color(0, 102, 0));
		lblCoefFte1.setBounds(90, 212, 86, 20);
		lblCoefFte1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.add(lblCoefFte1);
		
		JLabel lblCoefFdo1 = new JLabel("");
		lblCoefFdo1.setForeground(new Color(0, 102, 0));
		lblCoefFdo1.setBounds(90, 234, 86, 20);
		lblCoefFdo1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.add(lblCoefFdo1);
		
		JLabel lblPrecioAjuste1 = new JLabel("");
		lblPrecioAjuste1.setForeground(new Color(0, 102, 0));
		lblPrecioAjuste1.setBounds(90, 257, 86, 20);
		lblPrecioAjuste1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.add(lblPrecioAjuste1);
		
		JLabel lblCoefFte2 = new JLabel("");
		lblCoefFte2.setForeground(new Color(0, 102, 0));
		lblCoefFte2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCoefFte2.setBounds(246, 215, 86, 20);
		panel_2.add(lblCoefFte2);
		
		JLabel lblCoefFdo2 = new JLabel("");
		lblCoefFdo2.setForeground(new Color(0, 102, 0));
		lblCoefFdo2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCoefFdo2.setBounds(246, 237, 86, 20);
		panel_2.add(lblCoefFdo2);
		
		JLabel lblPrecioAjuste2 = new JLabel("");
		lblPrecioAjuste2.setForeground(new Color(0, 102, 0));
		lblPrecioAjuste2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblPrecioAjuste2.setBounds(246, 260, 86, 20);
		panel_2.add(lblPrecioAjuste2);
		
		JLabel label_24 = new JLabel("Ajuste:");
		label_24.setForeground(new Color(0, 102, 0));
		label_24.setHorizontalAlignment(SwingConstants.RIGHT);
		label_24.setBounds(161, 266, 75, 14);
		panel_2.add(label_24);
		
		JLabel label_25 = new JLabel("Fondo:");
		label_25.setForeground(new Color(0, 102, 0));
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setBounds(161, 243, 75, 14);
		panel_2.add(label_25);
		
		JLabel label_26 = new JLabel("Frente:");
		label_26.setForeground(new Color(0, 102, 0));
		label_26.setHorizontalAlignment(SwingConstants.RIGHT);
		label_26.setBounds(161, 221, 75, 14);
		panel_2.add(label_26);
		
		JLabel label_27 = new JLabel("Coeficientes:");
		label_27.setForeground(new Color(0, 102, 0));
		label_27.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_27.setBounds(196, 196, 102, 14);
		panel_2.add(label_27);
		
		JLabel lblCoefFte3 = new JLabel("");
		lblCoefFte3.setForeground(new Color(0, 102, 0));
		lblCoefFte3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCoefFte3.setBounds(403, 212, 86, 20);
		panel_2.add(lblCoefFte3);
		
		JLabel lblCoefFdo3 = new JLabel("");
		lblCoefFdo3.setForeground(new Color(0, 102, 0));
		lblCoefFdo3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCoefFdo3.setBounds(403, 234, 86, 20);
		panel_2.add(lblCoefFdo3);
		
		JLabel lblPrecioAjuste3 = new JLabel("");
		lblPrecioAjuste3.setForeground(new Color(0, 102, 0));
		lblPrecioAjuste3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblPrecioAjuste3.setBounds(403, 257, 86, 20);
		panel_2.add(lblPrecioAjuste3);
		
		JLabel label_31 = new JLabel("Ajuste:");
		label_31.setForeground(new Color(0, 102, 0));
		label_31.setHorizontalAlignment(SwingConstants.RIGHT);
		label_31.setBounds(318, 263, 75, 14);
		panel_2.add(label_31);
		
		JLabel label_32 = new JLabel("Fondo:");
		label_32.setForeground(new Color(0, 102, 0));
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setBounds(318, 240, 75, 14);
		panel_2.add(label_32);
		
		JLabel label_33 = new JLabel("Frente:");
		label_33.setForeground(new Color(0, 102, 0));
		label_33.setHorizontalAlignment(SwingConstants.RIGHT);
		label_33.setBounds(318, 218, 75, 14);
		panel_2.add(label_33);
		
		JLabel label_34 = new JLabel("Coeficientes:");
		label_34.setForeground(new Color(0, 102, 0));
		label_34.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_34.setBounds(353, 193, 102, 14);
		panel_2.add(label_34);
		
		JLabel lblAntecedenteN_3 = new JLabel("Antecedente N\u00BA 4");
		lblAntecedenteN_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAntecedenteN_3.setBounds(520, 50, 102, 14);
		panel_2.add(lblAntecedenteN_3);
		
		textFieldFrenteAnt4 = new JTextField();
		textFieldFrenteAnt4.setColumns(10);
		textFieldFrenteAnt4.setBounds(560, 75, 86, 20);
		panel_2.add(textFieldFrenteAnt4);
		
		JLabel label_36 = new JLabel("Frente:");
		label_36.setBounds(520, 78, 46, 14);
		panel_2.add(label_36);
		
		JLabel label_37 = new JLabel("\u00C1rea:");
		label_37.setBounds(520, 106, 46, 14);
		panel_2.add(label_37);
		
		textFieldAreaAnt4 = new JTextField();
		textFieldAreaAnt4.setColumns(10);
		textFieldAreaAnt4.setBounds(560, 103, 86, 20);
		panel_2.add(textFieldAreaAnt4);
		
		JLabel lblFondoAnt4 = new JLabel("");
		lblFondoAnt4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblFondoAnt4.setBounds(560, 134, 86, 20);
		panel_2.add(lblFondoAnt4);
		
		JLabel label_39 = new JLabel("Fondo");
		label_39.setBounds(520, 134, 46, 14);
		panel_2.add(label_39);
		
		JLabel lblPrecioUsd_3 = new JLabel("Precio USD:");
		lblPrecioUsd_3.setBounds(491, 168, 86, 14);
		panel_2.add(lblPrecioUsd_3);
		
		textFieldPrecioAnt4 = new JTextField();
		textFieldPrecioAnt4.setColumns(10);
		textFieldPrecioAnt4.setBounds(560, 165, 86, 20);
		panel_2.add(textFieldPrecioAnt4);
		
		JLabel label_41 = new JLabel("Coeficientes:");
		label_41.setForeground(new Color(0, 102, 0));
		label_41.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_41.setBounds(510, 193, 102, 14);
		panel_2.add(label_41);
		
		JLabel label_42 = new JLabel("Frente:");
		label_42.setForeground(new Color(0, 102, 0));
		label_42.setHorizontalAlignment(SwingConstants.RIGHT);
		label_42.setBounds(475, 218, 75, 14);
		panel_2.add(label_42);
		
		JLabel lblCoefFte4 = new JLabel("");
		lblCoefFte4.setForeground(new Color(0, 102, 0));
		lblCoefFte4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCoefFte4.setBounds(560, 212, 86, 20);
		panel_2.add(lblCoefFte4);
		
		JLabel lblCoefFdo4 = new JLabel("");
		lblCoefFdo4.setForeground(new Color(0, 102, 0));
		lblCoefFdo4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCoefFdo4.setBounds(560, 234, 86, 20);
		panel_2.add(lblCoefFdo4);
		
		JLabel label_45 = new JLabel("Fondo:");
		label_45.setForeground(new Color(0, 102, 0));
		label_45.setHorizontalAlignment(SwingConstants.RIGHT);
		label_45.setBounds(475, 240, 75, 14);
		panel_2.add(label_45);
		
		JLabel label_46 = new JLabel("Ajuste:");
		label_46.setForeground(new Color(0, 102, 0));
		label_46.setHorizontalAlignment(SwingConstants.RIGHT);
		label_46.setBounds(475, 263, 75, 14);
		panel_2.add(label_46);
		
		JLabel lblPrecioAjuste4 = new JLabel("");
		lblPrecioAjuste4.setForeground(new Color(0, 102, 0));
		lblPrecioAjuste4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblPrecioAjuste4.setBounds(560, 257, 86, 20);
		panel_2.add(lblPrecioAjuste4);
		
		JLabel label = new JLabel("Antecedente N\u00BA 1 ");
		label.setForeground(new Color(204, 51, 0));
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(692, 50, 102, 14);
		panel_2.add(label);
		
		JLabel lblMetroCuadradoAnt1 = new JLabel("");
		lblMetroCuadradoAnt1.setForeground(new Color(204, 51, 0));
		lblMetroCuadradoAnt1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMetroCuadradoAnt1.setBounds(692, 72, 102, 20);
		panel_2.add(lblMetroCuadradoAnt1);
		
		JLabel label_14 = new JLabel("Antecedente N\u00BA 2");
		label_14.setForeground(new Color(204, 51, 0));
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_14.setBounds(692, 100, 102, 14);
		panel_2.add(label_14);
		
		JLabel lblMetroCuadradoAnt2 = new JLabel("");
		lblMetroCuadradoAnt2.setForeground(new Color(204, 51, 0));
		lblMetroCuadradoAnt2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMetroCuadradoAnt2.setBounds(692, 117, 102, 20);
		panel_2.add(lblMetroCuadradoAnt2);
		
		JLabel label_16 = new JLabel("Antecedente N\u00BA 3");
		label_16.setForeground(new Color(204, 51, 0));
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_16.setBounds(692, 140, 102, 14);
		panel_2.add(label_16);
		
		JLabel lblMetroCuadradoAnt3 = new JLabel("");
		lblMetroCuadradoAnt3.setForeground(new Color(204, 51, 0));
		lblMetroCuadradoAnt3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMetroCuadradoAnt3.setBounds(692, 156, 102, 20);
		panel_2.add(lblMetroCuadradoAnt3);
		
		JLabel label_20 = new JLabel("Antecedente N\u00BA 4");
		label_20.setForeground(new Color(204, 51, 0));
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_20.setBounds(692, 180, 102, 14);
		panel_2.add(label_20);
		
		JLabel lblMetroCuadradoAnt4 = new JLabel("");
		lblMetroCuadradoAnt4.setForeground(new Color(204, 51, 0));
		lblMetroCuadradoAnt4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMetroCuadradoAnt4.setBounds(692, 199, 102, 20);
		panel_2.add(lblMetroCuadradoAnt4);
		
		JLabel lblMetroCuadradoAntProm = new JLabel("");
		lblMetroCuadradoAntProm.setForeground(new Color(204, 51, 0));
		lblMetroCuadradoAntProm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMetroCuadradoAntProm.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMetroCuadradoAntProm.setBounds(692, 240, 102, 37);
		panel_2.add(lblMetroCuadradoAntProm);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setForeground(new Color(204, 51, 0));
		lblPromedio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPromedio.setBounds(692, 221, 102, 14);
		panel_2.add(lblPromedio);
		
		JLabel lblAjustesM = new JLabel("Ajustes USD/M2");
		lblAjustesM.setForeground(new Color(204, 51, 0));
		lblAjustesM.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAjustesM.setBounds(692, 25, 102, 14);
		panel_2.add(lblAjustesM);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(667, 27, 10, 250);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(216, -113, 10, 81);
		panel_2.add(separator_1);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		btnCerrar.setBackground(new Color(245, 222, 179));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		btnCerrar.setBounds(734, 480, 103, 32);
		contentPane.add(btnCerrar);
		
		JButton btnResetear = new JButton("Resetear");
		btnResetear.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		btnResetear.setBackground(new Color(245, 222, 179));
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldFrente.setText(null);
				textFieldArea.setText(null);
				textFieldFrenteLM.setText(null);
				textFieldFondoLM.setText(null);
				textFieldFrenteAnt1.setText(null);
				textFieldAreaAnt1.setText(null);
				textFieldPrecioAnt1.setText(null);
				textFieldFrenteAnt2.setText(null);
				textFieldAreaAnt2.setText(null);
				textFieldPrecioAnt2.setText(null);
				textFieldFrenteAnt3.setText(null);
				textFieldAreaAnt3.setText(null);
				textFieldPrecioAnt3.setText(null);
				textFieldFrenteAnt4.setText(null);
				textFieldAreaAnt4.setText(null);
				textFieldPrecioAnt4.setText(null);
				lblFondoLP.setText(null);
				lblFteCoef.setText(null);
				lblFdoCoef.setText(null);
				lblFondoAnt1.setText(null);
				lblCoefFte1.setText(null);
				lblCoefFdo1.setText(null);
				lblPrecioAjuste1.setText(null);
				lblFondoAnt2.setText(null);
				lblCoefFte2.setText(null);
				lblCoefFdo2.setText(null);
				lblPrecioAjuste2.setText(null);
				lblFondoAnt3.setText(null);
				lblCoefFte3.setText(null);
				lblCoefFdo3.setText(null);
				lblPrecioAjuste3.setText(null);
				lblFondoAnt4.setText(null);
				lblCoefFte4.setText(null);
				lblCoefFdo4.setText(null);
				lblPrecioAjuste4.setText(null);
				comboBoxFondo.setSelectedItem("COEF. FONDO");
				
				
				
			}
		});
		btnResetear.setBounds(599, 480, 108, 32);
		contentPane.add(btnResetear);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		btnCalcular.setBackground(new Color(245, 222, 179));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{
					
					String precioAntPrimero = textFieldPrecioAnt1.getText();
					double precioAntPrimero1 = Double.parseDouble(precioAntPrimero);
					
					String precioAntSegundo = textFieldPrecioAnt2.getText();
					double precioAntSegundo1 = Double.parseDouble(precioAntSegundo);
					
					String precioAntTercero = textFieldPrecioAnt3.getText();
					double precioAntTercero1 = Double.parseDouble(precioAntTercero);
					
					String precioAntCuarto = textFieldPrecioAnt4.getText();
					double precioAntCuarto1 = Double.parseDouble(precioAntCuarto);
				
				// ------------------ HALLO FONDO FICTO --------------------//
				String frente = textFieldFrente.getText();
				double frente1 = Double.parseDouble(frente);
				String area = textFieldArea.getText();
				double area1 = Double.parseDouble(area);			
				double fondo = area1/frente1;
				String fondo1 = String.format("%.3f", fondo);
				lblFondoLP.setText(fondo1);
				// ------------------ HALLO COEFICIENTE FRENTE --------------------//
				double coefFrente = metodo.valienteNoaillesAdaptadoVariableFrente(frente1);
				String coefFrente1 = String.format("%.3f", coefFrente);
				lblFteCoef.setText(coefFrente1);
				// ----------------------------------------------------------------------------------//
				// ------------------ HALLO FONDO FICTO  // ANTECEDENTE 1  --------------------//
				String frenteAntPrim = textFieldFrenteAnt1.getText();
				double frenteAntPrim1 = Double.parseDouble(frenteAntPrim);
				String areaAntPrim = textFieldAreaAnt1.getText();
				double areaAntPrim1 = Double.parseDouble(areaAntPrim);			
				double fondoAntPrim = areaAntPrim1/frenteAntPrim1;
				String fondoAntPrimero = String.format("%.3f", fondoAntPrim);
				lblFondoAnt1.setText(fondoAntPrimero);
				// ------------------ HALLO COEFICIENTE FRENTE  // ANTECEDENTE 1--------------------//
				double coefFrenteAntPrim = metodo.valienteNoaillesAdaptadoVariableFrente(frenteAntPrim1);
				String coefFrenteAntPrim1 = String.format("%.3f", coefFrenteAntPrim);
				lblCoefFte1.setText(coefFrenteAntPrim1);
				// ----------------------------------------------------------------------------------//
				// ------------------ HALLO FONDO FICTO  // ANTECEDENTE 2  --------------------//
				String frenteAntSeg = textFieldFrenteAnt2.getText();
				double frenteAntSeg1 = Double.parseDouble(frenteAntSeg);
				String areaAntSeg = textFieldAreaAnt2.getText();
				double areaAntSeg1 = Double.parseDouble(areaAntSeg);			
				double fondoAntSeg = areaAntSeg1/frenteAntSeg1;
				String fondoAntSegundo = String.format("%.3f", fondoAntSeg);
				lblFondoAnt2.setText(fondoAntSegundo);
				// ------------------ HALLO COEFICIENTE FRENTE  // ANTECEDENTE 2--------------------//
				double coefFrenteAntSeg = metodo.valienteNoaillesAdaptadoVariableFrente(frenteAntSeg1);
				String coefFrenteAntSeg1 = String.format("%.3f", coefFrenteAntSeg);
				lblCoefFte2.setText(coefFrenteAntSeg1);
				
				// ----------------------------------------------------------------------------------//
				// ------------------ HALLO FONDO FICTO  // ANTECEDENTE 3  --------------------//
				String frenteAntTercero = textFieldFrenteAnt3.getText();
				double frenteAntTercero1 = Double.parseDouble(frenteAntTercero);
				
				String areaAntTercero = textFieldAreaAnt3.getText();
				double areaAntTercero1 = Double.parseDouble(areaAntTercero);
				
				double fondoAntTercero = areaAntTercero1/frenteAntTercero1;
				String fondoAntTercero1 = String.format("%.3f", fondoAntTercero);
				
				lblFondoAnt3.setText(fondoAntTercero1);
				// ------------------ HALLO COEFICIENTE FRENTE  // ANTECEDENTE 3--------------------//
				double coefFrenteAntTercero = metodo.valienteNoaillesAdaptadoVariableFrente(frenteAntTercero1);
				String coefFrenteAntTercero1 = String.format("%.3f", coefFrenteAntTercero);
				lblCoefFte3.setText(coefFrenteAntTercero1);
				
				// ----------------------------------------------------------------------------------//
				// ------------------ HALLO FONDO FICTO  // ANTECEDENTE 4  --------------------//
				String frenteAntCuarto = textFieldFrenteAnt4.getText();
				double frenteAntCuarto1 = Double.parseDouble(frenteAntCuarto);
				String areaAntCuarto = textFieldAreaAnt4.getText();
				double areaAntCuarto1 = Double.parseDouble(areaAntCuarto);			
				double fondoAntCuarto = areaAntCuarto1/frenteAntCuarto1;
				String fondoAntCuarto1 = String.format("%.3f", fondoAntCuarto);
				lblFondoAnt4.setText(fondoAntCuarto1);
				// ------------------ HALLO COEFICIENTE FRENTE  // ANTECEDENTE 4--------------------//
				double coefFrenteAntCuarto = metodo.valienteNoaillesAdaptadoVariableFrente(frenteAntCuarto1);
				String coefFrenteAntCuarto1 = String.format("%.3f", coefFrenteAntCuarto);
				lblCoefFte4.setText(coefFrenteAntCuarto1);
				
				
				// ----------------------------------------------------------------------------------//		
				// ---------------------- APLICO COEFICIENTES FONDO SEGÚN COMBOBOX ------------------------------//
				
				String fondoLoteMedial = textFieldFondoLM.getText();
				double fondoLoteMedial1 = Double.parseDouble(fondoLoteMedial);
				
				if(comboBoxFondo.getSelectedItem()=="HOFFMAN NEILL"){
					double coefFdo = 0.415;
					
					// ------------- COEF FONDO LOTE PROBLEMA ---------------------------------------------------------//
					double coef1 = fondoLoteMedial1/fondo;
					double coef2 = Math.ceil(coef1*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondo = Math.pow(coef2, coefFdo);
					double resultado = Math.ceil(exponenciaFondo*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoLoteProblema = String.format("%.3f", resultado);
					
					lblFdoCoef.setText(coefFdoLoteProblema);
					// ------------- ANTECEDENTE 1 ---------------------------------------------------------//
					double coefAntPrim = fondoLoteMedial1/fondoAntPrim;
					double coefAntPrim1 = Math.ceil(coefAntPrim*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntPrim = Math.pow(coefAntPrim1, coefFdo);
					double resultadoAntPrim = Math.ceil(exponenciaFondoAntPrim*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntPrimero = String.format("%.3f", resultadoAntPrim);
					
					double ajustePrecioAntecedentePrimero = precioAntPrimero1*resultadoAntPrim*coefFrenteAntPrim;
					String ajustePrecio1 =  String.format("%.3f", ajustePrecioAntecedentePrimero);
					lblPrecioAjuste1.setText(ajustePrecio1);
					double ajusteMetroCuadradoPrimero = ajustePrecioAntecedentePrimero/areaAntPrim1;
					String ajusteMetroCuadradoPrimero1 =  String.format("%.3f", ajusteMetroCuadradoPrimero);
					lblMetroCuadradoAnt1.setText(ajusteMetroCuadradoPrimero1);
					
					lblCoefFdo1.setText(coefFdoAntPrimero);
					// ------------- ANTECEDENTE 2 ---------------------------------------------------------//
					double coefAntSeg = fondoLoteMedial1/fondoAntSeg;
					double coefAntSeg1 = Math.ceil(coefAntSeg*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntSeg = Math.pow(coefAntSeg1, coefFdo);
					double resultadoAntSeg = Math.ceil(exponenciaFondoAntSeg*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntSegundo = String.format("%.3f", resultadoAntSeg);
					
					double ajustePrecioAntecedenteSegundo = precioAntSegundo1*resultadoAntSeg*coefFrenteAntSeg;
					String ajustePrecio2 =  String.format("%.3f", ajustePrecioAntecedenteSegundo);
					lblPrecioAjuste2.setText(ajustePrecio2);
					double ajusteMetroCuadradoSegundo = ajustePrecioAntecedenteSegundo/areaAntSeg1;
					String ajusteMetroCuadradoSegundo1 =  String.format("%.3f", ajusteMetroCuadradoSegundo);
					lblMetroCuadradoAnt2.setText(ajusteMetroCuadradoSegundo1);
					
					lblCoefFdo2.setText(coefFdoAntSegundo);
					
					// ------------- ANTECEDENTE 3 ---------------------------------------------------------//
					double coefAntTercero = fondoLoteMedial1/fondoAntTercero;
					double coefAntTercero1 = Math.ceil(coefAntTercero*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntTercero = Math.pow(coefAntTercero1, coefFdo);
					double resultadoAntTercero = Math.ceil(exponenciaFondoAntTercero*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntTercero = String.format("%.3f", resultadoAntTercero);
					
					double ajustePrecioAntecedenteTercero = precioAntTercero1*resultadoAntTercero*coefFrenteAntTercero;
					String ajustePrecio3 =  String.format("%.3f", ajustePrecioAntecedenteTercero);
					lblPrecioAjuste3.setText(ajustePrecio3);
					double ajusteMetroCuadradoTercero = ajustePrecioAntecedenteTercero/areaAntTercero1;
					String ajusteMetroCuadradoTercero1 =  String.format("%.3f", ajusteMetroCuadradoTercero);
					lblMetroCuadradoAnt3.setText(ajusteMetroCuadradoTercero1);
					
					lblCoefFdo3.setText(coefFdoAntTercero);
					// ------------- ANTECEDENTE 4 ---------------------------------------------------------//
					double coefAntCuarto = fondoLoteMedial1/fondoAntCuarto;
					double coefAntCuarto1 = Math.ceil(coefAntCuarto*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntCuarto = Math.pow(coefAntCuarto1, coefFdo);
					double resultadoAntCuarto = Math.ceil(exponenciaFondoAntCuarto*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntCuarto = String.format("%.3f", resultadoAntCuarto);
					
					double ajustePrecioAntecedenteCuarto = precioAntCuarto1*resultadoAntCuarto*coefFrenteAntCuarto;
					String ajustePrecio4 =  String.format("%.3f", ajustePrecioAntecedenteCuarto);
					lblPrecioAjuste4.setText(ajustePrecio4);
					double ajusteMetroCuadradoCuarto = ajustePrecioAntecedenteCuarto/areaAntCuarto1;
					String ajusteMetroCuadradoCuarto1 =  String.format("%.3f", ajusteMetroCuadradoCuarto);
					lblMetroCuadradoAnt4.setText(ajusteMetroCuadradoCuarto1);
					
					lblCoefFdo4.setText(coefFdoAntCuarto);
					

					//---------------------------------------- HAGO PROMEDIO DEL RESULTADO Y LO USO ---------------------
					
					double sumaTotal = (ajusteMetroCuadradoPrimero + ajusteMetroCuadradoSegundo + ajusteMetroCuadradoTercero + ajusteMetroCuadradoCuarto)/4;
					double sumaTotal1 = Math.ceil(sumaTotal*1000)/1000;
					String sumaTotal2 = String.format("%.2f", sumaTotal1);
					lblMetroCuadradoAntProm.setText(sumaTotal2);
					
					//----------------- MULTIPLICO LOS RESULTADOS POR COEFICIENTES PARA TASAR ----------------------------------//
					
					double tasar = sumaTotal1 *resultado*coefFrente*area1;
					double tasar1 = Math.ceil(tasar*1000)/1000;
					String tasar2 = String.format("%.2f", tasar1);
					lblTasaciónTotal.setText(tasar2);
					
				}else if(comboBoxFondo.getSelectedItem()=="1/3 - 2/3"){
					double coefFdo = 0.369;
					
					
					// ------------- COEF FONDO LOTE PROBLEMA ---------------------------------------------------------//
					double coef1 = fondoLoteMedial1/fondo;
					double coef2 = Math.ceil(coef1*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondo = Math.pow(coef2, coefFdo);
					double resultado = Math.ceil(exponenciaFondo*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoLoteProblema = String.format("%.3f", resultado);
					
					lblFdoCoef.setText(coefFdoLoteProblema);
					// ------------- ANTECEDENTE 1 ---------------------------------------------------------//
					double coefAntPrim = fondoLoteMedial1/fondoAntPrim;
					double coefAntPrim1 = Math.ceil(coefAntPrim*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntPrim = Math.pow(coefAntPrim1, coefFdo);
					double resultadoAntPrim = Math.ceil(exponenciaFondoAntPrim*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntPrimero = String.format("%.3f", resultadoAntPrim);
					
					double ajustePrecioAntecedentePrimero = precioAntPrimero1*resultadoAntPrim*coefFrenteAntPrim;
					String ajustePrecio1 =  String.format("%.3f", ajustePrecioAntecedentePrimero);
					lblPrecioAjuste1.setText(ajustePrecio1);
					double ajusteMetroCuadradoPrimero = ajustePrecioAntecedentePrimero/areaAntPrim1;
					String ajusteMetroCuadradoPrimero1 =  String.format("%.3f", ajusteMetroCuadradoPrimero);
					lblMetroCuadradoAnt1.setText(ajusteMetroCuadradoPrimero1);
					
					lblCoefFdo1.setText(coefFdoAntPrimero);
					// ------------- ANTECEDENTE 2 ---------------------------------------------------------//
					double coefAntSeg = fondoLoteMedial1/fondoAntSeg;
					double coefAntSeg1 = Math.ceil(coefAntSeg*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntSeg = Math.pow(coefAntSeg1, coefFdo);
					double resultadoAntSeg = Math.ceil(exponenciaFondoAntSeg*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntSegundo = String.format("%.3f", resultadoAntSeg);
					
					double ajustePrecioAntecedenteSegundo = precioAntSegundo1*resultadoAntSeg*coefFrenteAntSeg;
					String ajustePrecio2 =  String.format("%.3f", ajustePrecioAntecedenteSegundo);
					lblPrecioAjuste2.setText(ajustePrecio2);
					double ajusteMetroCuadradoSegundo = ajustePrecioAntecedenteSegundo/areaAntSeg1;
					String ajusteMetroCuadradoSegundo1 =  String.format("%.3f", ajusteMetroCuadradoSegundo);
					lblMetroCuadradoAnt2.setText(ajusteMetroCuadradoSegundo1);
					
					lblCoefFdo2.setText(coefFdoAntSegundo);
					// ------------- ANTECEDENTE 3 ---------------------------------------------------------//
					double coefAntTercero = fondoLoteMedial1/fondoAntTercero;
					double coefAntTercero1 = Math.ceil(coefAntTercero*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntTercero = Math.pow(coefAntTercero1, coefFdo);
					double resultadoAntTercero = Math.ceil(exponenciaFondoAntTercero*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntTercero = String.format("%.3f", resultadoAntTercero);
					
					double ajustePrecioAntecedenteTercero = precioAntTercero1*resultadoAntTercero*coefFrenteAntTercero;
					String ajustePrecio3 =  String.format("%.3f", ajustePrecioAntecedenteTercero);
					lblPrecioAjuste3.setText(ajustePrecio3);
					double ajusteMetroCuadradoTercero = ajustePrecioAntecedenteTercero/areaAntTercero1;
					String ajusteMetroCuadradoTercero1 =  String.format("%.3f", ajusteMetroCuadradoTercero);
					lblMetroCuadradoAnt3.setText(ajusteMetroCuadradoTercero1);
					
					lblCoefFdo3.setText(coefFdoAntTercero);
					// ------------- ANTECEDENTE 4 ---------------------------------------------------------//
					double coefAntCuarto = fondoLoteMedial1/fondoAntCuarto;
					double coefAntCuarto1 = Math.ceil(coefAntCuarto*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntCuarto = Math.pow(coefAntCuarto1, coefFdo);
					double resultadoAntCuarto = Math.ceil(exponenciaFondoAntCuarto*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntCuarto = String.format("%.3f", resultadoAntCuarto);
					
					double ajustePrecioAntecedenteCuarto = precioAntCuarto1*resultadoAntCuarto*coefFrenteAntCuarto;
					String ajustePrecio4 =  String.format("%.3f", ajustePrecioAntecedenteCuarto);
					lblPrecioAjuste4.setText(ajustePrecio4);
					double ajusteMetroCuadradoCuarto = ajustePrecioAntecedenteCuarto/areaAntCuarto1;
					String ajusteMetroCuadradoCuarto1 =  String.format("%.3f", ajusteMetroCuadradoCuarto);
					lblMetroCuadradoAnt4.setText(ajusteMetroCuadradoCuarto1);
					
					lblCoefFdo4.setText(coefFdoAntCuarto);
					

					//---------------------------------------- HAGO PROMEDIO DEL RESULTADO Y LO USO ---------------------
					
					double sumaTotal = (ajusteMetroCuadradoPrimero + ajusteMetroCuadradoSegundo + ajusteMetroCuadradoTercero + ajusteMetroCuadradoCuarto)/4;
					double sumaTotal1 = Math.ceil(sumaTotal*1000)/1000;
					String sumaTotal2 = String.format("%.2f", sumaTotal1);
					lblMetroCuadradoAntProm.setText(sumaTotal2);
					
					//----------------- MULTIPLICO LOS RESULTADOS POR COEFICIENTES PARA TASAR ----------------------------------//
					
					double tasar = sumaTotal1 *resultado*coefFrente*area1;
					double tasar1 = Math.ceil(tasar*1000)/1000;
					String tasar2 = String.format("%.2f", tasar1);
					lblTasaciónTotal.setText(tasar2);
					
					
				}else if(comboBoxFondo.getSelectedItem()=="HARPER"){
					double coefFdo = 0.5;
					
					// ------------- COEF FONDO LOTE PROBLEMA ---------------------------------------------------------//
					double coef1 = fondoLoteMedial1/fondo;
					double coef2 = Math.ceil(coef1*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondo = Math.pow(coef2, coefFdo);
					double resultado = Math.ceil(exponenciaFondo*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoLoteProblema = String.format("%.3f", resultado);
					
					lblFdoCoef.setText(coefFdoLoteProblema);
					// ------------- ANTECEDENTE 1 ---------------------------------------------------------//
					double coefAntPrim = fondoLoteMedial1/fondoAntPrim;
					double coefAntPrim1 = Math.ceil(coefAntPrim*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntPrim = Math.pow(coefAntPrim1, coefFdo);
					double resultadoAntPrim = Math.ceil(exponenciaFondoAntPrim*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntPrimero = String.format("%.3f", resultadoAntPrim);
					
					double ajustePrecioAntecedentePrimero = precioAntPrimero1*resultadoAntPrim*coefFrenteAntPrim;
					String ajustePrecio1 =  String.format("%.3f", ajustePrecioAntecedentePrimero);
					lblPrecioAjuste1.setText(ajustePrecio1);
					double ajusteMetroCuadradoPrimero = ajustePrecioAntecedentePrimero/areaAntPrim1;
					String ajusteMetroCuadradoPrimero1 =  String.format("%.3f", ajusteMetroCuadradoPrimero);
					lblMetroCuadradoAnt1.setText(ajusteMetroCuadradoPrimero1);
					
					lblCoefFdo1.setText(coefFdoAntPrimero);
					// ------------- ANTECEDENTE 2 ---------------------------------------------------------//
					double coefAntSeg = fondoLoteMedial1/fondoAntSeg;
					double coefAntSeg1 = Math.ceil(coefAntSeg*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntSeg = Math.pow(coefAntSeg1, coefFdo);
					double resultadoAntSeg = Math.ceil(exponenciaFondoAntSeg*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntSegundo = String.format("%.3f", resultadoAntSeg);
					
					double ajustePrecioAntecedenteSegundo = precioAntSegundo1*resultadoAntSeg*coefFrenteAntSeg;
					String ajustePrecio2 =  String.format("%.3f", ajustePrecioAntecedenteSegundo);
					lblPrecioAjuste2.setText(ajustePrecio2);
					double ajusteMetroCuadradoSegundo = ajustePrecioAntecedenteSegundo/areaAntSeg1;
					String ajusteMetroCuadradoSegundo1 =  String.format("%.3f", ajusteMetroCuadradoSegundo);
					lblMetroCuadradoAnt2.setText(ajusteMetroCuadradoSegundo1);
					
					lblCoefFdo2.setText(coefFdoAntSegundo);
					// ------------- ANTECEDENTE 3 ---------------------------------------------------------//
					double coefAntTercero = fondoLoteMedial1/fondoAntTercero;
					double coefAntTercero1 = Math.ceil(coefAntTercero*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntTercero = Math.pow(coefAntTercero1, coefFdo);
					double resultadoAntTercero = Math.ceil(exponenciaFondoAntTercero*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntTercero = String.format("%.3f", resultadoAntTercero);
					
					double ajustePrecioAntecedenteTercero = precioAntTercero1*resultadoAntTercero*coefFrenteAntTercero;
					String ajustePrecio3 =  String.format("%.3f", ajustePrecioAntecedenteTercero);
					lblPrecioAjuste3.setText(ajustePrecio3);
					double ajusteMetroCuadradoTercero = ajustePrecioAntecedenteTercero/areaAntTercero1;
					String ajusteMetroCuadradoTercero1 =  String.format("%.3f", ajusteMetroCuadradoTercero);
					lblMetroCuadradoAnt3.setText(ajusteMetroCuadradoTercero1);
					
					lblCoefFdo3.setText(coefFdoAntTercero);
					// ------------- ANTECEDENTE 4 ---------------------------------------------------------//
					double coefAntCuarto = fondoLoteMedial1/fondoAntCuarto;
					double coefAntCuarto1 = Math.ceil(coefAntCuarto*1000)/1000; // lo redondeo a tres números después de la coma
					double exponenciaFondoAntCuarto = Math.pow(coefAntCuarto1, coefFdo);
					double resultadoAntCuarto = Math.ceil(exponenciaFondoAntCuarto*1000)/1000; // lo redondeo a tres números después de la coma
					String coefFdoAntCuarto = String.format("%.3f", resultadoAntCuarto);
					
					double ajustePrecioAntecedenteCuarto = precioAntCuarto1*resultadoAntCuarto*coefFrenteAntCuarto;
					String ajustePrecio4 =  String.format("%.3f", ajustePrecioAntecedenteCuarto);
					lblPrecioAjuste4.setText(ajustePrecio4);
					double ajusteMetroCuadradoCuarto = ajustePrecioAntecedenteCuarto/areaAntCuarto1;
					String ajusteMetroCuadradoCuarto1 =  String.format("%.3f", ajusteMetroCuadradoCuarto);
					lblMetroCuadradoAnt4.setText(ajusteMetroCuadradoCuarto1);
					
					lblCoefFdo4.setText(coefFdoAntCuarto);
				
					//---------------------------------------- HAGO PROMEDIO DEL RESULTADO Y LO USO ---------------------
					
					double sumaTotal = (ajusteMetroCuadradoPrimero + ajusteMetroCuadradoSegundo + ajusteMetroCuadradoTercero + ajusteMetroCuadradoCuarto)/4;
					double sumaTotal1 = Math.ceil(sumaTotal*1000)/1000;
					String sumaTotal2 = String.format("%.2f", sumaTotal1);
					lblMetroCuadradoAntProm.setText(sumaTotal2);
					
					//----------------- MULTIPLICO LOS RESULTADOS POR COEFICIENTES PARA TASAR ----------------------------------//
					
					double tasar = sumaTotal1 *resultado*coefFrente*area1;
					double tasar1 = Math.ceil(tasar*1000)/1000;
					String tasar2 = String.format("%.2f", tasar1);
					lblTasaciónTotal.setText(tasar2);
					
					
				}else{
					JOptionPane.showMessageDialog(null, "Seleccione una opción de la lista desplegable, gracias", "TASACIONES - Mensaje",JOptionPane.ERROR_MESSAGE, img);
				}
				
				
				
				
				}catch(Exception error){
					JOptionPane.showMessageDialog(null, "Debes ingresar todos los campos", "TASACIONES - Mensaje",JOptionPane.ERROR_MESSAGE, img);
				}
				
				
				
				
			}
		});
		btnCalcular.setBounds(20, 480, 129, 32);
		contentPane.add(btnCalcular);
		
		JLabel lblSeleccioneOpcin = new JLabel("Seleccione:");
		lblSeleccioneOpcin.setBounds(599, 20, 77, 14);
		contentPane.add(lblSeleccioneOpcin);
		
		
		comboBoxFondo.setModel(new DefaultComboBoxModel(new String[] {"COEF. FONDO", "HOFFMAN NEILL", "1/3 - 2/3", "HARPER"}));
		comboBoxFondo.setBounds(667, 17, 170, 20);
		contentPane.add(comboBoxFondo);
		
		JButton btnPdf = new JButton("PDF");
		btnPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VistaPdf vistaPdf = new VistaPdf();
				
				vistaPdf.setVisible(true);
			}
		});
		btnPdf.setBounds(171, 486, 89, 23);
		contentPane.add(btnPdf);
	}
}
