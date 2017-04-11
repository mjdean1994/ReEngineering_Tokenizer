/**
 * Created by John on 4/7/17.
 */
public class EatRawCppString extends ConsumeState{
	
}

/*
public:
  EatRawCppString(Context* pContext)
  {
    _pContext = pContext;
  }
  virtual void eatChars()
  {
    _pContext->token.clear();
    do
    {
      _pContext->token += _pContext->currChar;
      if (!collectChar())
        return;
    } while (_pContext->currChar != '\"' || _pContext->prevChar == 'R');
    _pContext->token += _pContext->currChar;
    collectChar();
  }
*/