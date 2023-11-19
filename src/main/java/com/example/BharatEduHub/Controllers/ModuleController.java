package com.example.BharatEduHub.Controllers;

import com.example.BharatEduHub.Models.CustomMessage;
import com.example.BharatEduHub.Models.Modules;
import com.example.BharatEduHub.Service.ModuleService;
import com.example.BharatEduHub.dto.CreateModuleDTO;
import com.example.BharatEduHub.dto.ModuleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bharateduhub")
public class ModuleController {

    @Autowired
    ModuleService moduleService;

    @PostMapping("/api/modules")
    private ResponseEntity<ModuleDTO> addmodule(@RequestBody CreateModuleDTO createModuleDTO){
        Modules module = moduleService.createModule(createModuleDTO);
        ModuleDTO dto = moduleService.convertToDTO(module);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @DeleteMapping("/api/modules/{module_id}")
    public ResponseEntity<Void> delete(@PathVariable Integer module_id){
        boolean success = moduleService.deleteModuleById(module_id);
        if (success) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
