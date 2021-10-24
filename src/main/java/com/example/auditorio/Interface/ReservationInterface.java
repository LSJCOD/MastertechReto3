package com.example.auditorio.Interface;

import com.example.auditorio.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository<Reservation,Integer> {
}
