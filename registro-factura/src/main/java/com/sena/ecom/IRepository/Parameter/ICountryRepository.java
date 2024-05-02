package com.sena.ecom.IRepository.Parameter;
import org.springframework.stereotype.Repository;
import com.sena.ecom.Entity.Parameter.Country;
import com.sena.ecom.IRepository.IBaseRepository;

@Repository
public interface ICountryRepository extends IBaseRepository<Country, Long>{

}
