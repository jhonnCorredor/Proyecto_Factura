package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Invoice;
import com.sena.ecom.IService.Operational.IInvoiceService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/invoice")
public class InvoiceController extends ABaseController<Invoice,IInvoiceService>{

	protected InvoiceController(IInvoiceService service) {
		super(service, "Invoice");
	}

}
