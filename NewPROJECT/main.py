text_file = open('PoiskSTR.txt', 'r')
text = text_file.read()
from collections import Counter

text = text.lower()
words = text.split()
words = [word.strip('.,;') for word in words]

unique = []
for word in words:
    if word not in unique:
        unique.append(word)
c = Counter(words)

print('\n', unique, "\nВсего: ", len(unique), '\n')
print(c)

with open ('PoiskSTR.txt', 'r') as f:
  old_data = f.read()

new_data = old_data.replace('.', '')

with open ('PoiskSTR.txt', 'w') as f:
  f.write(new_data)

with open ('PoiskSTR.txt', 'r') as g:
  old_data1 = g.read()

new_data = old_data1.replace(',', '')

with open ('PoiskSTR.txt', 'w') as g:
  g.write(new_data)


from random import randint
text_file = open('zd2.txt', 'r')
text = text_file.read()
