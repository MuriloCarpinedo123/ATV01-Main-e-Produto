import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Produto> Produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;

    System.out.println("1 - Novo Produto");
    System.out.println("2 - alterar Produto");
    System.out.println("3 - excluir Produto");
    System.out.println("4 - Listar Produtos");
    System.out.println("5 - Sair"); 
    System.out.println("Escolha uma opção");

    opc = scanner.nextInt();
    scanner.nextLine();

    switch (opc) {
        case 1:
            System.out.println("Informe o modelo do produto");
            String modelo = scanner.nextLine();
            System.out.println("Informe a marca do produto");
            String marca = scanner.nextLine();
            System.out.println("Informe a cor do produto");
            String cor = scanner.nextLine();
            System.out.println("Informe o campeonato do produto");
            String campeonato = scanner.nextLine();
            System.out.println("Informe o ano do produto");
            int ano = scanner.nextInt();
            scanner.nextLine();

            Produto novoProduto = new Produto(modelo, marca);
            Produtos.add(novoProduto);
            System.out.println("produto cadastrado");

            break;
        case 2:
            if (Produtos.isEmpty()) {
                System.out.println("nenhum produto foi cadastrado");
                
            }else{
                System.out.println("Produtos cadastrados:");

                for (int i = 0; i < Produtos.size(); i++) {
                    Produto p = Produtos.get(i);
                    System.out.println("Produto:");
                    System.out.println("  Modelo: " + p.getModelo());
                    System.out.println("  Marca: " + p.getMarca());
                 }
                 System.out.println("Coloque o número do produto que você quer editar: ");
                 int numero = scanner.nextInt();
                 scanner.nextLine();

                 if (numero >= 0 && numero < Produtos.size()) {
                    Produto m = Produtos.get(numero);
                    System.out.println("Novo modelo:");
                    m.setModelo(scanner.nextLine());
                    System.out.println("Nova marca:");
                    m.setMarca(scanner.nextLine());
                 }
            }

            break;
        case 3:
    
        default:
        System.out.println("Opção inválida");
            break;
    }
   }
}




    

