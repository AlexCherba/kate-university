package com.vidwel.university.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RespUnivesityDTO {
    private UUID id;
    private String name;
    private Instant date;
    private String avatar;
}
