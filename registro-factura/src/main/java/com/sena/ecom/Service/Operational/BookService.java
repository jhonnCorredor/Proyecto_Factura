package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Book;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IBookRepository;
import com.sena.ecom.IService.Operational.IBookService;
import com.sena.ecom.Service.ABaseService;

@Service
public class BookService extends ABaseService<Book> implements IBookService{

	@Autowired
	private IBookRepository repository;
	
	@Override
	protected IBaseRepository<Book, Long> getRepository() {
		return repository;
	}

}
