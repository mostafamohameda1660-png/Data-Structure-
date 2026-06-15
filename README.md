# Data-Structure-
An efficient LRU Cache System built from scratch in Java for Alexandria University's Data Structures course (Spring 2026). It achieves $O(1)$ operations by integrating a custom-built Hash Table and Doubly Linked List, completely avoiding Java's built-in collections to master core memory management, data mapping, and eviction policies.

# LRU Cache System — Data Structures Final Project

## 📌 Project Overview
This repository contains a high-performance **Least Recently Used (LRU) Cache System** built from scratch using Java. Developed as the final project for the Data Structures course (Spring 2026) at the **Faculty of Computers and Data Science, Alexandria University**.

The system optimizes memory performance and data access by automatically evicting the least recently used items when capacity is reached. To master underlying structural mechanics, this implementation strictly avoids built-in Java collections (like `HashMap` or `LinkedHashMap`), relying entirely on custom-built components.

---

## ⚙️ System Architecture & Design
The system achieves constant time complexity by combining two foundational data structures:
*   **Custom Hash Table:** Maps keys directly to node references to provide **$O(1)$ direct access**.
*   **Custom Doubly Linked List:** Maintains the chronological order of item usage. 
    *   **Head:** Represents the Most Recently Used (MRU) item.
    *   **Tail:** Represents the Least Recently Used (LRU) item.
[Hash Table]  ---> Maps Key directly to Node Reference O(1)
        |
        v
 +--------------+      +--------------+      +--------------+
