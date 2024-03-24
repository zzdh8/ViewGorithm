package net.skhu.viewgorithm.dto.User;
import lombok.*;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Suggestion_Article_CommentDto {
    private int suggestion_article_comment_pk;
    private int suggestion_article_pk;
    private int user_pk;
    private String content;
    private Date created_at;
}
