# import WhitespaceTokenizer() method from nltk 
from nltk.tokenize import WhitespaceTokenizer 
	
# Create a reference variable for Class WhitespaceTokenizer 
tk = WhitespaceTokenizer() 
	
# Create a string input 
gfg = "KIITUNiversity \nis\t situated at\tBhubaneswar"
	
# Use tokenize method 
t = tk.tokenize(gfg) 
	
print(t) 
