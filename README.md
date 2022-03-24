# ell27-Java-Apprentice
Java training program - Apprentice level

## ***** Core Java ***** 

### Describe the lifecycle of an object instance in Java and how garbage collection works

1. A .class file is created:
- When we compile the Java class, it is transformed into byte code which is platform and machine-independent. The compiled classes are stored as a .class file on a disk.

2. The .class is loaded into memory:
- The Java runtime finds the class on disk and the Java classloader loads it into memory. Then the Java runtime reads it into the memory.

3. Initialize static members of class:
- Java looks for all initialized static members of the class (static methods, static fields, static blocks). Static members of the class do not belong to any particular instance of the class. The belong to the class itself and iare shared by all the objects created from the class.

4. Java classes initialized:
- Objects or instances of the class are created using the new keyword.

5. Memory allocated for object and reference variable:
- Java allocates memory on the heap for the objects.
- Java allocates memory on the stack for object reference variables.

6. Class constructors are called:
- The JVM calls the constructor of the class which is like a method but it is called only once when the object is created. Thus, the object lives its life and provides access to its fields and methods when needed.

7. Objects and reference variables removed from memory (garbage collection):
- When no longer needed, the object and its reference are removed from the memory by the JVM. The Java runtime calls the garbage collector to destroy all the objects. Thus, objects are born, live, and die.

refs: 
- scientecheasy.com/2020/06/life-cycle-of-object-in-java.html/

### Describe how the basic data types are represented in memory (boolean, int, long, String, array of ints, array of Objects, class with fields)

- All data type for primitive type variables are stored on the stack.
- For reference data types, the stack holds a pointer to the object on the heap. When setting a reference type variable equal to another reference type variable, a copy of only the pointer is made.

1. boolean:
- Stored as a single bit.
- Declaring it without a value defaults to false (0).

2. int:
- Java stores it using 32 bits of memory. In other words, it can represent values from -2,147,483,648 (-231) to 2,147,483,647 (231-1).
- The default value of an int declared without an assignment is 0.
- Decimal values are chopped off when performing math opperations on integers.

3. long:
- Stored in 64 bits of memory so it can hold a significantly larger set of possible values. Possible values of a long are between -9,223,372,036,854,775,808 (-263) to 9,223,372,036,854,775,807 (263 – 1).
- The default value of an int declared without an assignment is 0.

4. string:
- Strings are stored as objects in Java. All objects are dynamically allocated on Heap.

5. array of ints:
-  Stored dynamically allocated on Heap.

6. array of Objects:
- Stores a list of references to the objects.

7. class with fields:
- For normal objects in Java, the object header consists of mark and class words plus possible alignment paddings. After the object header, there may be zero or more references to instance fields. At least 16 bytes in 64-bit architectures because of 8 bytes of the mark, 4 bytes of class, and another 4 bytes for padding.

refs:
- baeldung.com/java-primitives
- geeksforgeeks.org/g-fact-46/
- tutorialspoint.com/where-does-array-stored-in-jvm-memory-in-java
- baeldung.com/java-memory-layout

### Write an application to find out how many total characters can be held in a single StringBuilder before running out of memory, translate that number of characters to the number of bytes held by that StringBuilder before crashing.
- See stringBuilderCrash for the completed task

- 603979772
- 603979773
- 603979774
- Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
- at java.util.Arrays.copyOf(Arrays.java:3332)
- at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
- at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:448)
- at java.lang.StringBuilder.append(StringBuilder.java:141)
- at com.ell27_stringbuilder.App.main(App.java:13)
- Process finished with exit code 1

- Result: 603,979,774 letter 'a's were appended to the string. Since the letter 'a' only takes 1 byte, it seems the stringBuilder can
- hold a max of 603,979,774 bytes.
- However, looking online, the max size seems to be 2,147,483,648 chars.

### Compare and contrast StringBuffer and StringBuilder and when to use each

1. StringBuffer:
- StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
- StringBuffer is less efficient than StringBuilder.
- If a string can change and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous, so you have thread-safety.

