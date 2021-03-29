# Problem Statement
Given a "graph" or "map" of N different regions - in this project represented as a matrix of the regions and their bordering regions - determine if,  
given M (user input) possible colors, it's possible to color the entire graph without any bordering regions being the same color.

# Solution Summary
Using back-tracking methodology, implement a recursive function which will iterate through region 1 thru n, attempting to assign each region with color  
1 thru m, using the matrix of bordering region to determine if using the given color will work.