# ✍️ Oficina I

## Instruções

Crie as classes propostas nos exercícios. Para cada exercício, crie uma classe com o método main para criar e testar os objetos.

## Exercício 1: **Classe Livro**

**Contexto:** Crie uma classe para representar um **livro físico**.

**📌 Atributos:**

* Título do livro
* Autor
* Número total de páginas
* Página atual
* Se está aberto (sim/não)

**✅ Métodos:**

1. **abrir()**
   * Torna o estado do livro "aberto".
   * Só altera se ainda estiver fechado.
2. **fechar()**
   * Torna o estado do livro "fechado".
   * Só altera se estiver aberto.
3. **virarPagina()**
   * Incrementa a página atual em 1.
   * Só pode ser executado se o livro estiver aberto **e** ainda não estiver na última página.
4. **voltarPagina()**
   * Decrementa a página atual em 1.
   * Só pode ser executado se o livro estiver aberto **e** a página atual for maior que 1.
5. **irParaPagina(int pagina)**
   * Leva diretamente à página especificada.
   * Só funciona se o livro estiver aberto **e** a página for válida (entre 1 e total de páginas).

## Exercício 2: **Classe ContaBancaria**

**Contexto:** Modele uma conta bancária simples.

**📌 Atributos:**

* Nome do titular
* Número da conta
* Saldo atual
* Limite de saque diário
* Valor sacado no dia

**✅ Métodos:**

1. **depositar(double valor)**
   * Adiciona o valor ao saldo.
   * Só pode ser usado se o valor for positivo.
2. **sacar(double valor)**
   * Subtrai o valor do saldo.
   * Só pode ser feito se:
     * Valor for positivo
     * Valor não ultrapassar o limite diário
     * Saldo suficiente
3. **consultarSaldo()**
   * Exibe o saldo atual.
4. **resetarLimiteDiario()**
   * Zera o valor sacado no dia (simulando virada de dia).

## Exercício 3: **Classe Lampada**

**Contexto:** Modele uma lâmpada com controle de estado e intensidade.

**📌 Atributos:**

* Se está ligada (sim/não)
* Intensidade da luz (0 a 100)
* Cor da luz (ex: branco, amarelo, azul)

**✅ Métodos:**

1. **ligar()**
   * Muda o estado para ligada.
   * Só funciona se estiver desligada.
2. **desligar()**
   * Muda o estado para desligada.
   * Só funciona se estiver ligada.
3. **ajustarIntensidade(int valor)**
   * Altera a intensidade da luz para o valor fornecido.
   * Só pode ser usado se a lâmpada estiver ligada.
   * O valor deve estar entre 0 e 100.
4. **mudarCor(String novaCor)**
   * Altera a cor da luz.
   * Pode ser usado em qualquer momento.

Claro! Aqui vão **mais 3 exercícios**, também baseados em objetos do mundo real, com descrições detalhadas de atributos e a lógica completa de cada método.

## Exercício 4: **Classe Filme**

**Contexto:** Modele um filme em um sistema de streaming.

**📌 Atributos:**

* Título
* Duração total (em minutos)
* Minuto atual (posição onde o usuário parou)
* Se está em reprodução (sim/não)
* Se está pausado (sim/não)

**✅ Métodos:**

1. **reproduzir()**
   * Inicia ou continua o filme.
   * Só pode ser executado se não estiver no final.
   * Altera o estado para "em reprodução", e desativa "pausado".
2. **pausar()**
   * Pausa o filme.
   * Só pode ser executado se estiver em reprodução.
3. **avancar(int minutos)**
   * Avança o filme em `minutos`.
   * Só pode ser usado se o filme estiver em reprodução.
   * Não pode ultrapassar a duração total.
4. **voltar(int minutos)**
   * Retrocede o filme em `minutos`.
   * Só pode ser usado se o filme estiver em reprodução.
   * Não pode ir abaixo de 0.
5. **reiniciar()**
   * Volta o filme para o minuto 0 e pausa.

## Exercício 5: **Classe Elevador**

**Contexto:** Modele um elevador de prédio.

**📌 Atributos:**

* Andar atual
* Total de andares do prédio
* Capacidade máxima de pessoas
* Quantidade de pessoas presentes

**✅ Métodos:**

