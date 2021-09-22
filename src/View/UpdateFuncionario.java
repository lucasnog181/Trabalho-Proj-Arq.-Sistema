package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import Controller.FuncionarioControllers;
import Model.Funcionario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateFuncionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldCPF;
	private JTextField textFieldCargo;
	private JTextField textFieldData;
	private JTextField textFieldSalario;
	private JTextField textFieldNome;
	
	
	
public void preencheDados(String string1, String string2, String string3, String string4, String string5, String string6){
	textFieldID.setText(string1);
		textFieldNome.setText(string2);
		textFieldCPF.setText(string3);
		textFieldSalario.setText(string4);
		textFieldData.setText(string5);
		textFieldCargo.setText(string6);
		
	}

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateFuncionario frame = new UpdateFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public UpdateFuncionario() {
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
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  System.exit(0);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_shutdown_40px.png"));
		lblNewLabel_3.setBounds(1325, 0, 46, 87);
		panel.add(lblNewLabel_3);
		

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.windowBorder);
		panel_1.setBounds(0, 115, 261, 656);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastrar Produto\r\n");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UpdateProducts product = new UpdateProducts();
				product.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_Add_to_Collection_60px_1.png"));
		lblNewLabel_2.setBounds(10, 30, 241, 81);
		panel_1.add(lblNewLabel_2);
		

		JLabel lblNewLabel_2_1 = new JLabel("Procurar Produto\r\n");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ListProducts listProducts = new ListProducts();
				listProducts.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_Package_Search_60px_2.png"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 135, 241, 81);
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
				ListCliente listCliente = new ListCliente();
				listCliente.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_search_client_60px_1.png"));
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1.setBounds(10, 341, 241, 81);
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
		lblNewLabel_2_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_coworking_60px_1.png"));
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1_1.setBounds(10, 443, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(123, 104, 238));
		panel_2.setBounds(280, 115, 1154, 61);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Atualizar Funcionarios");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 0, 221, 61);
		panel_2.add(lblNewLabel_1);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(280, 253, 1103, 40);
		contentPane.add(textFieldNome);
		
		JLabel NomeFuncionario = new JLabel("Nome do funcionario");
		NomeFuncionario.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		NomeFuncionario.setBounds(280, 215, 193, 27);
		contentPane.add(NomeFuncionario);
		
		textFieldID = new JTextField();
		textFieldID.setEnabled(false);
		textFieldID.setColumns(10);
		textFieldID.setBounds(280, 374, 292, 40);
		contentPane.add(textFieldID);
		
		JLabel lblCodigoDoFuncionario = new JLabel("Codigo do funcionario");
		lblCodigoDoFuncionario.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblCodigoDoFuncionario.setBounds(280, 336, 292, 27);
		contentPane.add(lblCodigoDoFuncionario);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(612, 374, 292, 40);
		contentPane.add(textFieldCPF);
		
		JLabel TipoProduto = new JLabel("CPF do funcionario");
		TipoProduto.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		TipoProduto.setBounds(612, 336, 292, 27);
		contentPane.add(TipoProduto);
		
		textFieldCargo = new JTextField();
		textFieldCargo.setColumns(10);
		textFieldCargo.setBounds(943, 374, 292, 40);
		contentPane.add(textFieldCargo);
		
		JLabel lblCargoDoFuncionario = new JLabel("Cargo do funcionario");
		lblCargoDoFuncionario.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblCargoDoFuncionario.setBounds(943, 336, 292, 27);
		contentPane.add(lblCargoDoFuncionario);
		
		textFieldData = new JTextField();
		textFieldData.setColumns(10);
		textFieldData.setBounds(280, 501, 292, 40);
		contentPane.add(textFieldData);
		
		JLabel lblDataDeContratao = new JLabel("Data de contrata\u00E7\u00E3o do funcionario");
		lblDataDeContratao.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblDataDeContratao.setBounds(280, 463, 317, 27);
		contentPane.add(lblDataDeContratao);
		
		textFieldSalario = new JTextField();
		textFieldSalario.setColumns(10);
		textFieldSalario.setBounds(612, 501, 292, 40);
		contentPane.add(textFieldSalario);
		
		JLabel lblSalarioDoFuncionario = new JLabel("Salario do funcionario");
		lblSalarioDoFuncionario.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblSalarioDoFuncionario.setBounds(612, 463, 292, 27);
		contentPane.add(lblSalarioDoFuncionario);
		
		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldID.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o campo corretamente");
				}else if (textFieldNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o campo corretamente");
				}else if (textFieldCPF.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Preencha o campo corretamente");
				}else if (textFieldSalario.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o campo corretamente");
				}else if (textFieldData.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o campo corretamente");
				}else if (textFieldCargo.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o campo corretamente");
				}else {
					 int dialogButton = JOptionPane.YES_NO_OPTION;
					   int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja apagar esse funcionario ?","Warning",dialogButton);
				
					    if (dialogResult == 0) {
					    	atualizar();
							JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso!");
							ListFuncionario funcionario = new ListFuncionario();
							funcionario.setVisible(true);
							dispose();
							
					    }else {
					    	JOptionPane.getRootFrame().dispose();  
				}
					
				}
			}
		});
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton.setBounds(1249, 691, 134, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListFuncionario funcionario = new ListFuncionario();
				funcionario.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(1088, 691, 134, 33);
		contentPane.add(btnNewButton_1);
		
	}
		

		
	
	public void limparCampos() {
		textFieldID.setText("");
		textFieldNome.setText("");
		textFieldCPF.setText("");
		textFieldSalario.setText("");
		textFieldData.setText("");
		textFieldCargo.setText("");
	}

	public void atualizar() {
		
	FuncionarioControllers dao = new FuncionarioControllers();
		
		Funcionario funcionario = new Funcionario.FuncionarioBuilder()
				.id(Integer.parseInt(textFieldID.getText()))
				.nome(textFieldNome.getText())
				.cpf(textFieldCPF.getText())
				.data_contratacao(textFieldData.getText())
				.salario(textFieldSalario.getText())
				.cargo(textFieldCargo.getText())
				.criarFuncionario();
		
		        dao.update(funcionario);
		         
		         limparCampos();
		
	}
	
	
}
