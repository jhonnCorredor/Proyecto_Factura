package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Subcategory;
import com.sena.ecom.IService.Operational.ISubcategoryService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/subcategory")
public class SubcategoryController extends ABaseController<Subcategory,ISubcategoryService>{

	protected SubcategoryController(ISubcategoryService service) {
		super(service, "Subcategory");
	}

}
