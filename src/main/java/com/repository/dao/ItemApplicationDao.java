package com.repository.dao;

import com.repository.entity.ItemApplicationEntity;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Repository
public class ItemApplicationDao extends AbstractDao<ItemApplicationEntity> {

}
