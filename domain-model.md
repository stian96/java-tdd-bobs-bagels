## Domain Model for User Stories

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

| User Story | Classes  | Members | Types                  | Methods                               |
|------------|----------|---------|------------------------|---------------------------------------|
| 1          | `Basket` | `items` | `Map<String, Integer>` | `addBagel(String type, int quantity)` |
| 2          | `Basket` | `items` | `Map<String, Integer>` | `removeBagel(String type)`            |



