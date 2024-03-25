package vigo.com.viewgorithm.algorithms.repository;

import vigo.com.viewgorithm.algorithms.domain.Algorithm_codes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlgoCodesRepository extends JpaRepository<Algorithm_codes, Long> {
}
