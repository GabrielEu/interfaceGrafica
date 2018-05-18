package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex13 {

	public static void main(String[] args) {
	
		// JFrame
		JFrame construtor = new JFrame();
		construtor.setSize(150, 160);
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.setLayout(null);
		
		// JLabel
		JLabel texto = new JLabel("Informe um número");
		texto.setBounds(10, 10, 150, 20);
		
		// JTextField
		JTextField campo = new JTextField();
		campo.setBounds(47, 50, 40, 20);
	
		// JButton
		JButton botao = new JButton("Continuar");
		botao.setBounds(20, 90, 100, 20);
		
		//Ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int ante, suce, num;
				num = Integer.parseInt(campo.getText());
				
				ante = num - 1;
				suce = num + 1;
				
				JOptionPane.showMessageDialog(null, "O antecessor de "+num+" é "+ante+" e o sucessor é "+suce);
				
			}
		});
		
		construtor.add(texto);
		construtor.add(campo);
		construtor.add(botao);
		
		construtor.setVisible(true);
	}

}
