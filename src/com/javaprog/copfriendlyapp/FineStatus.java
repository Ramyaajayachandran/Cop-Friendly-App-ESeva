package com.javaprog.copfriendlyapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FineStatus extends JFrame {
	static FineStatus frame;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new FineStatus();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
/*class ImagePanel extends JPanel{

		  private Image img;
		  public ImagePanel(String img) {
		    this(new ImageIcon(img).getImage());
		  }

		  public ImagePanel(Image img) {
		    this.img = img;
		    setSize(1366,768);
		    setLayout(null);
		  }

		  public void paintComponent(Graphics g) {
		    g.drawImage(img, 0, 0, null);
		  }
	}*/
	/**
	 * Create the frame.
	 */
	public FineStatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFineStatus = new JLabel("COP FRIENDLY APP");
		lblFineStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnAdminLogin = new JButton("Traffic central Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				AdminLogin.main(new String[]{});
				//ImagePanel panel = new ImagePanel(new ImageIcon("D:\\image1.jpg").getImage());
				frame.dispose();
			}
		});
		
		JButton btnInspectorLogin = new JButton("Traffic Inspector Login");
		btnInspectorLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InspectorLogin.main(new String[]{});
				frame.dispose();
			}
		});
		JButton btnalert = new JButton("Medical Team Login");
		btnalert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewEmergency.main(new String[]{});
				frame.dispose();
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(143)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnInspectorLogin, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnAdminLogin, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
							.addGap(143)
							.addComponent(btnalert, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
							.addComponent(lblFineStatus)))
					.addContainerGap(210, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblFineStatus)
					.addGap(42)
					.addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnInspectorLogin, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnalert, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
