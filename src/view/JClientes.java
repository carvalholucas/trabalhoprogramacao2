package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class JClientes {

	private JFrame frmPainelDeProdutos;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JClientes window = new JClientes();
					window.frmPainelDeProdutos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPainelDeProdutos = new JFrame();
		frmPainelDeProdutos.setTitle("Painel de Clientes");
		frmPainelDeProdutos.setBounds(100, 100, 450, 300);
		frmPainelDeProdutos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPainelDeProdutos.getContentPane().setLayout(null);
		
		// TODO: Model a partir dos objetos.
		DefaultTableModel model = new DefaultTableModel(new Object[][] {
		      { "some", "text" }, { "any", "text" }, { "even", "more" },
		      { "text", "strings" }, { "and", "other" }, { "text", "values" } },
		      new Object[] { "Column 1", "Column 2" });
		
		table = new JTable();
		table.setBounds(24, 36, 391, 205);
		frmPainelDeProdutos.getContentPane().add(table);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(157, -1, 117, 25);
		frmPainelDeProdutos.getContentPane().add(btnSalvar);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(28, -1, 117, 25);
		frmPainelDeProdutos.getContentPane().add(btnNovo);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(287, -1, 117, 25);
		frmPainelDeProdutos.getContentPane().add(btnRemover);
	}
}
