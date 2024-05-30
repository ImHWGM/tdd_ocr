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
@Table(name = "hy_kakaoinfo")
public class HyKakaoinfo {

    @Id
    private int kakaoKey;

    private String kakaoType;

    private String kakaoData;

    private String subject;

    private String content;

    private String status;

    private String resultCode;

    private String gwKey;

    private Date reqDate;

    private Date regDate;
}
