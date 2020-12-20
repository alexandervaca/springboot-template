package ar.com.company.app.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.company.app.auth.services.JwtService;
import ar.com.company.app.exception.NotificacionesServiceException;
import ar.com.company.app.model.Notificacion;
import ar.com.company.app.model.Usuario;
import ar.com.company.app.repository.NotificacionRepository;
import ar.com.company.app.repository.UsuarioRepository;

@Service
public class NotificacionesService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private NotificacionRepository notificacionRepository;
	
	public List<Notificacion> obtenerNotificacionesPorProveedor(HttpServletRequest http) throws NotificacionesServiceException {
		String username = jwtService.getUsernameFromToken((String) http.getHeader("Authorization"));
		Usuario usuario = usuarioRepository.findByUsername(username)
				.orElseThrow(() -> new NotificacionesServiceException("Proveedor inexistente."));
		return notificacionRepository.findByUsuarioIdUsuario(usuario.getIdUsuario());
	}
}
