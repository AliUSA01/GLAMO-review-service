package az.glamoreviewservice.controller;

import az.glamoreviewservice.model.request.ReviewRequest;
import az.glamoreviewservice.model.response.ReviewResponse;
import az.glamoreviewservice.service.abstraction.ReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createReview(@RequestBody @Valid ReviewRequest request) {
        reviewService.createReview(request);
    }

    @GetMapping("/provider/{providerId}")
    public List<ReviewResponse> getReviewsByProvider(@PathVariable Long providerId) {
        return reviewService.getReviewsByProvider(providerId);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }
}
