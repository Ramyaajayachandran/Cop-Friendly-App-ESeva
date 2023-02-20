package com.javaprog.copfriendlyapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class ViewViolator extends JFrame {
	static ViewViolator frame;
	public ViewViolator() {
		//Code to view data in JTable
		List<Violator> list=ViolatorDao.view();
		int size=list.size();
		
		String data[][]=new String[size][12];
		int row=0;
		for(Violator s:list){
			data[row][0]=String.valueOf(s.getid());
			data[row][1]=s.getName();
			data[row][2]=s.getEmail();
			data[row][3]=s.getviolence();
			data[row][4]=String.valueOf(s.getfine());
			data[row][5]=String.valueOf(s.getPaid());
			data[row][6]=String.valueOf(s.getDue());
			data[row][7]=s.getAddress();
			data[row][8]=s.getCity();
			data[row][9]=s.getState();
			data[row][10]=s.getCountry();
			data[row][11]=s.getContactno();
			
			row++;
		}
		String columnNames[]={"id","Name","Email","violence","fine","Paid","Due","Address","City","State","Country","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewViolator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
