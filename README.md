# Estudos Iniciais de Desenvolvimento Java para API RESTful

Este diretório contém exemplos práticos e comentados para o aprendizado dos conceitos fundamentais do desenvolvimento de APIs RESTful utilizando Java com Spring Boot.

## Conteúdo já implementado

- **Estruturação de um projeto Spring Boot com Maven**
- **Criação de controladores REST** usando a anotação `@RestController`
- **Mapeamento de rotas HTTP** com `@RequestMapping` e `@PathVariable`
- **Operações matemáticas básicas** via endpoints:
    - Soma (`/math/sum/{numUm}/{numDois}`)
    - Subtração (`/math/subtraction/{numUm}/{numDois}`)
    - Multiplicação (`/math/multiplication/{numUm}/{numDois}`)
    - Divisão (`/math/division/{numUm}/{numDois}`) — resultado limitado a 4 casas decimais
    - Média aritmética (`/math/average/{numUm}/{numDois}`) — resultado limitado a 4 casas decimais
    - Raiz quadrada (`/math/sqr/{numUm}`) — resultado limitado a 4 casas decimais
- **Validação de parâmetros** para garantir que apenas números válidos sejam processados
- **Tratamento de exceções personalizadas** para respostas mais claras em caso de erro de entrada

## Objetivo

O objetivo deste projeto é servir como base para quem está começando no desenvolvimento backend com Java, mostrando na prática como criar, estruturar e documentar APIs RESTful, além de aplicar boas práticas de validação e tratamento de erros.

## Como executar

1. Certifique-se de ter o Java e o Maven instalados.
2. Execute o projeto.
3. Acesse os endpoints via navegador ou ferramentas como Postman.

Sinta-se à vontade para explorar, modificar e evoluir os exemplos conforme seu aprendizado!