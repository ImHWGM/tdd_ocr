package com.enmad.ocr.hysms.domain.vo;

import java.util.List;

// MMS 이벤트 조건검색 결과 VO
public record SearchResult(int moKey, List<FilePath> filePaths, String subject) {

}