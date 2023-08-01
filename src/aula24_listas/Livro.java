
package aula24_listas;

/**
 *
 * @author alanelima
 */
public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private String genero;

    //CONSTRUTORES
    
    //construtor vazio
    public Livro() {}

    //construtor com atributos
    public Livro(String nome, String autor, String genero) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //getters
    
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "O livro " + nome + ", de " + autor + " tem gênero " + genero;
    }
}
