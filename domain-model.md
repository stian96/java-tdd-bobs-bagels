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

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

The following class will be used in all the user stories.

| Class    | Members   | Types                  |
|----------|-----------|------------------------|
| `Basket` | `items`   | `Map<String, Integer>` |
|          | `MAX`     | `Integer`              |


| User Story | Methods                               | Return    | Notes         |
|------------|---------------------------------------|-----------|---------------|
| 1          | `addBagel(String type, int quantity)` | `void`    |               |
| 2          | `removeBagel(String type)`            | `void`    |               |
| 3          | `hasCapacity()`                       | `boolean` | Max limit (5) |
| 4          | `changeBasketCapacity(int limit)`     | `void`    |               |




