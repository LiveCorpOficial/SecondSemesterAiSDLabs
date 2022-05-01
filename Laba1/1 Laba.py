def filt(s):
    ru = set('абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ')
    en = set('wertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM')
    nu = set('1234567890')
    a = s & ru
    b = s & en
    c = s & nu
    return a, b, c


if __name__ == '__main__':
    mass = set(input('Введите строку символов:\n'))
    print('Множество: ')
    print(*mass)
    rus, lat, num = filt(mass)
    print('Русские буквы: ')
    print(*rus)
    print('Латинские буквы: ')
    print(*lat)
    print('Цифры: ')
    print(*num)
