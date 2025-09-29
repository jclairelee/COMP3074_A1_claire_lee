# Payment Logger (A1_claire_lee)

Android application for logging and displaying user payments.  
Built in **Java** with Android Studio.

---

## 🚀 Build & Run

- Android Studio Hedgehog (or newer)
- Minimum SDK: 21
- Language: Java
- Run on emulator or physical device

---

## ✨ Features

- Input: number of hours worked and hourly rate
- Calculation:
  - Base pay (first 40 hours)
  - Overtime pay (>40h at 1.5× rate)
  - Total pay
  - Tax (18%)
- Validation with error messages (Toast)
- Success message and log entry on valid input
- **History screen** (`DetailActivity`) showing a list of logged payments via `ListView`
- Menu in `MainActivity` to navigate to `DetailActivity`
- Back (Up) navigation configured in manifest

---

## 📋 Assignment Requirements (COMP3074)

- Two activities:
  - **MainActivity** → main functionality (input, calculation, logging)
  - **DetailActivity** → list of logged payments
- DetailActivity accessible via menu option
- Up navigation configured in manifest
- Input validation with success/error messages
- Display of pay, overtime, total, and tax
- History implemented with `ListView`
- Project hosted on GitHub with **20+ commits**
- Submission includes **AI Usage Declaration PDF**

---

## 📝 Notes

- Data is stored in-memory (`PaymentsRepo`). Closing/restarting the app clears history.
- This implementation matches the requirements for **Assignment 1 (COMP3074 F2025)**.
