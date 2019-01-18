package com.juzss.dao;


import com.juzss.entity.Items;
import org.apache.ibatis.annotations.Select;


public interface ItemsDao {

    /**
     * findById是查找分类的id
     * @param id
     * @return
     */
    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
