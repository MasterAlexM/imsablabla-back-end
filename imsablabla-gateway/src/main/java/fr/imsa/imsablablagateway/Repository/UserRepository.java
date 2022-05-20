package fr.imsa.imsablablagateway.Repository;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.imsa.imsablablagateway.model.User;

@FeignClient(path = "/api/user", name = "imsablabla-USER")
public interface UserRepository {

	@RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Optional<User>> createUser(@RequestBody User newUser);

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<User>> getUsers();

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Optional<User>> getUser(@PathVariable("id") Integer id);

	@RequestMapping(value = "/search/{name}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<User>> searchUsersByName(@PathVariable("name") String name);

	@RequestMapping(value = "/{id}", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User newUser);
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Integer id);

}
