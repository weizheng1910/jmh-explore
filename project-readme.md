## Scenario
We explore the ways we can return a sorted list from two lists which have different type-parameters but inherit from the same abstract class.  
There are two different ways to return such a sorted list,
  * One, is to add the two lists into a TreeSet.
  * Two, is to add the lists into s List and then sorting it.

### Adding into a TreeSet
* In terms of readability, adding to a TreeSet is more concise. The problem is expressed more clearly, because the data structure implies the ordering necessary in the result.
* In terms of performance, the TreeSet solution is faster than the List solution by 40%.
* Methods in the TreeSet Api is also applicable in future business scenerios.

## Adding into a List then sorting it
* It's a rudimentary way of merging the list, a way commonly chosen by developers who have basic to no knowledge of computer science.

## Big-O Analysis between the two ways
### Adding into Tree Set
* The complexity for adding a single element, k, is 0 < k <= log(N)
* Since we add N elements, N x k which is approximately, N x log(N),
### Adding into List 
* While adding one element into an ArrayList takes constant time. The occassional O(N) addition to copy to a larger array, becomes more prominent.
* Together with a mergesort which takes Nlog(N), we have N + NlogN.

## JMH Benchmarking
* Consistent with the Big-O-analysis, adding into a TreeSet is faster than adding into a List first then sorting it.

