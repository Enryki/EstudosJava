package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.Autor;

public class teste{
	public static void main(String[] args) {
		Autor autor = new Autor();
		LivroFisico livro = new LivroFisico(autor);
		System.out.println(livro.getNome());
		
		Ebook ebook = new Ebook(autor);
		System.out.println(ebook);
	}
}
