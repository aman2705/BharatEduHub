package com.example.BharatEduHub.Controllers;


import com.example.BharatEduHub.Models.Testimonial;
import com.example.BharatEduHub.Service.TestimonialService;
import com.example.BharatEduHub.dto.TestimonialDTO;
import com.example.BharatEduHub.dto.UpdateTestimonialDTO;
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

    @PostMapping("/api/testimonials")
    public ResponseEntity<Testimonial> postalldetails(@RequestBody TestimonialDTO testimonialDTO){
        Testimonial testimonial = testimonialService.addtestimonial(testimonialDTO);
        return new ResponseEntity<>(testimonial, HttpStatus.CREATED);
    }

    @PutMapping("/api/testimonials/{user_id}")
    public ResponseEntity<Testimonial> updatethedetails(@PathVariable Integer id, @RequestBody UpdateTestimonialDTO updated){
        Testimonial testimonial = testimonialService.updated(id, updated);
        return new ResponseEntity<>(testimonial, HttpStatus.OK);
    }
}
