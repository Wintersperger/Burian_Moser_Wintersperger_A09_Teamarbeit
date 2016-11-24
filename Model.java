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
		this.light[(int)(Math.random()*5)][(int)(Math.random()*5)]=true;
		this.light[(int)(Math.random()*5)][(int)(Math.random()*5)]=true;
		this.light[(int)(Math.random()*5)][(int)(Math.random()*5)]=true;
		this.light[(int)(Math.random()*5)][(int)(Math.random()*5)]=true;
		this.light[(int)(Math.random()*5)][(int)(Math.random()*5)]=true;
	}
	/**
	 * Invertiert die Buttons um den gedrückten Buton
	 * @param x die x koordinate des Buttons
	 * @param y die y koordinate des Buttons
	 */
	public void invert(int x, int y){
		if(this.light[x][y]==true)this.light[x][y]=false;
		if(this.light[x][y]==false)this.light[x][y]=true;
		
		if(this.light[x+1][y]==true)this.light[x+1][y]=false;
		if(this.light[x+1][y]==false)this.light[x+1][y]=true;
		
		if(this.light[x-1][y]==true)this.light[x-1][y]=false;
		if(this.light[x-1][y]==false)this.light[x-1][y]=true;
		
		if(this.light[x][y+1]==true)this.light[x][y+1]=false;
		if(this.light[x][y+1]==false)this.light[x][y+1]=true;
		
		if(this.light[x][y-1]==true)this.light[x][y-1]=false;
		if(this.light[x][y-1]==false)this.light[x][y-1]=true;
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
	/**
	 * 
	 * @param x die x koordinate des Buttons
	 * @param y die y koordinate des Buttons
	 * @return ob der Button leuchted oder nicht
	 */
	public boolean getButtonStatus(int x, int y){
		return this.light[x][y];
	}
}
