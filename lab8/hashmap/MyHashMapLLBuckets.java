<<<<<<< HEAD
package hashmap;

import java.util.LinkedList;
import java.util.Collection;

/**
 * Hash Table with Linked List buckets
 * @author Neil Kulkarni
 */
public class MyHashMapLLBuckets<K, V> extends MyHashMap<K, V> {

    /**
     * Constructor that creates a backing array with default
     * initial size and load factor
     */
    public MyHashMapLLBuckets() {
        super();
    }

    /**
     * Constructor that creates a backing array of initialSize
     * and default load factor
     *
     * @param initialSize initial size of backing array
     */
    public MyHashMapLLBuckets(int initialSize) {
        super(initialSize);
    }

    /**
     * Constructor that creates a backing array of initialSize.
     * The load factor (# items / # buckets) should always be <= loadFactor
     *
     * @param initialSize initial size of backing array
     * @param maxLoad maximum load factor
     */
    public MyHashMapLLBuckets(int initialSize, double maxLoad) {
        super(initialSize, maxLoad);
    }

    @Override
    protected Collection<Node> createBucket() {
        return new LinkedList<>();
    }
}
=======
package hashmap;

import java.util.LinkedList;
import java.util.Collection;

/**
 * Hash Table with Linked List buckets
 * @author Neil Kulkarni
 */
public class MyHashMapLLBuckets<K, V> extends MyHashMap<K, V> {

    /**
     * Constructor that creates a backing array with default
     * initial size and load factor
     */
    public MyHashMapLLBuckets() {
        super();
    }

    /**
     * Constructor that creates a backing array of initialSize
     * and default load factor
     *
     * @param initialSize initial size of backing array
     */
    public MyHashMapLLBuckets(int initialSize) {
        super(initialSize);
    }

    /**
     * Constructor that creates a backing array of initialSize.
     * The load factor (# items / # buckets) should always be <= loadFactor
     *
     * @param initialSize initial size of backing array
     * @param maxLoad maximum load factor
     */
    public MyHashMapLLBuckets(int initialSize, double maxLoad) {
        super(initialSize, maxLoad);
    }

    @Override
    protected Collection<Node> createBucket() {
        return new LinkedList<>();
    }
}
>>>>>>> 160747451c147c59d8e3cbf70a7afee2b73bebdb
