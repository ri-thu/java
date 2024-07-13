import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI implements ActionListener
{
    JFrame jf;
    JLabel message;
    ButtonGroup bgroup;
    JRadioButton jred,jyellow,jgreen;
    GUI()
    {
        jf=new JFrame("Traffic Light");
        message=new JLabel("Select Light");
        bgroup=new ButtonGroup();
        jred=new JRadioButton("Red");
        jyellow=new JRadioButton("Yellow");
        jgreen=new JRadioButton("Green");
        jred.setForeground(Color.RED);
        jyellow.setForeground(Color.YELLOW);
        jgreen.setForeground(Color.GREEN);
        jf.setLayout(new FlowLayout());
        jf.setSize(200,300);
        jf.setVisible(true);
        jf.add(message);
        bgroup=new ButtonGroup();
        bgroup.add(jred);
        bgroup.add(jyellow);
        bgroup.add(jgreen);
        jf.add(jred);
        jf.add(jyellow);
        jf.add(jgreen);
        jred.addActionListener(this);
        jyellow.addActionListener(this);
        jgreen.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
    String s=ae.getActionCommand();
    if(s.equals("Red"))
    {
        message.setText("STOP");
        message.setForeground(Color.RED);

    }
    else if(s.equals("Yellow"))
    {
        message.setText("SLOW");
        message.setForeground(Color.YELLOW);

    }
    else
    {
        message.setText("GO");
        message.setForeground(Color.GREEN);
    }
}

}
class trafficlight
{
    public static void main(String args[])
    {
        GUI g=new GUI();
    }
}