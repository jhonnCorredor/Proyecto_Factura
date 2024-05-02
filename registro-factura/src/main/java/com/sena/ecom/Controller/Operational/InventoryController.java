package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Inventory;
import com.sena.ecom.IService.Operational.IInventoryService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/inventory")
public class InventoryController extends ABaseController<Inventory,IInventoryService>{

	protected InventoryController(IInventoryService service) {
		super(service, "Inventory");
	}

}
