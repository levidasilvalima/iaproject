package util;

import de.dfki.mycbr.core.Project;
import de.dfki.mycbr.core.model.Concept;
import de.dfki.mycbr.core.model.SymbolDesc;

public class CreateAttributes extends MyAttribute {

	MyAttribute createAttributeActivity;
	MyAttribute createAttributeAgeRange;
	MyAttribute createAttributeAlcohol;
	MyAttribute createAttributeCandy;
	MyAttribute createAttributeCholesterol;
	MyAttribute createAttributeDiabetes;
	MyAttribute createAttributeFries;
	MyAttribute createAttributeGender;
	MyAttribute createAttributeHypertension;
	MyAttribute createAttributeProcessed;
	MyAttribute createAttributeSalad;
	MyAttribute createAttributeFruits;
	MyAttribute createAttributeKidneys;
	MyAttribute createAttributeSoda;
	MyAttribute createAttributeSalt;
	MyAttribute createAttributeSweetener;
	MyAttribute createAttributeWater;

	public CreateAttributes(Project project, Concept diet) {
		super(project, diet);
		init();
	}

	@Override
	void init() {
		createAttributeActivity = new CreateAttributeActivity(MyAttribute.project, MyAttribute.diet);
		createAttributeAgeRange = new CreateAttributeAgeRange(MyAttribute.project, MyAttribute.diet);
		createAttributeAlcohol = new CreateAttributeAlcohol(MyAttribute.project, MyAttribute.diet);
		createAttributeCandy = new CreateAttributeCandy(MyAttribute.project, MyAttribute.diet);
		createAttributeCholesterol = new CreateAttributeCholesterol(MyAttribute.project, MyAttribute.diet);
		createAttributeDiabetes = new CreateAttributeDiabetes(MyAttribute.project, MyAttribute.diet);
		createAttributeFries = new CreateAttributeFries(MyAttribute.project, MyAttribute.diet);
		createAttributeGender = new CreateAttributeGender(MyAttribute.project, MyAttribute.diet);
		createAttributeHypertension = new CreateAttributeHypertension(MyAttribute.project, MyAttribute.diet);
		createAttributeProcessed = new CreateAttributeProcessed(MyAttribute.project, MyAttribute.diet);
		createAttributeSalad = new CreateAttributeSalad(MyAttribute.project, MyAttribute.diet);
		createAttributeFruits = new CreateAttributeFruits(MyAttribute.project, MyAttribute.diet);
		createAttributeKidneys = new CreateAttributeKidneys(MyAttribute.project, MyAttribute.diet);
		createAttributeSoda = new CreateAttributeSoda(MyAttribute.project, MyAttribute.diet);
		createAttributeSalt = new CreateAttributeSalt(MyAttribute.project, MyAttribute.diet);
		createAttributeSweetener = new CreateAttributeSweetener(MyAttribute.project, MyAttribute.diet);
		createAttributeWater = new CreateAttributeWater(MyAttribute.project, MyAttribute.diet);
	}

	public MyAttribute getCreateAttributeActivity() {
		return createAttributeActivity;
	}

	public MyAttribute getCreateAttributeAgeRange() {
		return createAttributeAgeRange;
	}

	public MyAttribute getCreateAttributeAlcohol() {
		return createAttributeAlcohol;
	}

	public MyAttribute getCreateAttributeCandy() {
		return createAttributeCandy;
	}

	public MyAttribute getCreateAttributeCholesterol() {
		return createAttributeCholesterol;
	}

	public MyAttribute getCreateAttributeDiabetes() {
		return createAttributeDiabetes;
	}

	public MyAttribute getCreateAttributeFries() {
		return createAttributeFries;
	}

	public MyAttribute getCreateAttributeGender() {
		return createAttributeGender;
	}

	public MyAttribute getCreateAttributeHypertension() {
		return createAttributeHypertension;
	}

	public MyAttribute getCreateAttributeProcessed() {
		return createAttributeProcessed;
	}

	public MyAttribute getCreateAttributeSalad() {
		return createAttributeSalad;
	}

	public MyAttribute getCreateAttributeFruits() {
		return createAttributeFruits;
	}

	public MyAttribute getCreateAttributeKidneys() {
		return createAttributeKidneys;
	}

	public MyAttribute getCreateAttributeSoda() {
		return createAttributeSoda;
	}

	public MyAttribute getCreateAttributeSalt() {
		return createAttributeSalt;
	}

	public MyAttribute getCreateAttributeSweetener() {
		return createAttributeSweetener;
	}

	public MyAttribute getCreateAttributeWater() {
		return createAttributeWater;
	}

	@Override
	SymbolDesc getSymbolDescription() {
		return null;
	}

}
