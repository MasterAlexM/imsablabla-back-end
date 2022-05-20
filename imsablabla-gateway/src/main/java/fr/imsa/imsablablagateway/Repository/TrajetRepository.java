package fr.imsa.imsablablagateway.Repository;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.imsa.imsablablagateway.model.Trajet;

@FeignClient(path = "/api/trajet", name = "imsablabla-TRAJET")
public interface TrajetRepository {

	@RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Optional<Trajet>> createTrajets(@RequestBody Trajet newTrajet);

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<Trajet>> getTrajets();

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Optional<Trajet>> getTrajet(@PathVariable("id") Integer id);

	@RequestMapping(value = "/search/{name}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<Trajet>> searchTrajetByUserId(@PathVariable("name") Integer userId);

	@RequestMapping(value = "/{id}", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Trajet> updateTrajet(@PathVariable("id") Integer id, @RequestBody Trajet newTrajet);
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Trajet> deleteTrajet(@PathVariable("id") Integer id);

}
