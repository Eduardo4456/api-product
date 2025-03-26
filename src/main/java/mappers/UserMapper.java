package mappers;


import br.com.primeshoes.api.entites.User;
import dtos.UserCreatDTO;
import dtos.UserResponseDTO;


public class UserMapper {

	
	public static UserResponseDTO toDTO(User user) {
		return new UserResponseDTO(user.getId(), user.getName(), user.getEmail(), user.isAdmin());
	}
	
	public static User ToEntity(UserCreatDTO userCreatDTO) {
		User user = new User();
		user.setName(userCreatDTO.name());
		user.setEmail(userCreatDTO.email());
		user.setPassword(userCreatDTO.password());
		
		return user;
		
	}
}
