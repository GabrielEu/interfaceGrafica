package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex1 {

	public static void main(String[] args) {
		
		// JFrame
		JFrame construtor = new JFrame();
		construtor.setSize(300, 230);
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.setLayout(null);
	
		// JLabel
		JLabel exibirNome = new JLabel("Informe seu nome: ");
		exibirNome.setBounds(10, 10, 300, 10);
		
		JLabel exibirIdade = new JLabel("Informe sua idade: ");
		exibirIdade.setBounds(10, 110, 300, 10);
		
		JLabel exibirCidade = new JLabel("Informe sua cidade: ");
		exibirCidade.setBounds(10, 61, 300, 10);
		
		// JTextField
		JTextField nome = new JTextField();
		nome.setBounds(125, 8, 110, 20);
		
		JTextField idade = new JTextField();
		idade.setBounds(125, 58, 110, 20);
		
		JTextField cidade = new JTextField();
		cidade.setBounds(130, 108, 110, 20);
		
		// Botão
		JButton botao = new JButton("Continuar");
		botao.setBounds(90, 160, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Olá "+nome.getText()+", você tem "+idade.getText()+" anos e mora em "+cidade.getText());
			}
		});
		
		
		// Construir
		construtor.add(botao);
		construtor.add(exibirNome);
		construtor.add(exibirCidade);
		construtor.add(exibirIdade);
		construtor.add(nome);
		construtor.add(idade);
		construtor.add(cidade);
		
		construtor.setVisible(true);
		
	}
	
}
