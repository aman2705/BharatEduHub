package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.Users;
import com.example.BharatEduHub.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService   {


    @Autowired
    private UserRepository userRepository;

    public void addusers(Users input) {
        userRepository.save(input);
    }
    public Users searchUser(Integer id) {
        return  userRepository.getReferenceById(id);
    }

    public Users update(Integer id, Users updated) {

        Users existinguser=userRepository.getReferenceById(id);
        existinguser.setEmail(updated.getEmail());
        existinguser.setPhoneno(updated.getPhoneno());
        existinguser.setUsername(updated.getUsername());
        existinguser.setPasswordhash(updated.getPasswordhash());

        return  existinguser;
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

}
