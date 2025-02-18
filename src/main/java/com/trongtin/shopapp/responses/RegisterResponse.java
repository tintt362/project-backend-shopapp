package com.trongtin.shopapp.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trongtin.shopapp.models.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResponse {
    @JsonProperty("message")
    private String message;

    @JsonProperty("user")
    private User user;
}
