package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;

public class ex5 {

	public static void main(String[] args) {
	
		int[] diaSemana = new int[20];
		int[] finalSemana = new int[8];
		
		diaSemana[0] = 1;
		diaSemana[1] = 2;
		
			finalSemana[0] = 3;
			finalSemana[1] = 4;
		
		diaSemana[2] = 5;
		diaSemana[3] = 6;
		diaSemana[4] = 7;
		diaSemana[5] = 8;
		diaSemana[6] = 9;
		
			finalSemana[2] = 10;
			finalSemana[3] = 11;
		
		diaSemana[7] = 12;
		diaSemana[8] = 13;
		diaSemana[9] = 14;
		diaSemana[10] = 15;
		diaSemana[11] = 16;
		
			finalSemana[4] = 17;
			finalSemana[5] = 18;
		
		diaSemana[12] = 19;
		diaSemana[13] = 20;
		diaSemana[14] = 21;
		diaSemana[15] = 22;
		diaSemana[16] = 23;
		
			finalSemana[6] = 24;
			finalSemana[7] = 25;
		
		diaSemana[17] = 26;
		diaSemana[18] = 27;
		diaSemana[19] = 28;

		// JFrame
		JFrame construtor = new JFrame();
		construtor.setSize(280, 150);
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.setLayout(null);
		
		// JLabel
		JLabel digite = new JLabel("Digite um dia do mês de fevereiro de 2018");
		digite.setBounds(12, 10, 250, 20);
		
		// JTextField
		JTextField campo = new JTextField();
		campo.setBounds(110, 40, 40, 20);
		
		// JButton
		JButton botao = new JButton("Continuar");
		botao.setBounds(80, 80, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int dia = Integer.parseInt(campo.getText());
				
				for(int i = 0; i < 20; i++) {
					
					if(dia == diaSemana[i]) {
						JOptionPane.showMessageDialog(null, "Será dia de semana");
					}
				}
				
				for(int i = 0; i < 8; i++) {
					
					if(dia == finalSemana[i]) {
						JOptionPane.showMessageDialog(null, "Será fim de semana");
					}
				}
				
				if((dia <= 0) || (dia > 28)){
					JOptionPane.showMessageDialog(null, "Esse dia não existe");
				}
				
			}
			
		});
		
		
		construtor.add(digite);
		construtor.add(campo);
		construtor.add(botao);
		construtor.setVisible(true);
		
	}

}
