# LRU Cache System — Data Structures Final Project

## 📌 Project Description
[cite_start]An efficient LRU (Least Recently Used) Cache System built from scratch in Java for Alexandria University's Data Structures course (Spring 2026)[cite: 1, 2, 3]. [cite_start]It achieves $O(1)$ operational complexity by integrating a custom-designed Hash Table and Doubly Linked List, completely avoiding Java's built-in collections to master core memory management, data mapping, and eviction policies[cite: 17, 18, 19, 20, 21, 22, 23, 24].

---

## ⚙️ System Architecture & Design
[cite_start]The system optimizes memory performance and data access by automatically evicting the least recently used items when capacity is reached[cite: 11, 13, 14]. [cite_start]To achieve constant time complexity, the architecture combines two foundational data structures implemented completely from scratch[cite: 17, 22, 23, 24]:
* [cite_start]**Custom Hash Table:** Maps keys directly to node references to provide **$O(1)$ direct access**[cite: 17, 29, 31].
* [cite_start]**Custom Doubly Linked List:** Chronologically tracks data usage[cite: 29, 32].
    * [cite_start]**Head:** Points to the Most Recently Used (MRU) item[cite: 33].
    * [cite_start]**Tail:** Points to the Least Recently Used (LRU) item[cite: 35].

   [Hash Table]  ---> Maps Key directly to Node Reference O(1)
        |
        v
 +--------------+      +--------------+      +--------------+
---> |  Head (MRU)  | <--> |  Mid Node    | <--> |  Tail (LRU)  | --->
+--------------+      +--------------+      +--------------+


### Operations Complexity Matrix

| Operation | Description | Required Complexity |
| :--- | :--- | :--- |
| `get(key)` | Retrieve value if it exists and move its node to the front [cite: 17, 109] | $O(1)$ [cite: 17] |
| `put(key, value)` | Insert a new item or update an existing one at the front [cite: 17, 111] | $O(1)$ [cite: 17] |
| `remove(key)` | Remove a specific key from the cache entirely [cite: 17] | $O(1)$ [cite: 17] |
| `eviction` | Automatically evict the tail item when cache capacity is full [cite: 121, 122, 123] | $O(1)$ [cite: 150] |
| `display()` | Show the full cache state from most to least recent [cite: 17] | $O(n)$ [cite: 17] |

---

## 🛠️ Implementation Tasks Breakdown
The project implementation is organized across 10 modular tasks:
1.  **Task 1: Node Design** — Creating a shared `Node` class containing a key, value, and `prev`/`next` references[cite: 37, 39, 40, 41, 42, 43, 44].
2.  **Task 2: Doubly Linked List Initialization** — Managing head/tail pointers and empty state bounds[cite: 51, 53, 54, 55, 56].
3.  **Task 3: Insert at Front** — Pushing new or updated elements to the MRU (head) position[cite: 57, 59, 61, 62].
4.  **Task 4: Remove a Node** — Safely detaching middle, head, or tail nodes without breaking pointers[cite: 63, 65, 66, 67].
5.  **Task 5: Move Node to Front** — Relocating an accessed node to the front to mark it as recently used[cite: 73, 75, 76, 78].
6.  **Task 6: Remove Least Recently Used Item** — Evicting the tail node and returning it for hash deletion[cite: 79, 81, 82, 83].
7.  **Task 7: Hash Function and Table Setup** — Custom index mapping and collision handling[cite: 84, 86, 88].
8.  **Task 8: Hash Table Operations** — Average constant-time implementation for insertion, lookup, and deletion[cite: 95, 98, 99, 100, 101].
9.  **Task 9: LRU Cache Core Logic** — Creating the orchestrator class tying the list and table operations together[cite: 102, 104, 112].
10. **Task 10: Capacity Handling and Testing** — Enforcing max capacity eviction rules and verifying edge cases[cite: 119, 121, 122, 123, 124, 128].

---

## 🚦 Testing & Verification Requirements
The test cases validate system integrity under the following criteria[cite: 124]:
* Inserting elements past the maximum capacity limit to trigger eviction[cite: 125, 127, 131, 133].
* Repeatedly accessing existing keys to verify priority shifts to the front[cite: 128, 132].
* Correctly updating existing values without causing structure duplication[cite: 126, 134].
* Handling edge cases such as manual removals and empty cache queries[cite: 128, 135].

---

## 🎓 Course Details
* **University:** Alexandria University (جامعة الإسكندرية) [cite: 4, 5]
* **Faculty:** Faculty of Computers and Data Science [cite: 1, 6]
* **Course:** Data Structures (Spring 2026) [cite: 1, 2]
* **Team Size:** 10 Members [cite: 7]
* **Deliverables:** Clean, modular Java source code and a comprehensive engineering report[cite: 136, 137, 138].
