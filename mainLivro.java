package LIVROS;

import java.util.List;

public class mainLivro {

	public static void main(String[] args) {
	
		List<dadosLivro> livro = List.of(
				new dadosLivro( "harry potter ","sheaksper" , 350),
				new dadosLivro("mario","murilo Huff",120),
				new dadosLivro("monica", "cesar Tralle" , 90),
				new dadosLivro("batman", "mauricio de solza", 400)
				);
		
		
		relatorioLivros livros = new relatorioLivros();
		
		List<String> resultado = livros.tituloComMaisPaginas(livro);
		
		long menosPaginas = livros.livroMenosPaginas(livro);
		
		String maisPagina = livros.tituloTopPaginas(livro);
		
		System.out.println("o livro que tem mais paginas e : " + maisPagina);
		
		System.out.println("o livro com menores quantidade de paginas sao : " + menosPaginas);
		
		System.out.println("livro com mais pagina e : " + resultado);
	}

	
	
	
	$ git rm --cached LIVROS
	error: the following file has staged content different from both the
	file and the HEAD:
	    LIVROS
	(use -f to force removal)

	Ruanh@DESKTOP-GH0T5MS MINGW64 /c/Eclipse/alees/src (master)
	$ git -C LIVROS log --oneline
	8bbe300 (HEAD -> master) projeto biblioteca


}
