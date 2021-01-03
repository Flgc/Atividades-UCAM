package com.ead.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programa extends JFrame {

	private JPanel Painel;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa frame = new Programa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Programa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 182);
		Painel = new JPanel();
		Painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Painel);
		Painel.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(108, 23, 275, 20);
		Painel.add(txtNome);
		txtNome.setColumns(10);
		
		JComboBox cmbSexo = new JComboBox<String>();
		cmbSexo.setBounds(108, 56, 275, 22);
		Painel.add(cmbSexo);
		cmbSexo.addItem("");
		cmbSexo.addItem("MASCULINO");
		cmbSexo.addItem("FEMININO");
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Programa.this, "Nome informado: " + txtNome.getText());
			}
		});
		btnEnviar.setBounds(162, 100, 89, 23);
		Painel.add(btnEnviar);
		
		JLabel lblNome = new JLabel("Seu Nome :");
		lblNome.setBounds(10, 26, 88, 17);
		Painel.add(lblNome);
		
		JLabel lblSexo = new JLabel("Sexo :");
		lblSexo.setBounds(10, 60, 46, 14);
		Painel.add(lblSexo);
	}
}
