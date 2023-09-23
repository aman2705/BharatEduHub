package com.example.BharatEduHub.Controllers;

import com.example.BharatEduHub.Models.CustomMessage;
import com.example.BharatEduHub.Models.Users;
import com.example.BharatEduHub.Service.UserService;
import com.example.BharatEduHub.util.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bharateduhub")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/post")
    public ResponseEntity<CustomMessage> postalldetails(@RequestBody Users input){
        userService.addusers(input);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CustomMessage("Added Successfully!"));
    }

    @GetMapping("/fetch/{id}")
    public ResponseEntity<Users>  getalldetails(@PathVariable Integer id){
        Users result=userService.searchUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Users> updatethedetails(@PathVariable Integer id, @RequestBody Users updated){
        Users newuser=userService.update(id,updated);
        return ResponseEntity.status(HttpStatus.OK).body(newuser);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CustomMessage> delete(@PathVariable Integer id){
        userService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(new CustomMessage("Deleted Successfully!"));
    }


    @PostMapping("/authenticate")
    public String generateToken(@RequestBody Users users) throws Exception {
        return jwtTokenUtil.generateToken(users.getUsername());
    }



}
