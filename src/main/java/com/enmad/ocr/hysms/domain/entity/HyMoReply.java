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
@Table(name = "hy_mo_reply")
public class HyMoReply {

    @Id
    private String moNumber;

    private String msgType;

    private String id;

    private String callback;

    private String usbject;

    private String content;

    private int fileKey;

    private int urlKey;

    private Date regDate;
}
