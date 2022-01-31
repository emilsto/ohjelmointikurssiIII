#pragma once
#include <iostream>
#include "Opiskelija.h"
using namespace std;

class Harjoittelija : public Opiskelija
{
private:
    /* data */
    string mTyopaikka;
    float mPalkka;

public:
    // Rakentaja / purkaja
    Harjoittelija();
    Harjoittelija(const string& aNimi, const string& aOpiskelijanumero, const string& aTyopaikka, float aPalkka);
    ~Harjoittelija();
    // Muut metodit
    void setTyopaikka( const string& aTyopaikka);
    void setPalkka(float aPalkka);

    // ToDo: getterit ja setterit työpaikalle ja palkalle

    //Uudelleen määritelty aliluokan metodi == override
    void tulostaTiedot() const;

};
