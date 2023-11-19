package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.Testimonial;
import com.example.BharatEduHub.Repository.TestimonialRepository;
import com.example.BharatEduHub.dto.TestimonialDTO;
import com.example.BharatEduHub.dto.UpdateTestimonialDTO;
import com.example.BharatEduHub.exception.TestimonialNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TestimonialService {

    @Autowired
    private TestimonialRepository testimonialRepository;

    public Testimonial addtestimonial(TestimonialDTO testimonialDTO) {

        Testimonial testimonial = new Testimonial();
        testimonial.setUserId(testimonialDTO.getUserId());
        testimonial.setPhotoPath(testimonialDTO.getPhotoPath());
        testimonial.setName(testimonialDTO.getName());
        testimonial.setCtc(testimonialDTO.getCtc());
        testimonial.setCompany(testimonialDTO.getCompany());
        testimonial.setComment(testimonialDTO.getComment());
        testimonial.setCreatedAt(LocalDateTime.now());
        testimonial.setUpdatedAt(LocalDateTime.now());
        return testimonialRepository.save(testimonial);
    }

    public Testimonial updated(Integer id, UpdateTestimonialDTO updated) {

        Optional<Testimonial> optionalTestimonial = testimonialRepository.findById(id);
        if (optionalTestimonial.isEmpty()) {
            throw new TestimonialNotFoundException(id);
        }
        Testimonial testimonial = optionalTestimonial.get();
        testimonial.setPhotoPath(updated.getPhotoPath());
        testimonial.setComment(updated.getComment());
        testimonial.setUpdatedAt(LocalDateTime.now());
        return testimonialRepository.save(testimonial);
    }
}
