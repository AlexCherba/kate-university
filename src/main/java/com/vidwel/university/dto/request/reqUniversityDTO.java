package com.vidwel.university.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class reqUniversityDTO {
    private String name;
    private String description;
    private String phone;
    private String email;
    private String address;
}
