package util;

import java.util.Arrays;
import java.util.HashSet;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.SymbolFct;

public class CreateAttributeKidneys extends MyAttribute {

	private SymbolDesc kidneysDesc;
	
	public CreateAttributeKidneys(Project project, Concept diet) {
		super(project, diet);
		init();
	}

	@Override
	void init() {
		HashSet<String> kidneys = new HashSet<String>();
		String[] kidneysArray = { "Nenhum", "Pouco, Normal", "Bastante" };
		kidneys.addAll(Arrays.asList(kidneysArray));

		try {
			kidneysDesc = new SymbolDesc(MyAttribute.diet, "kidneys", kidneys);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SymbolFct manuFct = kidneysDesc.addSymbolFct("kidneysFct", true);
		manuFct.setSimilarity("Nenhum", "Nenhum", 0.00d); 
		manuFct.setSimilarity("Nenhum", "Pouco", 0.00d);
		manuFct.setSimilarity("Nenhum", "Normal", 0.00d);
		manuFct.setSimilarity("Nenhum", "Bastante", 0.00d);
		manuFct.setSimilarity("Pouco", "Nenhum", 0.00d); 
		manuFct.setSimilarity("Pouco", "Pouco", 0.00d);
		manuFct.setSimilarity("Pouco", "Normal", 0.00d);
		manuFct.setSimilarity("Pouco", "Bastante", 0.00d);
		manuFct.setSimilarity("Normal", "Nenhum", 0.00d); 
		manuFct.setSimilarity("Normal", "Pouco", 0.00d);
		manuFct.setSimilarity("Normal", "Normal", 0.00d);
		manuFct.setSimilarity("Normal", "Bastante", 0.00d);
		manuFct.setSimilarity("Bastante", "Nenhum", 0.00d); 
		manuFct.setSimilarity("Bastante", "Pouco", 0.00d);
		manuFct.setSimilarity("Bastante", "Normal", 0.00d);
		manuFct.setSimilarity("Bastante", "Bastante", 0.00d);
	}

	@Override
	SymbolDesc getSymbolDescription() {
		return kidneysDesc;
	}

}
