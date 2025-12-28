# Bubble Sort in Java

## Description
This program demonstrates the implementation of **Bubble Sort** in Java.
Bubble sort repeatedly compares **adjacent elements** and swaps them if they are in the wrong order until the array is sorted.

## How It Works (Ascending Order)
- Reads the size of the array
- Stores elements in an array
- Compares adjacent elements
- Swaps them if the left element is greater than the right element
- Uses a flag to stop early if the array is already sorted
- Repeats the process until the array is sorted in ascending order

## How It Works (Descending Order)
- Reads the size of the array
- Stores elements in an array
- Compares adjacent elements
- Swaps them if the left element is smaller than the right element
- Uses a flag to stop early if the array is already sorted
- Repeats the process until the array is sorted in descending order

## Input Format
<array_size>
<array_elements>

## Sample Input
5
5 1 4 2 8

## Output (Ascending Order)
1 2 4 5 8

## Output (Descending Order)
8 5 4 2 1

## Time Complexity
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

## Space Complexity
O(1)

## Characteristics
- In-place sorting
- Stable
- Adaptive (optimized version)

## File Name
Bsort.java
