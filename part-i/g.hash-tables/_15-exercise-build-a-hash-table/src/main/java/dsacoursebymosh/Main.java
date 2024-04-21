package dsacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var entry1 = new Entry(1, "ela");
        var entry2 = new Entry(6, "kerwin");
        var entry3 = new Entry(3, "maeve");
        var entry4 = new Entry(4, "ulysses");
        var entry5 = new Entry(11, "mirava");
        var hashTable = new HashTable(5);
        hashTable.put(entry1);
        hashTable.put(entry2);
        hashTable.put(entry3);
        hashTable.put(entry4);
        hashTable.put(entry5);
        System.out.println(hashTable.remove(3).getValue());
        var removed = hashTable.remove(5);
        System.out.println(removed != null ? removed.getValue() : null);
        hashTable.put(new Entry(4, "new ulysses"));
        System.out.println(hashTable.get(4));
        System.out.println(hashTable.get(11));
        System.out.println(hashTable);
    }
}