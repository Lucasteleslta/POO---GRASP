# Sistema de Pedidos em Java - Aplicação de Princípios GRASP

## Descrição do Projeto

Este projeto consiste em uma aplicação simples desenvolvida em Java com o objetivo de demonstrar a aplicação prática de princípios GRASP (General Responsibility Assignment Software Patterns).

O sistema simula a criação de um pedido contendo um produto e calcula o valor total com base na quantidade.

---

## Objetivo

Aplicar conceitos de boas práticas de desenvolvimento orientado a objetos, utilizando princípios GRASP para melhorar organização, manutenção e clareza do código.

---

## Princípios GRASP Utilizados

### 1. Creator (Criador)

* Onde foi aplicado: Classe `Pedido`
* Justificativa:
  A classe `Pedido` recebe um objeto `Produto` e é responsável por utilizá-lo diretamente. Portanto, ela é considerada adequada para ser responsável pela criação e associação desse objeto, seguindo o padrão Creator.

---

### 2. Controller (Controlador)

* Onde foi aplicado: Classe `SistemaPedidosController`
* Justificativa:
  A classe `SistemaPedidosController` centraliza as operações do sistema, como a criação de pedidos e exibição de resultados, atuando como intermediária entre a classe principal (`Main`) e as classes de domínio.

---

## Estrutura do Sistema

* `Produto` → Representa um produto com nome e preço
* `Pedido` → Representa um pedido e calcula o valor total
* `SistemaPedidosController` → Controla o fluxo da aplicação
* `Main` → Classe principal que executa o sistema

---

## Princípios de Qualidade Aplicados

### Baixo Acoplamento (Low Coupling)

A classe `Main` não depende diretamente das classes `Produto` e `Pedido`, apenas do Controller, reduzindo dependências.

### Alta Coesão (High Cohesion)

Cada classe possui uma responsabilidade bem definida:

* Produto → Dados
* Pedido → Lógica de cálculo
* Controller → Coordenação

---

## Como Executar

1. Compilar o código:

```
javac Main.java
```

2. Executar:

```
java Main
```

---

## Saída Esperada

```
Total do pedido: R$ 6000.0
```

---

## Conclusão

O uso dos princípios GRASP permitiu a construção de um sistema simples, porém bem estruturado, com responsabilidades claras e fácil manutenção, demonstrando boas práticas de programação orientada a objetos.

