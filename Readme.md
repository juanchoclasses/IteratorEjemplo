Sure, here's a draft for your README file:

# Project Update

## Changes in RecyclableCollection

We are planning to change the internal representation in `RecyclableCollection` from `ArrayList` to an `RecyclableItem[]` array. This change is intended to optimize the memory usage and improve the performance of our collection.  We will be doing this in two steps. 
1) You will implement this with an array that does not resize.
2) For fun, you can implement the resizing of the array.

Here's a brief overview of the changes:

- The `items` field in `RecyclableCollection` will now be an array of `RecyclableItem` objects.
- The `addItem` method will be updated to add items to the array. In the first part of this exercise, we will not worry about resizing the array.
- The `getIterator` method will return an instance of `RecyclableCollectionIterator` that works with the array.

## Changes in RecyclableCollectionIterator

We will also re-implement `RecyclableCollectionIterator` to work with an array instead of an `ArrayList`.

Here's a brief overview of the changes:

- The `items` field in `RecyclableCollectionIterator` will now be an array of `RecyclableItem` objects.
- The `hasNext` and `next` methods will be updated to work with the array.

Please note that these changes will require modifications in any classes that use `RecyclableCollection` and `RecyclableCollectionIterator`. We recommend reviewing your code to identify any potential impact.

We believe these changes will make our code more efficient and maintainable. We appreciate your support during this transition.

## If you finish early
When using an array as an internal container, there may be situations where you need to reallocate the array, i.e., resize it to accommodate more elements. This is typically necessary when the array is full and you need to add more elements. The process of reallocating an array involves creating a new array with a larger size, copying the elements from the old array to the new one, and then replacing the old array with the new one.

In Java, you can use `Arrays.copyOf` method to achieve this. This method takes two parameters: the original array and the new length. It creates a new array with the specified length and copies the elements from the original array to the new one. If the new length is greater than the original length, the extra elements in the new array will be filled with default values (null for object arrays). After calling `Arrays.copyOf`, you can replace the old array with the new one.

Here's a simple example:

```java
// Suppose items is the original array
RecyclableItem[] newItems = Arrays.copyOf(items, newLength);
items = newItems;
```

In this example, `newLength` is the desired size of the array. It should be greater than the length of the original array if you want to increase the size. After these lines of code, `items` will be an array with the desired size, containing all the elements from the original array.  Typically you would double the size of the array when you resize it.  

There is a unit test `add100` that you can check to see if your resizing works.

## If you finish early and want to do more
Talk to your instructor