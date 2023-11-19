package com.example.BharatEduHub.Controllers;

import com.example.BharatEduHub.Service.UserService;
import com.example.BharatEduHub.dto.UserDTO;
import com.example.BharatEduHub.dto.UserListDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bharateduhub")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/fetch/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id) {
        UserDTO user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/api/users")
    public ResponseEntity<UserListDTO> getAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        UserListDTO userListDTO = new UserListDTO(users);
        return new ResponseEntity<>(userListDTO, HttpStatus.OK);
    }







//    @PostMapping("/authenticate")
//    public String generateToken(@RequestBody Users users) throws Exception {
//        return jwtTokenUtil.generateToken(users.getUsername());
//    }



}