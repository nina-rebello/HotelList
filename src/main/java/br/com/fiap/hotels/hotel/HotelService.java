package br.com.fiap.hotels.hotel;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) { this.hotelRepository = hotelRepository; }

    public List<Hotel> findAll() { return hotelRepository.findAll(); }

}
