package iteratelist;

/**
 * An example of a simple class that represents an item that can be recycled.
 */
public class RecyclableItem {
  private final String name;
  private final boolean isRecyclable;

  /**
   * Constructor.
   *
   * @param name The name of the item.
   * @param isRecyclable Whether the item is recyclable or not.
   */
  public RecyclableItem(String name, boolean isRecyclable) {
    this.name = name;
    this.isRecyclable = isRecyclable;
  }

  /**
   * Get the name of the item.
   *
   * @return The name of the item.
   */
  public String getName() {
    return name;
  }

  /**
   * Check if the item is recyclable.
   *
   * @return True if the item is recyclable, false otherwise.
   */
  public boolean isRecyclable() {
    return isRecyclable;
  }

  @Override
  public String toString() {
    return name + ": " + (isRecyclable ? "Recyclable" : "Non-recyclable");
  }
}