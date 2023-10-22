import java.util.*;

public class DailyTransactions
{

 private ArrayList <Transaction> allTransactions;  

                                         
 public DailyTransactions()
 {
  allTransactions = new ArrayList <Transaction> ();
 }
 
 public void addTransaction(Transaction transaction)
 {
  allTransactions.add(transaction);
 }

 public void printTransactions()
 {
  for(Transaction t : allTransactions)
  {
     System.out.println(t);
     System.out.println();
  }
 }
}