package dtos;

public record UserResponseDTO(
		Long id,
		String name,
		String email,
		Boolean admin) {

}
