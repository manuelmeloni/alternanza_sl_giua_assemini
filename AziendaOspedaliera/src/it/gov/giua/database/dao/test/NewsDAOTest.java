package it.gov.giua.database.dao.test;

import java.util.List;

import it.gov.giua.database.dao.NewsDAO;
import it.gov.giua.model.News;

public class NewsDAOTest {

	public static void main(String args[]) {
		NewsDAO dao = new NewsDAO();
		List<News> news = dao.getAllEnableNews();
		
		news.forEach(snews ->{
			System.out.println(snews.toString());
		});
		
	}
}
