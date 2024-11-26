package repositories;

import models.Package;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PackageRepo extends MongoRepository<Package, String> {
}
