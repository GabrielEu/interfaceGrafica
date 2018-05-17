package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex2 {

	public static void main(String[] args) {
		
		// JFrame
		JFrame programa = new JFrame();
		programa.setSize(300, 180);
		programa.setTitle("");
		programa.setLocationRelativeTo(null);
		programa.setLayout(null);
	
		// JLabel
		JLabel produto = new JLabel("Informe o valor do produto: ");
		produto.setBounds(10, 10, 160, 20);
		
		
		// JTextField
		JTextField valor = new JTextField();
		valor.setBounds(80, 60, 110, 20);
		
		// JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(85, 100, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int desconto = Integer.parseInt(valor.getText());
				double valorFinal = desconto * 0.90;
				JOptionPane.showMessageDialog(null, "Com o desconto de 10% ficará R$"+String.format("%.2f", valorFinal));
			}
		});
		
		
		
		programa.add(produto);
		programa.add(valor);
		programa.add(botao);
		
		
		programa.setVisible(true);
	}
	
}
