package com.enmad.ocr.ocrs.domain.entity;

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
@Table(name = "ocr_event")
@NoArgsConstructor
@AllArgsConstructor
public class OcrEvent {

    @Id
    private long eventId;

    private String eventName;

    private String callback;

    private Date eventStart;

    private Date eventEnd;
}
