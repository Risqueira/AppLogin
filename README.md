# 📱 Projeto Android - Sistema de Login com SQLite

Aplicação Android desenvolvida em Java utilizando SQLite para realizar cadastro e autenticação de usuários.

O sistema possui:

* Tela inicial
* Cadastro de usuários
* Login de autenticação
* Banco de dados SQLite
* Navegação entre telas
* Botão voltar nas telas de login e cadastro

---

# 🚀 Tecnologias Utilizadas

* Java
* Android Studio
* SQLite
* AndroidX
* ConstraintLayout

Dependências utilizadas:

```gradle
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
```

---

# 📂 Estrutura do Projeto

```text
app/
├── java/
│   └── br/com/senac/appLogin/
│       ├── MainActivity.java
│       ├── LoginActivity.java
│       ├── RegistrarActivity.java
│       └── DBHelper.java
│
├── res/
│   ├── layout/
│   │   ├── activity_main.xml
│   │   ├── activity_login.xml
│   │   └── activity_registrar.xml
│
└── AndroidManifest.xml
```

---

# 🖥️ Funcionalidades do Sistema

## ✅ Tela Inicial

A tela principal possui:

* Botão Entrar
* Botão Registrar
* Navegação entre telas

O usuário escolhe entre:

* Realizar login
* Criar novo cadastro

---

## ✅ Cadastro de Usuário

Na tela de cadastro o sistema permite:

* Inserir nome
* Inserir login
* Inserir senha
* Confirmar senha

Validações implementadas:

* Campos vazios
* Confirmação de senha
* Inserção no banco de dados

---

## ✅ Login de Usuário

A tela de login realiza:

* Validação do usuário
* Verificação da senha
* Autenticação no SQLite

---

## ✅ Banco de Dados SQLite

Banco utilizado:

```text
BancoDados.db
```

Tabela criada:

```sql
CREATE TABLE utilizador(
    username TEXT PRIMARY KEY,
    password TEXT
);
```

---

# 🗄️ Classe DBHelper

Classe responsável por:

* Criar banco de dados
* Criar tabela
* Inserir usuários
* Validar login

Métodos implementados:

| Método            | Função               |
| ----------------- | -------------------- |
| onCreate()        | Criação da tabela    |
| onUpgrade()       | Atualização do banco |
| criarUtilizador() | Cadastro do usuário  |
| validarLogin()    | Autenticação         |

---

# 🔐 Fluxo de Autenticação

## Cadastro

```text
Usuário → Cadastro → SQLite
```

---

## Login

```text
Usuário → Login → Validação SQLite
```

---

# 🔙 Botão Voltar

Foi implementado um botão de retorno nas telas:

* LoginActivity
* RegistrarActivity

O botão retorna para:

```text
MainActivity
```

Código utilizado:

```java
btVoltar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(
                RegistrarActivity.this,
                MainActivity.class
        );

        startActivity(intent);
    }
});
```

A mesma lógica pode ser aplicada em:

```java
LoginActivity
```

---

# 📱 Telas do Sistema

## 🏠 MainActivity

Tela inicial do sistema.

Componentes sugeridos:

* Logo
* Imagens
* Botões personalizados
* Background personalizado

Botões:

* Entrar
* Registrar

---

## 📝 RegistrarActivity

Tela responsável pelo cadastro.

Campos:

* Nome
* Usuário
* Senha
* Confirmar senha

Botões:

* Salvar
* Voltar

---

## 🔐 LoginActivity

Tela responsável pela autenticação.

Campos:

* Login
* Senha

Botões:

* Entrar
* Voltar
