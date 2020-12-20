package ar.com.company.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.company.app.model.Compra;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Long> {

	public List<Compra> findByUsuarioIdUsuario(Long idUsuario);
}
