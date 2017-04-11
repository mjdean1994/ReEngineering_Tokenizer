/**
 * Created by matt on 4/4/17.
 */
public class EatWhitespace extends ConsumeState{
	EatWhitespace(Context c){
		_mContext = c;
	}

	@Override
	void eatChars() {
		//locale relative to what it should be
		do {
	      if (!collectChar())
	        return;
	    } while (isWhitespace(_mContext->currChar) && _mContext->currChar != '\n');		
	};
	
	
}
