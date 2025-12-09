# 🎲 Random Array Shuffler (Fisher-Yates Implementation)

A Java console application that generates a dynamic integer array based on user input and shuffles it using the efficient **Fisher-Yates (Knuth) Shuffle** algorithm.

## 🚀 Overview

This project demonstrates the manipulation of Arrays in Java, handling user input via `Scanner`, and implementing a core computer science algorithm for randomization. It is designed with **Object-Oriented Programming (OOP)** principles, avoiding global static methods for better memory management and code isolation.

## ✨ Features

- **Dynamic Array Creation:** The user defines the size of the array at runtime.
- **Random Population:** The array is automatically filled with random integers.
- **Fisher-Yates Shuffle:** Implements the O(n) time complexity algorithm for unbiased permutation.
- **Input Validation:** Handles user input securely.
- **Resource Management:** Proper handling of `Scanner` resources to prevent memory leaks.

## 🛠️ Technologies Used

- **Language:** Java (JDK 8+)
- **Libraries:** `java.util.Scanner`, `java.util.Random`, `java.util.Arrays`
- **IDE:** VS Code 

## ⚙️ How It Works (The Logic)

1.  **Initialization:** The program asks the user for the desired array size.
2.  **Population:** It creates the array and fills it with random numbers (bound by `size * 10`).
3.  **Shuffling (Fisher-Yates):**
    * The loop iterates backwards from the last element to the second element (`i > 0`).
    * In each iteration, a random index `j` is selected from `0` to `i`.
    * The elements at index `i` and `j` are swapped.
    * *Why backwards?* This ensures that every permutation is equally likely and prevents "biased" shuffling.

## 💻 How to Run

1.  Clone this repository:
    ```bash
    git clone [https://github.com/erenmente/random-array-shuffler.git](https://github.com/erenmente/random-array-shuffler.git)
    ```
2.  Navigate to the project directory.
3.  Compile the Java file:
    ```bash
    javac EnterToArrays.java
    ```
4.  Run the application:
    ```bash
    java EnterToArrays
    ```

## 📸 Example Output

```text
Kaç Elemanlı bir dizi istersiniz? 5
Dizi oluşturuldu ve dolduruldu.
---------------------------
Karıştırmadan Önce: [12, 45, 2, 8, 33]
Karıştırdıktan Sonra: [8, 33, 12, 2, 45]