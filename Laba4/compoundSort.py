import time
import random


def quick_sort(alist):
    if len(alist) <= 1:
        return alist
    l_nums, p_nums, b_nums = [], [], []
    pivot = random.choice(alist)
    for i in alist:
        if i < pivot:
            l_nums.append(i)
        if i > pivot:
            b_nums.append(i)
        if i == pivot:
            p_nums.append(i)
    return quick_sort(l_nums) + p_nums + quick_sort(b_nums)


def viborom(alist):
    iteratsii = 0
    compare = 0
    exchange = 0
    for i in range(0, len(alist) - 1):
        smallest = i
        for j in range(i + 1, len(alist)):
            iteratsii += 1
            if alist[j] < alist[smallest]:
                compare += 1
                smallest = j
        alist[i], alist[smallest] = alist[smallest], alist[i]
        exchange += 1
    return [iteratsii, compare, exchange]


def vstavka(alist):
    iteratsii = 0
    sravn = 0
    obmen = 0
    for i in range(len(alist)):
        cursor = alist[i]
        pos = i
        while pos > 0 and alist[pos - 1] > cursor:
            iteratsii += 1
            sravn += 1
            obmen += 1
            alist[pos] = alist[pos - 1]
            pos = pos - 1
        alist[pos] = cursor
        obmen += 1
    return [iteratsii, sravn, obmen]


def pyzir(alist):
    iteratsii = 0
    sravn = 0
    obmen = 0
    n = len(alist)
    for i in range(0, n):
        for j in range(0, n - 1 - i):
            iteratsii += 1
            sravn += 1
            if alist[j] > alist[j + 1]:
                obmen += 1
                alist[j], alist[j + 1] = alist[j + 1], alist[j]
    return [iteratsii, sravn, obmen]


def fustSort(alist):
    iteratsii = 0
    sravn = 0
    iteratsii += 1
    if len(alist) <= 1:
        return [1, 1]
    l_nums, p_nums, b_nums = [], [], []
    pivot = random.choice(alist)
    for i in alist:
        if i < pivot:
            sravn += 1
            l_nums.append(i)
        if i > pivot:
            sravn += 1
            b_nums.append(i)
        if i == pivot:
            sravn += 1
            p_nums.append(i)
    temp_l_nums = fustSort(l_nums)
    temp_b_nums = fustSort(b_nums)
    iteratsii += temp_l_nums[0]
    iteratsii += temp_b_nums[0]
    sravn += temp_l_nums[1]
    sravn += temp_b_nums[1]
    return [iteratsii, sravn]


def rand(*args):
    alist = []
    for x in range(0, args[0]):
        alist.append(random.randint(0, 100))
    if len(args) == 2:
        if args[1] == 0:
            return quick_sort(alist)
        if args[1] == 1:
            alist = quick_sort(alist)
            return alist[::-1]
        if args[1] == 25:
            sorted_list_len = int(len(alist) / 4)
            return quick_sort(alist[:sorted_list_len]) + alist[sorted_list_len:]
        if args[1] == 50:
            sorted_list_len = int(len(alist) / 2)
            return quick_sort(alist[:sorted_list_len]) + alist[sorted_list_len:]
        if args[1] == 75:
            sorted_list_len = int(len(alist) / 4 * 3)
            return quick_sort(alist[:sorted_list_len]) + alist[sorted_list_len:]
    return alist


def table(property):
    len_list = [20, 50, 1000, 3000, 5000, 10000]
    alist = []
    #if property == -1:
     #   alist = input("Для 20 элементов введите их с клавиатуры, для рандомной генерации ничего\nВвод:").split()
      #  for i in range(len(alist)):
       #     alist[i] = int(alist[i])
    iteratsii = "Итерации"
    sravn = "Сравнения"
    obmen = "Обмены    "

    print(f"\t\t| %-10s |"
          f" %-7s {iteratsii} {sravn} {obmen} |"
          f" %-9s {iteratsii} {sravn} {obmen}|"
          f" %-11s {iteratsii} {sravn} {obmen}|"
          f" %-7s {iteratsii} {sravn} |" % (
              "Элементов",
              "Выбором",
              "Вставками",
              "Пузырьком",
              "Быстрой"))

    for i in len_list:
        print("\t\t| %-10d |" % i, end="")
        if len(alist) != 20:
            alist = rand(i, property)
        if i != 20:
            alist = rand(i, property)
        temp = alist.copy()
        sort_time = time.time()
        count = viborom(temp)
        print(" %-7f %-8d %-9d %-10d|" % ((time.time() - sort_time), count[0], count[1], count[2]), end="")
        temp = alist.copy()
        sort_time = time.time()
        count = vstavka(temp)
        print(" %-9f %-8d %-9d %-10d|" % ((time.time() - sort_time), count[0], count[1], count[2]), end="")
        temp = alist.copy()
        sort_time = time.time()
        count = pyzir(temp)
        print(" %-11f %-8d %-9d %-10d|" % ((time.time() - sort_time), count[0], count[1], count[2]), end="")
        temp = alist.copy()
        sort_time = time.time()
        count = fustSort(temp)
        print(" %-7f %-8d %-9d|" % ((time.time() - sort_time), count[0], count[1]))


def task():
    list_property = [-1, 0, 1, 25, 50, 75]
    name_property = {-1: "Стандартный",
                     0:  "Отсортированный массив",
                     1:  "Отсортированный в обратном порядке",
                     25: "Отсортированный на 25%",
                     50: "Отсортированный на 50%",
                     75: "Отсортированный на 75%"}
    for i in list_property:
        print(name_property[i])
        table(i)
        print("\n\n")


if __name__ == "__main__":
    task()
