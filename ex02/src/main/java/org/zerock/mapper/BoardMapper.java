package org.zerock.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	//@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	public void insert(BoardVO Board);
	
	public void insertSelectKey(BoardVO board);
	
	public void insertKeyCertify(BoardVO board);	
	
	public BoardVO read(long bno);
	
	public int delete(long bno);
	
	public int update(BoardVO board);
}
