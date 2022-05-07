package org.iset.entities;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Paiment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date_paiment;
	private String type;
	

	

	public Paiment() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Date getDate_paiment() {
		return date_paiment;
	}




	public void setDate_paiment(Date date_paiment) {
		this.date_paiment = date_paiment;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public Paiment(Long id, Date date_paiment, String type) {
		super();
		this.id = id;
		this.date_paiment = date_paiment;
		this.type = type;
	}



	
}
