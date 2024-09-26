package br.com.fiap.hotels.hotel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Hotel {

    @Id
    UUID id;

    @NotNull
    String title;

    @Size(min = 10)
    String description;

    @Min(1)
    int score;
}
