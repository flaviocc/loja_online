package br.com.casadocodigo.loja.managedbeans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.casadocodigo.loja.daos.BookDAO;
import br.com.casadocodigo.loja.models.Book;

@Model
public class AdminBooksBean {
	
	@Inject
	private BookDAO bookDAO;

	private Book product = new Book();

	public void save() {
		System.out.println(product);
	}

	public Book getProduct() {
		return product;
	}

}
