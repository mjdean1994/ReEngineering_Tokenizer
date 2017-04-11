/**
 * Created by matt on 4/4/17.
 */
abstract class ConsumeState {
	
	Context _mContext;
	
	abstract void eatChars();
	protected boolean collectChar(){
		return false;
		
	}
	
}
