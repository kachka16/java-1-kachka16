# Скріншоти виконання роботи

## Завдання 1

> Створити в пакеті **domain** клас **Сustomer** з приватними атрибутами: **ID, isNew, total**. Атрибути повинні мати значення за замовчуванням. Додати до класу метод **displayCustomerInfo**, який виводить на консоль інформацію про клієнта з допомогою System.out.println. Кожен рядок має містити відповідну мітку, наприклад, "Total purchases are:". Створити в пакеті **test** клас **CustomerTest**, в методі **main** якого створити об'єкт класу **Сustomer** та вивести на екран його властивості з допомогою методу **displayCustomerInfo**, зробити та зберегти(тека **Solution**) у файл **done.png** скріншот результатів роботи програми.

1. Метод **displayCustomerInformation(), c.displayCustomerInformation()** виводить всю інофрмацію про клієнта(номер клієнта, статус, сума замовлення). 
2. **Customer c = new Customer();**, створює новий об’єкт **с**(типу **Customer**).

## Customer.java
``` java
package domain;
public class Customer {
    private int ID;
    private boolean isNew;
    private double total;

    public Customer(){
        ID = 1;
        isNew = true;
        total = 1000.0;
    }
    public void displayCustomerInfo(){
        System.out.println("Custumer ID: "+ ID);
        System.out.println("Custumer is New: "+ isNew);
        System.out.println("Total purchases are: "+ total);
    }
    public void setID(int newID){
        if(newID<0) {return;}
        ID = newID;
    }
    public void setStatus(boolean newisNew){
        isNew = newisNew;
    }
    public void setTotal(double newtotal){
        if(newtotal<=0) {return;}
        total = newtotal;
    }
}

```

## CustomerTest.java
   
![task1](https://github.com/kachka16/java-1-kachka16/blob/main/Solution/done.png?raw=true)

## Завдання 2

> Додати конструктор за замовчуванням, який ініціалізує атрибути початковими значеннями (див. відеозапис лекції).
> Додати методи для зміни атрибутів - setID, setStatus, setTotal з відповідними параметрами та перевіркою присвоюваних значень (можуть або нічого не повертати, або повертати булевське значення).
> Використати ці методи в методі в методі main класуCustomerTest.
> Зробити та зберегти (тека Solution) у файл advanced.png скріншот результатів роботи програми, та модифікувати файл README.mdвідповідним чином.

## CustomerTest.java
![task2](https://github.com/kachka16/java-1-kachka16/blob/main/Solution/advanced.png?raw=true)
