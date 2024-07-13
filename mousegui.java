import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class mousegui implements MouseListener
{


    JFrame jf;
    JLabel jl;
    JLabel jl1;
    JLabel jl2;
    JButton jb;
    JTextField jt;
    JTextField jt1;
    JTextField jt2;

    mousegui()
    {
        jf=new JFrame("mouse");
        jl=new JLabel("x :");
        jt=new JTextField(10);
        jl1=new JLabel("y :");
        jt1=new JTextField(10);
        jl2=new JLabel("operation :");
        jt2=new JTextField(10);
        jf.setSize(600,800);
        jf.setVisible(true);
        jf.add(jl);
        jf.add(jt);
        jf.add(jl1);
        jf.add(jt1);
        jf.add(jl2);
        jf.add(jt2);
        jf.setLayout(new FlowLayout());
        jf.addMouseListener(this);
        
    }
    public void mouseClicked(MouseEvent e)
    {
        jt.setText(""+e.getX()+"");
        jt1.setText(""+e.getY()+"");
        jt2.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e)
    {
        jt.setText(e.getX()+"");
        jt1.setText(e.getY()+"");
        jt2.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e)
    {
        jt.setText(e.getX()+"");
        jt1.setText(e.getY()+"");
        jt2.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e)
    {
        jt.setText(e.getX()+"");
        jt1.setText(e.getY()+"");
        jt2.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e)
    {
        jt.setText(e.getX()+"");
        jt1.setText(e.getY()+"");
        jt2.setText("Mouse Exited");
    }


public static void main(String arg[])
{
    mousegui ob =new mousegui();
}    
}

