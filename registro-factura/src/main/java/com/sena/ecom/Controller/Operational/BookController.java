package com.sena.ecom.Controller.Operational;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.ecom.Controller.ABaseController;
import com.sena.ecom.Entity.Operational.Book;
import com.sena.ecom.IService.Operational.IBookService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("v1/api/book")
public class BookController extends ABaseController<Book,IBookService>{

	protected BookController(IBookService service) {
		super(service, "Book");
	}

}
