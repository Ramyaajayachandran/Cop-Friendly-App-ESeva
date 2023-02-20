package com.javaprog.copfriendlyapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class ViewEmergency extends JFrame {
	static ViewEmergency frame;
	public ViewEmergency() {
		//Code to view data in JTable
		List<Emergency> list=EmergencyDao.view();
		int size=list.size();
		
		String data[][]=new String[size][12];
		int row=0;
		for(Emergency s:list){
			data[row][0]=String.valueOf(s.getid());
			data[row][1]=s.getName();
			data[row][2]=s.getincidenttype();
			data[row][3]=s.getlocation();
			data[row][4]=s.getphno1();
			data[row][5]=s.getphno2();
			data[row][6]=s.getphno3();
			data[row][7]=s.getpatientaddress();
			data[row][8]=s.getbloodgroup();
			data[row][9]=s.getactiontaken();
			data[row][10]=s.getwitnessphno();
			data[row][11]=s.getoffenderphno();
			
			row++;
		}
		String columnNames[]={"id","name","incidenttype","location","phno1","phno2","phno3","patientaddress","bloodgroup","actiontaken","witnessphno","offenderphno"};
		
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
					frame = new ViewEmergency();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
