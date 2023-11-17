package com.example.BharatEduHub.Service;

import com.example.BharatEduHub.Models.Testimonial.Testimonial;
import com.example.BharatEduHub.Repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestimonialService {

    @Autowired
    private TestimonialRepository testimonialRepository;

    public void addtestimonial(Testimonial input) {
        testimonialRepository.save(input);
    }

    public Testimonial update(Integer id, Testimonial updated) {

        Testimonial existingtestimonial=testimonialRepository.getReferenceById(id);
        existingtestimonial.setComment(updated.getComment());
        existingtestimonial.setCompany(updated.getCompany());
        existingtestimonial.setName(updated.getName());
        existingtestimonial.setPhotopath(updated.getPhotopath());
        existingtestimonial.setCtc(updated.getCtc());

        return  existingtestimonial;
    }
}
