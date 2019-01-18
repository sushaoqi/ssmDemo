package com.juzss.service.impl;

import com.juzss.dao.ItemsDao;
import com.juzss.entity.Items;
import com.juzss.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Shinelon
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }

}
