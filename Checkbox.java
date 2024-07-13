import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class GUI implements ItemListener
{
    JFrame jf;
    JCheckBox jc1,jc2,jc3;
    JTextField jt;
    //JButtonGroup jb;
    JLabel jl;
    GUI()
    {
        jf=new JFrame("checkbox");
        jt=new JTextField(90);
        jc1=new JCheckBox("1");
        jc2=new JCheckBox("2");
        jc3=new JCheckBox("3");
        jl=new JLabel("Select any box");
        jf.add(jt);
        jf.add(jl);
        jf.add(jc1);
        jf.add(jc2);
        jf.add(jc3);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setSize(200,300);
        jc1.addItemListener(this);
        jc2.addItemListener(this);
        jc3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String selectedText=" ";
        if(jc1.isSelected()==true)
        {
            selectedText+="  " + "check box 1 checked";
        }
        else
        {
            selectedText+="  " + "check box 1 not checked";
        }
        if(jc2.isSelected()==true)
        {
            selectedText+="  " + "check box 2 checked";
        }
        else
        {
            selectedText+="  " + "check box 2 not checked";
        }
        if(jc3.isSelected()==true)
        {
            selectedText+="  " + "check box 3 checked";
        }
        else
        {
            selectedText+="  " + "check box 3 not checked";
        }
        jt.setText(selectedText);
    }
}
class checkbox
{
    public static void main(String arg[])
    {
        GUI g=new GUI();
    }
}