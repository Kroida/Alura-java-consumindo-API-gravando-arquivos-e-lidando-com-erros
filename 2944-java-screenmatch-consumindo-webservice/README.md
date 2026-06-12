# ScreenMatch - Consumindo Web Service

Projeto Java que consome a API OMDB para buscar informações de filmes e séries, com funcionalidades de classificação, cálculo de tempo e manipulação de listas.

## 📋 Descrição

O ScreenMatch é uma aplicação que permite buscar filmes e séries através da API OMDB, converter os dados JSON em objetos Java, calcular tempos de exibição, filtrar recomendações e gerar arquivos JSON com os resultados.

## 🏗️ Estrutura do Projeto

```
src/
├── br/com/alura/screenmatch/
│   ├── calculos/
│   │   ├── CalculadoraDeTempo.java
│   │   ├── Classificavel.java
│   │   └── FiltroRecomendacao.java
│   ├── excecao/
│   │   └── ErroDeConversaoDeAnoException.java
│   ├── modelos/
│   │   ├── Episodio.java
│   │   ├── Filme.java
│   │   ├── Serie.java
│   │   ├── Titulo.java
│   │   └── TituloOmdb.java
│   └── principal/
│       ├── Principal.java
│       ├── PrincipalBusca.java
│       └── PrincipalComListas.java
```

## 🚀 Funcionalidades

### Principal.java
- Criação de filmes e séries
- Sistema de avaliação com cálculo de média
- Cálculo de tempo total de exibição
- Filtragem de recomendações baseadas em classificação

### PrincipalBusca.java
- Busca de filmes na API OMDB
- Conversão de JSON para objetos Java usando Gson
- Tratamento de exceções (NumberFormatException, IllegalArgumentException, ErroDeConversaoDeAnoException)
- Geração de arquivo JSON com os títulos buscados
- Loop de busca interativo com opção de sair

### PrincipalComListas.java
- Manipulação de listas de títulos (ArrayList e LinkedList)
- Ordenação de listas por nome e ano de lançamento
- Uso de Comparator para ordenação personalizada
- Verificação de instância com instanceof pattern matching

## 🎯 Conceitos Aplicados

- **Herança**: Filme e Serie estendem Titulo
- **Interfaces**: Classificavel para classificação
- **Records**: TituloOmdb para imutabilidade
- **Exceções Customizadas**: ErroDeConversaoDeAnoException
- **API HTTP**: HttpClient para consumo de web services
- **JSON Parsing**: Gson para serialização/deserialização
- **Collections**: ArrayList, LinkedList, Comparator
- **Polimorfismo**: Uso de tipos abstratos (Titulo)

## 📦 Dependências

- Gson (Google JSON library)
- Java 11+ (para HttpClient)

## 🔧 Como Executar

### Principal.java
```bash
javac src/br/com/alura/screenmatch/principal/Principal.java
java -cp src br.com.alura.screenmatch.principal.Principal
```

### PrincipalBusca.java
```bash
javac -cp gson.jar src/br/com/alura/screenmatch/principal/PrincipalBusca.java
java -cp gson.jar:src br.com.alura.screenmatch.principal.PrincipalBusca
```

### PrincipalComListas.java
```bash
javac src/br/com/alura/screenmatch/principal/PrincipalComListas.java
java -cp src br.com.alura.screenmatch.principal.PrincipalComListas
```

## 📝 Exemplo de Uso

### Busca de Filmes (PrincipalBusca.java)
```
Digite um filme para busca
O poderoso chefão
[JSON response]
Titulo convertido
Titulo{nome='The Godfather', anoDeLancamento=1972, duracaoEmMinutos=175}
```

## 🎓 Aprendizados

Este projeto demonstra:
- Consumo de APIs REST com Java
- Manipulação de JSON com Gson
- Tratamento de exceções customizadas
- Uso de coleções e ordenação
- Boas práticas de orientação a objetos
- Padrões de projeto (Strategy com interfaces)
