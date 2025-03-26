package br.com.primeshoes.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.entites.User;
import br.com.primeshoes.api.repository.UserRepository;
import dtos.UserCreatDTO;
import dtos.UserResponseDTO;
import mappers.UserMapper;
@Service
public class UserService {
	

@Autowired
	private UserRepository userRepository;

	public UserResponseDTO store(UserCreatDTO userCreatDTO) {
		User user = UserMapper.ToEntity(userCreatDTO);
		UserResponseDTO userResponse = UserMapper.toDTO(userRepository.save(user));
		
		return userResponse;
	}
	public List<UserResponseDTO> getALL(){
		return userRepository.findAll().stream().map(UserMapper::toDTO).toList();
	}
}


