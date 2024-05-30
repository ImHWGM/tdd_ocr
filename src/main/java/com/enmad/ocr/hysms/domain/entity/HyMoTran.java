package com.enmad.ocr.hysms.domain.entity;

import jakarta.persistence.Column;
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
@Table(name = "hy_mo_tran")
public class HyMoTran {

    @Id
    @Column(name = "MO_KEY")
    private int moKey;

    @Column(name = "MSG_TYPE")
    private String msgType;

    @Column(name = "ID")
    private String id;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "CALLBACK")
    private String callback;

    @Column(name = "SUBJECT")
    private String subject;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "RESULT_DATE")
    private Date resultDate;

    @Column(name = "REPORT_DATE")
    private Date reportDate;

    @Column(name = "TEL")
    private String tel;

    @Column(name = "FILE_CNT")
    private int fileCnt;

    @Column(name = "FILE1_PATH")
    private String file1Path;

    @Column(name = "FILE2_PATH")
    private String file2Path;

    @Column(name = "FILE3_PATH")
    private String file3Path;

    @Column(name = "FILE4_PATH")
    private String file4Path;

    @Column(name = "FILE5_PATH")
    private String file5Path;

    @Column(name = "FILE6_PATH")
    private String file6Path;

    @Column(name = "FILE7_PATH")
    private String file7Path;

    @Column(name = "FILE8_PATH")
    private String file8Path;

    @Column(name = "FILE9_PATH")
    private String file9Path;

    @Column(name = "FILE10_PATH")
    private String file10Path;

    @Column(columnDefinition = "CHAR")
    private String isReply;

    @Column(name = "ETC1")
    private String etc1;

    @Column(name = "ETC2")
    private String etc2;

    @Column(name = "ETC3")
    private String etc3;

    @Column(name = "ETC4")
    private String etc4;

}
