# Sistema de Farmácia

Projeto desenvolvido em Java com foco no gerenciamento de uma farmácia, permitindo controle de clientes, funcionários, fornecedores, medicamentos, usuários e vendas.

## Descrição

O sistema foi criado para automatizar processos básicos de uma farmácia, organizando informações de estoque, vendas e cadastros.

Possui autenticação de usuários com níveis de acesso e geração de relatórios simples para controle interno.

## Funcionalidades

### Login
- Autenticação de usuários
- Controle de nível de acesso

Login padrão:
```text
Login: admin
Senha: 123
```

---

## CRUDs Implementados

### Cliente
- Cadastrar cliente
- Listar clientes
- Atualizar cliente
- Excluir cliente

### Fornecedor
- Cadastrar fornecedor
- Listar fornecedores
- Atualizar fornecedor
- Excluir fornecedor

### Funcionário
- Cadastrar funcionário
- Listar funcionários
- Atualizar funcionário
- Excluir funcionário

### Usuário
- Cadastrar usuário
- Listar usuários
- Atualizar usuário
- Excluir usuário

### Medicamento
- Cadastrar medicamento
- Listar medicamentos
- Excluir medicamento

### Venda
- Registrar venda
- Listar vendas
- Atualizar venda
- Excluir venda

---

## Relatórios
- Relatório de estoque
- Relatório de vendas
- Produtos vencidos
- Lucro mensal

---

## Arquitetura do Projeto

O projeto foi organizado em camadas:

### Model
Responsável pelas entidades do sistema:
- Cliente
- Fornecedor
- Funcionário
- Medicamento
- Usuário
- Venda

### Service
Responsável pelas regras de negócio e CRUD:
- ClienteService
- FornecedorService
- FuncionarioService
- MedicamentosService
- UsuarioService
- VendaService

### Main
Responsável pela interação com usuário:
- menus
- login
- navegação do sistema

---

## Tecnologias Utilizadas
- Java
- Programação Orientada a Objetos (POO)
- ArrayList
- Scanner
- IntelliJ IDEA

---

## Estrutura do Projeto

```text
src
├── Main.java
├── Model
│   ├── Cliente.java
│   ├── Fornecedor.java
│   ├── Funcionario.java
│   ├── Medicamento.java
│   ├── Usuario.java
│   └── Venda.java
└── Service
    ├── ClienteService.java
    ├── FornecedorService.java
    ├── FuncionarioService.java
    ├── MedicamentoService.java
    ├── UsuarioService.java
    └── VendaService.java

---

## Autor
Carlos Eduardo Gomes Filho
