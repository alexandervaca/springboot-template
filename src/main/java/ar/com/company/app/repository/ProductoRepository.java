package ar.com.company.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.company.app.model.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
	
	public Producto findByDescProducto(String descProducto);

	public List<Producto> findAll();
	
	public List<Producto> findByUsuarioIdUsuario(Long idUsuario);
	

}
