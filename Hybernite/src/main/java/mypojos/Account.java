package mypojos;



import javax.persistence.*;
import java.util.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String holderName;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions = new ArrayList<>();

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public List<Transaction> getTransactions() { return transactions; }
    public void setTransactions(List<Transaction> transactions) { this.transactions = transactions; }

    public void addTransaction(Transaction txn) {
        transactions.add(txn);
        txn.setAccount(this);
    }

    public void removeTransaction(Transaction txn) {
        transactions.remove(txn);
        txn.setAccount(null);
    }

    @Override
    public String toString() {
        return "Account{id=" + id + ", holderName='" + holderName + "'}";
    }
}
