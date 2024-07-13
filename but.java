import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI implements ActionListener
{
JLabel jl1,jl2,jl3;
JButton jb1,jb2;
JFrame jf;
JTextField jt1,jt2,jt3;
GUI()
{
jf=new JFrame();
jl1=new JLabel(" Enter first number");
jt1=new  JTextField(10);
jl2=new JLabel(" Enter second number");
jt2=new  JTextField(10);
jl3=new JLabel(" Result");
jt3=new  JTextField(10);
jb1=new JButton("+");
jb2=new JButton("-");
jf.setLayout(new FlowLayout());
jf.setSize(100,200);
jf.setVisible(true);
jf.add(jl1);
jf.add(jt1);
jf.add(jl2);
jf.add(jt2);
jf.add(jl3);
jf.add(jt3);
jf.add(jb1);
jf.add(jb2);
jb1.addActionListener(this);
jb2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s1=jt1.getText(); // get the 1st value from the textfield(jt1) and it is stored in s1 as String
int a=Integer.parseInt(s1); // convert s1(String type) to int and it is stored in integer variable a
String s2=jt2.getText();// get the 2ndst value from the textfield(jt2) and it is stored in s2 as String
int b=Integer.parseInt(s2);//// convert s2(String type) to int and it is stored in integer variable b
String s3=ae.getActionCommand();// returns the label of the button you have clicked
if(s3.equals("+"))
{
int c=a+b;
String s=String.valueOf(c);// convert integer(ie value of c) to String and it is stored in s because setText() method accepts only String 
jt3.setText(s);// set the content of textfield(jt3) with value of s
}
if(s3.equals("-"))
{
int c=a-b;
String s=String.valueOf(c);
jt3.setText(s);
}

}

}
class but
{
public static void main(String a[])
{
GUI g=new GUI();
}
}