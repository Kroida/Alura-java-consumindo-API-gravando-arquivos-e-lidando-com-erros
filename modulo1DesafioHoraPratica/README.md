# Módulo 1 - Desafio Hora Prática

Projeto contendo exemplos práticos de consumo de APIs externas usando Java HttpClient.

## 📋 Descrição

Este projeto demonstra como consumir diferentes APIs web usando Java, focando em requisições HTTP simples e exibição dos resultados em formato JSON.

## 🏗️ Estrutura do Projeto

```
src/
├── apiGoogleBook/
│   └── Main.java
└── apiMealDB/
    └── Main.java
```

## 🚀 Funcionalidades

### apiGoogleBook/Main.java
- Busca livros na Google Books API
- Permite busca por título do livro
- Exibe o resultado JSON completo da API

### apiMealDB/Main.java
- Busca receitas na TheMealDB API
- Permite busca por nome da receita
- Exibe o resultado JSON completo da API

## 🎯 Conceitos Aplicados

- **HttpClient**: Requisições HTTP GET
- **HttpRequest**: Configuração da requisição
- **HttpResponse**: Manipulação da resposta
- **Scanner**: Entrada de dados do usuário
- **URI**: Construção de URLs para APIs

## 📦 Dependências

- Java 11+ (para HttpClient)
- Nenhuma biblioteca externa necessária

## 🔧 Como Executar

### Google Books API
```bash
javac src/apiGoogleBook/Main.java
java -cp src apiGoogleBook.Main
```

### TheMealDB API
```bash
javac src/apiMealDB/Main.java
java -cp src apiMealDB.Main
```

## 📝 Exemplo de Uso

### Google Books
```
Digite um livro para busca
Harry Potter
[JSON response com informações do livro]
```

### TheMealDB
```
Digite uma receita para busca
Pizza
[JSON response com informações da receita]
```

## 🎓 Aprendizados

Este projeto demonstra:
- Consumo básico de APIs REST
- Construção de URLs dinâmicas
- Tratamento de exceções (IOException, InterruptedException)
- Uso de Scanner para entrada interativa
- Formatação de URLs (replace de espaços por +)

## 📚 APIs Utilizadas

- **Google Books API**: `https://www.googleapis.com/books/v1/volumes/`
- **TheMealDB API**: `https://www.themealdb.com/api/json/v1/1/search.php`
