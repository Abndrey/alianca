import java.util.Scanner;

    public class ProjetoAlianca {
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Cliente cliente = new Cliente();
            System.out.println("Digite o seu nome:");
            cliente.nome = sc.nextLine();

            System.out.println("Digite seu email:");
            cliente.email = sc.nextLine();

            System.out.println("Digite seu telefone:");
            cliente.telefone = sc.nextLine();


            Ourives ourives = new Ourives();

            System.out.println("Digite o seu nome:");
            ourives.nome = sc.nextLine();

            System.out.println("Digite seu email:");
            ourives.email = sc.nextLine();

            System.out.println("Coloque sua especialidade:");
            ourives.especialidade = sc.nextLine();

            System.out.println("Coloque sua diponibilidade:");
            ourives.disponibilidade = sc.nextLine();


            Modelo modelo = new Modelo();


            Personalizacao personalizacao = new Personalizacao();


            ProjetoAlianca projetoAlianca = new ProjetoAlianca();

        }
    }