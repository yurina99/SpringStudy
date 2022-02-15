package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		log.info("register______________________"+board);
		mapper.insertKeyCertify(board);
	}

	@Override
	public BoardVO get(long bno) {
		log.info("get()____!!");		
		
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("modify__:_"+board);
		return mapper.update(board) ==1;
	}

	@Override
	public boolean remove(long bno) {
		log.info("remove :"+ bno);
		
		return mapper.delete(bno) ==1;
	}

//	@Override
//	public List<BoardVO> getList() {
//		log.info("getList() ___ ");
//		return mapper.getList();
//	}
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("getListcri() ___ "+cri);
		return mapper.getListWithPaging(cri);
	}

}
