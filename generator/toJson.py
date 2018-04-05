import json

def my_split(fl):
    return fl.readline().split(":")[-1].replace("\n", "")

cases = {} 
id = 0   
with open("base.txt", "r") as fl:   
    while True:
        line = fl.readline()
        if line == '':
            break;
        case = {}
        case['name'] = line.split(":")[-1].replace("\n", "")
        case['gender'] = my_split(fl)
        case['ageRange'] = my_split(fl)
        case['diabetes'] = my_split(fl)
        case['cholesterol'] = my_split(fl)
        case['hypertension'] = my_split(fl)
        case['water'] = my_split(fl)
        case['processed'] = my_split(fl)    
        case['candy'] = my_split(fl)
        case['salad'] = my_split(fl)
        case['soda'] = my_split(fl)
        case['activity'] = my_split(fl)
        case['kidneys'] = my_split(fl)
        case['fries'] = my_split(fl)    
        case['salt'] = my_split(fl)
        case['sweetener'] = my_split(fl)
        case['fruits'] = my_split(fl)
        cases[id] = case
        id += 1
        print(id)         
with open("base.json", "w") as fl:
    json.dump(cases, fl)    
