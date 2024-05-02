package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.Invoice;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IInvoiceRepository extends IBaseRepository<Invoice, Long>{

}
