#pragma once
#include <string>
using namespace std;

class Opiskelija{
private:
    /* data */
    string mNimi;
    string mOpiskelijanumero;
    unsigned short int mOpintopisteet;
public:
    Opiskelija(/* args */);
    Opiskelija(const string& aNimi, const string& aOpiskelijanumero);
    ~Opiskelija(); //kutsutaan automaattisesti kun olio vapautetaan

    //Metodit (API)
    void setNimi( const string& aNimi);
    void setOpiskelijanumero(const string& aOpiskelijanumero);
    void setOpintipisteet(unsigned short int& aOpintopisteet);

    string getNimi() const;
    string getOpiskelijanumero() const;
    unsigned short int getOpintopisteet() const;

    //virtual -avainsana tuo dynaamisen sidonnan eli ajonaikaisesti katsotaan, löytyykö aliluokalta totetus
    //dynaaminen sidonta
    virtual void tulostaTiedot() const; 

};
