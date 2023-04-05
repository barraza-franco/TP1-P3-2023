package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JLabel sumaFila1 = new JLabel("10");
		sumaFila1.setBounds(190, 35, 46, 14);
		frame.getContentPane().add(sumaFila1);
		
		JLabel sumaFila2 = new JLabel("10");
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
		
		JLabel sumaFila3 = new JLabel("10");
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
		
		JLabel sumaFila4 = new JLabel("10");
		sumaFila4.setBounds(190, 125, 46, 14);
		frame.getContentPane().add(sumaFila4);
		
		JLabel sumaCol1 = new JLabel("10");
		sumaCol1.setHorizontalAlignment(SwingConstants.CENTER);
		sumaCol1.setBounds(40, 150, 15, 14);
		frame.getContentPane().add(sumaCol1);
		
		JLabel sumaCol2 = new JLabel("10");
		sumaCol2.setHorizontalAlignment(SwingConstants.CENTER);
		sumaCol2.setBounds(80, 150, 15, 14);
		frame.getContentPane().add(sumaCol2);
		
		JLabel sumaCol3 = new JLabel("10");
		sumaCol3.setHorizontalAlignment(SwingConstants.CENTER);
		sumaCol3.setBounds(120, 150, 15, 14);
		frame.getContentPane().add(sumaCol3);
		
		JLabel sumaCol4 = new JLabel("10");
		sumaCol4.setHorizontalAlignment(SwingConstants.CENTER);
		sumaCol4.setBounds(160, 150, 15, 14);
		frame.getContentPane().add(sumaCol4);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnEnviar);
	}
}
