package com.enmad.ocr.hysms.repository;

import com.enmad.ocr.hysms.domain.entity.HyMoTran;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

public interface HyMoTranRepository extends JpaRepository<HyMoTran, Integer> {

    List<HyMoTran> findByMsgTypeAndReportDateAndCallback(String msgType, Date reportDate,
        String callback);
}
