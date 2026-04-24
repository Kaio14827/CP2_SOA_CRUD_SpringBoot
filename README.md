# Checkpoint 2 - Spring Boot CRUD (Pedidos) 

Este projeto consiste em uma aplicação **RESTful API** desenvolvida com **Spring Boot** para gerenciar pedidos (`OrderModel`). O sistema realiza operações completas de CRUD, persistindo os dados em um banco de dados H2 e aplicando validações rigorosas nos campos de entrada.

## 👥 Grupo de Desenvolvimento
- Gustavo Viega Martins Lopes **RM555885**
- Kaio Drago Lima Souza **RM556095**
- Gabriel Guilherme Leste **RM558638**
- Vitor Rivas Cardoso **RM556404**
- Gustavo Yuji **RM555034**

## 🛠️ Tecnologias e Configurações
* **Linguagem:** Java 21
* **SDK:** JDK 21
* **Build Automation:** Maven
* **Dependências Principais:**
    * **Spring Data JPA**: Para mapeamento objeto-relacional e persistência.
    * **Lombok**: Para geração automática de Getters, Setters e Construtores.
    * **H2 Database**: Banco de dados embutido para desenvolvimento.
    * **Validation**: Para validação de restrições nos modelos.
    * **Spring Web**: Para criação dos controladores REST.

## 📋 Regras de Negócio e Validações
* **Identificação**: O `id` é a chave primária, gerada automaticamente pelo banco de dados via auto-incremento.
* **Nome do Cliente**: Campo obrigatório; não pode ser enviado vazio.
* **Data do Pedido**: Atribuída automaticamente com a data atual no momento da persistência, caso seja nula.
* **Valor Total**: Deve ser um valor positivo e não pode ser inferior a 0.0.

## 🚀 Como Utilizar
### 1. Configuração de Ambiente
A aplicação está configurada para rodar na porta **8085**. 
OBS: Mude para a opção "Postman Desktop Agent" caso não consiga rodar a ação dos botões. 

### 2. Endpoints da API
Todos os endpoints respondem através do prefixo `/orders`.

| Operação | Método | URL | Descrição |
| :--- | :--- | :--- | :--- |
| **Criar** | `POST` | `(http://localhost:8085/pedidos)` | Cria um novo pedido com validação de corpo. |
| **Listar** | `GET` | `(http://localhost:8085/pedidos)` | Retorna a lista completa de pedidos. |
| **Buscar** | `GET` | `(http://localhost:8085/pedidos/1` | Busca um pedido específico pelo ID. |
| **Atualizar** | `PUT` | `http://localhost:8085/pedidos/1` | Atualiza nome e valor de um pedido existente. |
| **Deletar** | `DELETE` | `http://localhost:8085/pedidos/1` | Remove um pedido do sistema por ID. |

### 3. Console do Banco de Dados H2
A interface gráfica do banco de dados pode ser acessada enquanto a aplicação estiver em execução:
* **URL:** `http://localhost:8085/h2-console `
* **JDBC URL:** `jdbc:h2:file:~/testdb`
* **User:** `sa`
* **Password:** `password`

---
**Nota Técnica:** O projeto utiliza a anotação `@Table(name = "Pedidos")` para mapear a entidade especificamente no banco de dados. A estrutura do banco é atualizada automaticamente conforme as alterações no modelo.


## 📸 PrintsScreens dos testes na API (Postman)
### 1. **POST** (Criar pedido)
<img width="1919" height="1079" alt="Screenshot 2026-04-24 191410" src="https://github.com/user-attachments/assets/44b8b167-c009-411a-828d-9290069edd29" />

### 2. **GET** (Listar pedido)
<img width="1919" height="1079" alt="Screenshot 2026-04-24 191518" src="https://github.com/user-attachments/assets/95d0e42c-3eeb-428d-addd-3fee4add7854" />

### 3. **GET id** (Buscar pedido)
<img width="1919" height="1079" alt="Screenshot 2026-04-24 191725" src="https://github.com/user-attachments/assets/ad47bf23-3892-4019-a40f-c0c8b6c93b09" />

### 4. **PUT** (Atualizar pedido)
<img width="1919" height="1079" alt="Screenshot 2026-04-24 191815" src="https://github.com/user-attachments/assets/49b3a37f-fdbf-4f03-ad16-c52c0a52016e" />

### 5. **DELETE** (Deletar pedido)
<img width="1919" height="1079" alt="Screenshot 2026-04-24 191916" src="https://github.com/user-attachments/assets/fb4b2022-9bf4-42d6-a380-b3d8a8dfa6b1" />
