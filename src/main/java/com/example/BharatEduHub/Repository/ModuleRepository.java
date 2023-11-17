package com.example.BharatEduHub.Repository;

import com.example.BharatEduHub.Models.Modules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Modules,Integer> {

}
