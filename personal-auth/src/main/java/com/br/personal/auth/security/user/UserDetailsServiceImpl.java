package com.br.personal.auth.security.user;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.hibernate.boot.model.source.internal.hbm.CommaSeparatedStringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.personal.auth.model.ApplicationUser;
import com.br.personal.auth.repository.ApplicationUserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static org.springframework.security.core.authority.AuthorityUtils.commaSeparatedStringToAuthorityList;


@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserDetailsServiceImpl implements UserDetailsService {

	private final ApplicationUserRepository aur;

	@Override
	public UserDetails loadUserByUsername(String username){
		log.info("Searching in the DB the user by username '{}'",username);
		ApplicationUser au = aur.findByUsername(username);
		log.info("Found username '{}'",au);
		
		if(au == null)
			throw new UsernameNotFoundException(String.format("No found '%d'", username));
		
		return new CustomUserDetails(au);
	}

	private static final class CustomUserDetails extends ApplicationUser implements UserDetails {
		CustomUserDetails(@NotNull ApplicationUser applicationUser) {
			super(applicationUser);
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return commaSeparatedStringToAuthorityList("ROLE_" + this.getRole());
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}

	}

}
