package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 物品类别：(ItemCategory)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ItemCategory")
public class ItemCategory implements Serializable {

    // ItemCategory编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_category_id")
    private Integer item_category_id;

    // 物品类别
    @Basic
    private String item_category;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
