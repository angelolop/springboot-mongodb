package angelo.workshopmongo.repositories;

import angelo.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
