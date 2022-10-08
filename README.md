⦁	One of the problems in this design is that it is built in a way that there is lots of code redundancy, and the entity class is not implemented in the best way.
⦁	By using the inheritance and create base classes it will be easier to maintain the code, but it needs lots of work in order to maintain it in this design
⦁	If any additional work is required like adding new entity-based objects, it means that there is more work to do, and in some cases, there are lots of unused functions in the child class
In addition, children in this design will take behaviors that they do not need Like the players will take MakeNoise functoin 
and if we adding a new monster which is fast and stealth that so hard 
so I solved the problem by adding an Interface (MakeNoise) and make function to make his behavior
Keeping the classes and inheritance as they are ,so i have 5 classes  
i put inside the entity class (move,render), and implements Monster class (MakeNoise)
and i override the functions in each class So it fits every type
if we woants to add new types of monster we just override the functions inside it


![image](https://user-images.githubusercontent.com/100956629/194719174-c799fdac-949c-495b-98cf-e3d250356a68.png)

