package com.butters.myeatslist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @NonNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank(message = "Cuisine cannot be blank")
    @NonNull
    @Column(name = "cuisine", nullable = false)
    private String cuisine;

    @NonNull
    @Min(value = 0, message = "Score cannot be less than 0")
    @Max(value = 10, message = "Score cannot be more than 10")
    @Column(name = "food", nullable = false)
    private Long food;

    @NonNull
    @Min(value = 0, message = "Score cannot be less than 0")
    @Max(value = 10, message = "Score cannot be more than 10")
    @Column(name = "price", nullable = false)
    private Long price;

    @NonNull
    @Min(value = 0, message = "Score cannot be less than 0")
    @Max(value = 10, message = "Score cannot be more than 10")
    @Column(name = "vibe", nullable = false)
    private Long vibe;

}
