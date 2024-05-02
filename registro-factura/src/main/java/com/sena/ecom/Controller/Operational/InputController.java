package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Input;
import com.sena.ecom.IService.Operational.IInputService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/input")
public class InputController extends ABaseController<Input,IInputService>{

	protected InputController(IInputService service) {
		super(service, "Input");
	}

}
