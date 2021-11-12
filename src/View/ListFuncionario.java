package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controllres.FuncionariosControllers;
import Model.Funcionario;

public class ListFuncionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldSearch;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListFuncionario frame = new ListFuncionario();
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
	public ListFuncionario() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1440, 800);
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
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_shutdown_40px.png"));
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
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_Add_to_Collection_60px_1.png"));
		lblNewLabel_2.setBounds(10, 27, 241, 81);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Procurar Produto\r\n");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ListProducts products = new ListProducts();
				products.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_Package_Search_60px_2.png"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 132, 241, 81);
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
		
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_add_user_male_60px.png"));
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBounds(10, 239, 241, 81);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Procurar Cliente");
		lblNewLabel_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ListFuncionario listCliente = new ListFuncionario();
				listCliente.setVisible(true);
				dispose();
			}
		});
		
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_search_client_60px_1.png"));
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1.setBounds(10, 339, 241, 81);
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
		lblNewLabel_2_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_job_seeker_60px.png"));
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 545, 241, 81);
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
		lblNewLabel_2_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_coworking_60px_1.png"));
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1_1.setBounds(10, 445, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(123, 104, 238));
		panel_2.setBounds(280, 115, 1154, 61);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Consultar Funcionario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 0, 188, 61);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Buscar por Nome do Funcionario");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3.setBounds(280, 215, 282, 28);
		contentPane.add(lblNewLabel_3);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(280, 253, 917, 40);
		contentPane.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JButton btnNewButtonSearch = new JButton("Procurar");
		btnNewButtonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldSearch.getText().isEmpty()) {
					LoadDataTable();
				}else {
					SearchName(textFieldSearch.getText());
				}
			}
		});
		btnNewButtonSearch.setBackground(new Color(123, 104, 238));
		btnNewButtonSearch.setForeground(Color.WHITE);
		btnNewButtonSearch.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButtonSearch.setBounds(1221, 253, 152, 40);
		contentPane.add(btnNewButtonSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(280, 339, 1093, 325);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "CPF", "Data Contrata\u00E7\u00E3o", "Sal\u00E1rio", "Cargo"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		

		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_1 = new JButton("Atualizar funcionario");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()!= -1) {
					
					UpdateFuncionario update = new UpdateFuncionario();
					update.preencheDados(table.getValueAt(table.getSelectedRow(), 0).toString(), 
							table.getValueAt(table.getSelectedRow(), 1).toString(), 
							table.getValueAt(table.getSelectedRow(), 2).toString(), 
							table.getValueAt(table.getSelectedRow(), 3).toString(),
							table.getValueAt(table.getSelectedRow(), 4).toString(),
							table.getValueAt(table.getSelectedRow(), 5).toString());
					       
					       
					
					update.setVisible(true);
					dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um porduto para editar! basta clicar 2X");
				}

			}

		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnNewButton_1_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1.setBounds(1064, 694, 163, 36);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Deletar Produto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1) {

					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja apagar esse funcionario ?", "Warning",
							dialogButton);
					if (dialogResult == 0) {
						delete();
						JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso!");

					} else {
						JOptionPane.getRootFrame().dispose();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um funcionario na Tabela!");
				}
			}

		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(1246, 694, 127, 36);
		contentPane.add(btnNewButton_1);
		
		LoadDataTable();
	}
	
	
	public void LoadDataTable() {
		try {
			@SuppressWarnings("unused")
			List<Funcionario> lista = FuncionariosControllers.procurar("");
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			if(model.getRowCount() > 0) {
				model.setRowCount(0);
			}
			
			for(Funcionario f: FuncionariosControllers.procurar("")) {
				Object [] object = new Object[6];
				object[0] = f.getId();
				object[1] = f.getNome();
				object[2] = f.getCpf();
				object[3] = f.getData_contratacao();
				object[4] = f.getSalario();
				object[5] = f.getCargo();
			
				model.addRow(object);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void delete() {
		 int id =  (int) table.getValueAt(table.getSelectedRow(), 0);
		 FuncionariosControllers.excluir(id);
		LoadDataTable();
	}
	
	
	public void SearchName(String nome) {
		try {
			
			@SuppressWarnings("unused")
			List<Funcionario> lista = FuncionariosControllers.procurar("");
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			if(model.getRowCount() > 0) {
				model.setRowCount(0);
			}
			
			for(Funcionario f : FuncionariosControllers.procurar(nome)) {
				Object [] object = new Object[6];
				object[0] = f.getId();
				object[1] = f.getNome();
				object[2] = f.getCpf();
				object[3] = f.getData_contratacao();
				object[4] = f.getSalario();
				object[5] = f.getCargo();

				model.addRow(object);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
