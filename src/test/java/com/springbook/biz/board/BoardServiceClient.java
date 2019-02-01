package com.springbook.biz.board;
import java.util.List;

import com.springbook.biz.board.impl.BoardDAO;

public class BoardServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList();
		

		for(BoardVO item : boardList)
			System.out.println(item.toString());
		//container.close();
	}

}
