package az.glamoreviewservice.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorMessage {

    REVIEW_NOT_FOUND("Review not found with id: %s");


    private final String message;




}
