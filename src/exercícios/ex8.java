package exercícios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ex8 {

	public static void main(String[] args) {
		
		int escolha;
		
		// JFrame
		JFrame calculadora = new JFrame();
		calculadora.setSize(280, 230);
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadora.setLocationRelativeTo(null);
		calculadora.setLayout(null);
		
		// JTextField
		JTextField num1 = new JTextField();
		num1.setBounds(20, 75, 50, 20);
		
		JTextField num2 = new JTextField();
		num2.setBounds(190, 75, 50, 20);
	
		// JRadioButton
		JRadioButton soma = new JRadioButton("Soma");
		soma.setBounds(80, 20, 200, 20);
		soma.setActionCommand("Somar");
		
		JRadioButton subtracao = new JRadioButton("Subtração");
		subtracao.setBounds(80, 50, 200, 20);
		subtracao.setActionCommand("Subtração");
		
		JRadioButton multiplicacao = new JRadioButton("Multiplicação");
		multiplicacao.setBounds(80, 80, 200, 20);
		multiplicacao.setActionCommand("Multiplicação");
		
		JRadioButton divisao = new JRadioButton("Divisão");
		divisao.setBounds(80, 110, 200, 20);
		divisao.setActionCommand("Divisão");
		
		// ButtonGroup
		ButtonGroup operacao = new ButtonGroup();
		operacao.add(soma);
		operacao.add(subtracao);
		operacao.add(multiplicacao);
		operacao.add(divisao);
		
		// JButton
		JButton continuar = new JButton("Continuar");
		continuar.setBounds(80, 150, 100, 20);
		
		// Ação do botão
		continuar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				int resultado;
				
				if(operacao.getSelection().getActionCommand().equals("Somar")) {
					resultado = n1 + n2;
					JOptionPane.showMessageDialog(null, n1+" + "+n1+" = "+resultado);
					operacao.clearSelection();
				} else if(operacao.getSelection().getActionCommand().equals("Subtração")) {
					resultado = n1 - n2;
					JOptionPane.showMessageDialog(null, n1+" - "+n1+" = "+resultado);
					operacao.clearSelection();
				} else if(operacao.getSelection().getActionCommand().equals("Divisão")) {
					resultado = n1 / n2;
					JOptionPane.showMessageDialog(null, n1+" / "+n1+" = "+resultado);
					operacao.clearSelection();
				} else if(operacao.getSelection().getActionCommand().equals("Multiplicação")) {
					resultado = n1 * n2;
					JOptionPane.showMessageDialog(null, n1+" X "+n1+" = "+resultado);
					operacao.clearSelection();
				}
				
				
				//System.out.println(operacao.getSelection().getActionCommand());
				
			}
		});
		
		
		calculadora.add(num1);
		calculadora.add(num2);
		calculadora.add(soma);
		calculadora.add(subtracao);
		calculadora.add(multiplicacao);
		calculadora.add(divisao);
		calculadora.add(continuar);
		
		calculadora.setVisible(true);
	}
	
}
