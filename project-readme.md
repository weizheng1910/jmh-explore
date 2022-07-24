## Scenario
We explore the ways we can return a sorted list from two lists which have different type-parameters that inherits from the same abstract class.  
There are two different ways to do so,
  * One, is to add the two lists into the TreeSet.
  * Two, is to add the lists into List and then sorting it.

### Adding into a TreeSet
* In terms of readability, adding to a TreeSet is more concise. The problem is expressed more clearly, because the data structure implies the ordering necessary in the result.
* In terms of performance, the TreeSet solution is faster than the List solution by 40%.
* The TreeSet api is also applicable in future business scenerios,

## Adding into a List then sorting it
* It's a rudimentary way of merging the list.
