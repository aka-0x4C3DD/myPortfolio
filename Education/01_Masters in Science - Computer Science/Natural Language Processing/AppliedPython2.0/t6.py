#The code uses regular expressions to find and list word characters, 
#sequences of word characters, and non-word characters in input strings.
#It provides lists of the matched characters or sequences.
import re 
p = re.compile('\w') 
print(p.findall("He said * in some_lang.")) 

p = re.compile('\w+') 
print(p.findall("I went to him at 11 A.M., he said *** in some_language.")) 

p = re.compile('\W') 
print(p.findall("he said *** in some_language.")) 
