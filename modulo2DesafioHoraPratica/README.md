# Módulo 2 - Desafio Hora Prática

Projeto demonstrando parsing de JSON usando Gson com Java Records.

## 📋 Descrição

Este projeto mostra como converter strings JSON em objetos Java usando a biblioteca Gson, com foco no uso de Records para representar estruturas de dados imutáveis.

## 🏗️ Estrutura do Projeto

```
src/
├── Livro/
│   ├── Editora.java
│   └── Livro.java
├── Pessoa/
│   └── Pessoa.java
└── Main.java
```

## 🚀 Funcionalidades

### Main.java
- Parsing de JSON para objeto Pessoa
- Parsing de JSON aninhado para objeto Livro com Editora
- Demonstração de diferentes configurações do Gson (setLenient)
- Exibição dos objetos convertidos

## 🎯 Conceitos Aplicados

- **Java Records**: Estruturas de dados imutáveis
- **Gson**: Biblioteca para serialização/deserialização JSON
- **JSON Parsing**: Conversão de strings JSON para objetos Java
- **Objetos Aninhados**: Parsing de estruturas JSON complexas
- **GsonBuilder**: Configuração personalizada do Gson

## 📦 Dependências

- Gson (Google JSON library)

## 🔧 Como Executar

```bash
javac -cp gson.jar src/Main.java
java -cp gson.jar:src Main
```

## 📝 Exemplo de Uso

### Pessoa
```json
{
  "nome": "Rodrigo",
  "cidade": "Brasília"
}
```

### Livro com Editora
```json
{
  "titulo": "Harry Porra",
  "autor": "MC Maha",
  "editora": {
    "nome": "Youtube"
  }
}
```

## 🎓 Aprendizados

Este projeto demonstra:
- Uso de Java Records para modelagem de dados
- Parsing de JSON com Gson
- Trabalho com objetos aninhados em JSON
- Configuração do Gson com GsonBuilder
- Imutabilidade com Records
- Mapeamento automático de campos JSON para propriedades Java

## 📚 Estruturas de Dados

### Pessoa
- nome (String)
- idade (int)
- cidade (String)

### Livro
- titulo (String)
- autor (String)
- editora (Editora)

### Editora
- nome (String)
