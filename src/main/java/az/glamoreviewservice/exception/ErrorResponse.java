package az.glamoreviewservice.exception;

import lombok.Builder;

@Builder
public record ErrorResponse(String message) {
}
