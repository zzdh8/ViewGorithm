package net.skhu.viewgorithm.dto;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ViewGorithmDto {
    private int viewgorithm_pk;
    private int viewgorithm_Category_pk;
    private String c_code;
    private String c_sharp_code;
    private String python_code;
    private String java_code;
}
