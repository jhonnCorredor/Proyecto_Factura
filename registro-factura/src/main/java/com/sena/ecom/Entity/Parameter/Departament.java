package com.sena.ecom.Entity.Parameter;

import com.sena.ecom.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="departament")
public class Departament extends ABaseEntity{
	
	@Column(name = "name", length = 50, nullable = false)
	private String name;
	    
	@Column(name = "code", length = 50, nullable = false)
	private String code;
	        
	@Column(name = "description", length = 50, nullable = false)
	private String description;
	        
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "country_id", nullable = false)
	private Country country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
