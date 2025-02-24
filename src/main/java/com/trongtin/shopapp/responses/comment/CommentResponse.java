package com.trongtin.shopapp.responses.comment;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.trongtin.shopapp.models.Comment;
import com.trongtin.shopapp.responses.user.UserResponse;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentResponse {
    @JsonProperty("content")
    private String content;

    //user's information
    @JsonProperty("user")
    private UserResponse userResponse;

    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    public static CommentResponse fromComment(Comment comment) {
        return CommentResponse.builder()
                .content(comment.getContent())
                .userResponse(UserResponse.fromUser(comment.getUser()))
                .updatedAt(comment.getUpdatedAt())
                .build();
    }
}
