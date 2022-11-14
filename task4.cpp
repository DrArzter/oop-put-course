#include<iostream>
#include <string>
using namespace std;

class smartphone
{
public:
    virtual std::string price() = 0;

};

class iPhone: public smartphone
{
private:

    string model;
    float pay;

public:

    iPhone increse_price(float increase)
    {
        return std::to_string(pay + increase); /*Can't be implemented in C++*/

    }

    iPhone(float x, string m){
        model = m;
        pay = x;
    }

    std::string price()
    {
        return std::to_string(pay);
    }

};

int main()
{

    iPhone i(75.55,"XII");
    std::cout <<  i.price();


}
