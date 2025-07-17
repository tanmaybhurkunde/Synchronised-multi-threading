Here is a concise `README.md` file for your synchronized example using `Adder` and `Subtractor` on a shared variable:

🧵 Java Multithreading with `synchronized` — Adder and Subtractor Example

This project demonstrates the use of 
Java's `synchronized` block to handle concurrent access to a shared resource
between two threads — one performing addition and the other performing subtraction on the same variable.

💡 Key Concepts

Multithreading: Two threads (`Adder` and `Subtractor`) run concurrently.
Shared Resource: A common `Value` object with a field `x`.
Race Condition: Occurs when multiple threads modify shared data without proper synchronization.
`synchronized` block: Prevents race conditions by allowing only one thread to access the critical section at a time.
Context Switching: Still occurs, but `synchronized` ensures mutual exclusion during access to `x`.

🔐 Why `synchronized`?

Without `synchronized`, you may see "interleaved outputs" and incorrect final results due to "context switching". With `synchronized`, 
either the Adder or Subtractor completes entirely before the other begins,
ensuring data consistency.

📂 Files

`Adder.java`: Adds numbers 1 to 100 to the shared variable `x`.
`Subtractor.java`: Subtracts numbers 1 to 100 from the same variable `x`.
`Value.java`: Holds the shared integer `x`.
`Main.java`: Runs both tasks using `ExecutorService`.

📌 Output Example (with `synchronized`) link : https://drive.google.com/file/d/1IG0D9j5e9UjSkYRu20ZUw9YKxFmb8fO9/view?usp=sharing

This happens because only one thread enters the critical section at a time.
