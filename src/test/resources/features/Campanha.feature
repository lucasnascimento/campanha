#language:pt
Funcionalidade: Manutenção de Campanhas
  Contexto: No sistema de gestão de campanhas devemos conseguir inserir uma nova campanha
    Só serão campanhas válidas campanhas com nome maior que 3 caracteres e que tenham percentual de desconto entre 0 e 20%
  Delineacao do Cenario: Cadastro de novas campanhas
    Dado que o usuário esteja logado
    E tenha a permissão a permissão "INSERIR_CAMPANHA"
    Quando o usuário inserir a capanha "<nome_campanha>"
    E com o percentual de desconto de "<percentual_desconto>"
    Então a nova campanha o retorno do sistema será "<codigo_retorno>"
    Exemplos:
      |nome_campanha|percentual_desconto|codigo_retorno|
      |null         |10                 |400           |
      |ab           |21                 |400           |
      |abcd         |21                 |400           |
      |Black Friday |10                 |200           |
      |Campanha     |0                  |200           |
