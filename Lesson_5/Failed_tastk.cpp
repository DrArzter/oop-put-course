#include <iostream>
#include <map>
#include <sstream>
#include <iomanip>

class FakeCantor {
private:
    std::map<std::string, float> rates{{"USD", 1.0366f},
                                       {"GBP", 0.87063f},
                                       {"CHF", 0.9881f},
                                       {"JPY", 145.12f}};
public:
    FakeCantor() = default;
    float EuroToRate(const std::string &currency) {
        return rates[currency];
    };
};

class Currency {
public:
    virtual Currency *AddedCurrency(float value, std::string currency) = 0;
    virtual Currency *SubtractedCurrency(float value, std::string currency) = 0;
    virtual std::string Abbreviation() = 0;
    virtual std::string Symbol() = 0;
    virtual std::string Balance() = 0;
    virtual float DollarExchangeRate() = 0;
};

class Euro : public Currency {

private:
    float value;

public:
    Euro* DollarExchangeRate(float factor)
    {
        Euro* e = new Euro(value * factor);
        return e;
    }


};

int main() {

    Euro.Balance = (10);
    Euro* Added

    return 0;

}
