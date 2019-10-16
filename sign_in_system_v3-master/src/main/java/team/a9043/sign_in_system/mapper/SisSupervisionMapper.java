package team.a9043.sign_in_system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import team.a9043.sign_in_system.pojo.SisSupervision;
import team.a9043.sign_in_system.pojo.SisSupervisionExample;
import team.a9043.sign_in_system.pojo.SisSupervisionKey;

public interface SisSupervisionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    long countByExample(SisSupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    int deleteByExample(SisSupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    int deleteByPrimaryKey(SisSupervisionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    int insert(SisSupervision record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    int insertSelective(SisSupervision record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    List<SisSupervision> selectByExample(SisSupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    SisSupervision selectByPrimaryKey(SisSupervisionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") SisSupervision record, @Param("example") SisSupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    int updateByExample(@Param("record") SisSupervision record, @Param("example") SisSupervisionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    int updateByPrimaryKeySelective(SisSupervision record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sis_supervision
     *
     * @mbg.generated Mon Aug 27 13:08:41 CST 2018
     */
    int updateByPrimaryKey(SisSupervision record);

    List<Integer> getSsIds();
}