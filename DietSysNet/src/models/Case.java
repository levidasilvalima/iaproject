package models;

import abstracts.BinaryAttribute;
import abstracts.Sex;
import abstracts.TetraAttribute;

public class Case {

	private String name;
	private Sex sex;
	private RangeAge ageRange;
	private BinaryAttribute hypertension;
	private BinaryAttribute cholesterol;
	private BinaryAttribute diabetes;
	private TetraAttribute alcohol;
	private TetraAttribute activity;
	private TetraAttribute water;
	private BinaryAttribute kidneys;
	private TetraAttribute soda;
	private TetraAttribute fries;
	private TetraAttribute candy;
	private TetraAttribute salt;
	private TetraAttribute salad;
	private TetraAttribute fruit;
	private TetraAttribute processed;

	public Case() {

	}

	public Case(String name, Sex sex, RangeAge ageRange, BinaryAttribute hypertension, BinaryAttribute cholesterol,
			BinaryAttribute diabetes, TetraAttribute alcohol, TetraAttribute activity, TetraAttribute water,
			BinaryAttribute kidneys, TetraAttribute soda, TetraAttribute fries, TetraAttribute candy,
			TetraAttribute salt, TetraAttribute salad, TetraAttribute fruit, TetraAttribute processed) {
		super();
		this.name = name;
		this.sex = sex;
		this.ageRange = ageRange;
		this.hypertension = hypertension;
		this.cholesterol = cholesterol;
		this.diabetes = diabetes;
		this.alcohol = alcohol;
		this.activity = activity;
		this.water = water;
		this.kidneys = kidneys;
		this.soda = soda;
		this.fries = fries;
		this.candy = candy;
		this.salt = salt;
		this.salad = salad;
		this.fruit = fruit;
		this.processed = processed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public RangeAge getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(RangeAge ageRange) {
		this.ageRange = ageRange;
	}

	public BinaryAttribute getHypertension() {
		return hypertension;
	}

	public void setHypertension(BinaryAttribute hypertension) {
		this.hypertension = hypertension;
	}

	public BinaryAttribute getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(BinaryAttribute cholesterol) {
		this.cholesterol = cholesterol;
	}

	public BinaryAttribute getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(BinaryAttribute diabetes) {
		this.diabetes = diabetes;
	}

	public TetraAttribute getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(TetraAttribute alcohol) {
		this.alcohol = alcohol;
	}

	public TetraAttribute getActivity() {
		return activity;
	}

	public void setActivity(TetraAttribute activity) {
		this.activity = activity;
	}

	public TetraAttribute getWater() {
		return water;
	}

	public void setWater(TetraAttribute water) {
		this.water = water;
	}

	public BinaryAttribute getKidneys() {
		return kidneys;
	}

	public void setKidneys(BinaryAttribute kidneys) {
		this.kidneys = kidneys;
	}

	public TetraAttribute getSoda() {
		return soda;
	}

	public void setSoda(TetraAttribute soda) {
		this.soda = soda;
	}

	public TetraAttribute getFries() {
		return fries;
	}

	public void setFries(TetraAttribute fries) {
		this.fries = fries;
	}

	public TetraAttribute getCandy() {
		return candy;
	}

	public void setCandy(TetraAttribute candy) {
		this.candy = candy;
	}

	public TetraAttribute getSalt() {
		return salt;
	}

	public void setSalt(TetraAttribute salt) {
		this.salt = salt;
	}

	public TetraAttribute getSalad() {
		return salad;
	}

	public void setSalad(TetraAttribute salad) {
		this.salad = salad;
	}

	public TetraAttribute getFruit() {
		return fruit;
	}

	public void setFruit(TetraAttribute fruit) {
		this.fruit = fruit;
	}

	public TetraAttribute getProcessed() {
		return processed;
	}

	public void setProcessed(TetraAttribute processed) {
		this.processed = processed;
	}

}
