import java.text.DecimalFormat;

public class Account {
    private String id;
    private String name;
    private Double balance = 0.0;



    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public String getId(){
        String result = String.format("%s",this.id);
        return result;
    }

    public String getName(){
        String result = String.format("%s",this.name);
        return result;
    }

    public Double getBalance(){
        Double fetchedBalance;
        fetchedBalance = this.balance;
        return fetchedBalance;
    }

    public Double credit(double c){
        this.balance += c;
        return this.balance;
    }
    public Double debit(double d) {


        if (this.balance >= d) {
            this.balance -= d;
        } else {
            System.out.println("Amount Exceeded");
        }

        return this.balance;
    }

    public Double transferTo(Account b, double t) {
        if (this.balance >= t){
            debit(t);
            b.credit(t);
            System.out.println("Transfer completed");

        } else {
            System.out.println("Amount exceeded");
        }

        return this.balance;
    }

    public String accountDetails(){
        String result = String.format("%s, the current balance in your account %s is %.2f",this.name, this.id, this.balance);
        return result;
    }

    }

