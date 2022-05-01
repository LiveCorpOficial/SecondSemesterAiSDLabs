from random import randint
text_file = open('zd2.txt', 'r')
text = text_file.read()

random_position = randint(0, len(text))
new_text = text[:random_position] + '*' + text[random_position:]

save_changes = open ('zd2.txt', 'w')

save_changes.writelines(new_text)
