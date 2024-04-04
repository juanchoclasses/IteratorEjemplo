import iteratelist.RecyclableCollection;
import iteratelist.RecyclableCollectionIterator;
import iteratelist.RecyclableItem;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RecyclableCollectionTest {

  private RecyclableCollection recyclables;
  @Before
  public void setUp() throws Exception {
   recyclables = new RecyclableCollection();

  }
  @Test
  public void addItem() {
    recyclables.addItem(new RecyclableItem("Bottle", true));
    // Using the iterator to traverse through the collection.
    RecyclableCollectionIterator iterator = recyclables.getIterator();
    int count = 0;
    while (iterator.hasNext()) {
      RecyclableItem item = iterator.next();
      count++;
    }
    assertEquals(1, count);



    recyclables.addItem(new RecyclableItem("Can", true));

    iterator = recyclables.getIterator();
    count = 0;
    while (iterator.hasNext()) {
      RecyclableItem item = iterator.next();
      count++;
    }
    assertEquals(2, count);


    recyclables.addItem(new RecyclableItem("Plastic Bag", false));

    iterator = recyclables.getIterator();
    count = 0;
    while (iterator.hasNext()) {
      RecyclableItem item = iterator.next();
      count++;
    }
    assertEquals(3, count);
  }

  @Test
  public void add100Items() {
    for (int i = 0; i < 100; i++) {
      recyclables.addItem(new RecyclableItem("Item " + i, i % 2 == 0));
    }
    RecyclableCollectionIterator iterator = recyclables.getIterator();
    int count = 0;
    while (iterator.hasNext()) {
      RecyclableItem item = iterator.next();
      count++;
    }
    assertEquals(100, count);
  }

  @org.junit.Test
  public void getIterator() {
  }
}