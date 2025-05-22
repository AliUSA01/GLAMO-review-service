package az.glamoreviewservice.service.abstraction;

import az.glamoreviewservice.model.request.ReviewRequest;
import az.glamoreviewservice.model.response.ReviewResponse;

import java.util.List;

public interface ReviewService {
    void createReview(ReviewRequest request);
    List<ReviewResponse> getReviewsByProvider(Long providerId);
    void deleteReview(Long id);
}
