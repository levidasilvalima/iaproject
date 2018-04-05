package util;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.SymbolFct;

public abstract class MyAttribute {

	protected static Project project;
	protected static Concept diet;

	public MyAttribute(Project project, Concept diet) {
		super();
		this.project = project;
		this.diet = diet;
	}
	
	abstract void init();
	
	public abstract SymbolDesc getSymbolDescription();
	
	public abstract SymbolFct getSymbolFct();
	
}
