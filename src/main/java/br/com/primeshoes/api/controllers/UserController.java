package br.com.primeshoes.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.primeshoes.api.entites.User;
import br.com.primeshoes.api.services.UserService;
import dtos.UserCreatDTO;
import dtos.UserResponseDTO;
import mappers.UserMapper;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	UserService UserService;
	
	@PostMapping
	public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserCreatDTO userCreatDTO) {
		UserResponseDTO UserResponseDTO = UserService.store(userCreatDTO);
	 return new ResponseEntity<>(UserResponseDTO, HttpStatus.CREATED);
	}
	@GetMapping("/list")
	public List<UserResponseDTO> listALL(){
		
		return UserService.getALL();
	}
	
}

