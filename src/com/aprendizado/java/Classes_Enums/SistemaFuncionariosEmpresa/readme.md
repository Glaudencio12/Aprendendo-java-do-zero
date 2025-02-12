# Gerenciamento de funcionários

## Objetivo:
Criar um sistema para gerenciar funcionários de uma empresa, utilizando classes enum para representar cargos e departamentos. O sistema deve demonstrar o uso de arrays, blocos de inicialização, membros estáticos e membros finais.

### Classes:

#### Cargo (Enum):

- Definir os cargos: GERENTE, ANALISTA, DESENVOLVEDOR, ESTAGIARIO.
- Cada cargo deve ter um salário base associado.
- Implementar um método para retornar o salário base do cargo.

#### Departamento (Enum):

- Definir os departamentos: TI, RH, FINANCEIRO, MARKETING.
- Cada departamento deve ter um nome abreviado associado (ex: TI para "Tecnologia da Informação").
- Implementar um método para retornar o nome completo do departamento.

#### Funcionario (Class):

- Atributos: nome, cargo (enum), departamento (enum), salário (calculado).
- Construtor para inicializar nome, cargo e departamento.
- Método para calcular o salário:
    - O salário base do cargo é o ponto de partida.
    - O salário é acrescido de um bônus de 10% se o funcionário for do departamento de TI.
    - O salário é acrescido de um bônus de 5% se o funcionário for GERENTE.
    - Método para exibir as informações do funcionário (nome, cargo, departamento, salário).

#### Empresa (Class):

- Atributo: nome da empresa (final).
- Atributo estático: array de funcionários.
- Bloco de inicialização estático: criar alguns funcionários e adicioná-los ao array.
- Método estático para exibir a lista de funcionários.

