#include<bits/stdc++.h>

using namespace std;
string boolean[] = {"Sim", "Não"};
string ageRange[] = {"10-18", "19-30", "31-60", "61--"};
string gender[] = {"Homem", "Mulher"};
string multiVal[] = {"Nenhum", "Pouco", "Normal", "Bastante"};
string name;

int main() {
	srand(time(NULL));
	int idx;
	while(getline(cin, name) && name != "Homem") {
		cout << "name:" << name << endl;
		cout << "gender:Mulher" << endl;

		idx = rand() % 4;
		cout << "ageRange:" << ageRange[idx] << endl;

		idx = rand() % 2;
		cout << "diabetes:" << boolean[idx] << endl;

		idx = rand() % 2;
		cout << "cholesterol:" << boolean[idx] << endl;

		idx = rand() % 2;
		cout << "hypertension:" << boolean[idx] << endl;

		idx = rand() % 4;
		cout << "water:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "processed:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "candy:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "salad:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "soda:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "activity:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "kidneys:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "fries:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "salt:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "alcohol:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "fruits:" << multiVal[idx] << endl;

	}

	while(getline(cin, name)) {
		cout << "name:" << name << endl;
		cout << "gender:Homem" << endl;

		idx = rand() % 4;
		cout << "ageRange:" << ageRange[idx] << endl;

		idx = rand() % 2;
		cout << "diabetes:" << boolean[idx] << endl;

		idx = rand() % 2;
		cout << "cholesterol:" << boolean[idx] << endl;

		idx = rand() % 2;
		cout << "hypertension:" << boolean[idx] << endl;

		idx = rand() % 4;
		cout << "water:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "processed:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "candy:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "salad:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "soda:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "activity:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "kidneys:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "fries:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "salt:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "sweetener:" << multiVal[idx] << endl;

		idx = rand() % 4;
		cout << "fruits:" << multiVal[idx] << endl;

	}
	return 0;
}