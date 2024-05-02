package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.InvoiceDetail;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IInvoiceDetailRepository;
import com.sena.ecom.IService.Operational.IInvoiceDetailService;
import com.sena.ecom.Service.ABaseService;

@Service
public class InvoiceDetailService extends ABaseService<InvoiceDetail> implements IInvoiceDetailService{

	@Autowired
	private IInvoiceDetailRepository repository;
	
	@Override
	protected IBaseRepository<InvoiceDetail, Long> getRepository() {
		return repository;
	}

}
