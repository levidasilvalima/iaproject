package util;

import java.util.Arrays;
import java.util.HashSet;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.SymbolFct;

public class CreateAttributeHypertension extends MyAttribute{

	private SymbolDesc hypertensionDesc;
	
	public CreateAttributeHypertension(Project project, Concept diet) {
		super(project, diet);
		init();
	}

	@Override
	void init() {
		HashSet<String> hypertension = new HashSet<String>();
		String[] hypertensionArray = { "S", "N" };
		hypertension.addAll(Arrays.asList(hypertensionArray));

		try {
			hypertensionDesc = new SymbolDesc(MyAttribute.diet, "hypertension", hypertension);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SymbolFct manuFct = hypertensionDesc.addSymbolFct("hypertensionFct", true);
		manuFct.setSimilarity("S", "S", 1.00d); 
		manuFct.setSimilarity("S", "N", 0.00d);
		manuFct.setSimilarity("N", "S", 0.00d);
		manuFct.setSimilarity("N", "N", 1.00d);
	}

	@Override
	SymbolDesc getSymbolDescription() {
		return hypertensionDesc;
	}

}
