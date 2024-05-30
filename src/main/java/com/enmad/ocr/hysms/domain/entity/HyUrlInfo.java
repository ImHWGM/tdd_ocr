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
@Table(name = "hy_urlinfo")
public class HyUrlInfo {

    @Id
    private int urlKey;

    private String urlType;

    private String urlData;

    private String urlJsonFile;

    private String status;

    private String resultCode;

    private String gwKey;

    private Date reqDate;

    private Date regDate;


}
