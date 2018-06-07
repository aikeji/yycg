package yycg.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.po.Bss_sys_area;
import yycg.base.pojo.po.Bss_sys_areaExample;

public interface Bss_sys_areaMapper {
    long countByExample(Bss_sys_areaExample example);

    int deleteByExample(Bss_sys_areaExample example);

    int deleteByPrimaryKey(String areaid);

    int insert(Bss_sys_area record);

    int insertSelective(Bss_sys_area record);

    List<Bss_sys_area> selectByExample(Bss_sys_areaExample example);

    Bss_sys_area selectByPrimaryKey(String areaid);

    int updateByExampleSelective(@Param("record") Bss_sys_area record, @Param("example") Bss_sys_areaExample example);

    int updateByExample(@Param("record") Bss_sys_area record, @Param("example") Bss_sys_areaExample example);

    int updateByPrimaryKeySelective(Bss_sys_area record);

    int updateByPrimaryKey(Bss_sys_area record);
}