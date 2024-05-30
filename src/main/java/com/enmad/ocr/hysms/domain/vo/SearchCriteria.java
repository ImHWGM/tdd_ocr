package com.enmad.ocr.hysms.domain.vo;

import java.util.Date;

// 이벤트 문자 검색 조건 설정 관련 VO
public record SearchCriteria(String msgType, Date reportDate, String callback, String keyword) {

}