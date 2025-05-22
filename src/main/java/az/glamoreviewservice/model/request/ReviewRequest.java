package az.glamoreviewservice.model.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import static az.glamoreviewservice.model.constants.ApplicationConstants.*;


public record ReviewRequest(
        @NotNull(message = USER_ID_IS_REQUIRED) Long userId,
        @NotNull(message = PROVIDER_IS_REQUIRED) Long providerId,
        @Min(1) @Max(5)@NotNull(message = RATING_IS_REQUIRED) Integer rating,
        String comment
) {}
