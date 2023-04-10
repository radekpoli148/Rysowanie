package rysowanie;

import java.awt.*;
import javax.swing.*;

public class Rysowanie extends JFrame
{
    public Rysowanie()
    {
        this.setTitle("Rysowanie");
        this.setBounds(250, 300, 300, 250);
        
        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) 
    {
        new Rysowanie().setVisible(true);
    }
    
    private PanelRysowania panelDoRysowania = new PanelRysowania();
}
class PanelRysowania extends JPanel
{
    public PanelRysowania()
    {
        super();
        
        this.add(new JButton("Test"){
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            
        }
        });
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawString("Napis", 0, 25);
        g.drawImage(new ImageIcon("dodaj.png").getImage(), 10, 50, null);
        g.drawRect(40, 80, 100, 75);
        g.drawLine(50, 50, 90, 200);
        
        Graphics2D g2 = (Graphics2D)g;
    }
    public static int i = 0;
}