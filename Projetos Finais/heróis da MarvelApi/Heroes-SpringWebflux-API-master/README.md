Api feito para criação de Heroes junto com o DynamoDB

Executar dynamo: 
 java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb
 
 aws dynamodb list-tables --endpoint-url http://localhost:8000


swagger: http://localhost:8080/swagger-ui-heroes-reactive-api.html
