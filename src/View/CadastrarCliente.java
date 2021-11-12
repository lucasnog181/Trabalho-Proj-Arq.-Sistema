package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import org.lavieri.modelutil.cep.WebServiceCep;

import Controllres.ClienteControllers;
import Model.Cliente;

public class CadastrarCliente extends JFrame {

	private static final long serialVersionUID = 5143955175625024092L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEmail;
	private JTextField textFieldCidade;
	private JTextField textFieldLogandouro;
	private JTextField textFieldNumero;
	private JTextField textFieldObservacao;
	private JTextField textFieldEstado;
	
	private JTextField textFieldCEP;
	private JTextField textFieldBairro;

	
	public static void main(String[] args) {
		
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			// If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente frame = new CadastrarCliente();
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
	public CadastrarCliente() throws ParseException {
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {}
		});
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
		lblNewLabel_2.setBounds(10, 31, 241, 81);
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
		lblNewLabel_2_1.setBounds(10, 136, 241, 81);
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
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_search_client_60px_1.png"));
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_2_1_1_1.setBounds(10, 342, 241, 81);
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
		lblNewLabel_2_1_1_1_1.setBounds(10, 444, 241, 81);
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
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 544, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(123, 104, 238));
		panel_2.setBounds(280, 115, 1154, 61);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastrar Cliente");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 0, 188, 61);
		panel_2.add(lblNewLabel_1);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(280, 251, 475, 30);
		contentPane.add(textFieldNome);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nome do Cliente");
		lblNewLabel_3_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_1.setBounds(280, 220, 154, 20);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("CPF do Cliente");
		lblNewLabel_3_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_2.setBounds(791, 220, 154, 20);
		contentPane.add(lblNewLabel_3_2);
		
		JFormattedTextField formattedTextFieldCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		formattedTextFieldCPF.setBounds(791, 251, 164, 30);
		contentPane.add(formattedTextFieldCPF);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(280, 337, 475, 30);
		contentPane.add(textFieldEmail);
		
		JLabel lblNewLabel_3_3 = new JLabel("Email do Cliente");
		lblNewLabel_3_3.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3.setBounds(280, 306, 403, 20);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Data de Nascimento do Cliente");
		lblNewLabel_3_3_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1.setBounds(791, 306, 253, 20);
		contentPane.add(lblNewLabel_3_3_1);
		
		JFormattedTextField formattedTextFieldData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		formattedTextFieldData.setBounds(791, 337, 253, 30);
		contentPane.add(formattedTextFieldData);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("Sexo do Cliente");
		lblNewLabel_3_3_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1_1.setBounds(994, 220, 165, 20);
		contentPane.add(lblNewLabel_3_3_1_1);
		
		JComboBox<String>  comboBoxSexo = new JComboBox<String> ();
		comboBoxSexo.setModel(new DefaultComboBoxModel<String>(new String[] { "Masculino", "Feminino", "N\u00E3o declarar"}));
		comboBoxSexo.setBounds(994, 251, 165, 30);
		contentPane.add(comboBoxSexo);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("Estado Civil do Cliente");
		lblNewLabel_3_3_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1_1_1.setBounds(1197, 220, 196, 20);
		contentPane.add(lblNewLabel_3_3_1_1_1);
		
		JComboBox<String> comboBoxCivil = new JComboBox<String> ();
		comboBoxCivil.setModel(new DefaultComboBoxModel<String>(new String[] { "Solteiro ", "Casado ", "Separado ", "Divorciado ", "Vi\u00FAvo "}));
		comboBoxCivil.setBounds(1197, 251, 184, 30);
		contentPane.add(comboBoxCivil);
		
		JFormattedTextField formattedTextFieldPhone = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		formattedTextFieldPhone.setBounds(1083, 337, 298, 30);
		contentPane.add(formattedTextFieldPhone);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("Telefone do Cliente");
		lblNewLabel_3_3_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1_2.setBounds(1083, 306, 253, 20);
		contentPane.add(lblNewLabel_3_3_1_2);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Estado");
		lblNewLabel_3_3_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2.setBounds(280, 474, 253, 20);
		contentPane.add(lblNewLabel_3_3_2);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setEditable(false);
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(572, 505, 253, 30);
		contentPane.add(textFieldCidade);
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("Cidade");
		lblNewLabel_3_3_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_1.setBounds(572, 474, 253, 20);
		contentPane.add(lblNewLabel_3_3_2_1);
		
		textFieldLogandouro = new JTextField();
		textFieldLogandouro.setEditable(false);
		textFieldLogandouro.setColumns(10);
		textFieldLogandouro.setBounds(862, 505, 253, 30);
		contentPane.add(textFieldLogandouro);
		
		JLabel lblNewLabel_3_3_2_1_1 = new JLabel("Longadouro");
		lblNewLabel_3_3_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_1_1.setBounds(862, 474, 253, 20);
		contentPane.add(lblNewLabel_3_3_2_1_1);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		textFieldNumero.setBounds(1153, 505, 228, 30);
		contentPane.add(textFieldNumero);
		
		JLabel lblNewLabel_3_3_2_1_1_1 = new JLabel("N\u00FAmero");
		lblNewLabel_3_3_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_1_1_1.setBounds(1153, 474, 228, 20);
		contentPane.add(lblNewLabel_3_3_2_1_1_1);
		
		textFieldObservacao = new JTextField();
		textFieldObservacao.setColumns(10);
		textFieldObservacao.setBounds(280, 592, 1101, 70);
		contentPane.add(textFieldObservacao);
		
		JLabel lblNewLabel_3_3_2_2 = new JLabel("Observa\u00E7\u00F5es");
		lblNewLabel_3_3_2_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_2.setBounds(280, 561, 253, 20);
		contentPane.add(lblNewLabel_3_3_2_2);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textFieldNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O Nome do cliente não pode ser Vazio !");
				}else if (formattedTextFieldCPF.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O CPF do cliente não pode ser Vazio !");
				}else if (textFieldEmail.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O Email do cliente não pode ser Vazio !");
				}else if (formattedTextFieldData.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "A Data do cliente não pode ser Vazio !");
				}else if (comboBoxSexo.getSelectedItem()== null) {
					JOptionPane.showMessageDialog(null, "Informe o Sexo do cliente não pode ser Vazio !");
				}else if (comboBoxCivil.getSelectedItem() == null) {
					JOptionPane.showMessageDialog(null, "Informe o Estado civil do cliente não pode ser Vazio !");
				}else if (formattedTextFieldPhone.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe o Número de contato do cliente não pode ser Vazio !");
				}else if (textFieldEstado.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Informe o Estado do cliente não pode ser Vazio !");
				}else if (textFieldCidade.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe a Cidade do cliente não pode ser Vazio !");
				}else if (textFieldLogandouro.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe a Cidade do cliente não pode ser Vazio !");
				}else if (textFieldNumero.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Informe o Número do cliente não pode ser Vazio !");
				}else {
					
					try {
						
						Cliente cliente = new Cliente.ClienteBuilder()
								.id(55).nome(textFieldNome.getText())
								.cpf((String) formattedTextFieldCPF.getValue())
								.email(textFieldEmail.getText())
								.nascimento((String) formattedTextFieldData.getValue())
								.sexo(comboBoxSexo.getSelectedItem())
								.estado_civil(comboBoxCivil.getSelectedItem())
								.telefone((String) formattedTextFieldPhone.getValue())
								.CEP(textFieldCEP.getText())
								.estado(textFieldEstado.getText())
								.cidade(textFieldCidade.getText())
								.longadouro(textFieldLogandouro.getText())
								.numero(textFieldNumero.getText())
								.observacao(textFieldObservacao.getText())
								.criarCliente();
						
						 ClienteControllers.salvar(cliente);
						JOptionPane.showMessageDialog(null, "Cliente "+textFieldNome.getText()+" Cadastrado com sucesso!");
						
						formattedTextFieldCPF.setText("");
						formattedTextFieldData.setText("");
						formattedTextFieldPhone.setText("");
						LimparCampos();
						
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
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 LimparCampos();
			}
		});
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.setBounds(1083, 705, 132, 30);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_3_3_2_1_2 = new JLabel("Cidade");
		lblNewLabel_3_3_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_1_2.setBounds(280, 389, 253, 20);
		contentPane.add(lblNewLabel_3_3_2_1_2);
		
		JButton btnNewButton_1 = new JButton("Bucar por CEP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				functionValidarCamposCEP();	
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(123, 104, 238));
		btnNewButton_1.setBounds(543, 420, 124, 30);
		contentPane.add(btnNewButton_1);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setEditable(false);
		textFieldEstado.setColumns(10);
		textFieldEstado.setBounds(280, 505, 253, 30);
		contentPane.add(textFieldEstado);
		
		textFieldCEP = new JTextField();
		textFieldCEP.setColumns(10);
		textFieldCEP.setBounds(280, 420, 253, 30);
		contentPane.add(textFieldCEP);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setEditable(false);
		textFieldBairro.setColumns(10);
		textFieldBairro.setBounds(1153, 420, 228, 30);
		contentPane.add(textFieldBairro);
		
		JLabel lblNewLabel_3_3_2_1_1_1_1 = new JLabel("Bairro");
		lblNewLabel_3_3_2_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_1_1_1_1.setBounds(1153, 389, 228, 20);
		contentPane.add(lblNewLabel_3_3_2_1_1_1_1);
	
	}
	
	
	public void LimparCampos() {
		textFieldNome.setText("");
	    textFieldEmail.setText("");
		 textFieldCidade.setText("");
		 textFieldCEP.setText("");
		 textFieldLogandouro.setText("");
		 textFieldEstado.setText("");
		 textFieldNumero.setText("");
		textFieldObservacao.setText("");
		textFieldBairro.setText("");
		
	}
	
	
	public void functionValidarCamposCEP() {
		if(textFieldCEP.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o CEP do cliente não pode ser Vazio !");
		}else {
			String CEP = textFieldCEP.getText();
			try {
	
				WebServiceCep webServiceCep = WebServiceCep.searchCep(CEP);
				 
				if(webServiceCep.wasSuccessful()) {
					textFieldBairro.setText(webServiceCep.getBairro().toString());
					textFieldEstado.setText(webServiceCep.getUf().toString());
					 textFieldLogandouro.setText(webServiceCep.getLogradouroFull().toString());
					 textFieldCidade.setText(webServiceCep.getCidade().toString());
					 
					 System.out.println("Cep: "+webServiceCep.getCep());
						System.out.println("Logradouro: "+webServiceCep.getLogradouroFull());
						System.out.println("Bairro: "+webServiceCep.getBairro());
						System.out.println("Cidade: "+
								webServiceCep.getCidade()+"/"+ webServiceCep.getUf());
				
				}else {
					System.out.println("Erro número: " + webServiceCep.getResulCode());
					System.out.println("Descrição do erro: " + webServiceCep.getResultText());
				}
				 
				 System.out.println();
				 
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
