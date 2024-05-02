package com.sena.ecom.Entity.Operational;
import java.time.LocalDateTime;
import com.sena.ecom.Entity.ABaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="inventory_detail")
public class InventoryDetail extends ABaseEntity{
	
	@Column(name="quantity", nullable = true)
	private int quantity;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "inventory_id", nullable = false)
    private Inventory inventory;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "input_id", nullable = false)
    private Input input;	
	
	@Transient
	private LocalDateTime updatedAt;
	
	@Transient
	private LocalDateTime updatedBy;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

}
