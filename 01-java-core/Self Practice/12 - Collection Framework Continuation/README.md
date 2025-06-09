# Java Collection Framework - Comprehensive Guide

This README provides a complete overview of the **Java Collection Framework**, covering all major interfaces and classes with definitions, use cases, scope, and code examples.

---

## 📚 Table of Contents

1. [Collection Interfaces](#collection-interfaces)
2. [List Implementations](#list-implementations)
3. [Set Implementations](#set-implementations)
4. [Queue Implementations](#queue-implementations)
5. [Map Implementations](#map-implementations)
6. [Utility Classes](#utility-classes)
7. [Author](#Author)

---

##  Collection Interfaces

### ➤ `Collection` Interface

**Definition:**  
Root interface of the Java Collection hierarchy.

- **Scope:**  
  Represents a group of objects, known as *elements*.

- **Why used:**  
  Provides fundamental operations like:
    - `add()`
    - `remove()`
    - `contains()`
    - `size()`
    - And more...

#### ✅ Example:
```java
import java.util.Collection;
import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Item");
        collection.remove("Item");
        System.out.println("Collection Size: " + collection.size());
    }
}
```
### ➤ `List` Interface

**Definition:**  
An ordered collection (sequence) that allows duplicate elements.

- **Scope:**  
  Used when insertion order matters and elements need to be accessed by their index.

- **Why used:**
    - Maintains insertion order
    - Allows positional access and manipulation of elements

#### ✅ Example:

```java
import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "First");
        String item = list.get(0);
        System.out.println("Item at index 0: " + item);
    }
}
```
### ➤ `Set` Interface

**Definition:**  
Collection that contains no duplicate elements.

- **Scope:**  
  When uniqueness of elements is required.

- **Why used:**  
  Mathematical set abstraction, fast membership testing.

#### ✅ Example:

```java
import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("unique");
        boolean contains = set.contains("unique");
        System.out.println("Contains 'unique': " + contains);
    }
}
```
### ➤ `Queue` Interface

**Definition:**  
Collection designed for holding elements prior to processing.

- **Scope:**  
  FIFO (First-In-First-Out) or priority-based processing.

- **Why used:**  
  When elements need to be processed in a specific order.

#### ✅ Example:

```java
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("task");
        String next = queue.poll();
        System.out.println("Next task: " + next);
    }
}
```
### ➤ `Deque` Interface

**Definition:**  
Double-ended queue that supports insertion/removal at both ends.

- **Scope:**  
  When LIFO (stack) or FIFO (queue) behavior is needed.

- **Why used:**  
  More flexible than Stack or Queue alone.

#### ✅ Example:

```java
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("front");
        deque.addLast("back");
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());
    }
}
```
### ➤ `Map` Interface

**Definition:**  
Object that maps keys to values (not a true Collection).

- **Scope:**  
  Key-value pair storage and retrieval.

- **Why used:**  
  Efficient lookup by key, associative array implementation.

#### ✅ Example:

```java
import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 10);
        int value = map.get("key");
        System.out.println("Value for 'key': " + value);
    }
}
```
## List Implementations

### ➤ `ArrayList`

**Definition:**  
Resizable-array implementation of List.

- **Scope:**  
  Default choice for List when synchronization is not needed.

- **Why used:**  
  Fast random access and efficient for iteration.

#### ✅ Example:

```java
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("element");
        String item = arrayList.get(0);
        System.out.println("First element: " + item);
    }
}
```
### ➤ `LinkedList`

**Definition:**  
Doubly-linked list implementation of List and Deque.

- **Scope:**  
  Frequent insertions/deletions, queue operations.

- **Why used:**  
  Efficient for modifications, implements both List and Deque.

#### ✅ Example:

```java
import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        ((LinkedList<String>) linkedList).removeFirst();
        System.out.println("List after removal: " + linkedList);
    }
}
```
### ➤ `Vector`

**Definition:**  
Synchronized, thread-safe resizable-array implementation.

- **Scope:**  
  Legacy, thread-safe List implementation.

- **Why used:**  
  When thread safety is needed (but prefer `Collections.synchronizedList`).

#### ✅ Example:

```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("safe");
        String item = vector.elementAt(0);
        System.out.println("First element: " + item);
    }
}
```
### ➤ `Stack`

**Definition:**  
LIFO stack extending Vector.

- **Scope:**  
  Legacy stack implementation.

- **Why used:**  
  When stack operations are needed (but prefer `Deque`).

#### ✅ Example:

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("item");
        String top = stack.pop();
        System.out.println("Popped element: " + top);
    }
}
```
## Set Implementations

### ➤ `HashSet`

**Definition:**  
Hash table implementation of Set.

- **Scope:**  
  General-purpose Set when order doesn't matter.

- **Why used:**  
  Fastest Set implementation with constant-time operations.

#### ✅ Example:

```java
import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("unique");
        boolean exists = hashSet.contains("unique");
        System.out.println("Contains 'unique': " + exists);
    }
}
```
### ➤ `LinkedHashSet`

**Definition:**  
Hash table and linked list implementation maintaining insertion order.

- **Scope:**  
  When Set uniqueness with insertion order is needed.

- **Why used:**  
  Combines HashSet with predictable iteration order.

#### ✅ Example:

```java
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("first");
        linkedHashSet.add("second"); // Iteration order guaranteed
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
```
### ➤ `TreeSet`

**Definition:**  
Red-black tree implementation of NavigableSet.

- **Scope:**  
  Sorted Set implementation.

- **Why used:**  
  When elements need to be sorted automatically.

#### ✅ Example:

```java
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("zebra");
        treeSet.add("apple"); // Automatically sorted
        System.out.println("TreeSet: " + treeSet);
    }
}
```
### ➤ `EnumSet`

**Definition:**  
High-performance Set implementation specifically for enum types.

- **Scope:**  
  Used when working with enum values.

- **Why used:**  
  Extremely efficient for handling enum values.

#### ✅ Example:

```java
import java.util.EnumSet;

enum Day { MON, TUE, WED }

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Day> days = EnumSet.of(Day.MON, Day.TUE);
        System.out.println("EnumSet: " + days);
    }
}
```
## Queue Implementations

### ➤ `PriorityQueue`

**Definition:**  
Unbounded priority queue based on a priority heap.

- **Scope:**  
  Used when elements need to be processed based on priority.

- **Why used:**  
  Efficient priority-based processing.

#### ✅ Example:

```java
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1); // Elements processed in natural order: 1, then 5
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
```
### ➤ `ArrayDeque`

**Definition:**  
Resizable-array deque implementation.

- **Scope:**  
  High-performance stack and queue operations.

- **Why used:**  
  More efficient than `Stack` or `LinkedList` for deque operations.

#### ✅ Example:

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.push("stack-like");   // Acts like stack push
        deque.offer("queue-like");  // Acts like queue offer
        System.out.println(deque.pop());   // Outputs: stack-like
        System.out.println(deque.poll());  // Outputs: queue-like
    }
}
```
### ➤ `LinkedList` (as Queue)

