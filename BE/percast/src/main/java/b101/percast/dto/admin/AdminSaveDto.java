package b101.percast.dto.admin;

import b101.percast.entity.Admin;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link b101.percast.entity.Admin} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminSaveDto implements Serializable {
@ApiModel(value = "어드민 정보", description = "비밀번호, 암호화된 비밀번호를 담고 있는 dto")
public class AdminSaveDto{
    private Long id;

    @ApiModelProperty(value = "비밀번호")
    private String password;
    private String encryptedPassword;

    @ApiModelProperty(value = "암호화된 비밀번호")
    private String encryptedPassword;

    public Admin toEntity() {
        return Admin.builder()
                .id(id)
                .password(password)
                .encryptedPassword(encryptedPassword)
                .build();
    }
}