package exerc�cios;

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
		
		//Vari�veis
		ArrayList<Integer> finalSemana = new ArrayList<Integer>(), diaSemana = new ArrayList<Integer>();
		
		for(int i = 0; i < 28; i++) {
			
			if((i != 3) || (i != 10) || (i != 17) || (i != 24) || (i != 4) || (i != 11) || (i != 18) || (i != 25)) {
				diaSemana.add(i);
			} else {
				finalSemana.add(i);
			}
		}
	
		// JFrame
		JFrame construtor = new JFrame();
		construtor.setSize(280, 150);
		construtor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		construtor.setLocationRelativeTo(null);
		construtor.setLayout(null);
		
		// JLabel
		JLabel digite = new JLabel("Digite um dia do m�s de fevereiro de 2018");
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
				
				for(int i = 0; i < 28; i++) {
					if(dia == diaSemana<i>) {
						JOptionPane.showMessageDialog(null, "Ser� dia de semana");
					} else if(dia == finalSemana(i)) {
						JOptionPane.showMessageDialog(null, "Ser� final de semana");
					} else {
						JOptionPane.showMessageDialog(null, "Esse dia n�o existe");
					}
				}
			}
		});
		
		construtor.add(digite);
		construtor.add(campo);
		construtor.add(botao);
		construtor.setVisible(true);
		
	}

}
