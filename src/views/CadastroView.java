package views;

import java.awt.BorderLayout;
import java.awt.Color; // Import adicionado
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane; // Import adicionado para a barra de rolagem
import javax.swing.JTextArea; // Import adicionado para a area de texto
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder; // Import para dar uma margem visual

import exceptions.DadosInvalidosException;
import factory.Factory;
import model.entitis.Administrador;
import model.entitis.Empregado;
import model.entitis.Fornecedor;
import model.entitis.Operario;
import model.entitis.Pessoa;
import model.entitis.Vendedor;

public class CadastroView {
    
    private JFrame telaPrincipal;
    
    private JPanel painelPrincipal;
    private JPanel painelDeBotoes;
    private JTextArea areaDeTextoDireita;

    private JLabel labelNome;
    private JLabel labelEndereco;
    private JLabel labelTelefone;
    private JLabel labelValorCredito;
    private JLabel labelValorDivida;
    private JLabel labelCodigoSetor;
    private JLabel labelSalarioBase;
    private JLabel labelImposto;
    private JLabel labelAjudaDeCusto;
    private JLabel labelValorProducao;
    private JLabel labelComissaoOperario;
    private JLabel labelValorVendas;
    private JLabel labelComissaoVendedor;
    private JLabel labelTipo;
    
    private JTextField textFieldNome;
    private JTextField textFieldEndereco;
    private JTextField textFieldTelefone;
    private JTextField textFieldValorCredito;
    private JTextField textFieldValorDivida;
    private JTextField textFieldCodigoSetor;
    private JTextField textFieldSalarioBase;
    private JTextField textFieldImposto;
    private JTextField textFieldAjudaDeCusto;
    private JTextField textFieldValorProducao;
    private JTextField textFieldComissaoOperario;
    private JTextField textFieldValorVendas;
    private JTextField textFieldComissaoVendedor;
    private JTextField textFieldTipoFuncionario;
    
    private JButton enviarPessoa;
    private JButton enviarFornecedor;
    private JButton enviarEmpregado;
    private JButton enviarAdministrador;
    private JButton enviarOperario;
    private JButton enviarVendedor;
    
    public CadastroView() {
        telaPrincipal = new JFrame();
        painelPrincipal = new JPanel();
        painelDeBotoes = new JPanel();
        
        this.telaPrincipal.add(painelPrincipal, BorderLayout.CENTER);
        iniciar();
    }
    
    public void iniciar() {
        setFrame();
        setPanel();
        setRightPanel(); 
        setButtonPanel();
        this.telaPrincipal.setVisible(true);
    }
    
    public void setFrame() {
        this.telaPrincipal.setTitle("Formulário de Registro");
        this.telaPrincipal.setResizable(true);
        this.telaPrincipal.setSize(1150, 650);
        this.telaPrincipal.setLocationRelativeTo(null);
        this.telaPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

 
    private void setRightPanel() {
        areaDeTextoDireita = new JTextArea();
        areaDeTextoDireita.setEditable(false);
        areaDeTextoDireita.setLineWrap(true);
        areaDeTextoDireita.setWrapStyleWord(true);
        
        areaDeTextoDireita.setFont(new Font("Arial", Font.PLAIN, 18));
        areaDeTextoDireita.setBackground(Color.WHITE);
        areaDeTextoDireita.setForeground(new Color(139, 0, 0));
       
        areaDeTextoDireita.setText("Cada um dos botões 'enviar' imprime aqui os dados do objeto em questão.\n\n");
        
        areaDeTextoDireita.setBorder(new EmptyBorder(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(areaDeTextoDireita);
        scrollPane.setPreferredSize(new Dimension(350, 0));
        
        telaPrincipal.add(scrollPane, BorderLayout.EAST);
    }
 
    
    private void setPanel() {
        painelPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        
        labelTipo = createLabel("Tipo de Funcionário");
        textFieldTipoFuncionario = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelTipo, textFieldTipoFuncionario, gbc, 0);
        
        labelNome = createLabel("Nome");
        textFieldNome = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelNome, textFieldNome, gbc, 1); 
        
        labelEndereco = createLabel("Endereco");
        textFieldEndereco = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelEndereco, textFieldEndereco, gbc, 2);
        
        labelTelefone = createLabel("Telefone");
        textFieldTelefone = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelTelefone, textFieldTelefone, gbc, 3);
        
