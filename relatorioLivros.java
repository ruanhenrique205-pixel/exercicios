package LIVROS;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class relatorioLivros {

	
	
public List<String> tituloComMaisPaginas(List<dadosLivro> titulos) {
		
		List<String> livros =  titulos.stream()
				.filter(l-> l.getPaginas() > 300)
				.map(l-> l.getTitulo())
				.collect(Collectors.toList());
			
				
				
				return livros;
				
	}

public long livroMenosPaginas(List<dadosLivro> livros) {
	
	long livro = livros.stream()
			.filter(l-> l.getPaginas() < 200)
			.count();
	
	
	return livro;
	
}
public String tituloTopPaginas(List<dadosLivro> titulo){

	Optional<String> titulos = titulo.stream()

			
	
	.max(Comparator.comparing(dadosLivro::getPaginas))
	.map(t-> t.getTitulo());
	
	return titulos.get();
	
}

}
