package com.example.BharatEduHub.Repository;

import com.example.BharatEduHub.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
//    Users findByUserName(String username);

}
