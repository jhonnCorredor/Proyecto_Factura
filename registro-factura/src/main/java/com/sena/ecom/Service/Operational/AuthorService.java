package com.sena.ecom.Service.Operational;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.ecom.Entity.Operational.Author;
import com.sena.ecom.IRepository.IBaseRepository;
import com.sena.ecom.IRepository.Operational.IAuthorRepository;
import com.sena.ecom.IService.Operational.IAuthorService;
import com.sena.ecom.Service.ABaseService;

@Service
public class AuthorService extends ABaseService<Author> implements IAuthorService{

	@Autowired
	private IAuthorRepository repository;
	
	@Override
	protected IBaseRepository<Author, Long> getRepository() {
		return repository;
	}

}
