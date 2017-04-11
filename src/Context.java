/**
 * Created by matt on 4/4/17.
 */
public class Context {
	public int currChar;
	public int prevChar;
	
	private ConsumeState _mEatWhitespace;
	private ConsumeState _mEatRawCSharpString;
	private ConsumeState _mEatSQString;
	private ConsumeState _mEatSpecialCharacter;
		
}
