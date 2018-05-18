package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex9 {

	public static void main(String[] args) {
	
		// JFrame
		JFrame construtor = new JFrame();
		construtor.setSize(150, 225);
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.setLayout(null);
		
		// JLabel
		JLabel campo1 = new JLabel("Informe o 1ª número");
		campo1.setBounds(10, 10, 150, 20);
		
		JLabel campo2 = new JLabel("Informe o 2ª número");
		campo2.setBounds(10, 50, 150, 20);
		
		JLabel campo3 = new JLabel("Informe o 3ª número");
		campo3.setBounds(10, 90, 150, 20);
		
		// JTextField
		JTextField num1 = new JTextField();
		num1.setBounds(40, 32, 50, 20);
		
		JTextField num2 = new JTextField();
		num2.setBounds(40, 72, 50, 20);
		
		JTextField num3 = new JTextField();
		num3.setBounds(40, 112, 50, 20);
		
		// JButton
		JButton botao = new JButton("Continuar");
		botao.setBounds(15, 150, 100, 20);
		
		// Ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				int menorNum;
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				int n3 = Integer.parseInt(num3.getText());
				
				
				
				if((n1 < n2) && (n1 < n3)) {
					JOptionPane.showMessageDialog(null, "O menor número é "+n1+"(1º número)");
				} else if((n2 < n1) && (n2 < n3)) {
					JOptionPane.showMessageDialog(null, "O menor número é "+n2+"(2º número)");
				} else if((n3 < n1) && (n3 < n2)) {
					JOptionPane.showMessageDialog(null, "O menor número é "+n3+"(3º número)");
				} else {
					JOptionPane.showMessageDialog(null, "Os números são iguais");
				}
	
			}
			
		});
		
		construtor.add(campo1);
		construtor.add(campo2);
		construtor.add(campo3);
		construtor.add(num1);
		construtor.add(num2);
		construtor.add(num3);
		construtor.add(botao);
		
		construtor.setVisible(true);
		
	}

}
