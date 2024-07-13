import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI implements ActionListener
{
    JFrame jf;
    JTextField jt;
    JButton ba,bs,bm,bd,bmo,bc,be;
    String s1,s2,s3,s4="";
    int a,r;
    GUI()
    {
        jf=new JFrame("Simple Calculator");
        jt=new JTextField(25);
        ba=new JButton("+");
        bs=new JButton("-");
        bm=new JButton("x");
        bd=new JButton("/");
        bmo=new JButton("%");
        be=new JButton("=");
        bc=new JButton("C");
        jf.setLayout(new GridLayout(4,4,6,6));
        jf.setSize(300,300);
        jf.setVisible(true);
        JButton[] digitButtons=new JButton[10];
        jf.add(jt);
        for(int i=0;i<10;i++)
        {
            digitButtons[i]=new JButton(String.valueOf(i));
            jf.add(digitButtons[i]);
            digitButtons[i].addActionListener(this);
        }
        jf.add(ba);
        jf.add(bs);
        jf.add(bm);
        jf.add(bd);
        jf.add(bmo);
        jf.add(bc);
        jf.add(be);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        bmo.addActionListener(this);
        be.addActionListener(this);
        bc.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("0"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("1"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("2"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("3"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("4"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("5"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("6"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("7"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("8"))
        {
            s1=jt.getText();
            jt.setText(s);
        }
        if(s.equals("9"))
        {
            s1=jt.getText();
            jt.setText(s);
        }

        else if(s.equals("C"))
        {
            jt.setText("");
        }
        else if(s.equals("="))
        {
            s2=jt.getText();
            if(s4.equals("+"))
            {
                r=Integer.parseInt(s1)+Integer.parseInt(s2);
            }
           else if(s4.equals("-"))
            {
                r=Integer.parseInt(s1)-Integer.parseInt(s2);
            }
            else if(s4.equals("*"))
            {
                r=Integer.parseInt(s1)*Integer.parseInt(s2);
            }
            else if(s4.equals("/"))
            {
                r=Integer.parseInt(s1)/Integer.parseInt(s2);
            }
            else if(s4.equals("%"))
            {
                r=Integer.parseInt(s1)%Integer.parseInt(s2);
            }
            else
            {
                jt.setText("0");
            }
            String s3=String.valueOf(r);
                jt.setText(s3);
        }
        else
        { 
            if(s.equals("+"))
            {
             s4="+";
            }
            else if(s.equals("-"))
            {
                s4="-";
            }
            else if(s.equals("x"))
            {
                s4="*";
            }
            else if(s.equals("/"))
            {
                s4="/";
            }
            else if(s.equals("%"))
            {
                s4="%";
            }
        }
 }
}
class calculator
{
    public static void main(String args[])
    {
        GUI g=new GUI();
    }
}