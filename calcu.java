import javax.swing.*; import java.awt.*; import java.awt.event.*;
 
PROGRAM
 

SwethaSathyan 55
 
class GUI implements ActionListener
{
JFrame jf;
JLabel jl1;
JLabel jl2;
JLabel jl3;
JTextField jt1,jt2,jt3;
JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14;
GUI()
{
jf=new JFrame(); jf.setSize(200,300); jf.setVisible(true);
GridLayout g=new GridLayout(3,4); jf.setLayout(g);
jl1=new JLabel("enter 1st number"); jt1=new JTextField(10);
jl2=new JLabel("enter 2nd number"); jt2=new JTextField(10);
jl3=new JLabel("result"); jt3=new JTextField(10); jb1=new JButton("0"); jb2=new JButton("1"); jb3=new JButton("2"); jb4=new JButton("3"); jb5=new JButton("4"); jb6=new JButton("5"); jb7=new JButton("6"); jb8=new JButton("7"); jb9=new JButton("8"); jb10=new JButton("9");


jb11=new JButton("+"); jb12=new JButton("-"); jb13=new JButton("*"); jb14=new JButton("/"); jb15=new JButton("="); jb16=new JButton("AC");
 

jf.add(jl1);
jf.add(jt1);
jf.add(jl2);
jf.add(jt2);
jf.add(jl3);
jf.add(jt3);
jf.add(jb1);
jf.add(jb2);
jf.add(jb3);
jf.add(jb4);
jf.add(jb5);
jf.add(jb6);
jf.add(jb7);
jf.add(jb8);
jf.add(jb9);
jf.add(jb10);
jf.add(jb11);
jf.add(jb12);
jf.add(jb13);
jf.add(jb14); jb1.addActionListener(this); jb2.addActionListener(this); jb3.addActionListener(this); jb4.addActionListener(this); jb5.addActionListener(this); jb6.addActionListener(this); jb7.addActionListener(this); jb8.addActionListener(this); jb9.addActionListener(this); jb10.addActionListener(this); jb11.addActionListener(this); jb12.addActionListener(this); jb13.addActionListener(this); jb14.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s1=jt1.getText(); int a=Integer.parseInt(s1); String s2=jt2.getText(); int b=Integer.parseInt(s2);
String s3=ae.getActionCommand(); if(s3.equals("+"))
{
int c=a+b;
String s=String.valueOf(c); jt3.setText(s);
}
 
if(s3.equals("-"))
{
int c=a-b;
String s=String.valueOf(c); jt3.setText(s);
}
if(s3.equals("*"))
{
int c=a*b;
String s=String.valueOf(c); jt3.setText(s);
}
if(s3.equals("/"))
{
 



}
}
}
class cal
{
 
int c=a/b;
String s=String.valueOf(c); jt3.setText(s);
 
public static void main(String m[])
{
GUI g=new GUI();
}
}
