package repositories;

import models.TrackingInformation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackingInformationRepo extends MongoRepository<TrackingInformation, String> {
}
