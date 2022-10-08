The problem with this design is multiple inheritance In addition, children in this design will take behaviors that they do not need Like the players will take MakeNoise functoin 
and if we adding a new monster which is fast and stealth that so hard 
so I solved the problem by adding an Interface to each behavior (MakeNoise,MakeRender,MakeMove) and make function inside each one to make his behavior and i implements these behaviors for Each class needs it 
Keeping the classes and inheritance as they are ,so i have 5 classes and 3 interfaces 
i implements the enitiy class (MakeRender,MakeMove) to prevent players take it, and implements Monster class (MakeNoise)
and i override the functions in each class So it fits every type
if we woants to add new types of monster we just override the functions inside it
