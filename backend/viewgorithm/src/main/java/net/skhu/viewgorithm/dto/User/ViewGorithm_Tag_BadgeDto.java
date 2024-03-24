package net.skhu.viewgorithm.dto;
import lombok.*;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ViewGorithm_Tag_BadgeDto {
    private int viewgorith_tag_badge_pk;
    private int viewgorithm_pk;
    private int viewgorithm_category_pk;
    private String name;
}
