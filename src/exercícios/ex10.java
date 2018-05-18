package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex10 {

	public static void main(String[] args) {

		// JFrame
		JFrame cofre = new JFrame("Cofre");
		cofre.setSize(280, 400);
		cofre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cofre.setLocationRelativeTo(null);
		cofre.setLayout(null);
		
		// JLabel
		JLabel moeda01 = new JLabel("Moedas de 1 centavo:");
		moeda01.setBounds(10, 10, 150, 20);
		
		JLabel moeda05 = new JLabel("Moedas de 05 centavos:");
		moeda05.setBounds(10, 60, 150, 20);
		
		JLabel moeda10 = new JLabel("Moedas de 10 centavos:");
		moeda10.setBounds(10, 110, 150, 20);
		
		JLabel moeda25 = new JLabel("Moedas de 25 centavos:");
		moeda25.setBounds(10, 160, 150, 20);
		
		JLabel moeda50 = new JLabel("Moedas de 50 centavos:");
		moeda50.setBounds(10, 210, 150, 20);
		
		JLabel moeda1 = new JLabel("Moedas de 1 real:");
		moeda1.setBounds(10, 260, 150, 20);
		
		// JTextField
		JTextField campoMoeda01 = new JTextField();
		campoMoeda01.setBounds(200, 10, 50, 20);
		
		JTextField campoMoeda05 = new JTextField();
		campoMoeda05.setBounds(200, 60, 50, 20);
		
		JTextField campoMoeda10 = new JTextField();
		campoMoeda10.setBounds(200, 110, 50, 20);
		
		JTextField campoMoeda25 = new JTextField();
		campoMoeda25.setBounds(200, 160, 50, 20);
		
		JTextField campoMoeda50 = new JTextField();
		campoMoeda50.setBounds(200, 210, 50, 20);
		
		JTextField campoMoeda1 = new JTextField();
		campoMoeda1.setBounds(200, 260, 50, 20);
		
		
		// JButton
		JButton botao = new JButton("Continuar");
		botao.setBounds(55, 310, 150, 20);
		
		// Ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double total;
				double moedas01 = Double.parseDouble(campoMoeda01.getText());
				double moedas05 = Double.parseDouble(campoMoeda05.getText());
				double moedas10 = Double.parseDouble(campoMoeda10.getText());
				double moedas25 = Double.parseDouble(campoMoeda25.getText());
				double moedas50 = Double.parseDouble(campoMoeda50.getText());
				double moedas1 = Double.parseDouble(campoMoeda1.getText());
				
				total = ((moedas01 * 0.01) + (moedas05 * 0.05) + (moedas10 * 0.10) + (moedas25 * 0.25) + (moedas50 * 0.50) + (moedas1 * 1));
			
				JOptionPane.showMessageDialog(null, "Você economizou R$"+String.format("%.2f", total));
			}
		});
	
		cofre.add(moeda01);
		cofre.add(moeda05);
		cofre.add(moeda10);
		cofre.add(moeda25);
		cofre.add(moeda50);
		cofre.add(moeda1);
		
		cofre.add(campoMoeda01);
		cofre.add(campoMoeda05);
		cofre.add(campoMoeda10);
		cofre.add(campoMoeda25);
		cofre.add(campoMoeda50);
		cofre.add(campoMoeda1);
		
		cofre.add(botao);
		
		cofre.setVisible(true);
		
	}

}
