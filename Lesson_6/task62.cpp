#include<iostream>
#include<string>
#include<cmath>
using namespace std;

class Number{
public:
    virtual double doubleValue() = 0;
};

class Logarithm : public Number {
private:
    double base, argument;
public:
    double doubleValue() { return log(this->argument) / log(this->base);}
    Logarithm(double inputBase, double inputArgument) {

            if(inputBase>0 and inputBase != 1){
                this -> base = inputBase;
            }else{
                throw;
            }

            if(inputArgument>0){
                this -> argument = inputArgument;
            }else{
                throw;
            }

    }
};

int main(){

    

};
