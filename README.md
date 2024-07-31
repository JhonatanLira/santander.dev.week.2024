# Bootcamp Santander Backend 2024

## Diagrama de classes

```mermaid  <!--https://mermaid.js.org/ -->
classDiagram
    class User {
        - String name
        - BankAccount account
        - Feature features
        - Card card
        - News news
    }
    
    class Account {
        - String accountNumber
        - String accountAgency
        - float accountBalance
        - float accountLimit
    }
    
    class Feature {
        - String icon
        - String description
    }
    
    class Card {
        - String cardNumber
        - float cardLimit
    }
    
    class News {
        - String icon
        - String description
    }
    
    User"1" *--"1" Account
    User"1" *--"N" Feature
    User"1" *--"1" Card
    User"1" *--"N" News

```

## Banco H2
<a href="http://localhost:8080/h2-console/" target="_blank">Banco H2</a>


## Swagger 
<a href="http://localhost:8080/swagger-ui/index.html"> Swagger</a>
