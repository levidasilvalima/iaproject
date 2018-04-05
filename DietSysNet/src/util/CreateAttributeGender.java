package util;

import java.util.Arrays;
import java.util.HashSet;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.SymbolFct;

public class CreateAttributeGender extends MyAttribute {

	private SymbolDesc sexDesc;
	
	public CreateAttributeGender(Project project, Concept diet) {
		super(project, diet);
		init();
	}

	@Override
	void init() {
		HashSet<String> sex = new HashSet<String>();
		String[] sexArray = { "M", "F" };
		sex.addAll(Arrays.asList(sexArray));

		try {
			sexDesc = new SymbolDesc(MyAttribute.diet, "gender", sex);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SymbolFct manuFct = sexDesc.addSymbolFct("genderFct", true);
		manuFct.setSimilarity("F", "F", 1.00d); 
		manuFct.setSimilarity("F", "M", 0.00d);
		manuFct.setSimilarity("M", "F", 0.00d);
		manuFct.setSimilarity("M", "M", 1.00d);
	}

	@Override
	SymbolDesc getSymbolDescription() {
		return sexDesc;
	}
}
