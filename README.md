# Sistema-de-Gest-o-de-Biblioteca
Um sistema que permita o gerenciamento
de livros, usuários e empréstimos em uma biblioteca.
Funcionalidades:
● Classes:
  ○ Livro: título, autor, ISBN, disponibilidade.
  ○ Usuário: nome, ID, histórico de empréstimos.
  ○ Funcionário: herda de Usuário, com permissões
  adicionais.
  ○ Empréstimo: data de empréstimo, data de
  devolução, status.
● Conceitos de POO:
  ○ Herança: Funcionário herda de Usuário.
  ○ Polimorfismo: métodos como
  acessarSistema() com comportamentos
  diferentes para Usuário e Funcionário.
  ○ Encapsulamento: controle de acesso aos
  atributos dos livros e usuários.
  ○ Abstração: interface Notificável para envio de
  notificações por email ou SMS.
