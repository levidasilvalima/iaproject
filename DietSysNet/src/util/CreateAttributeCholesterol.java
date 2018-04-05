package util;

import java.util.Arrays;
import java.util.HashSet;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.SymbolFct;

public class CreateAttributeCholesterol extends MyAttribute {

	private SymbolDesc cholesterolDesc;
	
	public CreateAttributeCholesterol(Project project, Concept diet) {
		super(project, diet);
		init();
	}

	@Override
	void init() {
		HashSet<String> cholesterol = new HashSet<String>();
		String[] cholesterolArray = { "M", "F" };
		cholesterol.addAll(Arrays.asList(cholesterolArray));

		try {
			cholesterolDesc = new SymbolDesc(MyAttribute.diet, "cholesterol", cholesterol);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SymbolFct manuFct = cholesterolDesc.addSymbolFct("cholesterolFct", true);
		manuFct.setSimilarity("S", "S", 1.00d); 
		manuFct.setSimilarity("S", "N", 0.00d);
		manuFct.setSimilarity("N", "S", 0.00d);
		manuFct.setSimilarity("N", "N", 1.00d);
	}

	@Override
	SymbolDesc getSymbolDescription() {
		return cholesterolDesc;
	}

}
