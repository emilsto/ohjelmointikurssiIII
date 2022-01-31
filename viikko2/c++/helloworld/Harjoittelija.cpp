#include "Harjoittelija.h"

Harjoittelija::Harjoittelija() : Opiskelija(), mTyopaikka("tuntematon"), mPalkka(0)
{
    cout << "Harjoittelijan oletusrakentaja" << endl;
}

Harjoittelija::Harjoittelija(const string& aNimi, const string& aOpiskelijanumero, const string& aTyopaikka, float aPalkka)
    : Opiskelija(aNimi, aOpiskelijanumero), mTyopaikka(aTyopaikka), mPalkka(aPalkka)
{
    cout << "Harjoittelijan 4 parametrinen rakentaja " << endl;
}

Harjoittelija::~Harjoittelija()
{
    cout <<"Opiskelija " << getNimi() << " vapautettu muistista" << endl;
}


//ToDo getterit ja setterit

void Harjoittelija::setTyopaikka( const string& aTyopaikka)
{
    mTyopaikka = aTyopaikka;
}
void Harjoittelija::setPalkka(float aPalkka)
{
    mPalkka = aPalkka;
}

void Harjoittelija::tulostaTiedot() const
{
    // voidaan tylostaa myös ensin kantaluokan tulostus, esim. Opikselija::tulostaTiedot();
    cout << "Nimi: " << getNimi() << endl;
    cout <<"Opintopisteet: " << getOpintopisteet() <<endl;
    cout << "Harjoittelupaikka: " << mTyopaikka <<endl;
    cout << "Palkka: " << mPalkka << endl;
}