package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Author;
import com.sena.ecom.IService.Operational.IAuthorService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/author")
public class AuthorController extends ABaseController<Author,IAuthorService>{

	protected AuthorController(IAuthorService service) {
		super(service, "Author");
	}

}
