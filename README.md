# BootCampIBM

Quero que vocês apliquem os conhecimentos de projeto Spring adquiridos no bootcamp e exponham essa mesma regra de negócio em API Rest.


Endpoints:

POST /jogador
Body: {nome: “Nome Sobrenome”}
Retorno esperado: 2xx OK com body vazio

GET /times
Retorno esperado: 2xx OK com body:
{
“time1”: [“Nome Sobrenome”, “Nome Sobrenome”, “Nome Sobrenome”],
“time2”: [“Nome Sobrenome”, “Nome Sobrenome”]
}

DELETE /jogador/all
Retorno esperado: 2xx OK com body vazio

Testarei com script de forma similar ao teste unitário. Ao chamar o endpoint de delete, a “base” é esvaziada para começar a
montar novos times. O POST vai incluindo jogador, de um em um. E o GET traz os times até o momento com os jogadores já recebidos.

O requisito é que a aplicação suba sem nenhuma dependência externa. Então banco de dados em memória ou mesmo salvar os 
dados em uma variável é o mais sensato.


Forma de entrega: Link para projeto público no GitHub.



Eu também gostaria de ver, mas não vou exigir:

- Hospedar o projeto em algum serviço de cloud

- ~~Fazer frontend em React ou AngularJS.~~