package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Client;
import com.sena.ecom.IService.Operational.IClientService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/client")
public class ClientController extends ABaseController<Client,IClientService>{

	protected ClientController(IClientService service) {
		super(service, "Client");
	}

}