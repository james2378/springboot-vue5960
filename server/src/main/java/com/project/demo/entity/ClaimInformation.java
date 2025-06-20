package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 认领信息：(ClaimInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ClaimInformation")
public class ClaimInformation implements Serializable {

    // ClaimInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claim_information_id")
    private Integer claim_information_id;

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
    // 认领用户
    @Basic
    private Integer claiming_users;
    // 认领人姓名
    @Basic
    private String claimants_name;
    // 认领凭证
    @Basic
    private String claim_voucher;
    // 认领说明
    @Basic
    private String claim_instructions;



    // 审核状态
    @Basic
    private String examine_state;








    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
