# Aston Java Stream

## 📄 Описание проекта

Этот проект реализует методы класса `PuttingIntoPractice`, демонстрирующие различные операции над данными о трейдерах и транзакциях. В условии задания даны классы `Trader` и `Transaction`, а также внутри `PuttingIntoPractice` список транзакций и трейдеров. 

### Trader

Класс `Trader` представляет собой информацию о трейдерах, включая их имя и город.

- **Get Name**: Возвращает имя трейдера.
- **Get City**: Возвращает город, в котором работает трейдер.
- **Set City**: Изменяет город, в котором работает трейдер.
- **Equals**: Сравнивает двух трейдеров по имени и городу.
- **HashCode**: Генерирует хеш-код на основе имени и города трейдера.
- **ToString**: Возвращает строковое представление трейдера в формате `"Trader:<name> in <city>"`.

### Transaction

Класс `Transaction` представляет собой информацию о транзакциях, совершенных трейдерами.

- **Get Trader**: Возвращает трейдера, совершившего транзакцию.
- **Get Year**: Возвращает год, в котором была совершена транзакция.
- **Get Value**: Возвращает сумму транзакции.
- **Equals**: Сравнивает две транзакции по трейдеру, году и сумме.
- **HashCode**: Генерирует хеш-код на основе трейдера, года и суммы транзакции.
- **ToString**: Возвращает строковое представление транзакции в формате `"{Trader:<name>, year: <year>, value: <value>}"`.

### PuttingIntoPractice

Класс `PuttingIntoPractice` служит точкой входа программы и демонстрирует выполнение различных операций с данными о транзакциях и трейдерах. В условии задания даны список транзакций и трейдеров. 

- **printTransactionsOf2011(List<Transaction>)**: Выводит транзакции за 2011 год (от меньшей к большей).
- **printUniqueCities(List<Transaction>)**: Получает список неповторяющихся городов, в которых работают трейдеры.
- **public static void printTradersFromCambridge(List<Transaction>)**: Находит всех трейдеров из Кембриджа и сортирует их по именам.
- **public static void printTraderNames(List<Transaction>)**: Возвращает строку с именами всех трейдеров, отсортированными в алфавитном порядке.
- **public static void printHasTraderInMilan(List<Transaction>)**: Проверяет, есть ли хотя бы один трейдер из Милана.
- **void printSumOfTransactionsFromCambridge(List<Transaction>)**: Выводит суммы всех транзакций трейдеров из Кембриджа.
- **public static void printMaxTransactionValue(List<Transaction>)**: Выводит максимальную сумму среди всех транзакций.
- **public static void printMinTransaction(List<Transaction>)**: Выводит транзакцию с минимальной суммой.

## ⚙️ Установка и запуск

1. Склонируйте репозиторий проекта:

   ```bash
   git clone https://github.com/dreammexitme/AstonJavaStream.git
   ```

2. Перейдите в папку проекта:

   ```bash
   cd AstonJavaStream
   ```

3. Откройте проект в своей IDE (например, IntelliJ IDEA или VSCode).

4. Запустите класс PuttingIntoPractice.java для тестирования коллекций.
