package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex7 {

	public static void main(String[] args) {
	
		// JFrame
		JFrame tabuada = new JFrame("TABUADA");
		tabuada.setSize(270, 170);
		tabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabuada.setLocationRelativeTo(null);
		tabuada.setLayout(null);
		
		// JLabel
		JLabel num = new JLabel("Digite um número");
		num.setBounds(75, 10, 150, 20);
		
		// JTextField
		JTextField campo = new JTextField();
		campo.setBounds(110, 45, 30, 20);
		
		// Botao
		JButton botao = new JButton("Continuar");
		botao.setBounds(80, 85, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				int n = Integer.parseInt(campo.getText());
				String text = "";
				int resultado;
				
				for(int i = 0; i < 11; i++) {
					
					resultado = n * i;
					text += n+" X "+i+" = "+resultado+"\n";
					
				}
			
				JOptionPane.showMessageDialog(null, text);
				
			}
		});
		
		tabuada.add(num);
		tabuada.add(campo);
		tabuada.add(botao);
		
		tabuada.setVisible(true);
		
	}

}
