package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controllres.ProdutoControllers;
import DAO.ProdutoDAO;
import Model.Produto;

import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListProducts extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldSearchName;
	private JTable tableDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListProducts frame = new ListProducts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ListProducts() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1440, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(0, 0, 1434, 87);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Sistema Loja 001980");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 0, 344, 87);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3_1.setIcon(new ImageIcon(
				"C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_shutdown_40px.png"));
		lblNewLabel_3_1.setBounds(1323, 0, 46, 87);
		panel.add(lblNewLabel_3_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.windowBorder);
		panel_1.setBounds(0, 115, 261, 656);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Cadastrar Produto\r\n");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastroProducts product = new CadastroProducts();
				product.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_Add_to_Collection_60px_1.png"));
		lblNewLabel_2.setBounds(10, 28, 241, 81);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Procurar Produto\r\n");
		lblNewLabel_2_1.setIcon(new ImageIcon(
				"C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_Package_Search_60px_2.png"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 133, 241, 81);
		panel_1.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Cadastrar Cliente");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastrarCliente cliente = null;
				try {
					cliente = new CadastrarCliente();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cliente.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon(
				"C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_add_user_male_60px.png"));
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBounds(10, 240, 241, 81);
		panel_1.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Procurar Cliente");
		lblNewLabel_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ListCliente listCliente = new ListCliente();
				listCliente.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon(
				"C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_search_client_60px_1.png"));
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1.setBounds(10, 340, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Procurar Funcionario");
		lblNewLabel_2_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ListFuncionario funcionario = new ListFuncionario();
				funcionario.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1_1_1_1_1.setIcon(new ImageIcon(
				"C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_job_seeker_60px.png"));
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 543, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Cadastra Funcionario");
		lblNewLabel_2_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CadastrarFuncionario funcionario = new CadastrarFuncionario();
					funcionario.setVisible(true);
					dispose();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_2_1_1_1_1.setIcon(new ImageIcon(
				"C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_coworking_60px_1.png"));
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1_1.setBounds(10, 443, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(123, 104, 238));
		panel_2.setBounds(280, 115, 1154, 61);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Consultar Produtos");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 0, 188, 61);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Buscar por Nome do Produto");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3.setBounds(280, 215, 237, 28);
		contentPane.add(lblNewLabel_3);

		textFieldSearchName = new JTextField();
		textFieldSearchName.setBounds(280, 253, 969, 36);
		contentPane.add(textFieldSearchName);
		textFieldSearchName.setColumns(10);

		JButton btnNewButton = new JButton("Pesquisar");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textFieldSearchName.getText().isEmpty()) {
					LoadTableData();
				} else {
					SearchName(textFieldSearchName.getText());
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(123, 104, 238));
		btnNewButton.setBounds(1267, 253, 133, 36);
		contentPane.add(btnNewButton);

		JScrollPane scrollPaneTableData = new JScrollPane();
		scrollPaneTableData.setBounds(280, 318, 1120, 372);
		contentPane.add(scrollPaneTableData);

		tableDados = new JTable();
		tableDados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		scrollPaneTableData.setViewportView(tableDados);
		tableDados.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Codigo Produto", "Nome Produto",
				"Tipo Produto", "Valor Produto", "Desci\u00E7\u00E3o" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableDados.getColumnModel().getColumn(0).setResizable(false);
		tableDados.getColumnModel().getColumn(0).setPreferredWidth(86);
		tableDados.getColumnModel().getColumn(1).setResizable(false);
		tableDados.getColumnModel().getColumn(1).setPreferredWidth(79);
		tableDados.getColumnModel().getColumn(2).setResizable(false);
		tableDados.getColumnModel().getColumn(3).setResizable(false);

		JButton btnNewButton_1 = new JButton("Deletar Produto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tableDados.getSelectedRow() != -1) {

					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja apagar esse produto ?", "Deleter",
							dialogButton);

					if (dialogResult == 0) {

						int row = tableDados.getSelectedRow();
						Integer id = (Integer) tableDados.getValueAt(row, 0);

						deletDateTable(id);
						JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");

					} else {
						JOptionPane.getRootFrame().dispose();
					}
				}
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnNewButton_1.setBounds(1273, 701, 127, 36);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Atualizar Produto");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tableDados.getSelectedRow() != -1) {

					UpdateProducts update = new UpdateProducts();
					update.preencheDados(tableDados.getValueAt(tableDados.getSelectedRow(), 0).toString(),
							tableDados.getValueAt(tableDados.getSelectedRow(), 1).toString(),
							tableDados.getValueAt(tableDados.getSelectedRow(), 2).toString(),
							tableDados.getValueAt(tableDados.getSelectedRow(), 3).toString(),
							tableDados.getValueAt(tableDados.getSelectedRow(), 4).toString());

					update.setVisible(true);
					dispose();

				} else {
					JOptionPane.showMessageDialog(null, "Selecione um porduto para editar! basta clicar 2X");
				}
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnNewButton_1_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1.setBounds(1109, 701, 140, 36);
		contentPane.add(btnNewButton_1_1);

		LoadTableData();

	}

	public void LoadTableData() {
		try {

			@SuppressWarnings("unused")
			List<Produto> lista = ProdutoControllers.procurar("");
			DefaultTableModel model = (DefaultTableModel) tableDados.getModel();
			if (model.getRowCount() > 0) {
				model.setRowCount(0);
			}

			for (Produto p : ProdutoControllers.procurar("")) {
				Object[] object = new Object[5];
				object[0] = p.getCodigo_produto();
				object[1] = p.getNome_produto();
				object[2] = p.getTipo_produto();
				object[3] = p.getValor_produto();
				object[4] = p.getNome_produto();
				model.addRow(object);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	public void SearchName(String NomeProduto) {
		ProdutoDAO dao = new ProdutoDAO();
		try {

			List<Produto> lista = ProdutoControllers.procurar("");
			DefaultTableModel model = (DefaultTableModel) tableDados.getModel();
			if (model.getRowCount() > 0) {
				model.setRowCount(0);
			}

			for (Produto p : ProdutoControllers.procurar(NomeProduto)) {
				Object[] object = new Object[5];
				object[0] = p.getCodigo_produto();
				object[1] = p.getNome_produto();
				object[2] = p.getTipo_produto();
				object[3] = p.getValor_produto();
				object[4] = p.getNome_produto();
				model.addRow(object);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deletDateTable(int id) {
		Produto produto = new Produto.ProdutoBuilder().codigo_produto(55).nome_produto("").valor_produto("")
				.tipo_produto("").descricao_produto("").criarProduto();

		produto.setCodigo_produto((int) tableDados.getValueAt(tableDados.getSelectedRow(), 0));

		ProdutoControllers.excluir(id);
		LoadTableData();
	}

	public void CampoVazio() {
		if (textFieldSearchName.getText().isEmpty()) {
			LoadTableData();
		}
	}

}
