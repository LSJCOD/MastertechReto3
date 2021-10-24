package com.example.auditorio.Interface;

import com.example.auditorio.Modelo.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientInterface extends CrudRepository<Client,Integer> {
}
