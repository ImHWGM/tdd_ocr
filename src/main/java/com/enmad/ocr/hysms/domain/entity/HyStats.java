package com.enmad.ocr.hysms.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hy_stats")
public class HyStats {

    @Id
    private String dtStat;

    @Id
    private String id;

    @Id
    private String msgType;

    @Id
    private String tel;

    private int succCnt;

    private int failCnt;

    private int errorCnt;

    private int readCnt;
}
