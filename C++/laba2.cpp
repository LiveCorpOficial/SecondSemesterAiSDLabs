#include <iostream>
#include <string>
#include <algorithm>
#include <fstream>
#include <ctime>
#include <utility>
#include <set>
#include <map>
#include <sstream>
#include <vector>
#define DIGITSFILENAME "digits.txt"
#define SYMBOLFILENAME "symbols.txt"
#define STRINGFILENAME "nstrings.txt"

using namespace std;

void task1(){
    std::ofstream fout(DIGITSFILENAME, std::ios_base::trunc);
    const int numbersCount = 100;

    srand((unsigned)time(0));

    for (std::size_t i = 0; i < numbersCount; ++i){
        int random = (rand() % 200) - 50;
        fout << random << std::endl;
    }

    fout.close();

    std::ifstream fin(DIGITSFILENAME);

    if (!fin.is_open()) // если файл не открыт
        std::cout << "Can't open file!" << std::endl;

    int positive = 0;
    int negative = 0;

    while (fin) {
        int num;
        fin >> num;

        if (num > 0) positive++;
        else if (num < 0) negative++;
    }
    std::cout << "Count of negative digits: " << negative << " positive: " << positive << std::endl;

    fin.close();
}

//void task2(){
//    std::ofstream fout(SYMBOLFILENAME, std::ios_base::trunc);
//    const int COUNT = 1000;
//
//    srand((unsigned)time(0));
//
//    for (std::size_t i = 0; i <= COUNT; ++i) {
//        int random = (rand() % 93) + 33;
//        fout << char(random);
//    }
//
//    fout << std::endl;
//
//    std::ifstream fin(SYMBOLFILENAME);
//
//    std::cout << "Enter letter and position: ";
//    char letter;
//    std::size_t pos;
//
//    std::cin >> letter >> pos;
//
//    std::fstream file;
//
////    file.open(SYMBOLFILENAME);
////    file.seekp(pos);
////    file.put(letter);
////    file.close();
//
//    char tmp;
//    for (std::size_t i = pos; i <= COUNT; i++) {
//        fin.seekg(i);
//        fin >> tmp;
//        fout.seekp(i + 1);
//        fout << tmp;
//    }
//
//    if (pos < COUNT) {
//        fout.seekp(pos);
//        fout << letter;
//    } else std::cout << "Position must be less than symbols count" << std::endl;
//
//    fout.close();
//    fin.close();
//}

void task2()
{
    string symb;
    cout << "Enter string: "; cin >> symb;

    int stroka;
    cout << "Enter rows: "; cin >> stroka;

    int pozic;
    cout << "Enter column: "; cin >> pozic;
/*ofstream fout;
fout.open("2 task.txt");
for (int i = 1; i < stroka; i++)
{
fout « "\n";
}
for (int i = 1; i < pozic; i++)
{
fout « " ";
}
fout « symb;
fout.close();*/

    ifstream fin;
    fin.open(SYMBOLFILENAME);
    vector <string> stroki;
    string str = "";
    int count = 1;
    while (!fin.eof())
    {
        getline(fin, str);
        if (stroka == count)
        {
            if (str.length() >= pozic)
            {
                str.insert(pozic - 1, symb);
            }
            else
            {
                str.resize(pozic);
                str[str.length() - 1] = symb[0];
            }
        }
        count++;
        stroki.push_back(str);
    }
    fin.close();
    ofstream fout;
    fout.open(SYMBOLFILENAMEц);
    for (string a : stroki)
    {
        fout << a << '\n';
    }
    if (stroka > stroki.size())
    {
        for (int i = 1; i < stroka - stroki.size(); i++)
        {
            fout << '\n';
        }
        for (int i = 1; i < pozic; i++)
        {
            fout << " ";
        }
        fout << symb;
    }
    fout.close();
}

void task3(){
    std::ifstream fin(STRINGFILENAME);
    std::size_t n;

    std::cout << "Enter string number" << std::endl;

    std::cin >> n;

    std::size_t counter = 1;
    std::string buff;

    while (true) {
        if (!fin) {
            std::cout << "Lines count in file less than entered number" << std::endl;
            break;
        }

        std::getline(fin, buff);

        if (counter == n) {
            if (buff.length() == 0)
                std::cout << "This is empty string" << std::endl;
            std::cout << buff;
            break;
        }
        counter++;
    }
}

void task4() {
    std::ifstream fin(STRINGFILENAME);
    std::set<std::pair<std::size_t, std::size_t>> positionsSet;

    std::string substr;

    std::cout << "Enter substring: ";
    std::getline(std::cin, substr);

    std::string buff;
    std::size_t counter = 0;

    while (fin) {
        std::getline(fin, buff);
        std::size_t pos = buff.find(substr);
        if (pos != std::string::npos)
            positionsSet.insert(std::pair<std::size_t, std::size_t>(counter, pos));
        counter++;
    }

    std::cout << "All substring positions is: ";
    for (auto it = positionsSet.begin(); it != positionsSet.end(); it++)
        std::cout << '(' << it->first << ", " << it->second << ") ";
    std::cout << std::endl;
}
//
//void erasePunctuation(std::string& inp){
//    inp.erase(std::remove_if (inp.begin (), inp.end (), ispunct), inp.end ());
//}
//
//std::size_t howMany(const std::string& word, const std::map<std::string, std::size_t>& wordMap){ return wordMap.at(word); }
//
//void task5(){
//    std::ifstream fin(STRINGFILENAME);
//
//    std::map<std::string, std::size_t> wordsCount;
//
//    std::string buff;
//    while (fin) {
//        std::getline(fin, buff);
//        erasePunctuation(buff);
//        std::transform(buff.begin(), buff.end(), buff.begin(), tolower);
//
//        std::stringstream ss;
//        ss = std::stringstream(buff);
//        while (ss) {
//            std::string word;
//            ss >> word;
//            wordsCount[word]++;
//        }
//    }
//    int i = 0;
//    std::cout << "Unique words count: " << wordsCount.size() << std::endl;
//    for (auto it = wordsCount.begin(); it!= wordsCount.end(); it++) {
//        if (i != 0) {
//            std::cout << "Word " << it->first << " found " << it->second << " times" << std::endl;
//        } else {
//            i++;
//        }
//    }
//}


int main(){
//    task1();
    task2();
//    task3();
//    task4();
//    task5();

    return 0;

}