1. **entrar()**
   * Adiciona uma pessoa ao elevador.
   * Só pode ser executado se ainda houver espaço.
2. **sair()**
   * Remove uma pessoa do elevador.
   * Só pode ser executado se houver alguém dentro.
3. **subir()**
   * Sobe um andar.
   * Só funciona se ainda não estiver no último andar.
4. **descer()**
   * Desce um andar.
   * Só funciona se não estiver no térreo.
5. **irParaAndar(int destino)**
   * Move diretamente para um andar válido (entre 0 e total de andares).
   * Só funciona se o destino for diferente do atual.

## Exercício 6: **Classe ContaGotas**

**Contexto:** Modele um frasco de remédio com conta-gotas.

**📌 Atributos:**

* Capacidade total (em ml)
* Quantidade atual (em ml)
* Tamanho da dose padrão (em ml)

**✅ Métodos:**

1. **pingar()**
   * Reduz a quantidade atual em uma dose.
   * Só funciona se houver pelo menos 1 dose disponível.
2. **preencher(double quantidade)**
   * Adiciona `quantidade` ao frasco.
   * Só funciona se não ultrapassar a capacidade total.
3. **verificarRestante()**
   * Informa quantas doses ainda podem ser pingadas.
4. **esvaziar()**
   * Zera a quantidade atual.

## Exercício 7: **Classe RelogioDespertador**

**Contexto:** Modele um relógio despertador digital.

**📌 Atributos:**

* Hora atual (em formato 24h: hh:mm)
* Hora do alarme
* Alarme ativado (sim/não)

**✅ Métodos:**

1. **ajustarHora(String novaHora)**
   * Define a hora atual no formato "hh:mm".
   * A hora precisa estar no formato válido.
2. **ajustarAlarme(String horaAlarme)**
   * Define a hora do alarme.
   * Apenas se for um horário válido.
3. **ativarAlarme()**
   * Ativa o alarme.
4. **desativarAlarme()**
   * Desativa o alarme.
5. **verificarAlarme()**
   * Se o alarme estiver ativado e a hora atual for igual à hora do alarme, imprime “Alarme tocando!”.

## Exercício 8: **Classe Termometro**

**Contexto:** Modele um termômetro digital com histórico.

**📌 Atributos:**

* Temperatura atual
* Unidade de medida (Celsius ou Fahrenheit)
* Lista de últimas 5 temperaturas registradas

**✅ Métodos:**

1. **registrarTemperatura(float valor)**
   * Atualiza a temperatura atual.
   * Armazena no histórico (mantém só os 5 últimos registros).
2. **converterParaCelsius()**
   * Converte a temperatura atual para Celsius, se estiver em Fahrenheit.
3. **converterParaFahrenheit()**
   * Converte a temperatura atual para Fahrenheit, se estiver em Celsius.
4. **mostrarHistorico()**
   * Mostra as últimas 5 temperaturas registradas.

## Exercício 9: **Classe CarrinhoDeCompras**

**Contexto:** Modele um carrinho de compras online.

**📌 Atributos:**

* Lista de itens (nome e preço)
* Quantidade total de itens
* Valor total da compra

**✅ Métodos:**

1. **adicionarItem(String nome, double preco)**
   * Adiciona um item à lista.
   * Atualiza a quantidade total e o valor total.
2. **removerItem(String nome)**
   * Remove o item da lista (se existir).
   * Atualiza a quantidade e o valor total.
3. **listarItens()**
   * Mostra todos os itens do carrinho.
4. **finalizarCompra()**
   * Exibe o total e esvazia o carrinho.

## 🔹 Exercício 10: **Classe Cofrinho**

**Contexto:** Modele um cofrinho para guardar moedas.

**📌 Atributos:**

* Valor total guardado
* Quantidade de moedas de cada tipo (R$0.10, R$0.25, R$0.50, R$1.00)

**✅ Métodos:**

1. **adicionarMoeda(double valor)**
   * Aceita somente moedas válidas: 0.10, 0.25, 0.50 ou 1.00.
   * Soma ao total e conta a moeda.
2. **quebrar()**
   * Esvazia o cofre.
   * Mostra quanto tinha e reseta tudo para zero.
3. **verificarTotal()**
   * Mostra o valor acumulado.
4. **quantidadePorTipo()**
   * Mostra quantas moedas tem de cada tipo.
