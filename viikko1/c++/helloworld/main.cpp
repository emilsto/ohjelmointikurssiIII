#include <iostream>
#include "Opiskelija.h"

using namespace std;
int main(){

	//Luodaan opiskelija stackiin (automaattisesti vapautettava)
	Opiskelija pekka{"Kalle", "12345 "};
	pekka.tulostaTiedot();
	//Luodaan opiskelija heappin
	Opiskelija* jarkko = new Opiskelija("Jarkko", "33212"); // new tekee muistinvarauksen
	jarkko->tulostaTiedot();
	delete jarkko;

	cout<<"Hello world!" <<endl;

	return 0;
}