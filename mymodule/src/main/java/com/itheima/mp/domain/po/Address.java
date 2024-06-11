package com.itheima.mp.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 27fx
 * @since 2024-05-15
 */
@TableName("address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县/区
     */
    private String town;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 详细地址
     */
    private String street;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 是否是默认 1默认 0否
     */
    private Boolean isDefault;

    /**
     * 备注
     */
    private String notes;

    /**
     * 逻辑删除
     */
    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Address{" +
            "id=" + id +
            ", userId=" + userId +
            ", province=" + province +
            ", city=" + city +
            ", town=" + town +
            ", mobile=" + mobile +
            ", street=" + street +
            ", contact=" + contact +
            ", isDefault=" + isDefault +
            ", notes=" + notes +
            ", deleted=" + deleted +
        "}";
    }
}
