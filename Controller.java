package Burian_Moser_Wintersperger;

import java.awt.event.*;

/**
 * 
 * @author Moser Patrizia
 * @version 24.11.2016
 * 
 */

public class Controller implements ActionListener{

	private Model m;
	private View v;
	
	public Controller(){
		this.m = new Model();
		this.v = new View(this);
		this.v.setLeucht(this.m.getLight());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < this.v.getButtons().length; i++){
			
			if(e.getSource() == this.v.getButtons()[i]){

				this.m.invert(i);
				this.v.setLeucht(this.m.getLight());

				this.v.repaint();
				
				if(this.m.finish())this.v.finishFrame(this.m.getCounter());
			}
		}
	}

	public static void main(String [] args){
		new Controller();
	}

}
