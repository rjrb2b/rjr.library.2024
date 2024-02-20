package rjr.studio.library2024_rest.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "USERS")
public class UserEntity extends BaseEntity {

	public static final String _TYPE = UserEntity.class.getSimpleName();

	@Column(name = "NAME", nullable = false, length = 255)
	@Size(min = 2, message = "The name length must be at least 2 characters")
	private String name;
	@Column(name = "SURNAME", nullable = false, length = 255)
	@Size(min = 2, message = "The surname length must be at least 2 characters")
	private String surname;
	@Column(name = "USERNAME", nullable = false, length = 255)
	@Size(min = 2, message = "The username length must be at least 2 characters")
	private String username;
	@Column(name = "PASSWORD", nullable = false, length = 255)
	@Size(min = 8, message = "The password length must be at least 8 characters")
	private String password;
	@Column(name = "ROLE", nullable = false, length = 255)
	@Size(min = 2, message = "The role length must be at least 2 characters")
	private String role;

}
