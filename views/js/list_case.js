var SOURCECASE = {"name": "Ana Tereza de A. Vasques", "gender": "Mulher", "ageRange": "19-30", "diabetes": "N\u00e3o", "cholesterol": "N\u00e3o", "hypertension": "Sim", "water": "Pouco", "processed": "Pouco", "candy": "Normal", "salad": "Normal", "soda": "Pouco", "activity": "Nenhum", "kidneys": "Bastante", "fries": "Nenhum", "salt": "Normal", "alcohol": "Normal", "fruits": "Bastante"};
var BESTCASE = {"name": "Brisa Silva Bracchi", "gender": "Mulher", "ageRange": "61--", "diabetes": "Sim", "cholesterol": "N\u00e3o", "hypertension": "N\u00e3o", "water": "Normal", "processed": "Bastante", "candy": "Normal", "salad": "Pouco", "soda": "Pouco", "activity": "Pouco", "kidneys": "Pouco", "fries": "Pouco", "salt": "Pouco", "alcohol": "Normal", "fruits": "Nenhum"};

var ATRIBUTES = {"name": "Nome", "gender": "Gênero", "ageRange": "Faixa Etária", "diabetes": "Diabetes", "cholesterol": "Colesterol", "hypertension": "Hipertensão", "water": "Frequência em Consumo de Água", "processed": "Consumo de Embutidos", "candy": "Consumo de Guloseimas", "salad": "Consumo de Salada", "soda": "Consumo de Refrigerante", "activity": "Nível de Atividade", "kidneys": "Problemas Renais", "fries": "Consumo de Frituras", "salt": "Consumo de Sal", "alcohol": "Consumo de Álcool", "fruits": "Consumo de Frutas"};

function createTable(sourceCase, compCase) {
	console.log("levi");
	var sourceName = document.getElementById("name_source_case");
	var compName = document.getElementById("name_comp_case");

	sourceName.innerHTML = sourceCase['name'];
	compName.innerHTML = compCase['name'];
	Object.keys(sourceCase).forEach( function (attribute) { 
		if(attribute != 'name') {
			var table = document.querySelector("#attribute_table");

			var attTr = createAttributeRow(attribute, sourceCase[attribute], compCase[attribute]);

			table.appendChild(attTr);
			
		}
	});
};

function createAttributeRow(descAtt, sourceAtt, compAtt) {
    var attTr = document.createElement("tr");
    attTr.classList = "table-row";
    attTr.appendChild(buildTdText(ATRIBUTES[descAtt]));
    attTr.appendChild(buildTdText(sourceAtt));
    attTr.appendChild(buildTdText(compAtt));
    return attTr;
};


function buildTdText(data) {
    var td = document.createElement("td");

    td.textContent = data;

    return td;
};

createTable(SOURCECASE, BESTCASE);