package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.ScoreBoard;
import com.example.BharatEduHub.Models.Users;
import com.example.BharatEduHub.Repository.UserRepository;
import com.example.BharatEduHub.dto.ScoreboardDTO;
import com.example.BharatEduHub.dto.UserDTO;
import com.example.BharatEduHub.dto.UserListDTO;
import com.example.BharatEduHub.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UserService   {


    @Autowired
    private UserRepository userRepository;

    public UserDTO getUserById(Integer id) {
        Optional<Users> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            Users user = userOptional.get();
            return new UserDTO(
                    user.getId(),
                    user.getUsername(),
                    user.getEmail(),
                    user.getRole(),
                    user.getCreatedAt(),
                    user.getUpdatedAt());
        } else {
            throw new UserNotFoundException(id);
        }
    }


    public List<UserDTO> getAllUsers() {
        List<Users> users = userRepository.findAll();
        List<UserDTO> userDtos = new ArrayList<>();
        for(Users user : users) {
            userDtos.add(UserDTO.fromEntity(user));
        }
        return userDtos;
    }
}
