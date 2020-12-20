package ar.com.company.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.company.app.model.Permiso;

@Repository
public interface PermisoRepository extends CrudRepository<Permiso, Long>{
	
	public Permiso findByDescPermiso(String descPermiso);
	
}
