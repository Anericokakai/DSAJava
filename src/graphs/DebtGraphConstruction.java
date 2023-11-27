package graphs;

import java.util.*;

public class DebtGraphConstruction {

    static class Debt {
        int debtor;
        int creditor;
        int amount;

        Debt(int debtor, int creditor, int amount) {
            this.debtor = debtor;
            this.creditor = creditor;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        // Fetch data from the database or manually initialize the debt information
        List<Debt> debts = new ArrayList<>();
        debts.add(new Debt(0, 1, 30)); // A owes B 30
        debts.add(new Debt(1, 2, 50)); // B owes C 50
        debts.add(new Debt(2, 0, 80)); // C owes A 80

        // Constructing the graph using adjacency list representation
        int numUsers = 3; // Assuming 3 users: A, B, C
        List<List<Debt>> graph = new ArrayList<>();

        for (int i = 0; i < numUsers; i++) {
            graph.add(new ArrayList<>());
        }

        for (Debt debt : debts) {
            // Adding debts to the adjacency list for each user
            graph.get(debt.debtor).add(debt);
        }

        // Printing the constructed graph (for demonstration purposes)
        for (int i = 0; i < numUsers; i++) {
            System.out.println("User " + i + " owes:");
            for (Debt debt : graph.get(i)) {
                System.out.println("  -> User " + debt.creditor + " : " + debt.amount);
            }
        }
    }
}
