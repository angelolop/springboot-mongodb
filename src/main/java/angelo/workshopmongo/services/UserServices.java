package angelo.workshopmongo.services;

import angelo.workshopmongo.domain.User;
import angelo.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

   @Autowired
   private UserRepository repo;

   public List<User> findAll() {
      return repo.findAll();
   }
}
