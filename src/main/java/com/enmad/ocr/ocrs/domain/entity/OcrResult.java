package com.enmad.ocr.ocrs.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@Table(name = "ocr_result")
@NoArgsConstructor
@AllArgsConstructor
public class OcrResult {

    @Id
    @Column(name = "OCR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ocrId;

    private long eventId;

    @Column(name = "MO_KEY")
    private int moKey;

    private String callback;
    
    @Column(name = "OCR_TYPE")
    @Enumerated(EnumType.STRING)
    private EOcr ocrType;

    @Column(name = "RECOGNIZED_TEXT", length = 10000)
    private String recognizedText;

}