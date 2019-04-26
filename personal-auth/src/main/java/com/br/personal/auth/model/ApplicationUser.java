package com.br.personal.auth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ApplicationUser implements AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	@NotNull(message = "username nulo")
	@Column(nullable = false)
	private String username;
	@NotNull(message = "password nulo")
	@Column(nullable = false)
	@ToString.Exclude
	private String password;
	@NotNull(message = "role nulo")
	@Column(nullable = false)
	private String role = "USER";
	
	
	public ApplicationUser(@NotNull ApplicationUser applicationUser) {

		this.id = applicationUser.getId();
		this.username = applicationUser.getUsername();
		this.password = applicationUser.getPassword();
		this.role = applicationUser.getRole();
	}

	
	
}