import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        String chassi[] = new String[5];
        String nome[] = new String[5];
        String cor[] = new String[5];
        int motor[] = new int[5];
        int totalCarros = 0;
        int op;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 -  Inserir Carro");
            System.out.println("2 - Consultar por Chassi");
            System.out.println("3 - Remover Carro");
            System.out.println("4 - Alterar");
            System.out.println("5 -  Listar");
            System.out.println("6 - Sair");
            System.out.print("Digite uma opção: ");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    // O "chassi.length" é o menor valor do chassi
                    if (totalCarros < chassi.length) {
                        System.out.println("==== Cadastrar Carro ====");

                        System.out.print("Chassi: ");
                        chassi[totalCarros] = teclado.next();
                        System.out.println("====================");

                        System.out.print("Nome do Carro: ");
                        nome[totalCarros] = teclado.next();
                        System.out.println("====================");

                        System.out.print("Cor: ");
                        cor[totalCarros] = teclado.next();
                        System.out.println("====================");

                        System.out.print("Motor: ");
                        motor[totalCarros] = teclado.nextInt();
                        System.out.println("====================");

                        // Acrescenta +1 no valor da variável totalCarros
                        totalCarros++;

                        System.out.println("===============================");
                        System.out.println("Carro INSERIDO Com Sucesso.");
                        System.out.println("===============================");
                    } else {
                        System.out.println("Limite de Carros Cadastrados Atingidos!");
                    }
                    break;

                case 2:
                    System.out.println("===== Consultar por CHASSI =====");
                    System.out.print("Digite o CHASSi para consultar: ");
                    String filtroChassi = teclado.next();

                    // Variável com a função de ACHAR o chassi digitado
                    boolean achou = false;

                    for (int i = 0; i < totalCarros; i++) {

                        // Se o chassi digitado for encontrado, a variável achou passa a ser verdadeira
                        if (chassi[i].equals(filtroChassi)) {
                            achou = true;
                            System.out.println("====================");

                            // Mostra as variáveis na posição [], nesse caso a posição é [i]
                            System.out.println("Chassi: " + chassi[i]);
                            System.out.println("Nome do Carro: " + nome[i]);
                            System.out.println("Cor: " + cor[i]);
                            System.out.println("Motor: " + motor[i]);
                            break;
                        }
                    }
                    // Se achou for diferente de verdadeiro, mostra chassi não encontrado.
                    if (!achou) {
                        System.out.println("===============================");
                        System.out.println("Chassi Não Encontrado.");
                        System.out.println("===============================");

                    }
                    break;

                case 3:
                    System.out.println("===== Removendo Carro =====");
                    System.out.print("Digite o CHASSI do carro que deseja remover: ");
                    String removeChassi = teclado.next();

                    boolean encontrado = false;
                    for (int i = 0; i < totalCarros; i++) {
                        if (chassi[i].equals(removeChassi)) {
                            encontrado = true;
                            for (int j = i; j < totalCarros - 1; j++) {
                                chassi[j] = chassi[j + 1];
                                nome[j] = nome[j + 1];
                                cor[j] = cor[j + 1];
                                motor[j] = motor[j + 1];
                            }
                            totalCarros--;

                            System.out.println("===============================");
                            System.out.println("Carro Removido com Sucesso.");
                            System.out.println("===============================");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("==========================================");
                        System.out.println("O chassi digitado não foi encontrado. Tente novamente mais tarde! ");
                        System.out.println("==========================================");
                    }
                    break;

                case 4:
                    System.out.println("===== Alterar Dados de um Carro =====");
                    

                    if (totalCarros == 0) {
                        System.out.println("Não há carros cadastrados para alterar.");
                        break;
                    }

                    System.out.print("Digite o CHASSI do carro que deseja alterar: ");
                    String alterarChassi = teclado.next();
                    boolean alterado = false;

                    for (int i = 0; i < totalCarros; i++) {
                        if (chassi[i].equals(alterarChassi)) {
                            alterado = true;
                            System.out.println("-=-=-=- Carro que irá ser alterado -=-=-=-");
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-");
                            System.out.println("Chassi: "+ chassi[i]);
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-");
                            System.out.println("Nome do Carro: "+ nome[i]);
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-");
                            System.out.println("Cor: "+ cor[i]);
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-");
                            System.out.println("Motor: "+ motor[i]);
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-");

                            System.out.println("Insira novos dados:");
                            System.out.println("====================");
                            System.out.print("Chassi: ");
                            chassi[i] = teclado.next();
                            System.out.println("====================");

                            System.out.print("Nome do Carro: ");
                            nome[i] = teclado.next();
                            System.out.println("====================");

                            System.out.print("Cor: ");
                            cor[i] = teclado.next();
                            System.out.println("====================");

                            System.out.print("Motor: ");
                            motor[i] = teclado.nextInt();
                            System.out.println("====================");

                            System.out.println("Dados Alterados com Sucesso.");
                        }
                    }

                    if (!alterado) {
                        System.out.println("Carro com o CHASSI informado NÃO foi encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("===== Lista de Carros =====");

                    for (int i = 0; i < totalCarros; i++) {
                        System.out.println("====================");
                        System.out.println("Chassi: " + chassi[i]);
                        System.out.println("Nome do Carro: " + nome[i]);
                        System.out.println("Cor: " + cor[i]);
                        System.out.println("Motor: " + motor[i]);
                        System.out.println("====================");
                    }
                    if (totalCarros < 1){
                        System.out.println("Nenhum carro foi encontrado.");
                    }

                    break;

                case 6:
                    System.out.println("==================================");
                    System.out.println("Programa Encerrado, volte sempre!");
                    System.out.println("==================================");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente.");
                    break;
            }
        } while (op != 6);
    }
}