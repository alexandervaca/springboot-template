package ar.com.company.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ar.com.company.app.model.Notificacion;

public interface NotificacionRepository extends CrudRepository<Notificacion, Long>{

	public List<Notificacion> findByUsuarioIdUsuario(Long IdUsuario);
}
