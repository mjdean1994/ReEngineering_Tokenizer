/**
 * Created by John on 4/7/17.
 */
public class EatDQString extends ConsumeState{
}

/*
public:
  EatDQString(Context* pContext)
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
    } while (_pContext->currChar != '\"' || isEscapted(_pContext->token));
    _pContext->token += _pContext->currChar;
    _pContext->inCSharpString = false;
    collectChar();
  }
*/