# import these modules
from nltk.stem import PorterStemmer
from nltk.tokenize import word_tokenize

ps = PorterStemmer()

# choose some words to be stemmed
words = ["tried", "babies", "programmer", "programming", "programmers"]

for w in words:
	print(w, " : ", ps.stem(w))
