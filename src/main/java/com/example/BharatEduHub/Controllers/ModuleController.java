package com.example.BharatEduHub.Controllers;

import com.example.BharatEduHub.Models.CustomMessage;
import com.example.BharatEduHub.Models.Modules;
import com.example.BharatEduHub.Models.Users;
import com.example.BharatEduHub.Service.ModuleService;
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
    private ResponseEntity<CustomMessage> addmodule(@RequestBody Modules modules){
        moduleService.add_module(modules);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CustomMessage("Added Successfully!"));
    }

    @DeleteMapping("/api/modules/{module_id}")
    public ResponseEntity<CustomMessage> delete(@PathVariable Integer module_id){
        moduleService.delete(module_id);
        return ResponseEntity.status(HttpStatus.OK).body(new CustomMessage("Deleted Successfully!"));
    }

    @PutMapping("/api/modules/{module_id}/sequence")
    public ResponseEntity<Modules> update(@PathVariable Integer module_id,@RequestBody Modules updated){
        Modules newmodule=moduleService.update(module_id,updated);
        return ResponseEntity.status(HttpStatus.OK).body(newmodule);
    }
}
