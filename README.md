Lab4: improvement of Lab3 of CSV data parser and a visualization

Design Patterns:
dataVisualizer - iterator
Improving by no longer making it the main driver, but instead a class that can be called with options to edit what rows are being visualized. 
This makes it repeatable for optioned user CSV files, but also contains default data. 

Funny enough, why make it an entire java class when Grep in linux can do exactly that in a single line. 
