# 🔢 Java Array Master: Shuffle & Sort

A robust Java console application designed to demonstrate the logic behind fundamental Computer Science algorithms.

This project focuses on the **manual implementation** of array manipulation algorithms (Shuffling and Sorting) to understand deeply how they work under the hood, rather than relying on built-in Java methods like `Arrays.sort` or `Collections.shuffle`.

## 🚀 Features

- **Dynamic Array Initialization:** - Secure user input handling using `Scanner`.
  - Validates against negative numbers and non-integer inputs.
  - Populates the array with random integers.

- **Fisher-Yates Shuffle Algorithm:** - Manually implemented unbiased shuffling.
  - Iterates backwards (`i--`) to ensure every permutation is equally likely.

- **Optimized Bubble Sort:** - Manually implemented sorting algorithm.
  - Includes the critical optimization `(length - 1 - i)` in the inner loop to avoid redundant checks on already sorted elements at the end of the array.

- **Clean Code & OOP:** - Follows Object-Oriented principles (no static abuse).
  - Proper resource management (closing `Scanner` to prevent memory leaks).

## 🛠️ To-Do (Upcoming Features)

- [ ] **Implement Binary Search:** Add a manual Binary Search algorithm to find elements in the sorted array efficiently (O(log n)).
- [ ] Add performance comparison with other sorting algorithms.

## 💻 How to Run

1.  Clone the repository:
    ```bash
    git clone https://github.com/erenmente/Java-Arrays.git
    ```
2.  Compile the Java file:
    ```bash
    javac EnterToArrays.java
    ```
3.  Run the application:
    ```bash
    java EnterToArrays
    ```

## 📸 Example Output

```text
Kaç Elemanlı bir dizi istersiniz? 5

öncesi: [12, 4, 88, 3, 25]
Sonrası (Shuffle): [3, 88, 12, 25, 4]
Sıralama Sonrası (Bubble Sort): [3, 4, 12, 25, 88]
```

## 👨‍💻 Author

**Eren Mente**
* Software Engineering Student at Fırat University
* Passionate about Java, Algorithms, and Backend Development.
* [GitHub Profil](https://github.com/erenmente)
