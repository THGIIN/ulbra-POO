## Tarefas Implementadas

- Calculadora de Desconto (Scanner)
- Calculadora de ITBI (JOptionPane)
- Sistema de Avaliação (JOptionPane)
- Calculadora de Aposentadoria (Scanner)
- Circuito de Resistências (Scanner)
- Sistema de Login (Scanner)
- Gerador de Tabuada (Scanner)

## Como compilar e executar (Windows)

1) Compile todas as classes para a pasta `out`:

```
javac -d out src\atividades\poo\*.java
```

2) Execute a classe desejada, por exemplo:

```
java -cp out atividades.poo.DescontoCalculadora
java -cp out atividades.poo.ItbiCalculadora
java -cp out atividades.poo.SistemaAvaliacao
java -cp out atividades.poo.AposentadoriaCalculadora
java -cp out atividades.poo.CircuitoResistencias
java -cp out atividades.poo.SistemaLogin
java -cp out atividades.poo.GeradorTabuada
```

Observação: em entradas numéricas, utilize ponto como separador decimal (ex.: `1234.56`).

## Descrição resumida das classes

- `DescontoCalculadora`: Lê valor do produto e percentual de desconto via `Scanner`, calcula o valor do desconto e o preço final.
- `ItbiCalculadora`: Usa `JOptionPane` para ler valor de transação, valor venal e percentual de ITBI. Calcula o imposto sobre o maior entre valor de transação e valor venal.
- `SistemaAvaliacao`: Com `JOptionPane`, recebe duas notas de prova e uma de trabalho. Calcula média simples e informa aprovado (>= 6) ou reprovado.
- `AposentadoriaCalculadora`: Via `Scanner`, recebe idade, sexo (M/F) e anos de contribuição. Verifica se pode se aposentar por idade (homem 65, mulher 62) ou por tempo (homem 35 anos, mulher 30 anos). Se não puder, informa quantos anos faltam em cada regra.
- `CircuitoResistencias`: Usa `Scanner` para ler quatro resistências em série, exibe equivalente (soma), maior e menor.
- `SistemaLogin`: Simula login pedindo usuário e senha via `Scanner`. Espera ambos como `java8`. Três tentativas com mensagens de erro.
- `GeradorTabuada`: Usa `Scanner` para ler um número e imprime a tabuada de 1 a 10 com um loop.