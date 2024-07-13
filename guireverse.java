import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class GUI implements ActionListener
{
    JFrame jf;
    JTextField jt;
    JButton jb;
    GUI()
    {
        jf=new JFrame("reverse of name");
        jt=new JTextField(10);
        jb=new JButton("click");
        jf.setLayout(new FlowLayout());
        jf.setSize(200,300);
        jf.setVisible(true);
        jf.add(jt);
        jf.add(jb);
        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=jt.getText();
        int i,l;
        String reversed=" ";
        l=str.length();
        for(i=l-1;i>=0;i--)
        {
            reversed+=str.charAt(i);
        }
        jt.setText(reversed);
    }
}
class guireverse
{
    public static void main(String[] args) 
    {
        GUI g=new GUI();
    }
        
}
