package com.example.BharatEduHub.Controllers;

import com.example.BharatEduHub.Models.CustomMessage;
import com.example.BharatEduHub.Models.Testimonial.Testimonial;
import com.example.BharatEduHub.Service.TestimonialService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bharateduhub")
public class TestiMonialController {

    @Autowired
    private TestimonialService testimonialService;



    @PostMapping("/post_test")
    public ResponseEntity<CustomMessage> postalldetails(@RequestBody Testimonial input){
        testimonialService.addtestimonial(input);
        return ResponseEntity.status(HttpStatus.CREATED).body(new CustomMessage("Added Successfully!"));
    }

    @PutMapping("/update_test/{id}")
    public ResponseEntity<Testimonial> updatethedetails(@PathVariable Integer id, @RequestBody Testimonial updated){
        Testimonial newtestimonial=testimonialService.update(id,updated);
        return ResponseEntity.status(HttpStatus.OK).body(newtestimonial);
    }
}
