package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		Color fondoPrincipal = new Color (30,30,30);
		Color recuadro = new Color (15,15,15);
		Color fondoVentana = new Color (45,45,45);
		Color fuentePrincipal = new Color (255,255,255);
		Color escritura = new Color (200,200,200 );
		Color botones = new Color (74,74,74);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 700);
		contentPane = new JPanel();
		contentPane.setBackground(fondoPrincipal);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		user = new JTextField();
		user.setForeground(escritura);
		user.setBackground(fondoVentana);
		user.setBounds(311, 308, 365, 20);
		user.setColumns(10);
		
		pass = new JTextField();
		pass.setForeground(escritura);
		pass.setBounds(311, 408, 365, 20);
		pass.setBackground(fondoVentana);;
		pass.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(417, 276, 160, 26);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(414, 376, 160, 26);
		lblContrasea.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setForeground(Color.WHITE);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblContrasea);
		contentPane.add(pass);
		contentPane.add(user);
		
		JLabel lblNewLabel_1 = new JLabel("MANEJADOR DE BASES DE DATOS");
		lblNewLabel_1.setForeground(fuentePrincipal);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 48));
		lblNewLabel_1.setBounds(10, 49, 988, 94);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 143, 966, 2);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(recuadro);
		panel.setBounds(250, 228, 471, 323);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton inicioSesion = new JButton("INICIAR SESI�N");
		inicioSesion.setBounds(281, 260, 143, 23);
		panel.add(inicioSesion);
		inicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal vent = new VentanaPrincipal();
				vent.setVisible(true);
				dispose();
				
			}
		});
		inicioSesion.setBackground(botones);
		inicioSesion.setForeground(Color.WHITE);
		inicioSesion.setFocusPainted(false);
		
		
		
	}
}
