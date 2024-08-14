## Domain Model for User Story 1

User story:
```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Classes  | Members | Types                  | Methods                               |
|----------|---------|------------------------|---------------------------------------|
| `Basket` | `items` | `Map<String, Integer>` | `addBagel(String type, int quantity)` |
|          |         |                        |                                       |
