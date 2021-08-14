#include <iostream>
#include <string>

int main()
{
    int val1;
    int val2;
    std::string str;

    std::cout << "Calculator - C++\n";
    std::cin >> val1;
    std::cin >> str;
    std::cin >> val2;
    std::cout << "=\n";
    if (str == "+")
    {
        int val3 = val1 + val2;
        std::cout << val3;
    }
    else if (str == "-")
    {
        int val3 = val1 - val2;
        std::cout << val3;
    }
    else if (str == "*")
    {
        int val3 = val1 * val2;
        std::cout << val3;
    }
    else if (str == "/")
    {
        int val3 = val1 / val2;
        std::cout << val3;
    }
    //im new to c++ ok lol idk how i would do this otherwise xD
    std::string iambadlol;
    std::cin >> iambadlol;
}