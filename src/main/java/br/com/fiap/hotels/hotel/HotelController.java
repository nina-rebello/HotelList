package br.com.fiap.hotels.hotel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService){ this.hotelService = hotelService; }
    @GetMapping
    public String index(Model model){
        var hotels = hotelService.findAll();
        model.addAttribute("hotels", hotels);
        return "index";
    }
}
