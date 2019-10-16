package team.a9043.sign_in_system.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import team.a9043.sign_in_system.convertor.Byte2ImgSerializer;

@Data
public class SisSignInDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sis_sign_in_detail.ssid_id
     *
     * @mbg.generated Tue Nov 06 20:55:06 CST 2018
     */
    private Integer ssidId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sis_sign_in_detail.ssid_status
     *
     * @mbg.generated Tue Nov 06 20:55:06 CST 2018
     */
    private Boolean ssidStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sis_sign_in_detail.ssi_id
     *
     * @mbg.generated Tue Nov 06 20:55:06 CST 2018
     */
    private Integer ssiId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sis_sign_in_detail.su_id
     *
     * @mbg.generated Tue Nov 06 20:55:06 CST 2018
     */
    private String suId;

    @JsonSerialize(using = Byte2ImgSerializer.class)
    private byte[] ssidPicture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SisUser sisUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SisSignIn sisSignIn;


}