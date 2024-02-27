package rjr.studio.library2024_rest.dao.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "BOOKS")
public class BookEntity extends BaseEntity {

	public static final String _TYPE = BookEntity.class.getSimpleName();

	@Column(name = "TITLE_IT", nullable = false, length = 255)
	@Size(min = 2, message = "The italian title length must be at least 2 characters")
	private String titleIt;
	@Column(name = "TITLE_ORIGINAL", nullable = false, length = 255)
	@Size(min = 2, message = "The original title length must be at least 2 characters")
	private String titleOriginal;
	@Column(name = "DATE_PUB_1ST", nullable = false)
	private LocalDate datePub1St;
	@Column(name = "DATE_PUB", nullable = true)
	private LocalDate datePub;


}
