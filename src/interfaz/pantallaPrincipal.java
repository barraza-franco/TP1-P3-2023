package interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import juego.juegoAritmetico;

import javax.swing.JButton;
import java.awt.Font;

public class pantallaPrincipal {

	private JFrame frame;
	private JTextField fila0Col0;
	private JTextField fila0Col1;
	private JTextField fila0Col2;
	private JTextField fila0Col3;
	private JTextField fila1Col0;
	private JTextField fila1Col1;
	private JTextField fila1Col2;
	private JTextField fila1Col3;
	private JTextField fila2Col0;
	private JTextField fila2Col1;
	private JTextField fila2Col2;
	private JTextField fila2Col3;
	private JTextField fila3Col0;
	private JTextField fila3Col1;
	private JTextField fila3Col2;
	private JTextField fila3Col3;
	private JLabel msjErrorCamposVacios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantallaPrincipal window = new pantallaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pantallaPrincipal() {
		juegoAritmetico matriz= new juegoAritmetico(4);
		initialize(matriz.getMatriz(), matriz);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int[][] matrizJuego, juegoAritmetico matriz) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fila0Col0 = new JTextField();
		fila0Col0.setBounds(30, 30, 30, 20);
		frame.getContentPane().add(fila0Col0);
		fila0Col0.setColumns(10);
		
		fila0Col1 = new JTextField();
		fila0Col1.setColumns(10);
		fila0Col1.setBounds(70, 30, 30, 20);
		frame.getContentPane().add(fila0Col1);
		
		fila0Col2 = new JTextField();
		fila0Col2.setColumns(10);
		fila0Col2.setBounds(110, 30, 30, 20);
		frame.getContentPane().add(fila0Col2);
		
		fila0Col3 = new JTextField();
		fila0Col3.setColumns(10);
		fila0Col3.setBounds(150, 30, 30, 20);
		frame.getContentPane().add(fila0Col3);
		
		fila1Col0 = new JTextField();
		fila1Col0.setColumns(10);
		fila1Col0.setBounds(30, 60, 30, 20);
		frame.getContentPane().add(fila1Col0);
		
		fila1Col1 = new JTextField();
		fila1Col1.setColumns(10);
		fila1Col1.setBounds(70, 60, 30, 20);
		frame.getContentPane().add(fila1Col1);
		
		fila1Col2 = new JTextField();
		fila1Col2.setColumns(10);
		fila1Col2.setBounds(110, 60, 30, 20);
		frame.getContentPane().add(fila1Col2);
		
		fila1Col3 = new JTextField();
		fila1Col3.setColumns(10);
		fila1Col3.setBounds(150, 60, 30, 20);
		frame.getContentPane().add(fila1Col3);
		
		JLabel sumaFila1 = new JLabel(Integer.toString(matrizJuego[0][4]));
		sumaFila1.setBounds(190, 35, 46, 14);
		frame.getContentPane().add(sumaFila1);
		
		JLabel sumaFila2 = new JLabel(Integer.toString(matrizJuego[1][4]));
		sumaFila2.setBounds(190, 65, 46, 14);
		frame.getContentPane().add(sumaFila2);
		
		fila2Col0 = new JTextField();
		fila2Col0.setColumns(10);
		fila2Col0.setBounds(30, 90, 30, 20);
		frame.getContentPane().add(fila2Col0);
		
		fila2Col1 = new JTextField();
		fila2Col1.setColumns(10);
		fila2Col1.setBounds(70, 90, 30, 20);
		frame.getContentPane().add(fila2Col1);
		
		fila2Col2 = new JTextField();
		fila2Col2.setColumns(10);
		fila2Col2.setBounds(110, 90, 30, 20);
		frame.getContentPane().add(fila2Col2);
		
		fila2Col3 = new JTextField();
		fila2Col3.setColumns(10);
		fila2Col3.setBounds(150, 90, 30, 20);
		frame.getContentPane().add(fila2Col3);
		
		JLabel sumaFila3 = new JLabel(Integer.toString(matrizJuego[2][4]));
		sumaFila3.setBounds(190, 95, 46, 14);
		frame.getContentPane().add(sumaFila3);
		
		fila3Col0 = new JTextField();
		fila3Col0.setColumns(10);
		fila3Col0.setBounds(30, 120, 30, 20);
		frame.getContentPane().add(fila3Col0);
		
		fila3Col1 = new JTextField();
		fila3Col1.setColumns(10);
		fila3Col1.setBounds(70, 120, 30, 20);
		frame.getContentPane().add(fila3Col1);
		
		fila3Col2 = new JTextField();
		fila3Col2.setColumns(10);
		fila3Col2.setBounds(110, 120, 30, 20);
		frame.getContentPane().add(fila3Col2);
		
		fila3Col3 = new JTextField();
		fila3Col3.setColumns(10);
		fila3Col3.setBounds(150, 120, 30, 20);
		frame.getContentPane().add(fila3Col3);
		
