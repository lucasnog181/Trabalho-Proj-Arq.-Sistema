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

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Controller.FuncionarioControllers;
import Model.Funcionario;

public class CadastrarFuncionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5143955175625024092L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldSalario;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFuncionario frame = new CadastrarFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public CadastrarFuncionario() throws ParseException {
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
		lblNewLabel_3.setBounds(1324, 0, 46, 87);
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
				CadastroProducts product = new CadastroProducts();
				product.setVisible(true);
				dispose();
			}
		});
		
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_Add_to_Collection_60px_1.png"));
		lblNewLabel_2.setBounds(10, 34, 241, 81);
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
		lblNewLabel_2_1.setBounds(10, 139, 241, 81);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cadastrar Cliente");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastrarFuncionario cliente = null;
				try {
					cliente = new CadastrarFuncionario();
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
		lblNewLabel_2_1_1.setBounds(10, 243, 241, 81);
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
		lblNewLabel_2_1_1_1.setBounds(10, 345, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Cadastra Funcionario");
		lblNewLabel_2_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CadastrarFuncionario funcionario;
				try {
					funcionario = new CadastrarFuncionario();
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
		lblNewLabel_2_1_1_1_1.setBounds(10, 446, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
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
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 546, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(123, 104, 238));
		panel_2.setBounds(280, 115, 1154, 61);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastrar Funcionario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 0, 188, 61);
		panel_2.add(lblNewLabel_1);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(280, 251, 1101, 30);
		contentPane.add(textFieldNome);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nome do Funcionario");
		lblNewLabel_3_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_1.setBounds(280, 220, 184, 20);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("CPF do Funcionario");
		lblNewLabel_3_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_2.setBounds(559, 395, 164, 20);
		contentPane.add(lblNewLabel_3_2);
		
		JFormattedTextField formattedTextFieldCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		formattedTextFieldCPF.setBounds(559, 426, 196, 30);
		contentPane.add(formattedTextFieldCPF);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Data de Contrata\u00E7\u00E3o do Funcionario");
		lblNewLabel_3_3_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1.setBounds(280, 306, 298, 20);
		contentPane.add(lblNewLabel_3_3_1);
		
		JFormattedTextField formattedTextFieldData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		formattedTextFieldData.setBounds(280, 337, 475, 30);
		contentPane.add(formattedTextFieldData);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("Salario do Funcionario");
		lblNewLabel_3_3_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1_2.setBounds(783, 390, 196, 20);
		contentPane.add(lblNewLabel_3_3_1_2);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Cargo do Funcionario");
		lblNewLabel_3_3_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2.setBounds(280, 395, 253, 20);
		contentPane.add(lblNewLabel_3_3_2);
		
		JComboBox<String> comboBoxCargo = new JComboBox<String>();
		comboBoxCargo.setModel(new DefaultComboBoxModel<String>(new String[] {"Gestor de marketing e vendas", "Gerente de vendas", "Supervisor de vendas", "Coordenador de vendas", "Consultor de vendas", "Executivo de vendas ou analista de vendas", "Suporte a vendas", "Auxiliar de vendas ou assistente de vendas", "Auxiliar administrativo de vendas", "Vendedor"}));
		comboBoxCargo.setBounds(280, 426, 253, 30);
		contentPane.add(comboBoxCargo);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (textFieldNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O Nome do Funcionario não pode ser Vazio !");
				}else if (formattedTextFieldCPF.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O CPF do Funcionario não pode ser Vazio !");
				}else if (formattedTextFieldData.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "A Data de contratação do Funcionario não pode ser Vazio !");
				}else if (comboBoxCargo.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Informe o Cargo do Funcionario não pode ser Vazio !");
				}else if (textFieldSalario.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe o Salário do Funcionario não pode ser Vazio !");
				}else {
					try {
						
						FuncionarioControllers funcionarioControllers = new FuncionarioControllers();
						
						Funcionario funcionario = new Funcionario.FuncionarioBuilder()
								.nome(textFieldNome.getText())
								.cpf(formattedTextFieldCPF.getText())
								.data_contratacao(formattedTextFieldData.getText())
								.salario(textFieldSalario.getText())
								.cargo(comboBoxCargo.getSelectedItem())
								.criarFuncionario();
						
						         funcionarioControllers.save(funcionario);
						         
						         JOptionPane.showMessageDialog(null, "Funcionario "+textFieldNome.getText()+" Cadastrado com sucesso!");
						
						         textFieldNome.setText("");
						         textFieldSalario.setText("");
						         formattedTextFieldCPF.setText("");
								 formattedTextFieldData.setText("");
						
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton.setBounds(1249, 705, 132, 30);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.setBounds(1083, 705, 132, 30);
		contentPane.add(btnCancelar);
		
		textFieldSalario = new JTextField();
		textFieldSalario.setColumns(10);
		textFieldSalario.setBounds(783, 426, 196, 30);
		contentPane.add(textFieldSalario);
	
	}
	
	
}
