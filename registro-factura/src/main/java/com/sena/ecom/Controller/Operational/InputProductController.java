package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.InputProduct;
import com.sena.ecom.IService.Operational.IInputProductService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/inputProduct")
public class InputProductController extends ABaseController<InputProduct,IInputProductService>{

	protected InputProductController(IInputProductService service) {
		super(service, "Input_product");
	}

}
