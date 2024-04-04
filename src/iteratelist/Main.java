package iteratelist;

/**
 * A collection class for recyclable items that implements Iterable.
 * This allows us to use the for-each loop to iterate through the collection.
 */
public class Main {
  public static void main(String[] args) {
    RecyclableCollection recyclables = new RecyclableCollection();
    recyclables.addItem(new RecyclableItem("Bottle", true));
    recyclables.addItem(new RecyclableItem("Can", true));
    recyclables.addItem(new RecyclableItem("Plastic Bag", false));

    // Using the iterator to traverse through the collection.
    RecyclableCollectionIterator iterator = recyclables.getIterator();
    while (iterator.hasNext()) {
      RecyclableItem item = iterator.next();
      System.out.println(item.toString());
    }
  }
}
