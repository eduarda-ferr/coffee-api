# ☕ CoffeeShop REST API

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![Build](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

Uma API RESTful desenvolvida em **Java 21** e **Spring Boot** para gerenciamento de pedidos e processamento de pagamentos de uma cafeteria. O projeto foi projetado com foco em boas práticas de arquitetura de software, aplicando padrões de projeto como **Strategy** e **DTO (Data Transfer Object)**.

---

## 🎯 Objetivo do Projeto

O principal objetivo desta aplicação é fornecer uma solução robusta e escalável para o ecossistema de uma cafeteria. A API permite gerenciar o catálogo de bebidas e processar transações financeiras de forma desacoplada, facilitando a adição de novos métodos de pagamento e regras de negócio sem alterar o código existente (seguindo o princípio *Open/Closed* do SOLID).

---

## 🚀 Funcionalidades Principais

* **Gerenciamento de Bebidas:** Consulta e listagem do catálogo de bebidas disponíveis.
* **Processamento Dinâmico de Pagamentos:** Endpoint para processamento de transações via cartão ou dinheiro.
* **Desserialização Segura:** Utilização de DTOs para tráfego seguro de dados entre a requisição e a camada de controle.

---

## 🛠️ Padrões de Projeto e Arquitetura

### 1. Strategy Pattern (`payment`)
Para evitar estruturas condicionais extensas (`if/else` ou `switch`) na verificação da forma de pagamento, foi implementada a interface `PagamentoStrategy`. 
* **CartaoCredito:** Implementação que encapsula a lógica de pagamento via cartão.
* **Dinheiro:** Implementação responsável pelo processamento de pagamento em espécie.

### 2. DTO Pattern (`dto`)
A classe `PagamentoRequestDTO` é utilizada para receber os dados das requisições POST (`valor` e `tipo`), garantindo a segurança ao não expor diretamente os modelos internos do sistema.

### 3. REST Standards
Refatoração de rotas para seguir as convenções REST, utilizando o verbo HTTP `@PostMapping` para operações que envolvem envio e processamento de payloads no corpo da requisição (`@RequestBody`).

---

## 💻 Como Executar o Projeto Localmente

### Pré-requisitos
* **Java 21** instalado.
* **Maven** instalado (ou utilizar o wrapper `./mvnw` incluído no projeto).
* **Git** para clonar o repositório.

### Passo a Passo

1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/eduarda-ferr/coffee-api.git](https://github.com/eduarda-ferr/coffee-api.git)
   cd coffee-api/coffee-shop-api

2. Compilar e executar o projeto:

Bash
./mvnw spring-boot:run
A API iniciará por padrão na porta 8080.

🧪 Testando os Endpoints (PowerShell / Terminal)
Você pode testar a API utilizando ferramentas como Postman, Insomnia ou diretamente pelo PowerShell da sua máquina.

Processar Pagamento via Dinheiro (POST)
PowerShell
Invoke-RestMethod -Uri "http://localhost:8080/api/pagamentos/processar" -Method Post -ContentType "application/json" -Body '{"valor": 120.00, "tipo": "DINHEIRO"}'
Processar Pagamento via Cartão (POST)
PowerShell
Invoke-RestMethod -Uri "http://localhost:8080/api/pagamentos/processar" -Method Post -ContentType "application/json" -Body '{"valor": 50.00, "tipo": "CARTAO"}'
🛣️ Próximos Passos e Evolução
O projeto está em constante evolução. As próximas etapas do roadmap incluem:

[ ] Bean Validation: Adicionar validações (@NotNull, @Min, @NotBlank) nos DTOs para impedir dados inválidos na entrada.

[ ] Persistência de Dados (Spring Data JPA): Integrar com banco de dados (H2/PostgreSQL) para salvar pedidos e catálogo de bebidas.

[ ] Tratamento Global de Exceções (@ControllerAdvice): Padronizar o retorno de erros da API em formato JSON.

[ ] Testes Automatizados: Cobertura de testes unitários e de integração utilizando JUnit 5 e Mockito.

👩‍💻 Autora
Desenvolvido por Maria Eduarda Barbosa.


---

### 💡 Como adicionar esse `README.md` no seu projeto:
1. Abra o **IntelliJ IDEA**.
2. Na raiz do projeto `coffee-shop-api`, crie (ou abra) o arquivo `README.md`.
3. Cole o conteúdo acima e salve.
4. No terminal do IntelliJ ou PowerShell, envie a atualização para o GitHub:
   ```powershell
   git add README.md
   git commit -m "docs: adiciona README profissional do projeto"
   git push origin main
