package vigo.com.viewgorithm.algorithms.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Algorithm_CodesDto {

    private String c_code;
    private String c_sharp_code;
    private String python_code;
    private String java_code;

}
