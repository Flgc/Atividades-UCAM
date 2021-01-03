package com.ead.threads.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Cronometro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Thread t ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cronometro frame = new Cronometro();
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
	public Cronometro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 t = new Thread(new Runnable() {

					@Override
					public void run() {
						try {
							for (int i = 0; i < 50; i++) {
								textField.setText(new Date().toString());
								Thread.sleep(1000);
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				});
				t.start();
			}
		});
		btnNewButton.setBounds(10, 24, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Terminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (t != null) {
					t.stop();
				}
				
			}
		});
		btnNewButton_1.setBounds(10, 58, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(109, 25, 315, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
