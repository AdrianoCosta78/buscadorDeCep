package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		getContentPane().setBackground(SystemColor.controlHighlight);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Vers\u00E3o 1,0");
		lblNewLabel.setBounds(48, 56, 324, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Autor : Adriano Costa");
		lblNewLabel_1.setBounds(48, 96, 324, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service: ");
		lblNewLabel_2.setBounds(48, 140, 95, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(132, 140, 189, 14);
		getContentPane().add(lblWebService);
		
		JButton btnInstagram = new JButton("");
		btnInstagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.instagram.com/costa_adriano78/");
			}
		});
		btnInstagram.setToolTipText("Meu Instagram");
		btnInstagram.setBackground(SystemColor.controlHighlight);
		btnInstagram.setBorder(null);
		btnInstagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInstagram.setIcon(new ImageIcon(Sobre.class.getResource("/img/instagram.png")));
		btnInstagram.setForeground(SystemColor.control);
		btnInstagram.setBounds(142, 187, 48, 48);
		getContentPane().add(btnInstagram);
		
		JButton btnGitHub = new JButton("");
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/AdrianoCosta78");
			}
		});
		btnGitHub.setToolTipText("Projeto no Github");
		btnGitHub.setBackground(SystemColor.controlHighlight);
		btnGitHub.setBorder(null);
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGitHub.setForeground(SystemColor.control);
		btnGitHub.setBounds(244, 187, 48, 48);
		getContentPane().add(btnGitHub);

	}
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch (Exception e){
			System.out.println(e);
		}
	}

}
