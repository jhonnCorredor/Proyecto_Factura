package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.InvoiceDetail;
import com.sena.ecom.IService.Operational.IInvoiceDetailService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/invoiceDetail")
public class InvoiceDetailController extends ABaseController<InvoiceDetail,IInvoiceDetailService>{

	protected InvoiceDetailController(IInvoiceDetailService service) {
		super(service, "Invoice_detail");
	}

}
