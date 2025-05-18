#Extracting email addresses using regular expressions in Python
# Python program to extract emails From the String By Regular Expression. 
import re 
s = """Hello from shubhamg199630@gmail.com 
		to priya@yahoo.com about sdashfca@kiit.ac.in the meeting @2PM"""

# \S matches any non-whitespace character 
# @ for as in the Email 
# + for Repeats a character one or more times 
lst = re.findall('\S+@\S+', s)	 
# Printing of List 
print(lst) 
