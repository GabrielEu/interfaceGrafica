package ex07_JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

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
		JRadioButton rbtMasculino = new JRadioButton("Masculino");
		rbtMasculino.setBounds(10, 10, 100, 20);

		JRadioButton rbtFeminino = new JRadioButton("Feminino");
		rbtFeminino.setBounds(110, 10, 100, 20);

		// JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 50, 150, 20);

		// Ação
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if ((rbtMasculino.isSelected()) && (rbtFeminino.isSelected())) {
					JOptionPane.showMessageDialog(null, "Ambos estão selecionados");
				} else if (rbtMasculino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Masculino está selecionado");
				} else if (rbtFeminino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Feminino está selecionado");
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum foi selecionado");
				}

			}
		});

		// Adicionar ao JFrame
		formulario.add(rbtFeminino);
		formulario.add(rbtMasculino);
		formulario.add(botao);

		formulario.setVisible(true);

	}

}
