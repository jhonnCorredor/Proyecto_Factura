package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Invoice;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IInvoiceRepository;
import com.sena.ecom.IService.Operational.IInvoiceService;
import com.sena.ecom.Service.ABaseService;

@Service
public class InvoiceService extends ABaseService<Invoice> implements IInvoiceService{

	@Autowired
	private IInvoiceRepository repository;
	
	@Override
	protected IBaseRepository<Invoice, Long> getRepository() {
		return repository;
	}

}
