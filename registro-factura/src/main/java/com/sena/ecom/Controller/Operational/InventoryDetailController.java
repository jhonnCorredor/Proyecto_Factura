package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.InventoryDetail;
import com.sena.ecom.IService.Operational.IInventoryDetailService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/inventoryDetail")
public class InventoryDetailController extends ABaseController<InventoryDetail,IInventoryDetailService>{

	protected InventoryDetailController(IInventoryDetailService service) {
		super(service, "Inventory_detail");
	}

}
