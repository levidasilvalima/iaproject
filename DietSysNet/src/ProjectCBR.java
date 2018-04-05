import java.util.ArrayList;

import de.dfki.mycbr.core.DefaultCaseBase;
import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.casebase.Instance;
import de.dfki.mycbr.core.model.Concept;
import models.Case;
import util.CreateAttributes;

public class ProjectCBR {

	private Project project;
	private Concept diet;
	private CreateAttributes createAttributes;
	private DefaultCaseBase baseCase;

	public ProjectCBR() {
		super();
		try {
			this.project = new Project();
			this.diet = project.createTopConcept("Diet");
			this.createAttributes = new CreateAttributes(project, diet);
			this.baseCase = project.createDefaultCB("myCaseBase");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createCase(Case somecase) {
		Instance i = diet.addInstance("case");
		i.addAttribute(createAttributes.getCreateAttributeActivity().getSymbolDescription(), createAttributes.getCreateAttributeActivity().getAttribute("VW"));
		cb.addCase(i);
	}
	
	public ArrayList<Case> RetrieveCases(Case somecase) {
	
	
		return null;
	}

}
