package util;

import java.util.Arrays;
import java.util.HashSet;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.SymbolFct;

public class CreateAttributeAlcohol extends MyAttribute{

	private SymbolDesc alcoholComsumptionDesc;
	
	public CreateAttributeAlcohol(Project project, Concept diet) {
		super(project, diet);
		init();
	}

	@Override
	void init() {
		HashSet<String> alcoholConsumption = new HashSet<String>();
		String[] alcoholConsuptiomArray = { "Nenhum", "Pouco, Normal", "Bastante" };
		alcoholConsumption.addAll(Arrays.asList(alcoholConsuptiomArray));

		try {
			alcoholComsumptionDesc = new SymbolDesc(MyAttribute.diet, "alcoholConsumption", alcoholConsumption);
		} catch (Exception e) {
			e.printStackTrace();
		}

		SymbolFct manuFct = alcoholComsumptionDesc.addSymbolFct("alcoholConsumptionFct", true);
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
		return alcoholComsumptionDesc;
	}

}
