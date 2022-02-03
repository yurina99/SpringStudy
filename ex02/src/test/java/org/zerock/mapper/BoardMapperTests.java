package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board->log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		
		board.setTitle("sts new 1");
		board.setContent("sts content1");
		board.setWriter("sts1");
		
		mapper.insert(board);
		log.info(board);
	}
	
	@Test
	public void testInsertKeySelect() {
		BoardVO board = new BoardVO();
		
		board.setTitle("sts new key");
		board.setContent("sts content key");
		board.setWriter("sts1");
		
		mapper.insertSelectKey(board);
		log.info(board);
	}

	
	@Test
	public void testInsertcertify() {
		
		BoardVO board = new BoardVO();
		
		board.setTitle("sts new key certify");
		board.setContent("sts content key certify");
		board.setWriter("certify");
		
		mapper.insertKeyCertify(board);
		log.info(board);
	}
	
	@Test
	public void testRead() {
		BoardVO board = mapper.read(5L);
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		log.info("del count:" + mapper.delete(3L));
	}
	
	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		
		board.setBno(5L);
		board.setTitle("update Tiele");
		board.setContent("Update contents");
		board.setWriter("update writer");
		
		int count = mapper.update(board);
		log.info("update count:"+ count);
		
	}
	
	
}
