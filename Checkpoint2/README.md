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

### 2. Endpoints da API
Todos os endpoints respondem através do prefixo `/orders`.

| Operação | Método | URL | Descrição |
| :--- | :--- | :--- | :--- |
| **Criar** | `POST` | `/orders` | Cria um novo pedido com validação de corpo. |
| **Listar** | `GET` | `/orders` | Retorna a lista completa de pedidos. |
| **Buscar** | `GET` | `/orders/{id}` | Busca um pedido específico pelo ID. |
| **Atualizar** | `PUT` | `/orders/{id}` | Atualiza nome e valor de um pedido existente. |
| **Deletar** | `DELETE` | `/orders/{id}` | Remove um pedido do sistema por ID. |

### 3. Console do Banco de Dados H2
A interface gráfica do banco de dados pode ser acessada enquanto a aplicação estiver em execução:
* **URL:** `http://localhost:8085/h2-console`
* **JDBC URL:** `jdbc:h2:file:~/testdb`
* **User:** `sa`
* **Password:** `password`

---
**Nota Técnica:** O projeto utiliza a anotação `@Table(name = "Pedidos")` para mapear a entidade especificamente no banco de dados. A estrutura do banco é atualizada automaticamente conforme as alterações no modelo.
