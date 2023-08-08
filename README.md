# Rick and Morty Service

![projeto rick and morty banner](https://github.com/brielsene/rick-and-morty-service/assets/87671071/4daa5bad-5a7b-4f12-bf55-ccb4800311d6)

## Descrição

O Rick and Morty Service é um serviço que fornece informações sobre personagens da famosa série animada "Rick and Morty". Ele consome a API pública "The Rick and Morty API" para obter os dados dos personagens e exibe-os em um formato fácil de usar.

Este projeto é desenvolvido em Java e utiliza o framework Spring Boot para fornecer um serviço web RESTful.

## Funcionalidades

- Listar todos os personagens da série.
- Pesquisar um personagem específico por nome ou ID.
- Obter detalhes de um personagem, incluindo nome, status, espécie, gênero, origem e episódios em que aparece.
- Métodos como:
    - Cadastrar dados da API externa no banco de dados local
    - Consultar quantos episódios determinado personagem participou

## Tecnologias utilizadas
- Java
- Spring Boot
- MySql
- JPA e Hibernate

## Dependências Maven
- Spring Web
- Spring Data JPA
- DevTools
- Lombok
- Spring Cloud Feign
- MySql Driver Connector

## Organização de classes
![organização dos pacotes e classes](https://github.com/brielsene/rick-and-morty-service/assets/87671071/332c9d42-7b02-4c9a-a96e-678645e486c1)

## Configurações da Aplicação
![applications properties - arquivo de configuração da aplicação](https://github.com/brielsene/rick-and-morty-service/assets/87671071/20acf3ac-32f5-4993-8571-7c55f368bd9e)

## Retornos da API
- Retorno Lista com todos os personagens
![retorno api lista com todos os personagens](https://github.com/brielsene/rick-and-morty-service/assets/87671071/ac2a49a6-e99a-458a-b605-39ff76ac225b)


- Retorno personagem por ID

![retorno api objeto personagem pelo ID](https://github.com/brielsene/rick-and-morty-service/assets/87671071/5bceae1a-1b27-4c5f-8fa8-8d5102341689)

- Retorno número de episódios que determinado personagem participou
![retorno de número de episódios que dado personagem participou](https://github.com/brielsene/rick-and-morty-service/assets/87671071/5cde40d1-0422-4b11-acd2-e4d352c9957a)

- Tela geral aplicação no Inteliij IDEA
![print geral](https://github.com/brielsene/rick-and-morty-service/assets/87671071/d26c3c37-ffa1-4da1-bf48-f253115bf668)

### Pré-requisitos

- Java 11 ou superior instalado.
- Maven ou Gradle instalado para compilar o projeto.
- Navegador web ou ferramenta de API como o Postman para testar as solicitações HTTP.
