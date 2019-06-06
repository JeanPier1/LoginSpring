package pe.edu.upeu.spring.dao;




import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.spring.entities.Login.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
	
//	@Query(value = "SELECT usua.*,sed.*, ad.*, rd.* from sede sed, area ad, rol rd, usuario usua, sede_area sead, sa_rol sad, usua_rol usr WHERE sed.se_id=sead.sed_id and sead.area_id=ad.area_id and sad.rol_id=rd.rol_id and sead.sa_id=sad.sa_id and sad.sa_rol_id=usr.sa_rol_id and usr.usu_id=usua.usu_id and usua.nomnbre=? and usua.password=?", nativeQuery = true)
//	List<Map<String ,String>> getUsuario(String user,String pass);
	public Usuario findByUsername(String username);
	

}
