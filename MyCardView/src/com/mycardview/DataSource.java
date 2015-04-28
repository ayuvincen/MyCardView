package com.mycardview;

public class DataSource {
	private String nameText;
	private String latinNameText;
	private String image;
	
	public DataSource(){}
	
	public DataSource(String nameText){
		this.nameText=nameText;
	}
	
    public DataSource(String nameText, String latinNameText, String image){
    	this.nameText=nameText;
    	this.latinNameText=latinNameText;
    	this.image=image;
    }
    
    public void setNameText(String nameText){
    	this.nameText=nameText;
    }
    
    public String getNameText(){
    	return nameText;
    }
    
    public void setLatinNameText(String latinNameText){
    	this.latinNameText=latinNameText;
    }
    
    public String getLatinNameText(){
    	return latinNameText;
    }
    
    public void setImage(String image){
    	this.image=image;
    }
    
    public String getImage(){
    	return image;
    }
    
}