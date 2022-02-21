# ell27-Java-Apprentice
Java training program - Apprentice level

## Core Java

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

### Write an application to read a file with 10k lines of text, and output another file with the lines in sorted order (sample file)

### Write an application to read a file with 10k lines of text, and output another file with the lines in reverse sorted order

### Write code to show exception handling including examples of checked, unchecked, and Error exceptions

### Write your own enum type.  Describe when you would use it.