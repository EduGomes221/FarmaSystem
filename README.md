# 💊 Sistema de Farmácia

Projeto desenvolvido em Java com foco no gerenciamento de uma farmácia, permitindo controle completo de clientes, funcionários, fornecedores, medicamentos, usuários e vendas.

---

## 📌 Descrição

O sistema foi criado para automatizar processos internos de uma farmácia, organizando informações de estoque, vendas e cadastros.

Conta com autenticação de usuários, controle de acesso e relatórios simples para facilitar a administração do negócio.

---

## 🚀 Funcionalidades

### 🔐 Login

Autenticação de usuários com controle de acesso.

**Login padrão:**

- Usuário: `admin`
- Senha: `123`

---

## 📋 CRUDs Implementados

### 👤 Cliente

- Cadastrar cliente
- Listar clientes
- Atualizar cliente
- Excluir cliente

### 🚚 Fornecedor

- Cadastrar fornecedor
- Listar fornecedores
- Atualizar fornecedor
- Excluir fornecedor

### 👨‍💼 Funcionário

- Cadastrar funcionário
- Listar funcionários
- Atualizar funcionário
- Excluir funcionário

### 👥 Usuário

- Cadastrar usuário
- Listar usuários
- Atualizar usuário
- Excluir usuário

### 💊 Medicamento

- Cadastrar medicamento
- Listar medicamentos
- Excluir medicamento

### 🛒 Venda

- Registrar venda
- Listar vendas
- Atualizar venda
- Excluir venda

---

## 📊 Relatórios

- Relatório de estoque
- Relatório de vendas
- Produtos vencidos
- Lucro mensal

---

## 🏗️ Arquitetura do Projeto

O sistema foi organizado utilizando separação por camadas para facilitar manutenção e organização do código.

### 📁 Model

Responsável pelas entidades do sistema:

- Cliente
- Fornecedor
- Funcionario
- Medicamento
- Usuario
- Venda

---

### ⚙️ Service

Responsável pelas regras de negócio e operações CRUD:

- ClienteService
- FornecedorService
- FuncionarioService
- MedicamentoService
- UsuarioService
- VendaService

---

### 🎮 Controller

Responsável por receber ações do usuário e intermediar a comunicação entre o menu e a camada de serviço:

- ClienteController
- FornecedorController
- FuncionarioController
- MedicamentoController
- UsuarioController
- VendaController

---

### 🖥️ Main

Responsável pela execução do sistema:

- Inicialização
- Menus
- Login
- Navegação

---

## 🛠️ Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- ArrayList
- Scanner
- IntelliJ IDEA

---

## 📂 Estrutura do Projeto

```bash
src
├── Main.java
│
├── Model
│   ├── Cliente.java
│   ├── Fornecedor.java
│   ├── Funcionario.java
│   ├── Medicamento.java
│   ├── Usuario.java
│   └── Venda.java
│
├── Controller
│   ├── ClienteController.java
│   ├── FornecedorController.java
│   ├── FuncionarioController.java
│   ├── MedicamentoController.java
│   ├── UsuarioController.java
│   └── VendaController.java
│
└── Service
    ├── ClienteService.java
    ├── FornecedorService.java
    ├── FuncionarioService.java
    ├── MedicamentoService.java
    ├── UsuarioService.java
    └── VendaService.java
```

---

## 👨‍💻 Autor

**Carlos Eduardo Gomes Filho**

🎓 Estudante de Ciência da Computação  
💻 Desenvolvedor Java  

---

## 📄 Licença

Este projeto está sob a licença MIT.
