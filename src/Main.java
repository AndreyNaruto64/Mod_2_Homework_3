import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void dictionary(){
        String[] manyWords = {"Banana", "Apple", "Monkey", "Dog", "Dog", "Cheese", "Table", "Summer", "Water", "Dog", "Apple", "Monkey", "Cheese", "Mouse", "Banana", "Meat", "Cola", "Human", "Home", "House"};

        Map<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0; i < manyWords.length; i++) {
            if(hm.containsKey(manyWords[i])){
                hm.put(manyWords[i], hm.get(manyWords[i])+1 );
            }else {
                hm.put(manyWords[i], 1);
            }

        }
        System.out.println(hm);

    }

    public static void phoneBook() {
        Book book = new Book();
        book.add("Sidorov","546621579828");
        book.add("Sidorov","856626979828");
        book.add("Ivanov","546621299828");
        book.add("Vasilkov","546351579813");
        book.add("Petrov","546351573828");

        System.out.println("Ivanov "+(book.get("Ivanov")));
        System.out.println("Sidorov"+(book.get("Sidorov")));
        System.out.println("Vasilkov"+(book.get("Vasilkov")));



    }

    public static void main(String[] args) {
        dictionary();
        phoneBook();

    }
}