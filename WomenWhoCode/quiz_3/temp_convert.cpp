#include <iostream>

using namespace std;


void convert_temp();
float to_celsius(float fahrenheit);

int main(){
	convert_temp();
}

void convert_temp(){
	float f = 0.0;
	float c = 0.0;

	cout << "Temperature Conversion!\n\n";
	cout << "Enter fahrenheit degree: \n\n";
	cin >> f;
	c = to_celsius(f);
	cout << "Degrees celsius: " << c << endl;

}

float to_celsius(float fahrenheit){
	float celsius = (fahrenheit - 32.0) * 5.0/9.0;
	return celsius;
}

