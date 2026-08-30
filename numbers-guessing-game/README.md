# Number Guessing Game
 
A console-based number guessing game written in Java, in the spirit of *Mastermind* / *Bulls and Cows*. The program secretly generates a number made of unique digits, and the player has a limited number of guesses to figure it out — after each guess, the game reveals how many digits were correct, and how many of those are in the exact right position.
 
This repository doubles as a learning log: rather than one final version, it's organized into **three branches**, each representing a step in building the game up from a simple hardcoded version into a properly structured one.
 
## Branches
 
| Branch | Description |
|---|---|
| [`main`](../../tree/main) | **Task 1** — The original version. Always generates a 4-digit secret number with unique digits, capped at 10 guesses. |
| [`task2`](../../tree/task2) | **Task 2** — Generalized to any digit count. The player chooses how many digits (e.g. 4, 5, 6...), and the max number of guesses scales with it (`2.5 × digitCount`). |
| [`task3`](../../tree/task3) | **Task 3** — Refactor of Task 2. Same behavior, but the logic is broken out into separate functions (`generateNumber`, `countCorrectPlace`, `countFound`, `playGame`) instead of living entirely in `main`. |
 
Each branch builds directly on top of the previous one's commit history, so `git log --oneline` on `task3` shows the full progression from Task 1 through Task 3.
 
## How to Play
 
1. The game picks a secret number with **no repeated digits**.
2. You type in a guess of the same length.
3. After each guess, you're told:
   - How many of your digits exist *somewhere* in the secret number.
   - How many of those are in the *correct position*.
4. Guess the number exactly, in the right order, before you run out of attempts.
**Example** (Task 2/3, with a 4-digit number):
```
Enter Number of Digits: 4
Please Guess the Number: 1234
Guess 1: 1234: 2 numbers are found, and 1 of them are in the correct place!
```
 
## Running a Version
 
Each branch is self-contained. Check out the one you want, then compile and run it:
 
```bash
git checkout task2          # or main / task3
javac task2.java            # match the filename to the branch's task
java task2
```
 
## Why Branches Instead of One Final Version?
 
The point of this repo isn't just the finished game — it's the process of getting there: starting from a quick hardcoded prototype, generalizing it, and then cleaning up the structure. Keeping each stage on its own branch means the progression stays visible and each version stays runnable on its own, instead of being overwritten by the next.
 
