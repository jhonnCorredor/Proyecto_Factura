package com.sena.ecom.Controller.Security;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Security.View;
import com.sena.ecom.IService.Security.IViewService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/view")
public class ViewController extends ABaseController<View,IViewService>{

	protected ViewController(IViewService service) {
		super(service, "View");
	}

}
