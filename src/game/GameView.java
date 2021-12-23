package game;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameView extends JPanel implements MouseListener, MouseMotionListener
{
    private GameState state;

    public GameView(GameState state)
    {
        this.state = state;

        JFrame frame = new JFrame("Investment Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = this;
        frame.setContentPane(p);

        Dimension d = new Dimension(600, 600);
        this.setMinimumSize(d);
        this.setMaximumSize(d);
        this.setPreferredSize(d);

        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paint(Graphics g)
    {
        state.drawAll(g);
    }

    public void mouseClicked(MouseEvent e)
    {

    }

    public void mousePressed(MouseEvent e)
    {
        state.changeIsMouseClicked(true);
    }

    public void mouseReleased(MouseEvent e)
    {

    }

    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {

    }

    public void mouseDragged(MouseEvent e)
    {
        state.setMouseLocation(e.getX(), e.getY());
    }

    public void mouseMoved(MouseEvent e)
    {
        state.setMouseLocation(e.getX(), e.getY());
    }
}