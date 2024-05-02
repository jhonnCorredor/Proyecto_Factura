package com.sena.ecom.Entity.Operational;
import com.sena.ecom.Entity.ABaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="input_product")
public class InputProduct extends ABaseEntity{
	
	@Column(name="quantity", nullable = true)
	private int quantity;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "product_id", nullable = false)
    private Product product;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "input_id", nullable = false)
    private Input input;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "unit_of_measure_id", nullable = false)
    private UnitofMeasure unitof_measure;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public UnitofMeasure getUnitof_measure() {
		return unitof_measure;
	}

	public void setUnitof_measure(UnitofMeasure unitof_measure) {
		this.unitof_measure = unitof_measure;
	}
	
}
