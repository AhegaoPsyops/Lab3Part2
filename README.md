Lab4: improvement of Lab3 of CSV data parser and a visualization

Design Patterns:
dataVisualizer - Facade
Improving by no longer making it the main driver, but instead a class that can be called with options to edit what rows are being visualized. 
This makes it repeatable for optioned user .txt files, but also contains default data presentation for default data set. 
Wraps all of the GUI elements into a single class that can be modified by outside code to change based on presentation needs. 

Funny enough, why make it an entire java class when Grep in linux can do exactly that in a single line. 
