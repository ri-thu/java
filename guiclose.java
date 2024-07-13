import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class GUI implements ActionListener
{
    JFrame jf;
    JLabel jl;
    ButtonGroup bg;
    JRadioButton jb1,jb2,jb3;
    GUI()
    {
        jf=new JFrame("yes/no/close");
        jl=new JLabel(" ");
        jb1=new JRadioButton("YES");
        jb2=new JRadioButton("NO");
        jb3=new JRadioButton("close");
        bg=new ButtonGroup();
        jf.setLayout(new FlowLayout());
        jf.setSize(600,600);
        jf.setVisible(true);
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jl);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if(str.equals("close"))
        {
            jf.dispose();
        }
        else if(str.equals("YES"))
        {
            jl.setText("button yes is pressed");
        }
        else if(str.equals("NO"))
        {
            jl.setText("button no is pressed");
        }
    }
}
class guiclose
{
    public static void main(String arg[])
    {
        GUI g=new GUI();
    }
}
