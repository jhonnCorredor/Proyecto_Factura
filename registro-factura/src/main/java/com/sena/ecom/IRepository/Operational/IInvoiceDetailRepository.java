package com.sena.ecom.IRepository.Operational;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Operational.InvoiceDetail;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface IInvoiceDetailRepository extends IBaseRepository<InvoiceDetail, Long>{

}
