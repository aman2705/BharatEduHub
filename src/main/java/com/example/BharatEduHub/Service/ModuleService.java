package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.Modules;
import com.example.BharatEduHub.Repository.ModuleRepository;
import com.example.BharatEduHub.dto.CreateModuleDTO;
import com.example.BharatEduHub.dto.ModuleDTO;
import com.example.BharatEduHub.exception.ModuleNotFoundException;
import com.example.BharatEduHub.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepository;

    public Modules createModule(CreateModuleDTO createModuleDTO) {
        Modules modules = new Modules();
        modules.setTitle(createModuleDTO.getTitle());
        modules.setDescription(createModuleDTO.getDescription());
        modules.setSeqnum(createModuleDTO.getSeqNum());
        modules.setCreatedAt(LocalDateTime.now());
        modules.setUpdatedAt(LocalDateTime.now());
        return moduleRepository.save(modules);
    }

    public ModuleDTO convertToDTO(Modules modules) {
        ModuleDTO dto = new ModuleDTO();
        dto.setId(modules.getId());
        dto.setTitle(modules.getTitle());
        dto.setDescription(modules.getDescription());
        dto.setSeqNum(modules.getSeqnum());
        dto.setCreatedAt(modules.getCreatedAt());
        dto.setUpdatedAt(modules.getUpdatedAt());
        return dto;
    }

    public boolean deleteModuleById(Integer moduleId) {
        Optional<Modules> optionalModule = moduleRepository.findById(moduleId);
        if (optionalModule.isPresent()) {
            moduleRepository.deleteById(moduleId);
            return true;
        } else {
            throw new ModuleNotFoundException(moduleId);
        }
    }

}
