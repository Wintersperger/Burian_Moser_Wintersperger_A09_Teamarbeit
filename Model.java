package Gruppe_Burian_Moser_Wintersperger;

import javax.swing.*;

/**
 * 
 * @author mwintersperger
 * @version 2016-11-24
 */
public class Model {
	private int counter;
	private boolean[][] light;
	private Model(){
		this.counter=0;
		this.light=new boolean[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				this.light[i][j]=false;
			}
		}
		this.light[2][4]=true;
		this.light[4][1]=true;
		this.light[1][3]=true;
		this.light[5][5]=true;
		this.light[1][5]=true;
	}
	/**
	 * Invertiert die Buttons um den gedrückten Buton
	 */
	public void invert(){
		counter++;
	}
	/**
	 * Überprüft ob alle Button on oder off sind. falls alle off sind wird true returned
	 * @return true wenn alle buttons off sind. false wen nicht
	 */
	public boolean Finish(){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(this.light[i][j]==false)return false;
			}
		}
		return true;
	}
}

