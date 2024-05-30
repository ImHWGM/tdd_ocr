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
@Table(name = "hy_fileinfo")
public class HyFileinfo {

    @Id
    private int fileKey;

    private int fileCnt;

    private String file1Path;

    private String file2Path;

    private String file3Path;

    private String file4Path;

    private String file5Path;

    private String status;

    private String resultCode;

    private String gwKey;

    private Date reqDate;

    private Date regDate;

}
