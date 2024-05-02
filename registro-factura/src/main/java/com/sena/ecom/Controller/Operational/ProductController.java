package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Product;
import com.sena.ecom.IService.Operational.IProductService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/product")
public class ProductController extends ABaseController<Product,IProductService>{

	protected ProductController(IProductService service) {
		super(service, "Product");
	}

}
