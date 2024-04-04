package iteratelist;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection class for recyclable items that implements Iterable.
 * This allows us to use the for-each loop to iterate through the collection.
 */
public class RecyclableCollection {
  private final List<RecyclableItem> items;

  /**
   * Constructor.
   */
  public RecyclableCollection() {
    items = new ArrayList<>();
  }

  /**
   * Adds an item to the collection.
   *
   * @param item The item to add.
   */
  public void addItem(RecyclableItem item) {
    items.add(item);
  }

  /**
   * Gets the iterator for the collection.
   *
   * @return The iterator.
   */
  public RecyclableCollectionIterator getIterator() {
    return new RecyclableCollectionIterator(items);
  }
}
