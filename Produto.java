public class Produto { //atribuindo os parametros para o produto BOLA
    public String Modelo;
    public String Marca;
    public int Ano;
    public String Campeonato;
    public String Cor;
}
//criação de metodos construtores para atribuir o valor padrão de cada atributo
public Produto(String Cor){ 
    this.Cor = "laranja";
}
public Produto(String campeonato, int ano){
    this.Ano = 2000;
    this.Campeonato = "copa padrao";
}
public Produto( String Modelo, String Marca ){
    this.Modelo = "modelo base";
    this.Marca = "XXX";
}
//settando os getters para serem chamados na função MAIN
public String getCamp(){
    return Campeonato;
}
public int getAno(){
    return Ano;
}
public String getCor(){
    return Cor;
}
public String getModelo(){
    return Modelo;
}
public String getMarca(){
    return Marca;
}