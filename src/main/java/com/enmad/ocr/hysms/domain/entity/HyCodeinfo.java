package com.enmad.ocr.hysms.domain.entity;

import jakarta.persistence.Column;
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
@Table(name = "hy_codeinfo")
public class HyCodeinfo {

    @Id
    @Column(length = 4)
    private String code;

    private String convertCode;

    private String description;

    @Column(length = 1)
    private String resultType;
}
