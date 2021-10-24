package com.example.auditorio.Interface;

import com.example.auditorio.Modelo.Audience;
import org.springframework.data.repository.CrudRepository;



public interface AudienceInterface extends CrudRepository<Audience, Integer> {
}
