package com.enmad.ocr.hysms.converter;

import com.enmad.ocr.hysms.domain.entity.HyMoTran;
import com.enmad.ocr.hysms.domain.vo.FilePath;
import com.enmad.ocr.hysms.domain.vo.SearchResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface HyMoTranConverter {

    HyMoTranConverter INSTANCE = Mappers.getMapper(HyMoTranConverter.class);

    @Mapping(source = "moKey", target = "moKey")
    @Mapping(source = "subject", target = "subject")
    @Mapping(target = "filePaths", expression = "java(mapFilePaths(entity))")
    SearchResult entityToVo(HyMoTran entity);

    @Mapping(source = "moKey", target = "moKey")
    @Mapping(source = "subject", target = "subject")
    @Mapping(target = "file1Path", expression = "java(getFilePath(vo, 0))")
    @Mapping(target = "file2Path", expression = "java(getFilePath(vo, 1))")
    @Mapping(target = "file3Path", expression = "java(getFilePath(vo, 2))")
    @Mapping(target = "file4Path", expression = "java(getFilePath(vo, 3))")
    @Mapping(target = "file5Path", expression = "java(getFilePath(vo, 4))")
    @Mapping(target = "file6Path", expression = "java(getFilePath(vo, 5))")
    @Mapping(target = "file7Path", expression = "java(getFilePath(vo, 6))")
    @Mapping(target = "file8Path", expression = "java(getFilePath(vo, 7))")
    @Mapping(target = "file9Path", expression = "java(getFilePath(vo, 8))")
    @Mapping(target = "file10Path", expression = "java(getFilePath(vo, 9))")
    HyMoTran voToEntity(SearchResult vo);

    default List<FilePath> mapFilePaths(HyMoTran entity) {
        List<FilePath> filePaths = new ArrayList<>();
        for (int i = 1; i <= entity.getFileCnt(); i++) {
            String filePath = getFilePathByFileCnt(entity, i);
            if (filePath != null) {
                filePaths.add(new FilePath(filePath));
            }
        }
        return filePaths;
    }

    default String getFilePath(SearchResult vo, int fileCnt) {
        if (vo.filePaths().size() > fileCnt) {
            return vo.filePaths().get(fileCnt).filePath();
        }
        return null;
    }

    default String getFilePathByFileCnt(HyMoTran entity, int fileCnt) {
        return switch (fileCnt) {
            case 1 -> entity.getFile1Path();
            case 2 -> entity.getFile2Path();
            case 3 -> entity.getFile3Path();
            case 4 -> entity.getFile4Path();
            case 5 -> entity.getFile5Path();
            case 6 -> entity.getFile6Path();
            case 7 -> entity.getFile7Path();
            case 8 -> entity.getFile8Path();
            case 9 -> entity.getFile9Path();
            case 10 -> entity.getFile10Path();
            default -> null;
        };
    }
}