**Definition:**  
Doubly-linked list that also implements the `Queue` interface.

- **Scope:**  
  When both `List` and `Queue` functionality are needed.

- **Why used:**  
  Flexible but generally slower than `ArrayDeque` for queue operations.

#### ✅ Example:

```java
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("item");
        String next = queue.poll();
        System.out.println("Next item: " + next);
    }
}
```
## Map Implementations
### ➤ `HashMap`

**Definition:**  
Hash table based implementation of the `Map` interface.

- **Scope:**  
  General-purpose key-value storage.

- **Why used:**  
  Fastest `Map` implementation with near constant-time operations for basic methods.

#### ✅ Example:

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key", 10);
        int val = hashMap.get("key");
        System.out.println("Value for 'key': " + val);
    }
}
```
### ➤ `LinkedHashMap`

**Definition:**  
Hash table and linked list implementation of the `Map` interface maintaining insertion or access order.

- **Scope:**  
  When a `Map` with predictable iteration order is needed.

- **Why used:**  
  Combines the fast lookup of `HashMap` with a predictable iteration order.

#### ✅ Example:

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("first", 1);
        linkedMap.put("second", 2); // Iteration order guaranteed
        linkedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
```
### ➤ `TreeMap`

**Definition:**  
Red-black tree based implementation of the `NavigableMap` interface.

- **Scope:**  
  Sorted `Map` implementation.

- **Why used:**  
  When keys need to be sorted automatically.

#### ✅ Example:

```java
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("zebra", 1);
        treeMap.put("apple", 2); // Sorted by key
        treeMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
```
### ➤ `IdentityHashMap`

