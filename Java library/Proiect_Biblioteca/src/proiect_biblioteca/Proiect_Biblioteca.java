package proiect_biblioteca;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Proiect_Biblioteca extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public Proiect_Biblioteca() {
             super("eLibrary");
		
                setSize(1366,650);
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("START");
                
                /*b1.setBackground(Color.decode("#28afed"));
                b1.setForeground(Color.BLACK);*/
                b1.setOpaque(false);
                b1.setContentAreaFilled(false);
                b1.setBorderPainted(false);
                b1.setFont(new Font("Arial", Font.BOLD, 30));
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("proiect_biblioteca/icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 650,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(630,530,200,60);
		l1.setBounds(0, 0, 1366, 650);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                Proiect_Biblioteca window = new Proiect_Biblioteca();
                window.setVisible(true);			
	}
}
