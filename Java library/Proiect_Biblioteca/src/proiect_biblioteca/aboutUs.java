package proiect_biblioteca;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About The Developer");
         
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
            JLabel l2 = new JLabel("Back");
	    l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Home home = new Home();
		home.setVisible(true);
            }
	    });
	    l2.setForeground(Color.GRAY);
	    l2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	    ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("proiect_biblioteca/icons/tenth.png"));
            Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l2.setIcon(i9);
	    l2.setBounds(300, 400, 72, 33);
	    contentPane.add(l2);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("proiect_biblioteca/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("eLibrary");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            /*JLabel l4 = new JLabel("");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);*/

            JLabel l5 = new JLabel("v1.0");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By: Dorina-Gheorghita Calin");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("You can contact me at calin.dorina.b8u@student.ucv.ro");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

