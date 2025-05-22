package az.glamoreviewservice.model.response;


import java.time.LocalDateTime;

public record ReviewResponse(
        Long id,
        Long userId,
        Long providerId,
        Integer rating,
        String comment,
        LocalDateTime createdAt
) {}