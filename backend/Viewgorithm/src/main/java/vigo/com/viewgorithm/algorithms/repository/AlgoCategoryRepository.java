package vigo.com.viewgorithm.algorithms.repository;

import vigo.com.viewgorithm.algorithms.domain.Algorithm_Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 첫번째는 객체, 기본키 타입
@Repository
public interface AlgoCategoryRepository extends JpaRepository<Algorithm_Category, Long> {

}
