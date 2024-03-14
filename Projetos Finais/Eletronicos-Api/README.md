# Eletronicos_DIO
Projetos Finais da DIO com Java usando API Rest usando Spring WebFlux e usando o banco DynamoDb localmente para armazenar nossos dados e realizar testes unitários da sua API com Junit e como gerar documentações simples por meio do Postman e também do Swagger.


## Executar dynamo: 

 java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
 
 aws dynamodb list-tables --endpoint-url http://localhost:8000


swagger: http://localhost:8080/swagger-ui-eletronicos-reactive-api.html

