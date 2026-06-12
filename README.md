# Java: Consumindo API, Gravando Arquivos e Lidando com Erros

Coleção de projetos Java do curso da Alura sobre consumo de APIs, manipulação de JSON e tratamento de exceções.

## 📋 Descrição

Este repositório contém projetos práticos que demonstram como consumir APIs web, manipular dados JSON, gerar arquivos e implementar tratamento de erros em Java. Os projetos evoluem desde exemplos simples até aplicações mais complexas com boas práticas de desenvolvimento.

## 🏗️ Estrutura do Repositório

```
.
├── 2944-java-screenmatch-consumindo-webservice/
├── modulo1DesafioHoraPratica/
├── modulo2DesafioHoraPratica/
├── oDesafio/
└── Dependecies/
```

## 📚 Projetos

### 1. ScreenMatch - Consumindo Web Service
Aplicação completa que consome a API OMDB para buscar filmes e séries.

**Funcionalidades:**
- Busca de filmes e séries na API OMDB
- Sistema de classificação e avaliação
- Cálculo de tempo de exibição
- Filtragem de recomendações
- Manipulação de listas e ordenação
- Tratamento de exceções customizadas
- Geração de arquivos JSON

**Conceitos:** Herança, Interfaces, Records, Exceções, HttpClient, Gson, Collections

### 2. Módulo 1 - Desafio Hora Prática
Exemplos básicos de consumo de APIs externas.

**Funcionalidades:**
- Busca de livros na Google Books API
- Busca de receitas na TheMealDB API
- Requisições HTTP simples
- Exibição de resultados JSON

**Conceitos:** HttpClient, HttpRequest, HttpResponse, Scanner, URI

### 3. Módulo 2 - Desafio Hora Prática
Parsing de JSON usando Gson com Java Records.

**Funcionalidades:**
- Parsing de JSON para objetos Java
- Trabalho com objetos aninhados
- Configuração do Gson
- Uso de Records para imutabilidade

**Conceitos:** Java Records, Gson, JSON Parsing, GsonBuilder, Objetos Aninhados

### 4. Consulta CEP - O Desafio
Aplicação para consulta de CEPs usando API ViaCEP.

**Funcionalidades:**
- Consulta interativa de múltiplos CEPs
- Acumulação de endereços em lista
- Geração de arquivo JSON formatado
- Tratamento de formatação de CEP

**Conceitos:** Java Records, Gson, HttpClient, List, Injeção de Dependência, API REST

## 🎯 Conceitos Abordados

- **Consumo de APIs REST:** HttpClient para requisições HTTP
- **Manipulação de JSON:** Gson para serialização/deserialização
- **Tratamento de Exceções:** Try-catch e exceções customizadas
- **Java Records:** Estruturas de dados imutáveis
- **Orientação a Objetos:** Herança, Interfaces, Polimorfismo
- **Collections:** ArrayList, LinkedList, Comparator
- **Geração de Arquivos:** FileWriter e Gson pretty printing
- **Injeção de Dependência:** Via construtor

## 📦 Dependências Comuns

- **Gson:** Biblioteca Google para manipulação de JSON
- **Java 11+:** Para uso de HttpClient

## 🔧 Pré-requisitos

- Java 11 ou superior
- Biblioteca Gson (google-gson)
- IDE (IntelliJ IDEA, Eclipse, etc.)
- Conexão com internet para consumo de APIs

## 🚀 Como Executar os Projetos

Cada projeto possui seu próprio README com instruções específicas de execução. Em geral:

```bash
# Compilar
javac -cp gson.jar src/.../Main.java

# Executar
java -cp gson.jar:src ...Main
```

Consulte o README de cada projeto para detalhes específicos.

## 📝 APIs Utilizadas

- **OMDB API:** Busca de filmes e séries
- **Google Books API:** Busca de livros
- **TheMealDB API:** Busca de receitas
- **ViaCEP API:** Consulta de CEPs brasileiros

## 🎓 Aprendizados

Este conjunto de projetos demonstra:
- Evolução desde requisições HTTP simples até aplicações completas
- Boas práticas de tratamento de erros
- Padrões de projeto e arquitetura
- Manipulação eficiente de dados JSON
- Organização de código em pacotes
- Reutilização de código através de herança e interfaces

## 📖 Curso

Estes projetos foram desenvolvidos como parte do curso "Java: Consumindo API, Gravando Arquivos e Lidando com Erros" da Alura, focado em desenvolvimento de aplicações Java que interagem com serviços web externos.

## 🤝 Contribuições

Este é um repositório educacional para fins de aprendizado. Os projetos foram desenvolvidos como exercícios práticos do curso.
