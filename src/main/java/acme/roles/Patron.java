package acme.roles;

import javax.persistence.Entity;

import acme.framework.roles.UserRole;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter

public class Patron extends UserRole {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;
	
	// Attributes -------------------------------------------------------------
	
	// Relationships ----------------------------------------------------------
	

}
