package dev.julio.movies.Repository;

import dev.julio.movies.Entity.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;

public interface IReviewRepository extends MongoRepository<Review, ObjectId> {

}
