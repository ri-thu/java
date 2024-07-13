import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class GUI implements ActionListener 
{
    JFrame jf;
    JTextField jt1,jt2,jt3;
    JLabel jl1,jl2,jl3,jl4;
    JButton jb;
    GUI()
    {
        jf=new JFrame("gui with exception ");
        jt1=new JTextField(10);
        jt2=new JTextField(10);
        jt3=new JTextField(10);
        jl4=new JLabel("Result");
        jl1=new JLabel("Enter first number");
        jl2=new JLabel("Enter second number");
        jl3=new JLabel(" ");
        jb=new JButton("division");
        jf.setLayout(new FlowLayout());
        jf.setSize(600,600);
        jf.setVisible(true);
        jf.add(jl1);
        jf.add(jt1);
        jf.add(jb);
        jf.add(jl2);
        jf.add(jt2);
        jf.add(jl4);
        jf.add(jt3);
        jf.add(jl3);
        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
        String str1=jt1.getText();
        int a,b;
        float result;
        String str2=jt2.getText();
        a=Integer.parseInt(str1);
        b=Integer.parseInt(str2);
        result=a/b;
        String str3=String.valueOf(result);
        jt3.setText(str3);
        jl3.setText("");
        }
        catch(NumberFormatException ne)
        {
                jl3.setText("NumberFormatException");
                jt3.setText("");
        }
        catch(ArithmeticException ne )
        {
            jl3.setText("Arithmetic Exception");
            jt3.setText("");
        }
       
       

    }
}
class guiexception
{
    public static void main(String[] args) {
        GUI g=new GUI();
    }
}