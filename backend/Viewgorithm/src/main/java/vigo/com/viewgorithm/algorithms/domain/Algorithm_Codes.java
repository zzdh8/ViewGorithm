package vigo.com.viewgorithm.algorithms.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class Algorithm_codes {
    @Id
    private Long id;

    // 외래키랑 고유키는 일단 쓰지 말자.
    @Column(name = "c_code", columnDefinition = "TEXT")
    private String c_code;

    @Column(name = "c_sharp_code", columnDefinition = "TEXT")
    private String c_sharp_code;

    @Column(name = "python_code", columnDefinition = "TEXT")
    private String python_code;

    @Column(name = "java_code", columnDefinition = "TEXT")
    private String java_code;


    // 1:1 관계 표시
    // 알고리즘 이름으로 조인하는거다.
    @OneToOne
    @JoinColumn(name = "algorithm_name")
    private Algorithm_Category codes;
}
