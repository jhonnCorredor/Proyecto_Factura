package com.sena.ecom.Entity.Operational;
import com.sena.ecom.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="input")
public class Input extends ABaseEntity{
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="description",nullable=false)
	private String description;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "unit_of_measure_id", nullable = false)
    private UnitofMeasure unitof_measure;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UnitofMeasure getUnitof_measure() {
		return unitof_measure;
	}

	public void setUnitof_measure(UnitofMeasure unitof_measure) {
		this.unitof_measure = unitof_measure;
	}

}