        labelValorCredito = createLabel("Valor Crédito");
        textFieldValorCredito = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelValorCredito, textFieldValorCredito, gbc, 4);
        
        labelValorDivida = createLabel("Valor Dívida");
        textFieldValorDivida = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelValorDivida, textFieldValorDivida, gbc, 5);
        
        labelCodigoSetor = createLabel("Código Setor");
        textFieldCodigoSetor = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelCodigoSetor, textFieldCodigoSetor, gbc, 6);
        
        labelSalarioBase = createLabel("Salário Base");
        textFieldSalarioBase = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelSalarioBase, textFieldSalarioBase, gbc, 7);
        
        labelImposto = createLabel("Imposto");
        textFieldImposto = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelImposto, textFieldImposto, gbc, 8);
        
        labelAjudaDeCusto = createLabel("Ajuda de Custo");
        textFieldAjudaDeCusto = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelAjudaDeCusto, textFieldAjudaDeCusto, gbc, 9);
        
        labelValorProducao = createLabel("Valor Produção");
        textFieldValorProducao = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelValorProducao, textFieldValorProducao, gbc, 10);
        
        labelComissaoOperario = createLabel("Comissão Operário");
        textFieldComissaoOperario = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelComissaoOperario, textFieldComissaoOperario, gbc, 11);
        
        labelValorVendas = createLabel("Valor Vendas");
        textFieldValorVendas = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelValorVendas, textFieldValorVendas, gbc, 12);
        
        labelComissaoVendedor = createLabel("Comissão Vendedor");
        textFieldComissaoVendedor = createTextField(20, new Font("Verdana", Font.PLAIN, 15));
        addFieldWithLabel(labelComissaoVendedor, textFieldComissaoVendedor, gbc, 13);
        
        enviarEmpregado = createButton("Enviar Empregado", "Clique aqui para adicionar um Empregado", new Font("Verdana", Font.PLAIN, 15));
        addButtonEvent(enviarEmpregado);
        painelDeBotoes.add(enviarEmpregado);
    }
    
    private void setButtonPanel() {
        painelDeBotoes.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        telaPrincipal.add(painelDeBotoes, BorderLayout.SOUTH);
    }
    
    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        return label;
    }
    
    private JTextField createTextField(int columns, Font font) {
        JTextField textField = new JTextField(columns);
        textField.setFont(font);
        textField.setMaximumSize(new Dimension(250, 30));
        return textField;
    }
    
    private JButton createButton(String buttonText, String buttonMessage, Font font) {
        JButton button = new JButton(buttonText);
        button.setFocusable(false);
        button.setToolTipText(buttonMessage);
        button.setFont(font);
        button.setMargin(new Insets(5, 5, 5, 5));
        return button;
    }
    
    private void addFieldWithLabel(JLabel label, JTextField textField, GridBagConstraints gbc, int row) {     
        gbc.gridx = 0;
        gbc.gridy = row;
        gbc.weightx = 0.0;
        painelPrincipal.add(label, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = row;
        gbc.weightx = 1.0;
        painelPrincipal.add(textField, gbc);
    } 
    
    public void register() throws NumberFormatException, DadosInvalidosException {
        String tipoFuncionario = textFieldTipoFuncionario.getText().trim().toLowerCase();

        if (tipoFuncionario.equals("pessoa")) {
            Pessoa pessoa = Factory.getPessoa(
                textFieldNome.getText(),
                textFieldEndereco.getText(),
                textFieldTelefone.getText()
            );
            this.mostrarFuncionario(pessoa);

        } else if (tipoFuncionario.equals("fornecedor")) {
            Fornecedor fornecedor = Factory.getFornecedor(
                textFieldNome.getText(),
                textFieldEndereco.getText(),
                textFieldTelefone.getText(),
                Double.parseDouble(textFieldValorCredito.getText()),
                Double.parseDouble(textFieldValorDivida.getText())
            );
            this.mostrarFuncionario(fornecedor);

        } else if (tipoFuncionario.equals("empregado")) {
            Empregado empregado = Factory.getEmpregado(
                textFieldNome.getText(),
                textFieldEndereco.getText(),
                textFieldTelefone.getText(),
                Integer.parseInt(textFieldCodigoSetor.getText()),
                Double.parseDouble(textFieldSalarioBase.getText()),
                Integer.parseInt(textFieldImposto.getText())
            );
            this.mostrarFuncionario(empregado);

        } else if (tipoFuncionario.equals("administrador")) {
            Administrador administrador = Factory.getAdministrador(
                textFieldNome.getText(),
                textFieldEndereco.getText(),
                textFieldTelefone.getText(),
                Integer.parseInt(textFieldCodigoSetor.getText()),
                Double.parseDouble(textFieldSalarioBase.getText()),
                Integer.parseInt(textFieldImposto.getText()),
                Double.parseDouble(textFieldAjudaDeCusto.getText())
            );
            this.mostrarFuncionario(administrador);

        } else if (tipoFuncionario.equals("operario")) {
            Operario operario = Factory.getOperario(
                textFieldNome.getText(),
                textFieldEndereco.getText(),
                textFieldTelefone.getText(),
                Integer.parseInt(textFieldCodigoSetor.getText()),
                Double.parseDouble(textFieldSalarioBase.getText()),
                Integer.parseInt(textFieldImposto.getText()),
                Double.parseDouble(textFieldValorProducao.getText()),
                Integer.parseInt(textFieldComissaoOperario.getText()));
            this.mostrarFuncionario(operario);

        } else if (tipoFuncionario.equals("vendedor")) {
            Vendedor vendedor = Factory.getVendedor(
                textFieldNome.getText(),
                textFieldEndereco.getText(),
                textFieldTelefone.getText(),
                Integer.parseInt(textFieldCodigoSetor.getText()),
                Double.parseDouble(textFieldSalarioBase.getText()),
                Integer.parseInt(textFieldImposto.getText()),
                Double.parseDouble(textFieldValorVendas.getText()),
                Integer.parseInt(textFieldComissaoVendedor.getText()));
            this.mostrarFuncionario(vendedor);
        }
    }
        
    private void addButtonEvent(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button.equals(enviarEmpregado)) {
                    try {
						register();
					} catch (NumberFormatException | DadosInvalidosException e1) {
						System.err.print(e1.getMessage());
					}
                }
            }
        });
    }
    
 
   private void mostrarFuncionario(Object obj) {
    
        areaDeTextoDireita.append(obj.toString() + "\n\n------------------------\n\n");
    }

 
}