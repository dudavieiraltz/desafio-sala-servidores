# 🔐 Desafio — Testando a Regra de Acesso à Sala

Projeto desenvolvido durante os estudos de **QA e Testes Automatizados**, com o objetivo de validar as regras de acesso a uma sala de servidores.

## 📋 Sobre o projeto

O sistema gerencia solicitações de acesso à sala de servidores.

Para que o acesso seja concedido, o funcionário precisa atender **todas as regras de negócio**:

- Possuir o cargo de **Técnico de Infraestrutura** ou **Administrador de Sistemas**;
- Solicitar entrada entre **7h e 19h**, inclusive;
- Não estar presente na **lista de bloqueio**.

Quando alguma regra não é atendida, o acesso é negado e o sistema apresenta a justificativa.

## 🧪 Testes automatizados

Foram criados **9 testes automatizados** utilizando JUnit.

| ID | Cenário | Resultado esperado |
|---|---|---|
| CT-01 | Técnico às 8h | Acesso concedido |
| CT-02 | Técnico às 6h | Acesso negado |
| CT-03 | Entrada exatamente às 7h | Acesso concedido |
| CT-04 | Administrador exatamente às 19h | Acesso concedido |
| CT-05 | Entrada às 20h | Acesso negado |
| CT-06 | Funcionário bloqueado | Acesso negado |
| CT-07 | Administrador às 10h | Acesso concedido |
| CT-08 | Cargo não permitido | Acesso negado |
| CT-09 | Funcionário bloqueado com outras regras inválidas | Acesso negado |

### 🔎 Tipos de validação realizados

- Testes de regras de negócio;
- Testes de condição **OR** para os cargos permitidos;
- Testes de condição **AND** entre as regras de acesso;
- Testes de valores-limite;
- Validação de acesso permitido;
- Validação de acesso negado;
- Validação de funcionário bloqueado.

## 🛠️ Tecnologias utilizadas

- **Java**
- **JUnit 5**
- **Maven**
- **Git**
- **GitHub**
- **VS Code**

## ▶️ Como executar os testes

### Pré-requisitos

É necessário ter o Java e o Maven instalados.

### Executar os testes

Na pasta do projeto, execute:

```bash
mvn test