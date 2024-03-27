package autowiredannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;
	@Autowired
	public TextEditor(SpellChecker s) {
		System.out.println("Text Editor Constror");
		spellChecker=s;
	}
	public void setSpellChecker( SpellChecker spellChecker ){
	System.out.println("Spellchecker Constructor");
	this.spellChecker = spellChecker;
	}
	public SpellChecker getSpellChecker( ) {
	return spellChecker;
	}
	public void spellCheck() {
	spellChecker.checkSpelling();
	}

}
