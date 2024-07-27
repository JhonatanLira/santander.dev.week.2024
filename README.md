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
    
    class BankAccount {
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
    
    User --> BankAccount
    User --> Feature
    User --> Card
    User --> News

```

