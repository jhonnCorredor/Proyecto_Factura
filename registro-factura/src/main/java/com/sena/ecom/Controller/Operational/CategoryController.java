package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Category;
import com.sena.ecom.IService.Operational.ICategoryService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/category")
public class CategoryController extends ABaseController<Category,ICategoryService>{

	protected CategoryController(ICategoryService service) {
		super(service, "Category");
	}

}
