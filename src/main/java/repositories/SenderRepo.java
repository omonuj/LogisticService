package repositories;

import models.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SenderRepo extends MongoRepository<Sender, String> {
}
