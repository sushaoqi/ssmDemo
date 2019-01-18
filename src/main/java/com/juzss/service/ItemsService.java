package com.juzss.service;

import com.juzss.entity.Items;

public interface ItemsService {

    /**
     * findById是查找分类的id
     * @param id
     * @return
     */
    public Items findById(Integer id);
}
