import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI implements ActionListener
{
    JFrame jf;
    JTextField jt1,jt2,jt3;
    JLabel jl1,jl2,jl3,jl4;
    JButton jb;
    GUI()
    {
        jf=new JFrame("temperature conversion ");
        jt1=new JTextField(10);
        jt2=new JTextField(10);
        jt3=new JTextField(10);
        jl1=new JLabel("Celsius");
        jl2=new JLabel("Farenheit");
        jl4=new JLabel("");
        jl3=new JLabel("kelvin");
        jb=new JButton("Conversion");
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.add(jl1);
        jf.add(jt1);
        jf.add(jb);
        jf.add(jl2);
        jf.add(jt2);
        jf.add(jl3);
        jf.add(jt3);
        jf.add(jl4);
        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            float result,res;
            String str=jt1.getText();
            int a=Integer.parseInt(str);
            result=a*9/5+(32);
            res=a+273;
            String str4=String.valueOf(res);
            String str2=String.valueOf(result);
            jt2.setText(str2);
            jt3.setText(str4);
            jl4.setText("");
        }
        catch(Exception e)
        {
            jl4.setText("CharacterInputException");
            jt2.setText("");
            jt3.setText("");
        }
}
}
class guitemp
{
    public static void main(String[] args) 
    {
        GUI g=new GUI();
    }
}