package com.javaprog.copfriendlyapp;

import java.awt.*;  
import javax.swing.JFrame;  
public class PaymentCode extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("qr.jpg");  
        g.drawImage(i,120,100,this);  
          
    }  
        public static void main(String[] args) {  
        PaymentCode m=new PaymentCode();  
        JFrame f=new JFrame("Scan this QR Code to Pay");  
        f.add(m);  
        f.setSize(500,500);  
        f.setVisible(true);  
    }  
  
}  