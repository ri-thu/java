import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class GUI implements ActionListener 
{
    JFrame jf;
    JTextField jt1,jt2;
    JButton jb1,jb2,jb3,jb4;
    JLabel jl;
    
    GUI()
    {
        jf=new JFrame();
        jl=new JLabel("Enter the number:");
        jb1=new JButton("Square");
        jb2=new JButton("Cube");
        jb3=new JButton("Palindrome");
        jb4=new JButton("Factorial");
        jt2=new JTextField(8);
        jt1=new JTextField(10);
        jf.setLayout(new FlowLayout());
        jf.setSize(200,500);
        jf.setVisible(true);
        jf.add(jl);
        jf.add(jt1);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jt2);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);

         
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s1=jt1.getText();
        int a=Integer.parseInt(s1);
        String s2=ae.getActionCommand();
        if(s2.equals("Square"))
        {
            int b=a*a;
            String s=String.valueOf(b);
            jt2.setText(s);
        }
        else if(s2.equals("Cube"))
        {
            int b=a*a*a;
            String s=String.valueOf(b);
            jt2.setText(s);

        }
        if(s2.equals("Palindrome"))
        {
            int r;
            int n=a;
            int sum=0;
            while(n!=0)
            {
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
            }
            if(sum==a)
            {
                
                jt2.setText("Palindrome");
            }
            else

            

            
    public static void main(String args[])
    {
        GUI g=new GUI();
      
    }
} 