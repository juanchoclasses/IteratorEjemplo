package iteratelist;

import java.util.Iterator;
import java.util.List;

/**
 * An iterator for the RecyclableCollection class.
 */
public class RecyclableCollectionIterator implements Iterator<RecyclableItem> {
  private final List<RecyclableItem> items;
  private int currentIndex = 0;

  /**
   * Constructor.
   *
   * @param items The list of items to iterate through.
   */
  public RecyclableCollectionIterator(List<RecyclableItem> items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return currentIndex < items.size();
  }

  @Override
  public RecyclableItem next() {
    return items.get(currentIndex++);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("Remove not supported.");
  }
}

