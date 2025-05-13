
![Programação-Formação Java](https://github.com/iasminaraujoc/3355-java-screenmatch-com-jpa/assets/84939115/3c51e000-962d-4dc9-97fc-1d384e2511a2)

# Java: Persistência de Dados e Consultas com Spring Data JPA

**Projeto desenvolvido no segundo curso da formação Avançando com Java da Alura**. O objetivo é evoluir o projeto **Screenmatch**, iniciado no primeiro curso da formação, criando novas funcionalidades e melhorando a arquitetura da aplicação com Spring Data JPA.

---

## 🚧 **Status do Projeto**
Este projeto ainda está em desenvolvimento e pode não estar totalmente funcional ou completo. Atualmente, estamos implementando novas funcionalidades e ajustando o código para melhorar a experiência do usuário e a performance da aplicação.

---

## 🔨 **Objetivos do Projeto**

- Evoluir no projeto **Screenmatch**, iniciado no primeiro curso da formação, criando um **menu interativo** com várias opções.
- Modelar as abstrações da aplicação através de **classes**, **enums**, **atributos** e **métodos**.
- **Consumir a API do ChatGPT** para enriquecer a aplicação com funcionalidades de linguagem natural.
- **Utilizar o Spring Data JPA** para persistir dados no banco, aproveitando os recursos da interface **JPARepository**.
- Trabalhar com o banco de dados **PostgreSQL** para persistência de dados, aprendendo a criar **consultas complexas**.
- Aprofundar no uso de **Spring Data JPA** para facilitar a persistência e consulta de dados no banco.
- **Personalização do Projeto:** Adicionadas funcionalidades como busca de **séries e episódios** via API OMDB e tradução de sinopses de inglês para português com a **API MyMemory**.

---

## 🚀 **Tecnologias Utilizadas**

- **Linguagem:** Java
- **Framework:** Spring Boot
- **Persistência de Dados:** Spring Data JPA, Hibernate
- **Banco de Dados:** PostgreSQL
- **APIs:** OMDB (para busca de séries e episódios), MyMemory (para tradução de sinopses)
- **Gerenciador de Dependências:** Maven
- **Outros:** Lombok, Jackson Databind

---

## 🧑‍💻 **Funcionalidades**

- **Menu Interativo no Terminal:** Permite buscar e listar **séries** e **episódios**, com opções para salvar os dados no banco.
- **Busca de Séries e Episódios:** Utiliza a API do **OMDB** para buscar informações de séries e episódios e exibir no terminal.
- **Tradução Automática de Sinopses:** Sinopses de séries são traduzidas para o **português** utilizando a **API MyMemory**, oferecendo uma experiência mais acessível ao usuário.
- **Persistência de Dados:** Utiliza **Spring Data JPA** para salvar e consultar dados no banco de dados **PostgreSQL**, com consultas dinâmicas e eficientes.

---

## 🧪 **Testes e Uso**

- A interação com a API do OMDB e MyMemory é feita via terminal, e os dados são salvos no banco de dados PostgreSQL.
- A persistência e consulta dos dados é realizada utilizando o **Spring Data JPA**, garantindo uma integração eficiente com o banco.

---

## 🛠️ **Como Executar**

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/Screenmatch.git
   
2. Importe o projeto na sua IDE (IntelliJ IDEA / Eclipse).

3. Configure o banco de dados PostgreSQL com as credenciais corretas.

4. Execute a aplicação utilizando o Spring Boot.

5. Acesse o menu interativo no terminal para buscar e listar séries, e registrar episódios com a funcionalidade de tradução das sinopses.

---

## 👥 **Autor**
Este projeto foi desenvolvido por Enrique Bastos durante os cursos da Alura.

[GitHub](https://github.com/EnriqueAraujoBastos) • [LinkedIn](https://www.linkedin.com/in/enriquearaujobastos/)

---

## 🔗 **Link para o Projeto**
👉 [Acesse o projeto no GitHub](https://github.com/EnriqueAraujoBastos/screenmatch)
