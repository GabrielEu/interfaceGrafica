package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.AcceptPendingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex6 {

	public static void main(String[] args) {
		
		// JFrame
		JFrame construtor = new JFrame();
		construtor.setSize(300, 220);
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.setLayout(null);
	
		// JLabel
		JLabel num1 = new JLabel("Digite o 1º número");
		num1.setBounds(90, 10, 150, 20);
		
		JLabel num2 = new JLabel("Digite o 2º número");
		num2.setBounds(90, 60, 150, 20);
		
		// JTextField
		JTextField numero1 = new JTextField();
		numero1.setBounds(117, 35, 50, 20);
		
		// JTextField
		JTextField numero2 = new JTextField();
		numero2.setBounds(117, 85, 50, 20);
		
		// JButton
		JButton botao = new JButton("Continuar");
		botao.setBounds(94, 130, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(numero1.getText());
				int n2 = Integer.parseInt(numero2.getText());
				
				if(n1 == n2) {
					JOptionPane.showMessageDialog(null, "Os números são iguais");
				} else {
					JOptionPane.showMessageDialog(null, "Os números são diferentes");
				}
				
			}
		});;
		
		
		construtor.add(num1);
		construtor.add(num2);
		construtor.add(numero1);
		construtor.add(numero2);
		construtor.add(botao);
		
		construtor.setVisible(true);
		
	}

}