2. StrinBuilder:
- StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
- StringBuilder is more efficient than StringBuffer.
- If a string can change (for example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a StringBuilder is good enough.

refs:
- javatpoint.com/difference-between-stringbuffer-and-stringbuilder
- geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/

### Compare/contrast use of ArrayList / LinkedList / HashMap / HashSet / TreeSet

1. ArrayList:
- The ArrayList class is a resizable array, which can be found in the java.util package.
- The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever.
- Elements in an ArrayList are objects.
- Permits all elements, including null.
- The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. The constant factor is low compared to that for the LinkedList implementation.
- An application can increase the capacity of an ArrayList instance before adding a large number of elements using the ensureCapacity operation. This may reduce the amount of incremental reallocation.
- If multiple threads access an ArrayList instance concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.
- The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

2. LinkedList:
- The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
- The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.
- The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
- Implements all optional list operations, and permits all elements (including null).
- Like the arrayList, if multiple threads access a linked list concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.

3. HashMap:
- where Arrays store items as an ordered collection (accessed by an index number), a HashMap stores items in "key/value" pairs, accessed by an index of another type (e.g. a String).
- One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values.
- Hash table based implementation of the Map interface.
- Provides all of the optional map operations, and permits null values and the null key.
- Does not guarantee the order will remain constant over time.
- Provides constant-time performance for the basic operations (get and put).

4. HashSet:
- A HashSet is a collection of items where every item is unique, and it is found in the java.util package.
- Items in an HashSet are objects.
- This class implements the Set interface, backed by a hash table (actually a HashMap instance). 
- It does not guarantee that the order will remain constant over time.
- Permits the null element.
- Offers constant time performance for the basic operations (add, remove, contains and size).
- If multiple threads access a hash set concurrently, and at least one of the threads modifies the set, it must be synchronized externally.

5. TreeSet
- TreeSet is basically an implementation of a self-balancing binary search tree. 
- Provides guaranteed log(n) time cost for the basic operations (add, remove and contains). Therefore, this is considered one of the most efficient data structures in order to store the huge sorted data and perform operations on it.
- If multiple threads access a tree set concurrently, and at least one of the threads modifies the set, it must be synchronized externally. 
- A NavigableSet implementation based on a TreeMap. 
- The elements are ordered using their natural ordering.

refs:
- w3schools.com/java/java_arraylist.asp
- docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
- w3schools.com/java/java_linkedlist.asp
- docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
- w3schools.com/java/java_hashmap.asp
- docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
- w3schools.com/java/java_hashset.asp
- docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
- geeksforgeeks.org/treeset-in-java-with-examples/
- docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html

### Write an application to read a file with 10k lines of text, and output another file with the lines in sorted order
- See sort10000lines for the completed task

### Write an application to read a file with 10k lines of text, and output another file with the lines in reverse sorted order
- See reverseSort10000lines for the completed task

### Write code to show exception handling including examples of checked, unchecked, and Error exceptions
- See ExceptionHandling for the completed task

### Write your own enum type.  Describe when you would use it.
- See enumProject for the completed task
- In the project I created, energy sources are listed like coal and solar. These also have associated energy values in joules and general details. The idea here would be to use this enum as part of a video game where a robot is gathering resources on a distant planet. These energy values would not ever need to be updated, so an enum makes sense. The values would only need to be obtained via a getter.


## ***** Working with Methods, Encapsulation, & Inheritance *****

### Show how to use a common piece of logic from two different classes, in three different ways: 1) by composition, 2) by inheritance, and 3) by static method calls, discuss the tradeoff, for example: two different classes that write a message to a file, one in XML, one in line-oriented text, but both need to reuse logic to open the file in the same way


### Create and overload constructors -- Create a class that has 4 fields and construct the class with variations of one required field and the others are optional.  Use constructor chaining as an example.
- See OverloadedConstructors for completed task.

### Apply encapsulation principles to a class -- Show an example of good encapsulation.  Show a bad example of encapsulation and explain why.  Additionally explain access modifiers and how they can be used as part of the class encapsulation.
- See Encapsulation for completed task.

### Determine the effect upon object references and primitive values when they are passed into methods that change the values -- Create a method 3 parameters, one is parameter is passed by value, one is passed by reference and one with the keyword final.  Explain each and how the method changes each one.


### Write code to show how access modifiers work: private, protected, and public, talk about why you would use each of these.
- See AccessModifiers for completed task. 

### Write code to show how virtual method invocation lets one implementation be swapped for another.
- See virtualMethodInvocation for completed task

### Write code that uses the instanceof operator and show how casting works.
### Show how to override a method in a subclass, talk about plusses and minuses in doing so.
### Show how to overload constructors and methods, talk about plusses and minuses in doing so.


## ***** Library *****

### Write an application that uses the slf4j logging library directly (can also choose log4j if you want)
- Do the following:
  - configure the logging using an accepted department log statement format (see Application Specific Logging)
  - log at different logging levels (error, warn, info, debug), to see the effect of the default logging level setting
  - turn on DEBUG in the logging config to show DEBUG output
  - configure logging to go to both the console and a log file