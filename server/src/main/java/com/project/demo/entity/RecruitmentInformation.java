package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 招领信息：(RecruitmentInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RecruitmentInformation")
public class RecruitmentInformation implements Serializable {

    // RecruitmentInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recruitment_information_id")
    private Integer recruitment_information_id;

    // 发布用户
    @Basic
    private Integer publish_users;
    // 联系电话
    @Basic
    private String contact_number;
    // 招领物品
    @Basic
    private String collect_items;
    // 物品类别
    @Basic
    private String item_category;
    // 图片
    @Basic
    private String picture;
    // 拾物地点
    @Basic
    private String pickup_location;
    // 拾物时间
    @Basic
    private String pick_up_time;
    // 拾物数量
    @Basic
    private Integer pick_up_quantity;
    // 物品简介
    @Basic
    private String item_introduction;
    // 详情
    @Basic
    private String details;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
