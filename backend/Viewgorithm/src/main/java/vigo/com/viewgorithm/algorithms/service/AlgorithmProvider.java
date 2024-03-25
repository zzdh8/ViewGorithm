package vigo.com.viewgorithm.algorithms.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vigo.com.viewgorithm.algorithms.repository.AlgoCategoryRepository;
import vigo.com.viewgorithm.algorithms.repository.AlgoCodesRepository;
@Service
@RequiredArgsConstructor
public class AlgorithmProvider {
    private AlgoCategoryRepository categoryRepository;
    private AlgoCodesRepository codesRepository;

    // 여기서 모든 작업들을 수행한다.


    

}
