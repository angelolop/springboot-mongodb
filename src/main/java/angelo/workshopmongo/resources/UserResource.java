package angelo.workshopmongo.resources;

import angelo.workshopmongo.domain.User;
import angelo.workshopmongo.dto.UserDTO;
import angelo.workshopmongo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

   @Autowired
   private UserServices service;

   @GetMapping
   public ResponseEntity<List<UserDTO>> findAll() {
      List<User> list = service.findAll();
      List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
      return ResponseEntity.ok().body(listDto);
   }
}
