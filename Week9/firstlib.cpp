/*
* g++ -c firstlib.cpp -o firstlib.o
* ar rcs libFirstLib.a firstlib.o
* g++ main.cpp -L. -lFirstLib -o main
* ./main
*/
#include <iostream>
#include "firstlib.h"
using namespace std;
void printGreeting()
{
cout << "Welcome to C++ Library Programming" << endl;
}

string getMyLocation(string loc){
	
	string location_to_return = "Your location is: " + loc;	
	
	return location_to_return;
}

void weatherForecast(int ndays){

	if (ndays <= 0 || ndays > 3)
		cout << "Invalid number of days" << endl;
	else{
		for (int i = 1; i <= ndays; i++){
			
			cout << "/nDay: " << i << endl;
			cout << "High: " << i*10 << " deg C" <<  endl;
			cout << "Low: " << i*8 << " deg C" << endl;
			cout << "Predicted Rainfall: " << i << " inch(es) of rain" << endl;
			cout << "Windspeed: " << i*10 << "mph" << endl;
			
			if (i == 1)
				cout << "Wind-Direction: North" << endl;
			else if (i == 2)
				cout << "Wind-Direction: South" << endl;
			else 
				cout << "Wind-Direction: East" << endl;
		}

	}
		

}


