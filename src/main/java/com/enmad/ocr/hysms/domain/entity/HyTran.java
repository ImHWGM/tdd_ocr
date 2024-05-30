package com.enmad.ocr.hysms.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hy_tran")
public class HyTran {

    @Id
    private int kakaoKey;

    private String phone;

    private String callback;

    private String authData;

    private String kakaoButton;

    private String status;

    private Date reqDate;

    private Date sendDate;

    private Date resultDate;

    private Date reportDate;

    private Date pushReadDate;

    private Date readDate;

    private String tel;

    private String etc1;

    private String etc2;

    private String etc3;

    private String etc4;
}
