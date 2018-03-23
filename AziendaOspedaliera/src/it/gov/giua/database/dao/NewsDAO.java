package it.gov.giua.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import it.gov.giua.model.News;

public class NewsDAO extends BaseDAO {

	public NewsDAO() {
		super();

	}

	public List<News> getAllNews(String query) {
		logger.info("Recupero tutte le news");
		logger.info("Recupero tutte le news");
		List<News> news = new ArrayList<News>();

		try {
			ResultSet rs = getDbm().performQuery(query);
			while (rs.next()) {
				String titolo = rs.getString("titolo");
				String sottotitolo = rs.getString("sottotitolo");
				String testo = rs.getString("testo");
				String tipo = rs.getString("tipo");
				boolean abilitato = rs.getBoolean("abilitato");

				News current = new News(titolo, sottotitolo, testo, abilitato, tipo);
				news.add(current);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			news = new ArrayList<News>();
		}

		return news;
	}

	public List<News> getAllEnableNews() {
		return getAllNews("select * from news where abilitato = 1");
	}
}
