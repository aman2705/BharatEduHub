package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.Modules;
import com.example.BharatEduHub.Repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepository;

    public void add_module(Modules input) {
        moduleRepository.save(input);
    }

    public void delete(Integer id) {
        moduleRepository.deleteById(id);
    }

    public Modules update(Integer moduleId, Modules updated) {
        Modules existing=moduleRepository.getReferenceById(moduleId);
        existing.setSeqnum(updated.getSeqnum());
        return existing;
    }
}
