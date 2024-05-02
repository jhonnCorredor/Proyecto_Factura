package com.sena.ecom.Entity.Operational;
import com.sena.ecom.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="unit_of_measure")
public class UnitofMeasure extends ABaseEntity{

	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="code",nullable=false)
	private String code;

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
	
}
