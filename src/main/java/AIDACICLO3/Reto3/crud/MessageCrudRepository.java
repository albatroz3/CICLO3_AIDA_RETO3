package AIDACICLO3.Reto3.crud;

import AIDACICLO3.Reto3.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
