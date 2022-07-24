## 
We explore the ways we can return a sorted list of objects from two lists that accept different type-parameters.  
Even though the type-parameters are different between the two lists, they inherit from the same abstract class, and thus can be added into the same list.  
There are two different ways we can merge the 2 input lists into the final output list:
  * Adding into a TreeSet
  * Adding into a List and then sorting it.

### Adding into a TreeSet
* In terms of readability, adding to a TreeSet is more concise and expresses the problem more clearly, because it implies the ordering necessary in the result.
* In terms of performance, the TreeSet solution is faster than the List solution by 40%.
* The TreeSet api is also applicable in future business scenerios,

