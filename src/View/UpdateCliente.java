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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.ClienteControllers;
import Model.Cliente;
import javax.swing.JFormattedTextField;

@SuppressWarnings("unused")
public class UpdateCliente extends JFrame {

	
	private static final long serialVersionUID = 5143955175625024092L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEmail;
	private JTextField textFieldCidade;
	private JTextField textFieldLogandouro;
	private JTextField textFieldNumero;
	private JTextField textFieldObservacao;
	
	private JFormattedTextField formattedTextFieldData;
	

	private JTextField textFieldCPF;
	private JTextField textFieldSexo;
	private JTextField textFieldEstadoCivil;
	private JTextField textFieldEstado;
	private JTextField textFieldData;
	private JTextField textFieldTelefone;
	private JTextField textFieldID;
	
	public void preencheDados(String string, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11 , String string12){
		
		textFieldID.setText(string);
		textFieldNome.setText(string1);
		textFieldCPF.setText(string2);
		textFieldEmail.setText(string3);
		textFieldData.setText(string4);
		textFieldSexo.setText(string5);
		textFieldEstadoCivil.setText(string6);
		textFieldTelefone.setText(string7);
		textFieldEstado.setText(string8);
		textFieldCidade.setText(string9);
		textFieldLogandouro.setText(string10);
		textFieldNumero.setText(string11);
		textFieldObservacao.setText(string12);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCliente frame = new UpdateCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public UpdateCliente() throws ParseException {
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
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  System.exit(0);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Sistema Loja\\resources\\Images\\icons8_shutdown_40px.png"));
		lblNewLabel_3.setBounds(1323, 0, 46, 87);
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
				UpdateCliente cliente = null;
				try {
					cliente = new UpdateCliente();
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
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 547, 241, 81);
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
		lblNewLabel_2_1_1_1_1.setBounds(10, 447, 241, 81);
		panel_1.add(lblNewLabel_2_1_1_1_1);

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

		JLabel lblNewLabel_3_3_1_1 = new JLabel("Sexo do Cliente");
		lblNewLabel_3_3_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1_1.setBounds(994, 220, 165, 20);
		contentPane.add(lblNewLabel_3_3_1_1);

		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("Estado Civil do Cliente");
		lblNewLabel_3_3_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1_1_1.setBounds(1197, 220, 196, 20);
		contentPane.add(lblNewLabel_3_3_1_1_1);

		JLabel lblNewLabel_3_3_1_2 = new JLabel("Telefone do Cliente");
		lblNewLabel_3_3_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_1_2.setBounds(1083, 306, 253, 20);
		contentPane.add(lblNewLabel_3_3_1_2);

		JLabel lblNewLabel_3_3_2 = new JLabel("Estado");
		lblNewLabel_3_3_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2.setBounds(280, 395, 253, 20);
		contentPane.add(lblNewLabel_3_3_2);

		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(572, 426, 253, 30);
		contentPane.add(textFieldCidade);

		JLabel lblNewLabel_3_3_2_1 = new JLabel("Cidade");
		lblNewLabel_3_3_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_1.setBounds(572, 395, 253, 20);
		contentPane.add(lblNewLabel_3_3_2_1);

		textFieldLogandouro = new JTextField();
		textFieldLogandouro.setColumns(10);
		textFieldLogandouro.setBounds(862, 426, 253, 30);
		contentPane.add(textFieldLogandouro);

		JLabel lblNewLabel_3_3_2_1_1 = new JLabel("Longadouro");
		lblNewLabel_3_3_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_1_1.setBounds(862, 395, 253, 20);
		contentPane.add(lblNewLabel_3_3_2_1_1);

		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		textFieldNumero.setBounds(1153, 426, 228, 30);
		contentPane.add(textFieldNumero);

		JLabel lblNewLabel_3_3_2_1_1_1 = new JLabel("N\u00FAmero");
		lblNewLabel_3_3_2_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_1_1_1.setBounds(1153, 395, 228, 20);
		contentPane.add(lblNewLabel_3_3_2_1_1_1);

		textFieldObservacao = new JTextField();
		textFieldObservacao.setColumns(10);
		textFieldObservacao.setBounds(280, 514, 1101, 148);
		contentPane.add(textFieldObservacao);

		JLabel lblNewLabel_3_3_2_2 = new JLabel("Observa\u00E7\u00F5es");
		lblNewLabel_3_3_2_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel_3_3_2_2.setBounds(280, 483, 253, 20);
		contentPane.add(lblNewLabel_3_3_2_2);

		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    	atualizar();
						ListCliente cliente = new  ListCliente();
						cliente.setVisible(true);
						dispose();    
			}});
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton.setBounds(1249, 705, 132, 30);
		contentPane.add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
				ListCliente cliente = new ListCliente();
				cliente.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.setBounds(1083, 705, 132, 30);
		contentPane.add(btnCancelar);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setEnabled(false);
		textFieldCPF.setBounds(791, 251, 165, 30);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldSexo = new JTextField();
		textFieldSexo.setEnabled(false);
		textFieldSexo.setColumns(10);
		textFieldSexo.setBounds(994, 251, 165, 30);
		contentPane.add(textFieldSexo);
		
		textFieldEstadoCivil = new JTextField();
		textFieldEstadoCivil.setColumns(10);
		textFieldEstadoCivil.setBounds(1197, 251, 184, 30);
		contentPane.add(textFieldEstadoCivil);
		
		textFieldEstado = new JTextField();
		textFieldEstado.setEnabled(false);
		textFieldEstado.setColumns(10);
		textFieldEstado.setBounds(280, 426, 253, 30);
		contentPane.add(textFieldEstado);
		
		textFieldData = new JTextField();
		textFieldData.setEnabled(false);
		textFieldData.setColumns(10);
		textFieldData.setBounds(791, 337, 253, 30);
		contentPane.add(textFieldData);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(1083, 337, 298, 30);
		contentPane.add(textFieldTelefone);
		
				JPanel panel_2 = new JPanel();
				panel_2.setBackground(new Color(123, 104, 238));
				panel_2.setBounds(280, 115, 1154, 61);
				contentPane.add(panel_2);
				panel_2.setLayout(null);
				
						JLabel lblNewLabel_1 = new JLabel("Atualizar Cliente");
						lblNewLabel_1.setForeground(new Color(255, 255, 255));
						lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
						lblNewLabel_1.setBounds(10, 0, 188, 61);
						panel_2.add(lblNewLabel_1);
						
						textFieldID = new JTextField();
						textFieldID.setEnabled(false);
						textFieldID.setEditable(false);
						textFieldID.setBounds(1295, 141, 86, 20);
						contentPane.add(textFieldID);
						textFieldID.setColumns(10);

	}

	public void LimparCampos() {
		textFieldNome.setText("");
		textFieldEmail.setText("");
		textFieldCidade.setText("");
		textFieldLogandouro.setText("");
		textFieldNumero.setText("");
		textFieldObservacao.setText("");
		textFieldTelefone.setText("");
		textFieldEstadoCivil.setText("");
		textFieldCPF.setText("");
		textFieldData.setText("");
		textFieldCPF.setText("");
		textFieldEstado.setText("");

	}
	
	public void atualizar() {
		
		ClienteControllers dao = new ClienteControllers();
		
		Cliente cliente = new Cliente.ClienteBuilder()
				.id(Integer.parseInt(textFieldID.getText()))
				.nome(textFieldNome.getText())
				.cpf(textFieldCPF.getText())
				.email(textFieldEmail.getText())
				.nascimento(textFieldData.getText())
				.sexo(textFieldSexo.getText())
				.estado_civil(textFieldEstadoCivil.getText())
				.telefone(textFieldTelefone.getText())
				.estado(textFieldEstado.getText())
				.cidade(textFieldCidade.getText())
				.longadouro(textFieldLogandouro.getText())
				.numero(textFieldNumero.getText())
				.observacao(textFieldObservacao.getText())
				.criarCliente();
		
		dao.update(cliente);
		
		JOptionPane.showMessageDialog(null, "Cliente atualizado com sucessso!");
		
		LimparCampos();
		
	}
}
