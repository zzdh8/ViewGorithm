package net.skhu.viewgorithm.dto;
import lombok.*;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Viewgorithm_CommentDto {
    private int viewgorithm_comment_pk;
    private int viewgorithm_pk;
    private int user_pk;
    private int viewgorithm_category_pk;
    private String content;
    private Date created_at;
}
