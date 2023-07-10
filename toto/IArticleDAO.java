package toto;

public interface IArticleDAO {
	public void ajoutArticle(Article unArticle);
	public void suppArticle(int id);
	public void modifArticle(Article unArticle);
	public void getArticle(int id);
	public void getAllArticles();
}
