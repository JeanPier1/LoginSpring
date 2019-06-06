package pe.edu.upeu.spring.oauth;

//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.token.TokenEnhancer;
//import org.springframework.stereotype.Component;
//
//import pe.edu.upeu.spring.entities.Login.Usuario;
//import pe.edu.upeu.spring.service.UserService;


//@Component
public class InfoAdicionalToken /* implements TokenEnhancer*/ {
//	
//	@Autowired
//	private UserService unser;
//
//	@Override
//	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
//		Usuario usi=unser.findByUsername(authentication.getName());
//		Map<String, Object> info = new HashMap();	
//		info.put("Info_", "Hola Mundo".concat(authentication.getName()));
//		
//		info.put("Nombre Usuario", usi.getId()+" : "+usi.getUsername()+":"+usi.getIdpersona().getUsername()
//				+": ");
//		
//		
//		
//		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
//		return accessToken;
//	}

}
