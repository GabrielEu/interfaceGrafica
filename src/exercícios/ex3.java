package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex3 {

	public static void main(String[] args) {
		
		// JFrame
		JFrame construtor = new JFrame();
		construtor.setSize(300, 300);	
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.setLayout(null);
		
		// JLabel
		JLabel nota1 = new JLabel("Informe sua 1º nota: ");
		nota1.setBounds(10, 10, 200, 10);
		
		JLabel nota2 = new JLabel("Informe sua 2º nota: ");
		nota2.setBounds(10, 60, 200, 10);
		
		JLabel nota3 = new JLabel("Informe sua 3º nota: ");
		nota3.setBounds(10, 110, 200, 10);
		
		JLabel nota4 = new JLabel("Informe sua 4º nota: ");
		nota4.setBounds(10, 160, 200, 10);
		
		// JTextField
		JTextField receberN1 = new JTextField();
		receberN1.setBounds(130, 8, 50, 20);
		
		JTextField receberN2 = new JTextField();
		receberN2.setBounds(130, 58, 50, 20);
		
		JTextField receberN3 = new JTextField();
		receberN3.setBounds(130, 108, 50, 20);
		
		JTextField receberN4 = new JTextField();
		receberN4.setBounds(130, 158, 50, 20);
		
		// JButton
		JButton botao = new JButton("Continuar");
		botao.setBounds(83, 215, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				int nota1 = Integer.parseInt(receberN1.getText());
				int nota2 = Integer.parseInt(receberN2.getText());
				int nota3 = Integer.parseInt(receberN3.getText());
				int nota4 = Integer.parseInt(receberN4.getText());
				
				int notas = nota1 + nota2 + nota3 + nota4;
				double media = notas / 4;
				
				String text;
				
				if((media >= 7) && (media <= 10)){
					text = "Aprovado";
				} else if((media >= 5) && (media <= 6.9)) {
					text = "Em exame";
				} else {
					text = "Reprovado";
				}
				
				JOptionPane.showMessageDialog(null, "Você está "+text+"\nMédia: "+String.format("%.2f", media));
				
			}
		});
		
		construtor.add(nota1);
		construtor.add(nota2);
		construtor.add(nota3);
		construtor.add(nota4);
		construtor.add(receberN1);
		construtor.add(receberN2);
		construtor.add(receberN3);
		construtor.add(receberN4);
		construtor.add(botao);
		
		construtor.setVisible(true);
	}

}
