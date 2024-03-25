package vigo.com.viewgorithm.algorithms.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class Algorithm_Category {
    @Id
    private Long id;

    // 외래키랑 고유키는 일단 쓰지 말자.
    @Column(name = "algorithm_name")
    private String algorithmName;

    @Column(name = "category_name")
    private String categoryName;

}
