package timingtest;

/** Array based list.
 *  @author Josh Hug
 */

//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5

/* Invariants:
 addLast: The next item we want to add, will go into position size
 getLast: The item we want to return is in position size - 1
 size: The number of items in the list should be size.
*/

public class AList<Item> {
    private Item[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity. */
    /*将基本数组调整为目标的容量 */
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size); //从前面的数组复制到后面的数组，参数:被复制的数组、起始位置、复制到的数组、起始位置、复制的长度
        items = a;
    }

    /** Inserts X into the back of the list. */
    /*在列表的最后插入 x */
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size + 1);
        }

        items[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the list. */
    /* 返回列表最后的值 */
    public Item getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    /* 返回范围内指点位置 i 的值 */
    public Item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    /* 返回列表的长度 */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    /* 返回列表最后的值并在列表中删掉这个值*/
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }


}
