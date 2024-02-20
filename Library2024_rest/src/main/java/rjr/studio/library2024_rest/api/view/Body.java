package rjr.studio.library2024_rest.api.view;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Body<T> {
	
	@NotNull
	@Schema(example ="User", description = "data type")
	private String _dataType;

	private T element;
	
	private Collection<T> elements;

	@Schema(description = "total data object elements")
	private Integer totalElements;

}
