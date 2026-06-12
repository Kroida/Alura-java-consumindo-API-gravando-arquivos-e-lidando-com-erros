# Consulta CEP - O Desafio

Aplicação Java para consulta de CEPs (Códigos de Endereçamento Postal) usando a API ViaCEP, com geração de arquivo JSON.

## 📋 Descrição

Este projeto permite consultar múltiplos CEPs através da API ViaCEP, exibir as informações de endereço e salvar todos os resultados em um arquivo JSON formatado.

## 🏗️ Estrutura do Projeto

```
src/
├── models/
│   ├── ConsultaCep.java
│   ├── Endereco.java
│   └── GeradorDeArquivo.java
└── Main.java
```

## 🚀 Funcionalidades

### Main.java
- Loop interativo para consulta de múltiplos CEPs
- Opção de sair digitando "sair"
- Acumulação de endereços em uma lista
- Geração de arquivo JSON com todos os endereços consultados

### ConsultaCep.java
- Consulta de CEP na API ViaCEP
- Tratamento de formatação do CEP (remoção de hífen)
- Exibição do status HTTP da requisição
- Conversão de JSON para objeto Endereco usando Gson

### Endereco.java
- Record contendo todos os campos de endereço retornados pela API
- Campos: cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi

### GeradorDeArquivo.java
- Salva lista de endereços em arquivo JSON
- Usa Gson com pretty printing para formatação legível
- Gera arquivo "enderecos.json" no diretório raiz

## 🎯 Conceitos Aplicados

- **Java Records**: Estruturas de dados imutáveis para Endereco
- **Gson**: Serialização/deserialização JSON com pretty printing
- **HttpClient**: Requisições HTTP GET para API externa
- **List**: Acumulação de múltiplos objetos
- **Injeção de Dependência**: Gson injetado via construtor
- **API REST**: Consumo da API ViaCEP

## 📦 Dependências

- Gson (Google JSON library)
- Java 11+ (para HttpClient)

## 🔧 Como Executar

```bash
javac -cp gson.jar src/Main.java
java -cp gson.jar:src Main
```

## 📝 Exemplo de Uso

```
Digite seu CEP (ou 'sair' para encerrar):
01310-100
Status: 200
Endereco[cep=01310-100, logradouro=Av. Paulista, ...]
Digite seu CEP (ou 'sair' para encerrar):
20040-002
Status: 200
Endereco[cep=20040-002, logradouro=Rua da Assembleia, ...]
Digite seu CEP (ou 'sair' para encerrar):
sair
Arquivo gerado: enderecos.json
Programa finalizado!
```

## 🎓 Aprendizados

Este projeto demonstra:
- Consumo de APIs REST com Java HttpClient
- Parsing de JSON com Gson
- Uso de Records para modelagem de dados
- Injeção de dependência via construtor
- Manipulação de listas e acumulação de dados
- Geração de arquivos JSON formatados
- Tratamento de entrada do usuário com Scanner
- Formatação de strings (remoção de caracteres)

## 📚 API Utilizada

- **ViaCEP**: `https://viacep.com.br/ws/{cep}/json/`
- API pública brasileira para consulta de CEPs
- Não requer autenticação
- Retorna dados em formato JSON

## 📄 Arquivo Gerado

O projeto gera um arquivo `enderecos.json` contendo todos os endereços consultados durante a sessão, formatado com pretty printing para facilitar a leitura.
