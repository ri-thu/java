import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI implements ActionListener
{
    JFrame jf;
    JLabel jl1,jl2,jl3,jl4;
    JTextField jt1,jt2;
    JButton jb1,jb2,jb3;
    GUI()
    {
        jf=new JFrame("square_cube_factorial");
        jb1=new JButton("SQUARE");
        jb2=new JButton("CUBE");
        jb3=new JButton("FACTORIAL");
        jt1=new JTextField(15);
        jl1=new JLabel("ENTER THE NUMBER");
        jl2=new JLabel("RESULT");
        jt2=new JTextField(15);
        jf.setLayout(new FlowLayout());
        jf.setSize(200,200);
        jf.setVisible(true);
        jf.add(jl1);
        jf.add(jt1);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jl2);
        jf.add(jt2);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=jt1.getText();
        String str1=ae.getActionCommand();
        int a=Integer.parseInt(str);
        if(str1.equals("SQUARE"))
        {
            int n=a*a;
            String str2=String.valueOf(n);
            jt2.setText(str2);
        }
        else if(str1.equals("CUBE"))
        {
            int b=a*a*a;
            String str3=String.valueOf(b);
            jt2.setText(str3);
        }
        else if(str1.equals("FACTORIAL"))
        {
            int sum=1;
            for(int i=1;i<=a;i++)
            {
                sum=sum*i;
            }
            String str4=String.valueOf(sum);
            jt2.setText(str4);
        }
    }

}
class fac
{
    public static void main(String arg[])
    {
        GUI g=new GUI();
    }
}