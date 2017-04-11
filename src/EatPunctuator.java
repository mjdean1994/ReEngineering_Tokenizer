/**
 * Created by John on 4/7/17.
 */
public class EatPunctuator extends ConsumeState{
	
}

/*
public:
  EatPunctuator(Context* pContext)
  {
    _pContext = pContext;
  }
  virtual void eatChars()
  {
    _pContext->token.clear();
    int chNext = _pContext->_pIn->peek();
    do {
      if (_pContext->currChar == '\"' && _pContext->prevChar != '\\')    // start of double quoted string
      {
        return;
      }
      if (_pContext->currChar == '@' && chNext == '\"')    // start of raw C# double quoted string
      {
        return;
      }
      if (_pContext->currChar == '\'' && _pContext->prevChar != '\\')    // start of single quoted string
      {
        return;
      }
      Token temp = makeString(_pContext->currChar);
      if (isOneCharToken(temp))
      {
        return;
      }
      _pContext->token += _pContext->currChar;
      if (!_pContext->_pIn->good())  // end of stream
      {
        return;
      }
      if (!collectChar())
        return;
    } while (ispunct(_pContext->currChar));
  }
*/