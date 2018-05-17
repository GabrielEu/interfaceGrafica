package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex4 {

	public static void main(String[] args) {

		// JFrame
		JFrame construtor = new JFrame();
		construtor.setSize(300, 300);
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.setLayout(null);
		
		// JLabel
		JLabel produto = new JLabel("Informe o nome do produto");
		produto.setBounds(10, 10, 200, 20);
		
		JLabel valor = new JLabel("Informe o valor do produto");
		valor.setBounds(10, 70, 200, 20);
		
		JLabel formaPag = new JLabel("Informe a forma de pagamento");
		formaPag.setBounds(10, 130, 200, 20);
		
		// JTextField
		JTextField nomeProduto = new JTextField();
		nomeProduto.setBounds(10, 30, 150, 20);
		
		JTextField valorProduto = new JTextField();
		valorProduto.setBounds(10, 90, 100, 20);
		
		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10, 150, 150, 20);
		combo.addItem("Á vista");
		combo.addItem("Á prazo");
		combo.addItem("Cheque");
		combo.addItem("Cartão de crédito");
		
		// JButton 
		JButton botao = new JButton("Continuar");
		botao.setBounds(80, 220, 120, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int total, valor = Integer.parseInt(valorProduto.getText());
				double desconto = 0.90;
				
				if(valor > 500) {
					total = (int) (valor * desconto);
				} else {
					total = valor;
				}
				
				JOptionPane.showMessageDialog(null, "O produto "+nomeProduto.getText()+" custará R$"+total);
				
			}
		});
		
		construtor.add(produto);
		construtor.add(valor);
		construtor.add(nomeProduto);
		construtor.add(valorProduto);
		construtor.add(formaPag);
		construtor.add(combo);
		construtor.add(botao);
		construtor.setVisible(true);
	}

}
