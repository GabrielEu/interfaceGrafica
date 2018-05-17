package ex06_JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 130);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JComboBox");
		formulario.setLayout(null);

		// JCheckBox
		JCheckBox xbxMasculino = new JCheckBox("Masulino");
		xbxMasculino.setBounds(10, 10, 100, 20);

		// JCheckBox
		JCheckBox xbxFeminino = new JCheckBox("Feminino");
		xbxFeminino.setBounds(110, 10, 100, 20);

		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(20, 40, 150, 20);
		
		//Ação
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if((xbxMasculino.isSelected()) && (xbxFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estão selecionados");
				} else if(xbxMasculino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Masculino está selecionado");
				} else if(xbxFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminino está selecionado");	
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum foi selecionado");
				}
				
			}
		});
		
		
		//Adicionar ao JFrame
		formulario.add(xbxFeminino);
		formulario.add(xbxMasculino);
		formulario.add(botao);
		
		formulario.setVisible(true);
		
	}
}
