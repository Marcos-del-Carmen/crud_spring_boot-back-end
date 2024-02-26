package mx.com.softurasolutions.demo.repositorios;

import mx.com.softurasolutions.demo.entidades.Personas;
import org.springframework.data.repository.CrudRepository;

public interface PersonasRepositorio extends CrudRepository<Personas, Integer>{
    
}
