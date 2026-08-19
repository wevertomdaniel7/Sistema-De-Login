# Sistema de Login

Um simples sistema de autenticação desenvolvido em Java que permite cadastro e login de usuários.

## 📋 Funcionalidades

- **Cadastro de Usuário**: Registre um novo usuário com nome de usuário e senha
- **Login**: Autentique-se com um usuário e senha já cadastrados
- **Validação**: Verifica se as credenciais inseridas correspondem aos dados cadastrados
- **Menu Interativo**: Interface simples via linha de comando

## 🚀 Como Usar

1. Compile o arquivo Java:
   ```
   javac SistemaLogin.java
   ```

2. Execute o programa:
   ```
   java SistemaLogin
   ```

3. Escolha uma das opções do menu:
   - Digite **1** para cadastrar um novo usuário
   - Digite **2** para fazer login
   - Digite **3** para sair do sistema

## 💡 Exemplo de Uso

```
===== SISTEMA DE LOGIN =====
1 - Cadastrar usuário
2 - Fazer login
3 - Sair
Escolha uma opção: 1

--- CADASTRO ---
Digite um usuário: joao
Digite uma senha: senha123
Usuário cadastrado com sucesso!
```

## 📝 Detalhes Técnicos

- Linguagem: Java
- Entrada: Scanner (console)
- Armazenamento: Variáveis em memória (dados perdidos ao encerrar)

## ⚠️ Notas

- Os dados são armazenados em memória e serão perdidos quando o programa for encerrado
- Apenas um usuário por sessão pode ser cadastrado
- A senha é armazenada em texto simples (não é recomendado em aplicações reais)
