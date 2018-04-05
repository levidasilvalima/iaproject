package util;

import java.util.Arrays;
import java.util.HashSet;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.SymbolFct;

public class CreateAttributeAgeRange extends MyAttribute {

	private SymbolDesc ageRangeDesc;
	private SymbolFct manuFct;
	
	public CreateAttributeAgeRange(Project project, Concept diet) {
		super(project, diet);
		init();
	}

	@Override
	void init() {
		HashSet<String> ageRange = new HashSet<String>();
		String[] ageRangeArray = { "10-18", "19-30", "31-60", "61--" };
		ageRange.addAll(Arrays.asList(ageRangeArray));

		try {
			ageRangeDesc = new SymbolDesc(MyAttribute.diet, "ageRange", ageRange);
		} catch (Exception e) {
			e.printStackTrace();
		}

		manuFct = ageRangeDesc.addSymbolFct("ageRangeFct", true);
		manuFct.setSimilarity("10-18", "10-18", 0.00d); 
		manuFct.setSimilarity("10-18", "19-30", 0.00d);
		manuFct.setSimilarity("10-18", "31-60", 0.00d);
		manuFct.setSimilarity("10-18", "61--", 0.00d);
		manuFct.setSimilarity("19-30", "10-18", 0.00d); 
		manuFct.setSimilarity("19-30", "19-30", 0.00d);
		manuFct.setSimilarity("19-30", "31-60", 0.00d);
		manuFct.setSimilarity("19-30", "61--", 0.00d);
		manuFct.setSimilarity("31-60", "10-18", 0.00d); 
		manuFct.setSimilarity("31-60", "19-30", 0.00d);
		manuFct.setSimilarity("31-60", "31-60", 0.00d);
		manuFct.setSimilarity("31-60", "61--", 0.00d);
		manuFct.setSimilarity("61--", "10-18", 0.00d); 
		manuFct.setSimilarity("61--", "19-30", 0.00d);
		manuFct.setSimilarity("61--", "31-60", 0.00d);
		manuFct.setSimilarity("61--", "61--", 0.00d);		
	}

	@Override
	SymbolDesc getSymbolDescription() {
		return ageRangeDesc;
	}
	
	@Override
	SymbolFct getSymbolFct() {
		return manuFct;
	}

}
