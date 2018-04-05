package util;

import java.util.Arrays;
import java.util.HashSet;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.SymbolFct;

public class CreateAttributeDiabetes extends MyAttribute {

	private SymbolDesc diabetesDesc;
	
	public CreateAttributeDiabetes(Project project, Concept diet) {
		super(project, diet);
		init();
	}

	@Override
	void init() {
		HashSet<String> diabetes = new HashSet<String>();
		String[] diabetesArray = { "S", "N" };
		diabetes.addAll(Arrays.asList(diabetesArray));

		try {
			diabetesDesc = new SymbolDesc(MyAttribute.diet, "diabetes", diabetes);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SymbolFct manuFct = diabetesDesc.addSymbolFct("diabetesFct", true);
		manuFct.setSimilarity("S", "S", 1.00d);
		manuFct.setSimilarity("S", "N", 0.00d);
		manuFct.setSimilarity("N", "S", 0.00d);
		manuFct.setSimilarity("N", "N", 1.00d);
	}

	@Override
	SymbolDesc getSymbolDescription() {
		return diabetesDesc;
	}

}
