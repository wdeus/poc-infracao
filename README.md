# poc-infracao

Este projeto foi desenvolvido seguindo os princípios da Arquitetura Hexagonal (também conhecida como Arquitetura de Portas e Adaptadores). A ideia principal dessa arquitetura é permitir que a lógica de negócio seja isolada e independente de detalhes técnicos, como frameworks, interfaces de usuário ou infraestruturas externas. O foco é na separação de responsabilidades e facilidade para troca de componentes externos sem impactar o núcleo do sistema.

A arquitetura é dividida em três pilares principais, representados pelos packages: core, inbound e outbound.

Estrutura do Projeto

# 1. Core
O package core é o coração da aplicação. Ele contém toda a lógica de negócio, as regras de domínio e as entidades principais do sistema. O objetivo é garantir que essa camada seja completamente agnóstica a quaisquer detalhes de implementação externa, tornando-a altamente testável e reutilizável.

# 2. Inbound
O package inbound é responsável por lidar com todas as interações que entram na aplicação. Ele funciona como uma "porta de entrada" e pode conter controladores, listeners, gateways ou quaisquer componentes que recebem dados de fontes externas.

# 3. Outbound
O package outbound lida com todas as interações com sistemas externos. Ele atua como uma "porta de saída", buscando ou enviando informações para fora do sistema, como bancos de dados, sistemas de mensageria, APIs externas, entre outros.

Aqui estão implementadas as interfaces definidas no core, de modo que os detalhes da infraestrutura e de persistência fiquem isolados. Dessa forma, se algum componente externo precisar ser substituído (ex: trocar o banco de dados ou o sistema de mensageria), o impacto no core será mínimo.


