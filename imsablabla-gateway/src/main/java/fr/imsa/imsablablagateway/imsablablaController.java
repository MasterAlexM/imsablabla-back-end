package fr.imsa.imsablablagateway;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.imsa.imsablablagateway.Repository.MessageRepository;
import fr.imsa.imsablablagateway.Repository.TrajetRepository;
import fr.imsa.imsablablagateway.Repository.UserRepository;
import fr.imsa.imsablablagateway.model.Message;
import fr.imsa.imsablablagateway.model.Trajet;
import fr.imsa.imsablablagateway.model.User;

@RestController
@RequestMapping("/api")
public class imsablablaController {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TrajetRepository trajetRepository;
	@Autowired
	private MessageRepository messageRepository;
	

	@RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Optional<User>> createUsers(@RequestBody User newUser) {
		return userRepository.createUser(newUser);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<User>> getUsers() {
		return userRepository.getUsers();
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Optional<User>> getUser(@PathVariable("id") Integer id) {
		return userRepository.getUser(id);
	}

	@RequestMapping(value = "/user/search/{name}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<User>> searchUsersByName(@PathVariable("name") String name) {
		return userRepository.searchUsersByName(name);
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User newUser) {
		return userRepository.updateUser(id, newUser);
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Integer id) {
		return userRepository.deleteUser(id);
	}
	
	//-----------------------------------------------------------------------------------------------------

	@RequestMapping(value = "/trajet", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Optional<Trajet>> createTrajets(@RequestBody Trajet newTrajet) {
		return trajetRepository.createTrajets(newTrajet);
	}

	@RequestMapping(value = "/trajet", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<Trajet>> getTrajets() {
		return trajetRepository.getTrajets();
	}

	@RequestMapping(value = "/trajet/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Optional<Trajet>> getTrajet(@PathVariable("id") Integer id) {
		return trajetRepository.getTrajet(id);
	}

	@RequestMapping(value = "/trajet/search/{userId}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<Trajet>> searchTrajetByUserId(@PathVariable("userId") Integer userId) {
		return trajetRepository.searchTrajetByUserId(userId);
	}

	@RequestMapping(value = "/trajet/{id}", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Trajet> updateTrajet(@PathVariable("id") Integer id, @RequestBody Trajet newTrajet) {
		return trajetRepository.updateTrajet(id, newTrajet);
	}

	@RequestMapping(value = "/trajet/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Trajet> deleteTrajet(@PathVariable("id") Integer id) {
		return trajetRepository.deleteTrajet(id);
	}

	//-----------------------------------------------------------------------------------------------------

	@RequestMapping(value = "/message", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Optional<Message>> createMessages(@RequestBody Message newMessage) {
		return messageRepository.createMessages(newMessage);
	}

	@RequestMapping(value = "/message/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Optional<Message>> getMessage(@PathVariable("id") Integer id) {
		return messageRepository.getMessage(id);
	}

	@RequestMapping(value = "/message/search/{userSender}-{userReceiver}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<Message>> searchMessageByUserId(@PathVariable("userId") Integer userId) {
		return messageRepository.searchMessageByUserId(userId);
	}

	@RequestMapping(value = "/message/{id}", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Message> updateMessage(@PathVariable("id") Integer id, @RequestBody Message newMessage) {
		return messageRepository.updateMessage(id, newMessage);
	}

	@RequestMapping(value = "/message/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Message> deleteMessage(@PathVariable("id") Integer id) {
		return messageRepository.deleteMessage(id);
	}

	//-----------------------------------------------------------------------------------------------------
/*
	@RequestMapping(path = "/geocode/coords", method = RequestMethod.GET, produces = "application/json")
    public Location locationFromAddress(@RequestParam(name = "address") final String address) {
        return geoCodeRepository.locationFromAddress(new Place(address));
    }

    @RequestMapping(value = "/geocode/place", method = RequestMethod.GET, produces = "application/json")
    public Place addressFromLocation(@RequestParam(name = "lat") final Float latitude, @RequestParam(name = "long") final Float longitude) {
        return geoCodeRepository.addressFromLocation(new Location(latitude, longitude, null));
    }
*/
}
