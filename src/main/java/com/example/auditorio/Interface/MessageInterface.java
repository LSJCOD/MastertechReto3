package com.example.auditorio.Interface;

import com.example.auditorio.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository<Message,Integer> {
}
