package br.com.fiap.hotels.hotel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HotelRepository extends JpaRepository <Hotel, UUID> {
}
