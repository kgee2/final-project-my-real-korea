package com.itwill.my_real_korea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.my_real_korea.dao.NoticeDao;
import com.itwill.my_real_korea.dto.Notice;
import com.itwill.my_real_korea.dto.NoticeListPageMakerDto;
import com.itwill.my_real_korea.util.PageMaker;
@Service
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeDao noticeDao;
	
	public NoticeServiceImpl() {
		System.out.println(">>> NoticeServiceImpl : 기본 생성자 호출");
	}
	public NoticeDao getNoticeDao() {
		return noticeDao;
	}
	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
	
	@Override
	public int insertNotice(Notice notice) throws Exception {
		return noticeDao.insertNotice(notice);
	}

	@Override
	public Notice selectByNo(int n_no) throws Exception {
		return noticeDao.selectByNo(n_no);
	}

	
	/*
	 * 게시글 리스트 보기
	*/
	public NoticeListPageMakerDto selectAll(int currentPage) throws Exception{
		// 전체 글의 수
		int totalRecordCount = noticeDao.selectNoticeCount();
		// paging 계산 (PageMaker)
		PageMaker pageMaker = new PageMaker(totalRecordCount, currentPage);
		// 게시글 데이터 얻기
		List<Notice> noticeList = noticeDao.selectAll(pageMaker.getPageBegin(), pageMaker.getPageEnd());
		NoticeListPageMakerDto pageMakerBoardList = new NoticeListPageMakerDto();
		pageMakerBoardList.itemList = noticeList;
		pageMakerBoardList.pageMaker = pageMaker;
		return pageMakerBoardList;
	}
	
	 
	/*
	 * 키워드로 검색된 게시글 리스트 보기
	 */
	public NoticeListPageMakerDto selectSearchNoticeList(int currentPage, String keyword) throws Exception{
		// 전체 글의 수
		int totalRecordCount = noticeDao.selectSearchCount(keyword);
		// paging 계산 (PageMaker)
		PageMaker pageMaker = new PageMaker(totalRecordCount, currentPage);
		// 게시글 데이터 얻기
		List<Notice> noticeList = noticeDao.selectSearchNoticeList(pageMaker.getPageBegin(), pageMaker.getPageEnd(),keyword);
		NoticeListPageMakerDto pageMakerBoardList = new NoticeListPageMakerDto();
		pageMakerBoardList.itemList = noticeList;
		pageMakerBoardList.pageMaker = pageMaker;
		return pageMakerBoardList;
	}
	
	/*
	 * 게시글 title 출력 설정
	 */
	public String getTitleString(Notice notice) {
		StringBuilder title = new StringBuilder(128);
		String t = notice.getN_title();
		if (t.length() > 15) {
			t = String.format("%s...", t.substring(0, 15));
		}
	
		title.append(t.replace(" ", "&nbsp;"));
		return title.toString();
	}
	
	
	@Override
	public List<Notice> selectAll(int pageStart, int pageEnd) throws Exception {
		return noticeDao.selectAll(pageStart, pageEnd);
	}

	@Override
	public int deleteNotice(int n_no) throws Exception {
		return noticeDao.deleteNotice(n_no);
	}

	@Override
	public int updateNotice(Notice notice) throws Exception {
		return noticeDao.updateNotice(notice);
	}

	@Override
	public int increaseReadCount(int n_no) throws Exception {
		return noticeDao.increaseReadCount(n_no);
	}

	@Override
	public int selectNoticeCount() throws Exception {
		return noticeDao.selectNoticeCount();
	}

	@Override
	public int selectSearchCount(String keyword) throws Exception {
		return noticeDao.selectSearchCount(keyword);
	}
	@Override
	public List<Notice> selectSearchNoticeList(int pageStart, int pageEnd, String keyword) throws Exception {
		return noticeDao.selectSearchNoticeList(pageStart, pageEnd, keyword);
	}



}
