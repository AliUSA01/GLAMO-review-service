package az.glamoreviewservice.service.concrete;

import az.glamoreviewservice.dao.repository.ReviewRepository;
import az.glamoreviewservice.exception.NotFoundException;
import az.glamoreviewservice.mapper.ReviewMapper;
import az.glamoreviewservice.model.request.ReviewRequest;
import az.glamoreviewservice.model.response.ReviewResponse;
import az.glamoreviewservice.service.abstraction.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static az.glamoreviewservice.model.enums.ErrorMessage.REVIEW_NOT_FOUND;
import static java.lang.String.format;


@Service
@RequiredArgsConstructor
public class ReviewServiceHandler implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public void createReview(ReviewRequest request) {
        var review = ReviewMapper.REVIEW_MAPPER.buildReviewEntity(request);
        reviewRepository.save(review);
    }

    @Override
    public List<ReviewResponse> getReviewsByProvider(Long providerId) {
        return reviewRepository.findByProviderId(providerId).stream()
                .map(ReviewMapper.REVIEW_MAPPER::buildReviewResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteReview(Long id) {
        var review = reviewRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(format(REVIEW_NOT_FOUND.getMessage()
                        ,id)));
        reviewRepository.delete(review);
    }
}






