import java.util.*;
import java.util.stream.Collectors;

import model.*;

public class PuttingIntoPractice {

    public static void main(String... args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        printTransactionsOf2011(transactions);
        printUniqueCities(transactions);
        printTradersFromCambridge(transactions);
        printSumOfTransactionsFromCambridge(transactions);
        printTraderNames(transactions);
        printHasTraderInMilan(transactions);
        printMaxTransactionValue(transactions);
        printMinTransaction(transactions);
    }

    public static void printTransactionsOf2011(List<Transaction> transactions) {
        List<Transaction> transactions2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("\nTransactions of 2011 in ascending order:");
        transactions2011.forEach(System.out::println);
    }

    public static void printUniqueCities(List<Transaction> transactions) {
        List<String> uniqueCities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        String cities = uniqueCities.stream()
        .collect(Collectors.joining(", "));
        System.out.println("\nUnique cities: " + cities);
    }

    public static void printTradersFromCambridge(List<Transaction> transactions) {
        List<Trader> tradersFromCambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        String traderNames = tradersFromCambridge.stream()
                .map(Trader::getName)
                .collect(Collectors.joining(", "));
        System.out.println("\nTraders from Cambridge: " + traderNames);
    }

    public static void printTraderNames(List<Transaction> transactions) {
        String traderNames = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("\nTraders in alphabetic order: " + traderNames);
    }

    public static void printHasTraderInMilan(List<Transaction> transactions) {
        boolean hasTraderInMilan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("\nTrader from Milan is listed: " + hasTraderInMilan);
    }

    public static void printMaxTransactionValue(List<Transaction> transactions) {
        Optional<Transaction> maxTransaction = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue));
        System.out.println("\nMax transaction value: " + maxTransaction.map(Transaction::getValue).orElse(0));
    }

    public static void printMinTransaction(List<Transaction> transactions) {
        Optional<Transaction> minTransaction = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        
        System.out.println("\nMin transaction: " + minTransaction.orElse(null));
    }    

    public static void printSumOfTransactionsFromCambridge(List<Transaction> transactions) {
        Map<Trader, Integer> sumTransactionsByTraderFromCambridge = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.groupingBy(Transaction::getTrader,
                        Collectors.summingInt(Transaction::getValue)));
        String result = sumTransactionsByTraderFromCambridge.entrySet().stream()
                .map(entry -> entry.getValue() + " (" + entry.getKey().getName() + ")")
                .collect(Collectors.joining(", "));
        System.out.println("\nSums of transactions of individual traders from Cambridge: " + result);
    }
}
