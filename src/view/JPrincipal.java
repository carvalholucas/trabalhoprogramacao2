package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class JPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal window = new JPrincipal();
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
	public JPrincipal() {
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
		
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setBounds(12, 28, 117, 25);
		frame.getContentPane().add(btnProdutos);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setBounds(160, 28, 117, 25);
		frame.getContentPane().add(btnClientes);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setBounds(313, 28, 117, 25);
		frame.getContentPane().add(btnVendas);
	}
}
