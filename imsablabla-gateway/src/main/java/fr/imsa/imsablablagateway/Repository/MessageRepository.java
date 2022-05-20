package fr.imsa.imsablablagateway.Repository;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.imsa.imsablablagateway.model.Message;


@FeignClient(path = "/api/message", name = "imsablabla-MESSAGE")
public interface MessageRepository {

	@RequestMapping(value = "/message", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Optional<Message>> createMessages(@RequestBody Message newMessage);

	@RequestMapping(value = "/message/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Optional<Message>> getMessage(@PathVariable("id") Integer id);

	@RequestMapping(value = "/message/search/{userSender}-{userReceiver}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<Message>> searchMessageByUserId(@PathVariable("userId") Integer userId);

	@RequestMapping(value = "/message/{id}", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Message> updateMessage(@PathVariable("id") Integer id, @RequestBody Message newMessage);

	@RequestMapping(value = "/message/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Message> deleteMessage(@PathVariable("id") Integer id);


}
