# Palindrome Checker (C)

A command-line Palindrome Checker written in C, built as a second hands-on project to practice string manipulation, boolean flags, and the two-pointer technique.

## Features

- **Reads user input** — accepts a word (or short phrase) via safe input handling with `fgets`
- **Checks for palindromes** — uses the two-pointer method, comparing characters from both ends of the word moving inward, with an early exit as soon as a mismatch is found
- **Displays the result** — clearly states whether the input is or isn't a palindrome
- **Prints the word forward and backward** — so the result can be visually confirmed by the user

## Built With

- C (compiled with GCC)
- `<string.h>` for string handling (`strlen`, `strcspn`)
- `<stdbool.h>` for the boolean palindrome flag

## Getting Started

### Prerequisites

- GCC (or any standard C compiler)

### Build & Run

```bash
gcc main.c -o main
./main        # on Windows: main.exe
```

### Usage

Run the program and enter a word when prompted:

```
Enter Your Word: level
It Is A Palindrome.
l    e    v    e    l
l    e    v    e    l
```

```
Enter Your Word: hello
Is Not A Palindrome!
h    e    l    l    o
o    l    l    e    h
```

## How It Works

Instead of building a full reversed copy of the word, this program uses two markers — one starting at the beginning of the word, one at the end — that walk toward each other, comparing characters as they go. If any pair doesn't match, a `bool` flag is flipped to `false` and the loop stops immediately, since there's no need to keep checking. This is more memory-efficient than reversing the whole string, and can finish early instead of always checking every character.

## Project Structure

```
.
├── main.c        # All program logic
└── .gitignore    # Excludes compiled binaries from version control
```

## Possible Future Improvements

- Ignore spaces, punctuation, and capitalization to support phrases (e.g., "A man a plan a canal Panama")
- Handle multiple words in a single run without restarting the program
- Add input validation for empty input

## Author

**Aysuda** — [@Aysuda-j](https://github.com/Aysuda-j)