		JLabel sumaFila4 = new JLabel(Integer.toString(matrizJuego[3][4]));
		sumaFila4.setBounds(190, 125, 46, 14);
		frame.getContentPane().add(sumaFila4);
		
		JLabel sumaCol1 = new JLabel(Integer.toString(matrizJuego[4][0]));
		sumaCol1.setHorizontalAlignment(SwingConstants.CENTER);
		sumaCol1.setBounds(40, 150, 15, 14);
		frame.getContentPane().add(sumaCol1);
		
		JLabel sumaCol2 = new JLabel(Integer.toString(matrizJuego[4][1]));
		sumaCol2.setHorizontalAlignment(SwingConstants.CENTER);
		sumaCol2.setBounds(80, 150, 15, 14);
		frame.getContentPane().add(sumaCol2);
		
		JLabel sumaCol3 = new JLabel(Integer.toString(matrizJuego[4][2]));
		sumaCol3.setHorizontalAlignment(SwingConstants.CENTER);
		sumaCol3.setBounds(120, 150, 15, 14);
		frame.getContentPane().add(sumaCol3);
		
		JLabel sumaCol4 = new JLabel(Integer.toString(matrizJuego[4][3]));
		sumaCol4.setHorizontalAlignment(SwingConstants.CENTER);
		sumaCol4.setBounds(160, 150, 15, 14);
		frame.getContentPane().add(sumaCol4);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnEnviar);
		
		JTextPane textPane = new JTextPane();
        textPane.setBounds(10, 11, 414, 239);
        textPane.setVisible(false);
        frame.getContentPane().add(textPane);
        
        msjErrorCamposVacios = new JLabel("No se permiten campos vacios");
        msjErrorCamposVacios.setFont(new Font("Tahoma", Font.BOLD, 14));
        msjErrorCamposVacios.setForeground(Color.RED);
        msjErrorCamposVacios.setHorizontalAlignment(SwingConstants.CENTER);
        msjErrorCamposVacios.setBounds(30, 230, 298, 17);
        msjErrorCamposVacios.setVisible(false);
        frame.getContentPane().add(msjErrorCamposVacios);
        
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Primer fila
				try {
				int fila0campo1 = Integer.parseInt(fila0Col0.getText());
				matriz.setElementoEnMatriz(0, 0, fila0campo1);
				
				int fila0campo2 = Integer.parseInt(fila0Col1.getText());
				matriz.setElementoEnMatriz(0, 1, fila0campo2);
				
				int fila0campo3 = Integer.parseInt(fila0Col2.getText());
				matriz.setElementoEnMatriz(0, 2, fila0campo3);
				
				int fila0campo4 = Integer.parseInt(fila0Col3.getText());
				matriz.setElementoEnMatriz(0, 3, fila0campo4);
				
				// Segunda fila
				int fila1campo1 = Integer.parseInt(fila1Col0.getText());
				matriz.setElementoEnMatriz(1, 0, fila1campo1);
				
				int fila1campo2 = Integer.parseInt(fila1Col1.getText());
				matriz.setElementoEnMatriz(1, 1, fila1campo2);
				
				int fila1campo3 = Integer.parseInt(fila1Col2.getText());
				matriz.setElementoEnMatriz(1, 2, fila1campo3);
				
				int fila1campo4 = Integer.parseInt(fila1Col3.getText());
				matriz.setElementoEnMatriz(1, 3, fila1campo4);
				
				// Tercer fila
				int fila2campo1 = Integer.parseInt(fila2Col0.getText());
				matriz.setElementoEnMatriz(2, 0, fila2campo1);
				
				int fila2campo2 = Integer.parseInt(fila2Col1.getText());
				matriz.setElementoEnMatriz(2, 1, fila2campo2);
				
				int fila2campo3 = Integer.parseInt(fila2Col2.getText());
				matriz.setElementoEnMatriz(2, 2, fila2campo3);
				
				int fila2campo4 = Integer.parseInt(fila2Col3.getText());
				matriz.setElementoEnMatriz(2, 3, fila2campo4);
				
				// Cuarta fila
				int fila3campo1 = Integer.parseInt(fila3Col0.getText());
				matriz.setElementoEnMatriz(3, 0, fila3campo1);
				
				int fila3campo2 = Integer.parseInt(fila3Col1.getText());
				matriz.setElementoEnMatriz(3, 1, fila3campo2);
				
				int fila3campo3 = Integer.parseInt(fila3Col2.getText());
				matriz.setElementoEnMatriz(3, 2, fila3campo3);
				
				int fila3campo4 = Integer.parseInt(fila3Col3.getText());
				matriz.setElementoEnMatriz(3, 3, fila3campo4);
				
				}catch (Exception e1) {
					msjErrorCamposVacios.setVisible(true);
				}
		        if(matriz.verificarEstadoDelJuego()) {

		            textPane.setVisible(true);
		            textPane.setText("Felicitaciones ganaste el juego");
		            frame.getContentPane().add(textPane);
		            textPane.setEditable(false);
		            
		            btnEnviar.setVisible(false);
		        }
			}
		});
		
	}
}
