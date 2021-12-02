import java.util.*;;
public class InvalidTransactions {
    public static void main(String[] args) {
        String[] transactions = {"alex,676,260,bangkok","bob,656,1366,bangkok","alex,393,616,bangkok","bob,820,990,amsterdam","alex,596,1390,amsterdam"};
        List<String> result = invalidTransactions(transactions);
        for (String string : result) {
            System.out.println(string);
        }
    }
    public static List<String> invalidTransactions(String[] transactions) {
        List<String> invalidTransactions = new ArrayList<String>();
        boolean[] b = new boolean[transactions.length];
        for (int i = 0; i < transactions.length - 1; i++) {
            for (int k = i + 1; k < transactions.length; k++) {
                String[] transaction = convert(transactions[i]);
                String[] comparedTransaction = convert(transactions[k]);
            
            if (transaction[0].equals(comparedTransaction[0]) && !(transaction[3].equals(comparedTransaction[3])) 
            && Math.abs(Integer.parseInt(transaction[1]) - Integer.parseInt(comparedTransaction[1])) <= 60) {
                b[i] = true;
                b[k] = true;
            } if (Integer.parseInt(transaction[2]) > 1000) {
                b[i] = true;
            }
            if (Integer.parseInt(comparedTransaction[2]) > 1000) {
                b[k] = true;
            }
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == true) {
                invalidTransactions.add(transactions[i]);
            }
        }
        return invalidTransactions;
    }
    public static String[] convert(String transaction) {
        String[] result = transaction.split("\\,");
            return result;
    }
}