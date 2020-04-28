package org.zerock.mapper;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private int[] bnoArr = {130, 131,132,133,134};

	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	/*
	 * @Test public void testMapper() { log.info(mapper); }
	 */
	
	
	/*
	 * @Test public void testCreate() { IntStream.rangeClosed(1, 10).forEach(i -> {
	 * ReplyVO vo = new ReplyVO();
	 * 
	 * vo.setBno(bnoArr[i % 5]); vo.setReply("댓글테스트"+i); vo.setReplyer("replyer"+i);
	 * mapper.insert(vo);
	 * 
	 * }); }
	 */
	
	
	
	/*
	 * @Test public void testRead() { int targetRno = 5; ReplyVO vo =
	 * mapper.read(targetRno); log.info(vo); }
	 */
	
	
	/*
	 * @Test public void testDelete() { int targetRno = 7; mapper.delete(targetRno);
	 * 
	 * }
	 */
	
	
	/*
	 * @Test public void testUpdate() { int targetRno = 7; ReplyVO vo =
	 * mapper.read(targetRno); vo.setReply(" 수정됐슈 "); int count = mapper.update(vo);
	 * log.info("update count"+ count); }
	 */
	
	
	@Test
	public void testList() {
		
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 131);
		replies.forEach(reply -> log.info(reply));
	}
	
	
}
