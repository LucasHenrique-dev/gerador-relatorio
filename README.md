# ⚙️📊 Gerador Gráfico de Relatório

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

## ℹ Tabela de Conteúdos
- [Descrição do Projeto](#dart-projeto-da-cadeira-de-compiladores-20222)
- [Especificações](#-especificações-do-projeto)
- [Protótipo do Projeto - Figma](https://www.figma.com/proto/hDs7IpLgYHRi0fEVKPUU5L/PROJETO-DSL?node-id=31-4&scaling=min-zoom&page-id=0%3A1&starting-point-node-id=31%3A4)

## :dart: Projeto da Cadeira de Compiladores 2022.2

O projeto se propõe a criar uma DSL (Domain Specific Language). A atividade contribuirá para a consolidação da aprendizagem teórica da disciplina, onde iremos implementar o Frontend e Backend de uma linguagem. 

<div align="center">

  ![Tela Inicial do Gerador](images/tela-inicial-gerador.png)
  </br>
  ![Tela de Consultas do Gerador](images/tela-consultas-gerador.png)
</div>

> Telas da Linguagem de Domínio Específico.

## 📃 Especificações do Projeto

Especificações incluem:
- Frontend do Compilador
- Backend do Compilador

Visualize as especificações do projeto: [Especificações Gerador Gráfico de Relatório](especificacoes)

## ☕ Como Usar a DSL no Codespaces

Para usar a DSL, siga estas etapas:

1. Crie um codespace:
    * Texto
1. Compilar a descrição da linguagem fonte:
    * Use o seguinte comando
      ```shell
      java -jar antlr.jar -o src-gen GeradorRelatorio.g4
      ```
1. Compilar programas em Java:
   * Use o seguinte comando
      ```shell
      javac -cp antlr.jar:. -d classes src/*.java src-gen/*.java
      ```
 1. Executar o programa:
     * Use o seguinte comando
     ```shell
      java -cp antlr.jar:classes Main
      ```

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE) para mais detalhes.

[⬆ Voltar ao topo](#%EF%B8%8F-gerador-gráfico-de-relatório)<br>
