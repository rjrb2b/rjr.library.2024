package rjr.studio.library2024_rest.api.view;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class ApiResponseBuilder {

	public static <T> ResponseEntity<Body<T>> buildSuccessResponse(Collection<T> elements, String dataType)
			throws Exception {

		Body<T> body = new Body<T>();
		body.set_dataType(dataType);

		if (null == elements) {
			throw new Exception();
		} else if (1 == elements.size()) {
			Iterator<T> iterator = elements.iterator();
			T firstElement = iterator.next();
			body.setElement(firstElement);
		} else if (1 < elements.size()) {
			body.setElements(elements);
		}
		body.setTotalElements(elements.size());

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<>(body, headers, HttpStatus.OK);

	}

}
