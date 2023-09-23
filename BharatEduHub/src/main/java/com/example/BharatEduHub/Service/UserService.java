package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.Users;
import com.example.BharatEduHub.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {


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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//       Users users=userRepository.findByUserName(username);
       return  new org.springframework.security.core.userdetails.User("anandr01","testpass",new ArrayList<>());
    }
}
