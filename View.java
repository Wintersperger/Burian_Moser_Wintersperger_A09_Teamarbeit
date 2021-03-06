package Burian_Moser_Wintersperger;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 *  View ist das Graphische User Interface
 *
 * @author Burian Paul
 * @version 2016-11-17
 *
 */
public class View extends JFrame {
	
    private Controller c;
    private JFrame F2;
    
	private JLabel glueckwunsch;
    private JLabel l1;
    private Container c1;

    private JButton[] buttons;
    private boolean[] leucht;

    public View(Controller c){
        this.setTitle("Lights Out");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        this.leucht = new boolean[25];

        Border border = BorderFactory.createLineBorder(new Color(0, 150, 0), 2);
        Border border2 = new EmptyBorder(10, 10, 10, 10);

        this.l1 = new JLabel("<html><body><font size=5>Versuchen sie alle Lichter auszuschalten</html></body></font>");
        this.l1.setBackground(new Color(0, 50, 0));
        this.l1.setOpaque(true);
        this.l1.setForeground(Color.lightGray);
        this.l1.setBorder(new CompoundBorder(border,border2));
        this.l1.setVerticalAlignment(SwingConstants.CENTER);
        this.l1.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(l1, BorderLayout.NORTH);

        this.c1 = new Container();
        this.c1.setLayout(new GridLayout(5, 5));

        buttons = new JButton[25];
        for(int i=0; i<buttons.length; i++){
            this.buttons[i]=new JButton();
            if(leucht[i]==false) {
                this.buttons[i].setBackground(Color.BLACK);
            }else{
                this.buttons[i].setBackground(Color.YELLOW);
            }
            this.buttons[i].addActionListener(c);
        }

        for(int i=0; i<buttons.length; i++) {
            this.c1.add(buttons[i]);
        }
        this.add(c1, BorderLayout.CENTER);

        this.setVisible(true);
    }
    
    public void finishFrame(int counter){
    	this.F2 = new JFrame();
		this.F2.setTitle("Gewonnen");
		this.F2.setSize(400, 300);
		this.F2.setDefaultCloseOperation(3);
		this.F2.setLocationRelativeTo(null);
		this.glueckwunsch = new JLabel("Sie haben " + counter + " Züge benötigt");
		this.F2.add(this.glueckwunsch);
		this.F2.setVisible(true);
    }
    
    public boolean[] getLeucht() {
        return leucht;
    }
    public void setLeucht(boolean[] leucht) {
        this.leucht = leucht;
    }
    public JLabel getL1() {
        return l1;
    }
    public void setL1(JLabel l1) {
        this.l1 = l1;
    }
    public JButton[] getButtons() {
        return buttons;
    }
    public void setButtons(JButton[] buttons) {
        this.buttons = buttons;
    }
    public JFrame getF2() {
		return this.F2;
	}
}
