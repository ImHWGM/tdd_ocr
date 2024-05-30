package com.enmad.ocr.hysms.service;

import com.enmad.ocr.hysms.domain.entity.HyMoTran;
import com.enmad.ocr.hysms.domain.vo.SearchResult;
import com.enmad.ocr.hysms.converter.HyMoTranConverter;
import org.springframework.stereotype.Service;

@Service
public class HyMoTranService {

    public SearchResult getSearchResult(HyMoTran entity) {
        return HyMoTranConverter.INSTANCE.entityToVo(entity);
    }

    public HyMoTran getHyMoTran(SearchResult vo) {
        return HyMoTranConverter.INSTANCE.voToEntity(vo);
    }
}