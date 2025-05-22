package az.glamoreviewservice.mapper;

import az.glamoreviewservice.dao.entity.ReviewEntity;
import az.glamoreviewservice.model.request.ReviewRequest;
import az.glamoreviewservice.model.response.ReviewResponse;

import java.time.LocalDateTime;

public enum ReviewMapper {
    REVIEW_MAPPER;


    public ReviewEntity buildReviewEntity(ReviewRequest request){
        return ReviewEntity.builder()
                .userId(request.userId())
                .providerId(request.providerId())
                .rating(request.rating())
                .comment(request.comment())
                .createdAt(LocalDateTime.now())
                .build();
    }






    public ReviewResponse buildReviewResponse(ReviewEntity entity){

        return new ReviewResponse(
                entity.getId(),
                entity.getUserId(),
                entity.getProviderId(),
                entity.getRating(),
                entity.getComment(),
                entity.getCreatedAt()
        );
    }
}
