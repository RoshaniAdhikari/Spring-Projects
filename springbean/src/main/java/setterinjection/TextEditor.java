package setterinjection;

public class TextEditor {
	/*
	 *  Dependency Injection for you, then the process of creating 
	 *  an object for some other class and letting the class directly 
	 *  use the dependency is called Dependency Injection	*/
	
	private SpellChecker spellChecker;//refrence
	
	
	/*// a setter method to inject the dependency.
	public void setSpellChecker(SpellChecker spellChecker) {
	System.out.println("Inside setSpellChecker." );
	this.spellChecker = spellChecker;
	}
	
	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
	return spellChecker;
	}*/
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}


	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker." );
		this.spellChecker = spellChecker;
	}
	
	
	public void spellCheck() {
	spellChecker.checkSpelling();

}


	
}
