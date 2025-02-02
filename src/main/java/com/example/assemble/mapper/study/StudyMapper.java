package com.example.assemble.mapper.study;

import com.example.assemble.domain.study.StudyDTO;
import com.example.assemble.domain.study.StudyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudyMapper {
    // 스터디 총 갯수
    public Integer countAll(StudyDTO studyDTO);
    
    // 스터디 전체 목록
    public List<StudyVO> selectAll(StudyDTO studyDTO);

    // 스터디 상세보기
    public StudyVO select(Long studyId);

    // 스터디 추가
    public void insert(StudyVO studyVO);

    // 스터디 수정
    public void update(StudyVO studyVO);

    // 스터디 공지사항 수정
    public void updateNotice(StudyVO studyVO);

    // 스터디장 변경
    public void updateLeader(StudyVO studyVO);

    // 스터디 삭제
    public void delete(Long studyId);

    // 스터디 검색
    public List<StudyVO> search(StudyVO studyVO);
}
