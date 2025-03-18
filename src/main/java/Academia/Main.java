package Academia;

import Comparator.CompararAlunosCpf;
import Controle.Gerenciaraluno;
import Controle.Gerenciarfuncionario;
import Controle.Gerenciarproduto;
import Controle.Gerenciaragendamento;
import Controle.Gerenciarsalas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Sistemacentral sistema = new Sistemacentral();
         // Instanciando o objeto Login
        Login login = new Login(sistema.getGestaofuncionario(), sistema.getGestaoadmin());
        //Instanciando para login
        Administrador admin1 = new Administrador("Carlos", 101, 1234);
        sistema.getGestaoadmin().cadastrarAdmin(admin1);
        Funcionario funcionario1 = new Funcionario("Joao",1,10);
        sistema.getGestaofuncionario().cadastrarFuncionario(funcionario1);
        
        // Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);
        //Questão 2:
        // Escolha do tipo de login
        System.out.println("Escolha o tipo de login:");
        System.out.println("1 - Login como Funcionário");
        System.out.println("2 - Login como Administrador");
        System.out.print("Digite a opção: ");
        int tipoLogin = scanner.nextInt();  // Escolha do tipo de login
        
        // Login de Funcionário ou Administrador
        if (tipoLogin == 1) {
            System.out.println("==== Login Funcionário ====");
            System.out.print("Digite o ID do Funcionário: ");
            int idFuncionario = scanner.nextInt();  // ID do funcionário
            System.out.print("Digite a senha do Funcionário: ");
            int senhaFuncionario = scanner.nextInt();  // Senha do funcionário
            
            boolean loginFuncionario = login.realizarLoginFuncionario(idFuncionario, senhaFuncionario);
            if (loginFuncionario) {
                System.out.println("Acesso concedido como Funcionário!");
            } else {
                System.out.println("Acesso negado para Funcionário.");
                scanner.close();  // Fecha o scanner
                System.exit(0);  // Encerra o programa
            }
        } else if (tipoLogin == 2) {
            System.out.println("==== Login Administrador ====");
            System.out.print("Digite o ID do Administrador: ");
            int idAdmin = scanner.nextInt();  // ID do administrador
            System.out.print("Digite a senha do Administrador: ");
            int senhaAdmin = scanner.nextInt();  // Senha do administrador
            
            boolean loginAdmin = login.realizarLoginAdmin(idAdmin, senhaAdmin);
            if (loginAdmin) {
                System.out.println("Acesso concedido como Administrador!");
            } else {
                System.out.println("Acesso negado para Administrador.");
                scanner.close();  // Fecha o scanner
                System.exit(0);  // Encerra o programa
            }
        } else {
            System.out.println("Opção inválida. Digite 1 para Funcionário ou 2 para Administrador.");
            scanner.close();  // Fecha o scanner
            System.exit(0);  // Encerra o programa
        }
        
        // Fechando o scanner após o uso
        scanner.close();
    
        // Criar uma instância de Data
        Data dataVenda = new Data(30, 10, 2024);
        Data dataAgendamento = new Data (30, 10, 2024);
        Data dataVendaplano = new Data (28,10,2024);
        Data datadespesa = new Data(30,10,2024);
       
        Despesa despesa = new Despesa("limpeza", 200.00, datadespesa);
        
        // Inicializa as salas
        Gerenciarsalas.inicializarSalas();
        
        // Manipulando metodos de Aluno
        // Questão 7:
        Aluno aluno1 = new Aluno("luis","rua 2","3333","bernardoivo@gmail.com",23344);
        Aluno aluno2 = new Aluno("bernardo","rua 3","4444","ivo234@gmail.com",43333);
        Aluno aluno3 = new Aluno("Matheus","rua 1","5555","mat123@gmail.com",54321);
        System.out.println("Cadastrando alunos:");
        sistema.getGestaoaluno().cadastrarAluno(aluno1);
        sistema.getGestaoaluno().cadastrarAluno(aluno2);
        sistema.getGestaoaluno().cadastrarAluno(aluno3);
        //Contador de instancia
        //Questão 11
        System.out.println("Contador aluno:");
        //Resposta questão 11.C: O Encapsulamento é mais seguro e controlado, enquanto protected oferece mais flexibilidade, mas com menos controle.
        System.out.println("Número total de alunos criados: " + Sistemacentral.getContadorAlunos());
        System.out.println("Excluindo alunos:");
        sistema.getGestaoaluno().excluirAluno(54321);
        System.out.println("Alterando alunos:");
        sistema.getGestaoaluno().alterarAluno(23344, "Jose");
        System.out.println("Buscando aluno:");
        Aluno alunoEncontrado = sistema.getGestaoaluno().buscarAluno(43333);
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado.getNomeAluno());
        } else {
            System.out.println("Aluno não encontrado.");
        }
       
       //Comparador de Alunos por cpf 
       CompararAlunosCpf comparador = new CompararAlunosCpf();
       
        // Comparando os alunos
        int resultado = comparador.compare(aluno1, aluno2);

        // Exibindo o resultado da comparação
        System.out.println("Resultado da comparação:");
        if (resultado > 0) {
            System.out.println("Aluno1 tem CPF maior que Aluno2");
        } else if (resultado < 0) {
            System.out.println("Aluno1 tem CPF menor que Aluno2");
        } else {
            System.out.println("Aluno1 e Aluno2 têm o mesmo CPF");
        }
        
        //Manipulando metodos de Funcionario
        //Questão 6:
        Funcionario funcionario2 = new Funcionario("Carlos",2,20);
        Funcionario funcionario3 = new Funcionario("Juan",3,30);
        System.out.println("Cadastrando funcionarios:");
        sistema.getGestaofuncionario().cadastrarFuncionario(funcionario2);
        sistema.getGestaofuncionario().cadastrarFuncionario(funcionario3);
        System.out.println("Excluindo funcionarios:");
        sistema.getGestaofuncionario().excluirFuncionario(1);
        System.out.println("Alterando funcionarios:");
        sistema.getGestaofuncionario().alterarFuncionario(2, "Eduardo");
        System.out.println("Buscando funcionário:");
        Funcionario funcionarioBuscado = sistema.getGestaofuncionario().buscarFuncionario(3);
        if (funcionarioBuscado != null) {
            System.out.println("Funcionário encontrado: " + funcionarioBuscado.getNome());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
        
         //Manipulando metodos Admin
        Administrador admin3 = new Administrador("Junior", 103, 9101);
        Administrador admin2 = new Administrador("Mariana", 102, 5678);
        System.out.println("Cadastrando Administradores:");
        sistema.getGestaoadmin().cadastrarAdmin(admin2);
        sistema.getGestaoadmin().cadastrarAdmin(admin3);
        System.out.println("Excluindo Administradores:");
        sistema.getGestaoadmin().excluirAdmin(101);
        System.out.println("Alterando Administradores:");
        sistema.getGestaoadmin().alterarAdmin(102, "Roberto");
        // Busca de um Administrador usando o método de busca binária
        System.out.println("Buscando administrador:");
        Administrador adminBuscado = sistema.getGestaoadmin().buscarAdmin(103);
        if (adminBuscado != null) {
            System.out.println("Administrador encontrado: " + adminBuscado.getNome());
        } else {
            System.out.println("Administrador não encontrado.");
        }
        
        //Manipulando metodos de Produto
        Produto produto1 = new Produto("Whey", "Suplemento", 150.00, 1, 20);
        Produto produto2 = new Produto("Creatina","Suplemento",100.00,2,20);
        Produto produto3 = new Produto("hipercalorico","Suplemento",100.00,3,10);
        System.out.println("Cadastrando produtos:");
        sistema.getGestaoproduto().adicionarProduto(produto1);
        sistema.getGestaoproduto().adicionarProduto(produto2);
        sistema.getGestaoproduto().adicionarProduto(produto3);
        //Contador de instancia
        //Questão 12:
        System.out.println("Contador produto:");
        //Resposta questão 11.C: O Encapsulamento é mais seguro e controlado, enquanto protected oferece mais flexibilidade, mas com menos controle.
        System.out.println("Número total de produtos criados: " + Sistemacentral.getContadorProdutos());
        System.out.println("Excluindo produtos:");
        sistema.getGestaoproduto().excluirProduto(1);
        System.out.println("Alterando produtos:");
        sistema.getGestaoproduto().alterarProduto(2, "BCA", 50.00);
        // Busca de um Produto usando o método de busca binária
        System.out.println("Buscando produto:");
        Produto produtoBuscado = sistema.getGestaoproduto().buscarProduto(3);
        if (produtoBuscado != null) {
            System.out.println("Produto encontrado: " + produtoBuscado.getNomeDoProduto());
        } else {
            System.out.println("Produto não encontrado.");
        }

        
        //Ordenando com o collection
        //Questçao 16:
        sistema.getGestaoaluno().ordenarAlunosPorCpf();
        sistema.getGestaoaluno().ordenarAlunosPorTelefone();
       
        //Catraca
        // Questão 9:
        System.out.println("Catraca");
        Horario horarioEntrada = new Horario(30, 10, 2024, "08:00:00", null);
        sistema.getCatraca().registrarEntrada(43333, horarioEntrada);
        Horario horarioSaida = new Horario(30, 10, 2024, null, "10:00:00");
        sistema.getCatraca().registrarSaida(43333, horarioSaida);
       
       //Venda de produto
       System.out.println("Venda de produtos:");
       sistema.realizarVenda(1, 23344, 3, 10, dataVenda);
       sistema.realizarVenda(2, 23344, 2, 5, dataVenda);
       
       //Venda de plano
       System.out.println("Venda de planos:");
       sistema.realizarVendaPlano(2, 23344, "mensal", 100.00, dataVendaplano);
       
       //Agendamentos
       //Questão 9:
        System.out.println("Agendamentos:");
        sistema.getGestaoagenda().realizarPreAgendamento(23344, 2, 101, 1, dataAgendamento, 100.00, "234534");
        sistema.getGestaoagenda().realizarPreAgendamento(43333, 2, 102, 2, dataAgendamento, 100.00, "45567");
        sistema.getGestaoagenda().confirmarPreAgendamento(23344, 2, 101, 1, dataAgendamento, 100.00, "234534");
        sistema.getGestaoagenda().desmarcarAgendamento(2);
        sistema.getBalanço().adicionarReceitaConfirmarPreAgendamento();
        // Busca de um Agendamento usando o método de busca binária
        System.out.println("Buscando agendamento:");
        Agendamento agendamentoBuscado = sistema.getGestaoagenda().buscarAgendamento(1);
        if (agendamentoBuscado != null) {
            System.out.println("Agendamento encontrado para o aluno: " + agendamentoBuscado.getNomeAluno());
        } else {
            System.out.println("Agendamento não encontrado.");
        }
        
        //Balanço
        System.out.println("Balanço:");
        sistema.getBalanço().adicionarDespesa(despesa);
        sistema.getBalanço().calcularBalancoMensal(10, 2024);
        sistema.getBalanço().imprimirDadosBalancoMensal(10, 2024);
        
       //Imprimir
       //Questão 8:
       System.out.println("Impressão de dados:");
       sistema.imprimirDadosVenda(1);
       sistema.imprimirDadosVenda(2);
       sistema.imprimirDadosVendaPlano(2);
        
        //Iterator
        System.out.println("Iterator:");
        sistema.getGestaoaluno().imprimirAlunos();
        
        //Find
        //Questão 17:
        System.out.println("Find:");
        System.out.println(sistema.getGestaoaluno().find(43333));
        
         // Foreach
         //Questão 15:
         System.out.println("Foreach:");
         //Resposta questão 15: O foreach ele permite iterar sobre a lista de forma mais concisa, Ele não permite remover elementos durante a iteração, mas oferece um estilo de programação funcional mais simples e legível.
         sistema.getGestaoaluno().imprimirAlunosForeach();
         
      
 
        //Gson
        System.out.println("Gson:");
        sistema.getGestaoaluno().salvarAluno();
        sistema.getGestaoproduto().salvarProdutos();
        sistema.getGestaofuncionario().salvarFuncionario();
        sistema.getGestaoagenda().salvarAgendamento();
        sistema.salvarVendas();
        sistema.salvarVendasplano();
        sistema.getCatraca().salvarRegistros();

        
        
      
        
    }
    }    
    

        



