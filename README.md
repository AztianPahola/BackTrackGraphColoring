# Problem Statement
Given a "graph" or "map" of N different regions - in this project represented as a matrix of the regions and their bordering regions - determine if,  
given M (user input) possible colors, it's possible to color the entire graph without any bordering regions being the same color.

# Solution Summary
Using back-tracking methodology, implement a recursive function which will iterate through region 1 thru n, attempting to assign each region with color  
1 thru m, using the matrix of bordering region to determine if using the given color will work.

# Improvements Over Textbook Implementation
With the example given in class, my method doesn't have much improvement, but I believe in terms of scalability, mine is much better. The  
promising method in the textbook, especially when dealing with larger maps, has a high chance of going through unnecessary loops.  
  
e.g. If we were to use this method on the continental U.S., and let's say we are on our final iteration and we are trying to color in Kentucky, which only  
borders 7 other states, the textbook method is highly likely to go through many 'falses' in the T/F matrix - potentially even 49 - before finding a state that does border and  
does conflict color wise. My method, on the other hand would at most look at the 7 bordering states before deciding KY is a valid color or not.