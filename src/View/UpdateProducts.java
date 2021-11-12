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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controllres.ProdutoControllers;
import Model.Produto;

public class UpdateProducts extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCodigoProduto;
	private JTextField textFieldTipoValor;
	private JTextField textFieldValorProduto;
	private JTextField textFieldDescricao;

	
public void preencheDados(String string1, String string2, String string3, String string4, String string5){
		textFieldCodigoProduto.setText(string1);
		textFieldNome.setText(string2);
		textFieldTipoValor.setText(string3);
		textFieldValorProduto.setText(string4);
		textFieldDescricao.setText(string5);
	}

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProducts frame = new UpdateProducts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public UpdateProducts() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Atualizar Produtos");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 0, 188, 61);
		panel_2.add(lblNewLabel_1);
		
		JLabel NomeProduto = new JLabel("Nome do produto");
		NomeProduto.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		NomeProduto.setBounds(280, 229, 193, 27);
		contentPane.add(NomeProduto);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(280, 267, 1103, 40);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCodigoProduto = new JTextField();
		textFieldCodigoProduto.setEnabled(false);
		textFieldCodigoProduto.setColumns(10);
		textFieldCodigoProduto.setBounds(280, 390, 292, 40);
		contentPane.add(textFieldCodigoProduto);
		
		JLabel CodigoProduto = new JLabel("Codigo do produto");
		CodigoProduto.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		CodigoProduto.setBounds(280, 352, 292, 27);
		contentPane.add(CodigoProduto);
		
		textFieldTipoValor = new JTextField();
		textFieldTipoValor.setColumns(10);
		textFieldTipoValor.setBounds(600, 390, 292, 40);
		contentPane.add(textFieldTipoValor);
		
		JLabel TipoProduto = new JLabel("Tipo do produto");
		TipoProduto.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		TipoProduto.setBounds(600, 352, 292, 27);
		contentPane.add(TipoProduto);
		
		textFieldValorProduto = new JTextField();
		textFieldValorProduto.setColumns(10);
		textFieldValorProduto.setBounds(921, 390, 292, 40);
		contentPane.add(textFieldValorProduto);
		
		JLabel ValorProduto = new JLabel("Valor do produto");
		ValorProduto.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		ValorProduto.setBounds(921, 352, 292, 27);
		contentPane.add(ValorProduto);
		
		JLabel DescricaoProduto = new JLabel("Descri\u00E7\u00E3o do produto");
		DescricaoProduto.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		DescricaoProduto.setBounds(280, 474, 292, 27);
		contentPane.add(DescricaoProduto);
		
		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int dialogButton = JOptionPane.YES_NO_OPTION;
				   int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja atualizar esse produto ?","Atualizar",dialogButton);
			
				    if (dialogResult == 0) {
				    	atualizar();
						
				    	ListProducts listProduct = new ListProducts();
						listProduct.setVisible(true);
						dispose();
						
				    }else {
				    	JOptionPane.getRootFrame().dispose();  
		       }
			}
		});
		
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton.setBounds(1260, 675, 123, 34);
		contentPane.add(btnNewButton);
		
		textFieldDescricao = new JTextField();
		textFieldDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldDescricao.setBounds(280, 522, 1103, 113);
		contentPane.add(textFieldDescricao);
		textFieldDescricao.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar\r\n");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldCodigoProduto.setText("");
				textFieldNome.setText("");
				textFieldDescricao.setText("");
				textFieldTipoValor.setText("");
				textFieldValorProduto.setText("");
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroProducts prods = new CadastroProducts();
				prods.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.setBounds(1102, 675, 123, 34);
		contentPane.add(btnCancelar);
	}
	
	
	public void atualizar() {

		Produto produto = new Produto.ProdutoBuilder()
				.codigo_produto(Integer.parseInt(textFieldCodigoProduto.getText()))
				.nome_produto(textFieldNome.getText()).valor_produto(textFieldValorProduto.getText())
				.tipo_produto(textFieldTipoValor.getText()).descricao_produto("").criarProduto();

		ProdutoControllers.atualizar(produto);
		JOptionPane.showMessageDialog(null, "Produto atualizado com sucessso!");

		limparCampos();
	}

	public void limparCampos() {
		textFieldCodigoProduto.setText("");
		textFieldDescricao.setText("");
		textFieldNome.setText("");
		textFieldTipoValor.setText("");
		textFieldValorProduto.setText("");
	}
}
