package com.mukundakc.fileuploadRESTApi.service.fileuploadrestservice;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name="Mfile")
public class Mfile {
	
	@Id
	private int id;
	private String Address;
	private String links;
	
	
	public Mfile() {
		
	}


	public Mfile(int id, String imageUrl, String links) {
		super();
		this.id = id;
		this.links = links;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	

	public String getLinks() {
		return links;
	}


	public void setLinks(String links) {
		this.links = links;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	@Override
	public String toString() {
		return "Mfile [id=" + id + ", Address=" + Address + ", links=" + links + "]";
	}

	
}
