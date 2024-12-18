🚗 Gerenciador de Carros - Projeto em Java
Este é um projeto simples em Java para gerenciar informações de carros. Ele utiliza arrays para armazenar dados e um menu interativo para realizar operações como cadastro, consulta, remoção e alteração de informações de carros.

📋 Funcionalidades
Inserir Carro:
Permite cadastrar um novo carro fornecendo informações como chassi, nome, cor e motor.
(Limite: 5 carros.)

Consultar por Chassi:
Busca as informações de um carro específico pelo seu número de chassi.

Remover Carro:
Remove um carro cadastrado com base no chassi fornecido.
(Os carros subsequentes no array são reorganizados para evitar espaços vazios.)

Alterar:
Permite atualizar as informações de um carro existente pelo número do chassi.

Listar:
Exibe uma lista com todos os carros cadastrados e seus respectivos dados.

Sair:
Finaliza o programa.

🛠️ Como Executar
Certifique-se de ter o Java JDK 8 ou superior instalado.

Compile o programa no terminal com o comando:
javac projeto1.java

Execute o programa:
java projeto1

💡 Uso do Programa
  Ao iniciar, você será apresentado a um menu interativo com as opções de operação.
Escolha uma opção digitando o número correspondente e siga as instruções exibidas na tela.
Certifique-se de inserir os dados corretamente. 

Por exemplo: O chassi deve ser único para cada carro.
Os valores de motor devem ser números inteiros.

⚠️ Limitações e Melhorias Futuras
Limite de Carros: Atualmente, o programa suporta apenas 5 carros, pois os dados são armazenados em arrays de tamanho fixo. Uma melhoria seria usar estruturas dinâmicas como ArrayList.

Validação de Entrada: Não há verificação detalhada dos dados inseridos (ex.: impedir duplicação de chassi ou entrada inválida). Implementar validações robustas seria um próximo passo.

Persistência: Os dados são armazenados apenas em memória e são perdidos ao encerrar o programa. Adicionar persistência (arquivo ou banco de dados) seria uma excelente melhoria.

📚 Estrutura do Código

Menu Principal: Exibe opções e captura a escolha do usuário.
Switch Case: Controla o fluxo do programa com base na opção escolhida.
Funções Básicas: Cada funcionalidade (inserir, consultar, etc.) é implementada dentro de casos específicos.

🛡️ Cuidados
Evite inserir valores inválidos (ex.: texto no lugar de números).
Não altere diretamente o código, a menos que esteja familiarizado com Java.

🏆 Contribuições e Licença
Sinta-se à vontade para contribuir com melhorias. Este projeto é de código aberto e pode ser utilizado para fins educacionais ou como base para projetos mais complexos.

😊 Obrigado por usar o Gerenciador de Carros!
