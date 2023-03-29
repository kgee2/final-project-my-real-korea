package com.itwill.my_real_korea.service.notice;

import java.util.List;
import java.util.Map;

import com.itwill.my_real_korea.dto.notice.Notice;
import com.itwill.my_real_korea.dto.notice.NoticeListPageMakerDto;

public interface NoticeService {
	/*
	 * 공지사항 게시글 추가
	 */
	int insertNotice(Notice notice) throws Exception;
	/*
	 * 공지사항 게시글 번호(boardno)로 해당 게시글 보기 
	 */
	Notice selectByNo(int nNo) throws Exception;
	/*
	 * 공지사항 리스트 보기 (게시글 시작번호, 게시글 끝번호) - 페이징 처리
	 */
	List<Notice> selectAll(int pageStart, int pageEnd) throws Exception;
	/*
	 * 최신순 정렬 : 공지사항 리스트 보기 (게시글 시작번호, 게시글 끝번호) - 페이징 처리
	 */
	List<Notice> selectAllOrderByDateDesc(int pageStart, int pageEnd) throws Exception;
	/*
	 * 오래된순 정렬 : 공지사항 리스트 보기 (게시글 시작번호, 게시글 끝번호) - 페이징 처리
	 */
	List<Notice> selectAllOrderByDateAsc(int pageStart, int pageEnd) throws Exception;
	/*
	 * 조회수 높은순 정렬 : 공지사항 리스트 보기 (게시글 시작번호, 게시글 끝번호) - 페이징 처리
	 */
	List<Notice> selectAllOrderByReadcount(int pageStart, int pageEnd) throws Exception;
	
	// 공지사항 리스트 (페이지메이커 사용)
	
	NoticeListPageMakerDto selectAll(int currentPage) throws Exception;
	
	NoticeListPageMakerDto selectAllOrderByDateDesc(int currentPage) throws Exception;
	
	NoticeListPageMakerDto selectAllOrderByDateAsc(int currentPage) throws Exception;
	
	NoticeListPageMakerDto selectAllOrderByReadcount(int currentPage) throws Exception;
	
	/*
	 * 게시글 title 출력 설정
	 */
	String getTitleString(Notice notice) throws Exception;
	
	/*
	 * 공지사항 게시글 삭제
	 */
	int deleteNotice(int nNo) throws Exception;
	/*
	 * 공지사항 게시글 내용 수정
	 */
	int updateNotice(Notice notice) throws Exception;
	/*
	 * 공지사항 게시글 조회수 1 증가
	 */
	int increaseReadCount(int nNo) throws Exception;
	/*
	 * 공지사항 게시글 총 개수 조회
	 */
	int selectNoticeCount() throws Exception;
	
	/*
	 * 검색된 게시글 총 개수 조회
	 */
	int selectSearchCount(String keyword) throws Exception;
	
	/*
	 * 공지사항 게시판 title 키워드로 검색
	 */
	List<Notice> selectSearchNoticeList(int pageStart, int pageEnd, String keyword) throws Exception;

	NoticeListPageMakerDto selectSearchNoticeList(int currentPage, String keyword) throws Exception;
	
}
