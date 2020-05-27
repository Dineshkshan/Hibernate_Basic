package com.database.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dinesh 
{
	@Id
	int dineshid;
	String dineshname;
	String dineshcolour;
	public int getDineshid() {
		return dineshid;
	}
	public void setDineshid(int dineshid) {
		this.dineshid = dineshid;
	}
	public String getDineshname() {
		return dineshname;
	}
	public void setDineshname(String dineshname) {
		this.dineshname = dineshname;
	}
	public String getDineshcolour() {
		return dineshcolour;
	}
	public void setDineshcolour(String dineshcolour) {
		this.dineshcolour = dineshcolour;
	}
	
}