**Definition:**  
Uses reference-equality (`==`) instead of object-equality (`equals()`).

- **Scope:**  
  When `==` comparison is needed instead of `equals()`.

- **Why used:**  
  Rare cases requiring identity-based comparison.

#### ✅ Example:

```java
import java.util.Map;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> identityMap = new IdentityHashMap<>();
        String key1 = new String("key");
        String key2 = new String("key");
        identityMap.put(key1, 1);
        identityMap.put(key2, 2); // Both stored (== comparison)
        identityMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
```
### ➤ `WeakHashMap`

**Definition:**  
Hash map with weak keys (keys are eligible for garbage collection when no strong references exist).

- **Scope:**  
  Useful for cache-like structures.

- **Why used:**  
  Entries are automatically removed when keys become unreachable (garbage collected).

#### ✅ Example:

```java
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<Object, Integer> weakMap = new WeakHashMap<>();
        weakMap.put(new Object(), 1); // May be garbage collected
        System.out.println("WeakHashMap size: " + weakMap.size());
    }
}
```
### ➤ `EnumMap`

**Definition:**  
High-performance Map implementation for enum keys.

- **Scope:**  
  Used when enum constants are keys.

- **Why used:**  
  Extremely efficient storage and retrieval for enum keys.

#### ✅ Example:

```java
import java.util.Map;
import java.util.EnumMap;

enum Day { MON, TUE }

public class EnumMapExample {
    public static void main(String[] args) {
        Map<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MON, "Monday");
        System.out.println("EnumMap value for MON: " + enumMap.get(Day.MON));
    }
}
```
### ➤ `Hashtable`

**Definition:**  
Legacy synchronized Map implementation.

- **Scope:**  
  Legacy thread-safe Map (prefer `ConcurrentHashMap` now).

- **Why used:**  
  Used for thread safety in legacy code.

#### ✅ Example:

```java
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("key", 1);
        int val = table.get("key");
        System.out.println("Value for key: " + val);
    }
}
```
## Utility Classes
### ➤ `Collections`

**Definition:**  
Utility class with static methods for collections.

- **Scope:**  
  Provides common operations on collections.

- **Why used:**  
  Offers algorithms (e.g., `sort()`, `search()`) and collection wrappers (e.g., synchronized collections).

#### ✅ Example:

```java
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("cherry");

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        List<String> syncList = Collections.synchronizedList(list);
    }
}
```
### ➤ `Arrays`

**Definition:**  
Utility class for array operations.

- **Scope:**  
  Provides common operations on arrays.

- **Why used:**  
  Used for sorting, searching, and converting arrays to collections.

#### ✅ Example:

```java
import java.util.Arrays;
import java.util.List;

public class ArraysExample {
    public static void main(String[] args) {
        String[] arr = {"b", "a"};
        List<String> list = Arrays.asList(arr);
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("List view: " + list);
    }
}
```
### ➤ `ConcurrentHashMap`

**Definition:**  
Thread-safe HashMap variant.

- **Scope:**  
  Used in high-concurrency Map implementations.

- **Why used:**  
  Offers better performance than synchronized Map in multi-threaded applications.

#### ✅ Example:

```java
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("key", 1);
        System.out.println("Value for 'key': " + concurrentMap.get("key"));
    }
}
```
### ➤ `CopyOnWriteArrayList`

**Definition:**  
Thread-safe List with copy-on-write semantics.

- **Scope:**  
  Ideal for frequent reads and rare writes scenarios.

- **Why used:**  
  Ensures iteration stability is prioritized over write performance.

#### ✅ Example:

```java
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        List<String> cowList = new CopyOnWriteArrayList<>();
        cowList.add("item"); // Creates new internal array
        System.out.println("Item added: " + cowList.get(0));
    }
}
```
### ➤ `BlockingQueue` Implementations

**Definition:**  
Thread-safe queues supporting wait-for-space and wait-for-empty operations.

- **Scope:**  
  Used in producer-consumer scenarios.

- **Why used:**  
  For coordinating work between multiple threads safely.

#### ✅ Example:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(10);
        bq.put("item"); // Blocks if full
        String item = bq.take(); // Blocks if empty
        System.out.println("Item processed: " + item);
    }
}
```

##  Author
Crafted with focus and care by **Rachit Sharma** 