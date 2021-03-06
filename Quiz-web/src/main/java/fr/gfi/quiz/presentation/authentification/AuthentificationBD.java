package fr.gfi.quiz.presentation.authentification;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import fr.gfi.quiz.metier.service.AuthentificationBS;

public class AuthentificationBD implements AuthenticationProvider{

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthentificationBD.class);


	@Resource(name="authBS")
	private AuthentificationBS authentificationBS;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		LOGGER.debug("demande d'authentification du login [" + authentication.getName() + "]");
		String username = authentication.getName();
		String password = authentication.getCredentials().toString();
		List<String> lRoles = authentificationBS.authentification(username, password);
		if(lRoles != null && lRoles.size()>0){
			List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
			for(String sRoles : lRoles){
				grantedAuths.add(new SimpleGrantedAuthority(sRoles));
			}
			Authentication auth = new UsernamePasswordAuthenticationToken(username, password, grantedAuths);
			return auth;
		}
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
