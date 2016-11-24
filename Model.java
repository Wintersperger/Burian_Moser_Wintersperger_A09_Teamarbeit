package Burian_Moser_Wintersperger;

import javax.swing.*;

/**
 * 
 * @author mwintersperger
 * @version 2016-11-24
 */
public class Model {
	private int counter;
	private boolean[] light;
	public Model(){
		this.counter=0;
		this.light=new boolean[25];
		for(int i=0;i<25;i++){
				this.light[i]=false;
			}
		this.light[(int)(Math.random()*(25))]=true;
		this.light[(int)(Math.random()*(25))]=true;
		this.light[(int)(Math.random()*(25))]=true;
		this.light[(int)(Math.random()*(25))]=true;
	}
	/**
	 * Invertiert die Buttons um den gedrückten Buton
	 * @param x die stelle des Buttons im array
	 */
	public void invert(int x){
			
		try{
				if(this.light[x]==true){
				this.light[x]=false;
				}
				else{
					this.light[x]=true;
				}
				
				if(this.light[x+1]==true){
					this.light[x+1]=false;
				}else{
					this.light[x+1]=true;
				}
				
				if(this.light[x-1]==true){
					this.light[x-1]=false;
				}else{
					this.light[x-1]=true;
				}
				
				if(this.light[x+5]==true){
					this.light[x+5]=false;
				}else{
					this.light[x+5]=true;
				}
				
				if(this.light[x-5]==true){
					this.light[x-5]=false;
				}else{
					this.light[x-5]=true;
				}
		}catch(Exception e){
			
		}
		counter++;
	}
	/**
	 * Überprüft ob alle Button on oder off sind. falls alle off sind wird true returned
	 * @return true wenn alle buttons off sind. false wen nicht
	 */
	public boolean finish(){
		for(int i=0;i<25;i++){
			if(this.light[i]==true)return false;
		}
		return true;
	}
	/**
	 * gibt das light array zurück
	 * @return das light array
	 */
	public boolean[] getLight(){
		return this.light;
	}
	/**
	 * get methode für counter
	 * @return
	 */
	public int getCounter(){
		return this.counter;
	}
}
