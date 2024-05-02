package com.sena.ecom.Entity.Operational;
import com.sena.ecom.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category extends ABaseEntity{

	@Column(name="name", nullable= false)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
