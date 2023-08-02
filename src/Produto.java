import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {

    int id;
    String nome;
    double peso;
    double precoPorKilo;
    Date dataDeCadastro;
    double precoTotal; //precoPorKilo * peso


    //CONSTRUTOR VAZIO
    // para criar um produto sem informar seus dados no momento de criação
    public Produto(){}
    

    //CONSTRUTOR COM ATRIBUTOS
    // para criar um produto já informando os atributos abaixo no momento da criação
    public Produto(int id, String nome, double peso, double precoPorKilo, Date dataDeCadastro) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.precoPorKilo = precoPorKilo;
        this.dataDeCadastro = dataDeCadastro;
    }


    //setters

    public void setId(int id) {
        this.id = id;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public void setPrecoPorKilo(double precoPorKilo) {
        this.precoPorKilo = precoPorKilo;
    }


    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }


    //getters


    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public double getPeso() {
        return peso;
    }


    public double getPrecoPorKilo() {
        return precoPorKilo;
    }


    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    //método para exibir objeto como string de seus dados 
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Produto [id=" + id + ", nome=" + nome + ", peso=" + peso + ", precoPorKilo=" + precoPorKilo
                + ", dataDeCadastro=" + sdf.format(dataDeCadastro) + ", preço total = " + precoTotal + "]";
    }

    //calcular preço total do produto a partir de seu preço por kilo e seu peso
    public void calcularPrecoTotal(){
        precoTotal = peso*precoPorKilo;
    }  

}

