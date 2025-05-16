# 📄 Estudo Dirigido 03

{% hint style="success" %}
## Instruções

* Entrega via **GitHub**
* Salvar os arquivos no diretório: `ed03/`
* Todos os códigos devem estar **documentados com Javadoc**
* **Data limite de entrega: 28/05**
{% endhint %}

## 1. Folha de pagamento

Você precisa modelar um sistema de folha de pagamento simplificado. O ponto central é a existência de diferentes tipos de funcionários, cada um com sua própria forma de cálculo de salário final. Para isso, será criada uma classe abstrata que define uma estrutura comum, e classes concretas que especializam o comportamento do cálculo salarial por meio da sobrescrita de método.

### **Etapas**

1. **Implemente uma classe abstrata chamada `Funcionario` contendo:**
   * Atributo `nome` (tipo `String`) – representa o nome do funcionário.
   * Atributo `salarioBase` (tipo `double`) – representa o salário base.
   * Método `exibirDados()` que imprime o nome e o salário base.
   * Método abstrato `calcularSalario()` que retorna um `double`.
2. **Crie uma classe concreta `FuncionarioCLT` que herda de `Funcionario`:**
   * Este tipo de funcionário recebe um adicional fixo de R$ 300,00.
   * O método `calcularSalario()` deve retornar `salarioBase + 300`.
3. **Crie uma segunda classe concreta `FuncionarioTemporario`, também filha de `Funcionario`:**
   * Este tipo de funcionário tem um desconto fixo de R$ 100,00.
   * O método `calcularSalario()` deve retornar `salarioBase - 100`.
4. **Crie uma classe `ProgramaFolha` com método `main`:**
   * Crie uma instância de `FuncionarioCLT` com nome "Carlos" e salário base R$ 2000,00.
   * Crie uma instância de `FuncionarioTemporario` com nome "Ana" e salário base R$ 2000,00.
   * Para cada instância:
     * Chame o método `exibirDados()`.
     * Exiba o salário calculado com base na chamada de `calcularSalario()`.

### **Saída Esperada**

```
Nome: Carlos
Salário Base: 2000.0
Salário Final: 2300.0

Nome: Ana
Salário Base: 2000.0
Salário Final: 1900.0
```

## 2. Gráfica Online

Você deve modelar um sistema que permita a impressão de diversos tipos de conteúdo digital (documentos, imagens, gráficos, relatórios), onde cada tipo possui uma lógica de apresentação própria. Para isso, será utilizada uma interface `Imprimivel` com um método comum, a ser sobrescrito por todas as classes.

### **Etapas**

1. **Crie uma interface chamada `Imprimivel` contendo:**
   * Método `void imprimir();` — Sem parâmetros, responsável pela exibição dos dados do objeto de forma específica para cada tipo.
2. **Implemente a classe `DocumentoTexto` com os seguintes atributos:**
   * `titulo` (tipo `String`)
   * `conteudo` (tipo `String`)
   * O método `imprimir()` deve exibir o título em letras maiúsculas, seguido do conteúdo do texto.
3. **Implemente a classe `ImagemDigital` com os seguintes atributos:**
   * `nomeArquivo` (tipo `String`)
   * `resolucao` (tipo `String`)
   * O método `imprimir()` deve exibir o nome do arquivo e sua resolução (ex: “1920x1080”).
4. **Adicione mais duas implementações da interface:**
   * **Classe `GraficoEstatistico` com os atributos:**
     * `titulo` (String)
     * `tipoGrafico` (String) — Ex: "pizza", "barra"
     * `imprimir()` deve exibir o tipo de gráfico seguido do título em caixa alta.
   * **Classe `RelatorioPDF` com os atributos:**
     * `autor` (String)
     * `numeroPaginas` (int)
     * `imprimir()` deve exibir o nome do autor e o número total de páginas.
5. **Crie a classe `ProgramaImpressao` com método `main`:**
   * Instancie objetos das quatro classes implementadoras de `Imprimivel`.
   * Chame o método `imprimir()` diretamente em cada instância (sem uso de polimorfismo via `Imprimivel`).

### **Saída Esperada**

```
DOCUMENTO DE APRESENTAÇÃO
Este é o conteúdo do documento.

Arquivo: paisagem.jpg
Resolução: 1920x1080

Gráfico do tipo: BARRA
Título: DISTRIBUIÇÃO DE VENDAS

Autor: João Silva
Total de páginas: 12
```

## 3. Sistema de Login

Você precisa desenvolver um modelo que represente usuários de um sistema computacional, distinguindo aqueles que podem autenticar-se de acordo com regras específicas, e outros que possuem acessos limitados ou funcionalidades administrativas.&#x20;

### **Etapas**

1. **Crie a interface `Autenticavel` com o seguinte método:**
   * `autenticar(String senha);` - Este método verifica se a senha fornecida é válida segundo alguma regra.
2. **Crie uma interface `Gerenciavel` com os métodos:**
   * `void alterarSenha(String novaSenha);`
   * `void bloquearUsuario();`
3. **Crie uma interface `Logavel` com o método:**
   * `registrarLog(String operacao);` - Este método simula a gravação de um log de auditoria.
4. **Crie uma classe abstrata `Usuario` com os seguintes atributos:**
   * `login` (String)
   * `senha` (String)
5. **A classe `Usuario` deve fornecer o seguinte método concreto:**
   * `void exibirLogin()` que imprime o valor de `login`.
6. **Classe `Administrador`:**
   * Herda de `Usuario`.
   * Implementa as interfaces `Autenticavel`, `Gerenciavel` e `Logavel`.
   * A autenticação é considerada bem-sucedida se a senha fornecida for igual à armazenada.
   * O método `alterarSenha()` altera a senha armazenada.
   * O método `bloquearUsuario()` exibe a mensagem `"Usuário bloqueado com sucesso."`
   * O método `registrarLog()` imprime a operação registrada com a seguinte estrutura:\
     `"Log registrado: <operacao>"`
7. **Classe `Visitante`:**
   * Herda de `Usuario`.
   * Não implementa nenhuma interface.
   * Sobrescreve o método `exibirLogin()` para imprimir a mensagem:\
     `"Visitante - acesso restrito ao sistema."`
8. **Classe `Cliente`:**
   * Herda de `Usuario`.
   * Implementa apenas a interface `Autenticavel`.
   * A autenticação considera válida a senha armazenada apenas se a senha tiver mais de 6 caracteres e corresponder exatamente à senha atual.
   * Herda o método `exibirLogin()` diretamente da classe `Usuario`.
9. **Crie a classe `ProgramaLogin` com método `main`:**
   * Um `Administrador` com login `"admin"` e senha `"admin123"`.
   * Um `Visitante` com login `"guest"` e senha `"qualquer"`.
   * Um `Cliente` com login `"joao"` e senha `"segredo123"`.
10. **Para cada objeto:**
    * Chame o método `exibirLogin()`.
    * Para os que implementam `Autenticavel`, execute o método `autenticar()` com uma senha correta e uma senha incorreta.
    * Nos casos aplicáveis, utilize também os métodos de `Gerenciavel` e `Logavel`.

### **Saída Esperada**

```
Login: admin
Autenticação com 'admin123': true
Autenticação com 'errada': false
Senha alterada com sucesso.
Usuário bloqueado com sucesso.
Log registrado: Exclusão de conta

Visitante - acesso restrito ao sistema.

Login: joao
Autenticação com 'segredo123': true
Autenticação com '12345': false
```
