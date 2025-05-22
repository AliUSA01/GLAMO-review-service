package az.glamoreviewservice.dao.repository;

import az.glamoreviewservice.dao.entity.ReviewEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<ReviewEntity, Long> {
    List<ReviewEntity> findByProviderId(Long providerId);


}
