# Temperature Converter (C)
A command-line temperature converter written in C, built in three progressive versions — practicing `scanf` format-string behavior, floating-point precision, and function extraction along the way.

This project was originally developed across three Git branches (one per stage). The progression is preserved here as three separate files instead, so each stage stays viewable without needing to switch branches.

## Version structure

| File | What it adds |
|---|---|
| `task1.c` | Celsius ↔ Fahrenheit conversion |
| `task2.c` | Adds Kelvin as a third supported unit |
| `task3.c` | Extracts the unit-detection logic into a `toCelcius()` function |

To view any version, just open the file directly — `task1.c`, `task2.c`, or `task3.c`.

## Features
- **Single-input parsing** — reads a temperature and its unit from one line, e.g. `37C` or `37 C`
- **Celsius, Fahrenheit, and Kelvin support** (from `task2.c` onward)
- **Prints all other units at once** — e.g. entering a Celsius value prints both the Fahrenheit and Kelvin equivalents
- **Invalid input handling** — prints a clear message if the unit isn't recognized
- **Function-based unit conversion** (`task3.c`) — a single `toCelcius()` function handles all unit detection, so adding a future unit only means editing one function instead of duplicating logic per version

## Built With
- C (compiled with GCC)
- `<stdio.h>` for input/output

## Getting Started

### Prerequisites
- GCC (or any standard C compiler)

### Build & Run
```bash
gcc task1.c -o task1     # or task2.c / task3.c depending on version
./task1                  # on Windows: task1.exe
```

## Windows note: displaying the ° symbol correctly
Because these files are saved as UTF-8, the ° character is stored as two bytes (`0xC2 0xB0`), not one. Windows terminals sometimes decode those two bytes using a different code page (like Windows-1252) instead of UTF-8, misreading them as `Â°` — same bytes, wrong "alphabet" used to read them. Two ways to fix it:
- run `chcp 65001` once in your PowerShell terminal before running the program, or
- uncomment the `<windows.h>` / `SetConsoleOutputCP(CP_UTF8)` lines at the top of the file, which forces the fix into the program itself (Windows-only — remove them if building on Linux/Mac)

## Usage
```
Enter Your Temperature With It's Unit (C/F): 37C
Result: 37.00 °C
Result: 98.60 °F
Result: 310.15 °K
```

## Project Structure
```
temperature-converter/
├── task1.c        # C/F converter
├── task2.c        # C/F/K converter (adds Kelvin)
├── task3.c         # Refactored with toCelcius() function
└── README.md
```

## Possible Future Improvements
- Loop to allow multiple conversions per run instead of exiting after one
- Add more units (e.g. Rankine) — thanks to `toCelcius()`, this only needs one new branch inside that function plus one new formula

## Author
Aysuda — [@Aysuda-j](https://github.com/Aysuda-j)
