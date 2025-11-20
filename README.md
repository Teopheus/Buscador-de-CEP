# Buscador de Endereços (ViaCEP)

Este projeto é uma aplicação Java que consome a API pública do ViaCEP para buscar endereços a partir de um CEP fornecido pelo usuário. Além de exibir os dados no terminal, a aplicação gera um arquivo JSON com as informações encontradas.

O principal objetivo deste projeto foi praticar a integração com APIs externas, tratamento de exceções e manipulação de arquivos.

## Funcionalidades
1. O usuário digita um CEP no terminal.
2. A aplicação realiza uma requisição HTTP para a API do ViaCEP.
3. A resposta (JSON) é convertida para um objeto Java usando a biblioteca Gson.
4. Um arquivo `.json` é gerado automaticamente com os dados do endereço (ex: `01001000.json`).

## Tecnologias utilizadas
* **Java 17+:** Utilização de `Record` para modelagem de dados e `HttpClient` para requisições web.
* **Gson (Google):** Biblioteca utilizada para desserializar o JSON da API para objetos Java e para formatar a saída do arquivo.
* **Java IO:** Para criação e escrita de arquivos.

## Dependências
Este projeto depende da biblioteca **Gson**. O arquivo `gson-2.10.1.jar` deve estar presente na raiz do projeto para que a compilação e execução funcionem.

## Como executar
Como este projeto utiliza uma dependência manual (.jar), é necessário informar o *classpath* durante a compilação e execução.

1. Abra o terminal na pasta do projeto.
2. Compile os arquivos:
   (No Windows)
   javac -cp ".;gson-2.10.1.jar" *.java
   
   (No Linux/Mac)
   javac -cp ".:gson-2.10.1.jar" *.java

3. Execute a aplicação:
   (No Windows)
   java -cp ".;gson-2.10.1.jar" Principal
   
   (No Linux/Mac)
   java -cp ".:gson-2.10.1.jar" Principal

## Exemplo de uso
Ao executar, o programa solicitará o CEP:

Digite um número de CEP para consulta:
01001000
Endereço encontrado: Endereco[cep=01001-000, logradouro=Praça da Sé, complemento=lado ímpar, localidade=São Paulo, uf=SP]
Arquivo JSON gerado com sucesso!

Após essa mensagem, um arquivo chamado `01001000.json` será criado na pasta do projeto.
