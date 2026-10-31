# Projeto Calculadora — FinançApp

Projeto acadêmico desenvolvido com foco em Qualidade de Software, Testes, Refatoração, Documentação e Versionamento.

## 1. Identificação do Projeto

- **Projeto:** Projeto Calculadora
- **Contexto:** FinançApp
- **Aluno:** Andresa Cristina Najarro de Campos
- **RA:** 251538
- **Curso:** Análise e Desenvolvimento de Sistemas
- **Disciplina:** UX/UI
- **Professor:** Prof. Ohata
- **Semestre:** 2026.2

## 2. Visão Geral

O projeto consiste no desenvolvimento de um módulo de cálculos matemáticos básicos em Java para a startup fictícia FinançApp.

O módulo foi desenvolvido com o objetivo de ser utilizado futuramente em funcionalidades de controle financeiro, como:

- orçamento mensal;
- divisão de despesas;
- projeções financeiras;
- cálculos auxiliares.

Além do funcionamento correto das operações, o projeto aplica práticas de qualidade de software relacionadas a testes, tratamento de erros, refatoração, documentação e versionamento.

## 3. Problema

Durante o desenvolvimento da aplicação FinançApp, foi identificada a necessidade de criar um módulo matemático reutilizável. A equipe definiu que o módulo não deveria apenas funcionar corretamente, mas também apresentar:

- código legível;
- testes automatizados;
- tratamento de falhas;
- documentação técnica;
- controle de versões;
- facilidade de manutenção.

## 4. Objetivo

### 4.1 Objetivo Geral

Desenvolver uma calculadora em Java aplicando práticas de qualidade, testes, documentação, refatoração e versionamento.

### 4.2 Objetivos Técnicos

- implementar operações matemáticas básicas;
- tratar entradas inválidas;
- impedir divisão por zero;
- desenvolver testes automatizados;
- refatorar o código sem alterar seu comportamento;
- documentar classes e métodos com JavaDoc;
- gerar documentação HTML;
- utilizar Git e GitHub;
- organizar commits e branches;
- manter documentação técnica no README.

## 5. Escopo Funcional

| ID   | Funcionalidade        | Descrição                          | Status |
|------|-----------------------|------------------------------------|--------|
| RF01 | Soma                  | Soma dois números inteiros         | ok     |
| RF02 | Subtração             | Subtrai dois números inteiros      | ok     |
| RF03 | Multiplicação         | Multiplica dois números inteiros   | ok     |
| RF04 | Divisão               | Divide dois números inteiros       | ok     |
| RF05 | Validação de divisão  | Impede divisão por zero            | ok     |
| RF06 | Operação inválida     | Trata operadores não suportados    | ok     |

## 6. Requisitos Não Funcionais

| ID    | Categoria      | Requisito                                                        |
|-------|----------------|------------------------------------------------------------------|
| RNF01 | Qualidade      | O código deve possuir organização e legibilidade                 |
| RNF02 | Testabilidade  | As operações devem possuir testes automatizados                  |
| RNF03 | Manutenção     | O código deve permitir refatoração sem alteração funcional       |
| RNF04 | Documentação   | Classes e métodos devem possuir JavaDoc                          |
| RNF05 | Versionamento  | O projeto deve utilizar Git e GitHub                             |
| RNF06 | Confiabilidade | Erros não devem interromper inesperadamente a execução           |

## 7. Tecnologias Utilizadas

| Tecnologia   | Versão | Utilização                    |
|--------------|--------|-------------------------------|
| Java         | 17     | Desenvolvimento               |
| JDK          | 17     | Compilação                    |
| Git          | 2.x    | Controle de versão            |
| GitHub       | —      | Repositório remoto            |
| JavaDoc      | —      | Documentação                  |
| VS Code      | 1.x    | Ambiente de desenvolvimento   |

## 8. Estrutura do Projeto

```text
projeto_calculadora/
├── src/calculadora/Calculadora.java
├── test/calculadora/TesteCalculadora.java
├── docs/index.html
├── images/
│   ├── javadoc/
│   ├── refatoracao/
│   └── testes/
├── README.md
└── .gitignore
```
## 9. Explicação das Operações

| Operador | Operação | Exemplo | Resultado |
|---|---|---|---|
| + | Soma | calc(2, 3, "+") | 5 |
| - | Subtração | calc(5, 3, "-") | 2 |
| * | Multiplicação | calc(4, 3, "*") | 12 |
| / | Divisão | calc(10, 2, "/") | 5 |
| / com b=0 | Divisão por zero | calc(10, 0, "/") | exceção |
| inválido | Operação inválida | calc(1, 1, "%") | exceção |

## 10. Testes Unitários
A classe TesteCalculadora.java cobre soma, subtração, multiplicação, divisão, divisão por zero e operações inválidas. Cada teste exibe entrada, resultado esperado e resultado obtido.

Prints da execução dos testes
![Execução dos testes](images/testes/Teste.Calculadora.png)

## 11. Refatoração
Foi criada a branch Refatoracao, onde o código foi reorganizado com extração de métodos (somar, subtrair, etc.), melhoria nos nomes de variáveis e simplificação de condicionais com switch expression.
![Refatoração](images/refatoracao/Print_refatoracao.png)

## 12. Documentação JavaDoc
Gerada com o comando javadoc -d docs -sourcepath src -subpackages calculadora -author -version.

![JavaDoc index](images/javadoc/Javadoc.index.pngindex.png)
![JavaDoc index](images/javadoc/Index.png)

## 13. Como Executar

1- Clone o repositório:
git clone https://github.com/AndresaNajarro/projeto_calculadora.git

2- compile os arquivos:
javac -d out src/calculadora/*.java test/calculadora/*.java

3- Execute os testes:
java -cp out calculadora.TesteCalculadora

4- Abra a documentação no navegador abrindo o arquivo docs/index.html.

## 14. Link do Repositório
🔗 https://github.com/AndresaNajarro/projeto_calculadora

## 15. Conclusão
O projeto cumpriu os objetivos propostos ao implementar uma calculadora funcional em Java com tratamento de erros, testes unitários, refatoração, documentação JavaDoc e versionamento via Git/GitHub, demonstrando na prática a aplicação de boas práticas de qualidade de software.