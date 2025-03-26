# Tipos de Dados Primitivos

Na linguagem Java, os **tipos de dados primitivos** representam os blocos fundamentais de construção para armazenar valores simples. Ao contrário dos objetos, que são instâncias de classes, os primitivos não possuem métodos ou atributos associados — eles são valores literais e ocupam espaço direto na memória.

**Características:**

* Ocupam menos memória.
* São mais rápidos para operações de cálculo.
* Não são instanciáveis.
* Sempre armazenam um único valor.

São 8 os tipos primitivos em Java:

<table><thead><tr><th width="107">Tipo</th><th width="158">Categoria</th><th width="78.5">Tamanho</th><th width="136">Valor Padrão</th><th>Intervalo de Valores</th></tr></thead><tbody><tr><td><code>boolean</code></td><td>Lógico</td><td>1 bit</td><td><code>false</code></td><td><code>true</code> ou <code>false</code></td></tr><tr><td><code>char</code></td><td>Caractere Unicode</td><td>2 bytes</td><td><code>'\u0000'</code></td><td><code>0</code> a <code>65535</code> (Unicode)</td></tr><tr><td><code>byte</code></td><td>Numérico inteiro</td><td>1 byte</td><td><code>0</code></td><td><code>-128</code> a <code>127</code></td></tr><tr><td><code>short</code></td><td>Numérico inteiro</td><td>2 bytes</td><td><code>0</code></td><td><code>-32.768</code> a <code>32.767</code></td></tr><tr><td><code>int</code></td><td>Numérico inteiro</td><td>4 bytes</td><td><code>0</code></td><td><code>-2^31</code> a <code>2^31-1</code></td></tr><tr><td><code>long</code></td><td>Numérico inteiro</td><td>8 bytes</td><td><code>0L</code></td><td><code>-2^63</code> a <code>2^63-1</code></td></tr><tr><td><code>float</code></td><td>Ponto flutuante</td><td>4 bytes</td><td><code>0.0f</code></td><td><code>~±3.4 × 10^38</code></td></tr><tr><td><code>double</code></td><td>Ponto flutuante</td><td>8 bytes</td><td><code>0.0d</code></td><td><code>~±1.7 × 10^308</code></td></tr></tbody></table>

