package gsl.generate.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import queryIT.MultiTextItem;
import queryIT.Page;
import queryIT.ProgressBarLocation;
import queryIT.Question;
import queryIT.QuestionType;
import queryIT.Survey;
import queryIT.TextInputType;
import queryIT.TextValue;
import queryIT.TitleLocation;

@SuppressWarnings("all")
public class JQueryGenerator {
  private ArrayList<Page> pages = new ArrayList<Page>();
  
  private ArrayList<Question> questions = new ArrayList<Question>();
  
  private ArrayList<String> choices = new ArrayList<String>();
  
  private ArrayList<TextValue> columns = new ArrayList<TextValue>();
  
  private ArrayList<TextValue> rows = new ArrayList<TextValue>();
  
  private ArrayList<MultiTextItem> multiTextItems = new ArrayList<MultiTextItem>();
  
  private int nameCounter = 0;
  
  public void initializePages(final Survey survey) {
    EList _pages = survey.getPages();
    int size = _pages.size();
    int i = 0;
    boolean _while = (i < size);
    while (_while) {
      {
        EList _pages_1 = survey.getPages();
        Object _get = _pages_1.get(i);
        this.pages.add(((Page) _get));
        i = (i + 1);
      }
      _while = (i < size);
    }
  }
  
  public void initializeQuestions(final Page page) {
    this.questions.clear();
    EList _questions = page.getQuestions();
    int size = _questions.size();
    int i = 0;
    boolean _while = (i < size);
    while (_while) {
      {
        EList _questions_1 = page.getQuestions();
        Object _get = _questions_1.get(i);
        this.questions.add(((Question) _get));
        i = (i + 1);
      }
      _while = (i < size);
    }
  }
  
  public void initializeColumns(final Question question) {
    this.columns.clear();
    EList _matrixColumns = question.getMatrixColumns();
    int size = _matrixColumns.size();
    int i = 0;
    boolean _while = (i < size);
    while (_while) {
      {
        EList _matrixColumns_1 = question.getMatrixColumns();
        Object _get = _matrixColumns_1.get(i);
        this.columns.add(((TextValue) _get));
        i = (i + 1);
      }
      _while = (i < size);
    }
  }
  
  public void initializeRows(final Question question) {
    this.rows.clear();
    EList _matrixRows = question.getMatrixRows();
    int size = _matrixRows.size();
    int i = 0;
    boolean _while = (i < size);
    while (_while) {
      {
        EList _matrixRows_1 = question.getMatrixRows();
        Object _get = _matrixRows_1.get(i);
        this.rows.add(((TextValue) _get));
        i = (i + 1);
      }
      _while = (i < size);
    }
  }
  
  public void initializeMultiTextItems(final Question question) {
    this.multiTextItems.clear();
    EList _multiTextItems = question.getMultiTextItems();
    int size = _multiTextItems.size();
    int i = 0;
    boolean _while = (i < size);
    while (_while) {
      {
        EList _multiTextItems_1 = question.getMultiTextItems();
        Object _get = _multiTextItems_1.get(i);
        this.multiTextItems.add(((MultiTextItem) _get));
        i = (i + 1);
      }
      _while = (i < size);
    }
  }
  
  public void initialzeChoices(final Question question) {
    this.choices.clear();
    EList _choices = question.getChoices();
    int size = _choices.size();
    int i = 0;
    boolean _while = (i < size);
    while (_while) {
      {
        EList _choices_1 = question.getChoices();
        Object _get = _choices_1.get(i);
        this.choices.add(((String) _get));
        i = (i + 1);
      }
      _while = (i < size);
    }
  }
  
  public int incNameCounter() {
    return this.nameCounter = (this.nameCounter + 1);
  }
  
  public CharSequence generate(final Survey survey) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$( document ).ready(function() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Survey.defaultBootstrapCss.navigationButton = \"btn btn-primary\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Survey.Survey.cssType = \"bootstrap\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var survey = new Survey.Model({");
    _builder.newLine();
    _builder.append("\t\t");
    {
      String _title = survey.getTitle();
      boolean _notEquals = (!Objects.equal(_title, null));
      if (_notEquals) {
        _builder.append("title: \"");
        String _title_1 = survey.getTitle();
        _builder.append(_title_1, "\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      String _completedMessage = survey.getCompletedMessage();
      boolean _notEquals_1 = (!Objects.equal(_completedMessage, null));
      if (_notEquals_1) {
        _builder.append("completedMessage: \"");
        String _completedMessage_1 = survey.getCompletedMessage();
        _builder.append(_completedMessage_1, "\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      String _pageNextText = survey.getPageNextText();
      boolean _notEquals_2 = (!Objects.equal(_pageNextText, null));
      if (_notEquals_2) {
        _builder.append("pageNextText: \"");
        String _pageNextText_1 = survey.getPageNextText();
        _builder.append(_pageNextText_1, "\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      String _pagePrevText = survey.getPagePrevText();
      boolean _notEquals_3 = (!Objects.equal(_pagePrevText, null));
      if (_notEquals_3) {
        _builder.append("pagePrevText: \"");
        String _pagePrevText_1 = survey.getPagePrevText();
        _builder.append(_pagePrevText_1, "\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      String _completeText = survey.getCompleteText();
      boolean _notEquals_4 = (!Objects.equal(_completeText, null));
      if (_notEquals_4) {
        _builder.append("pagePrevText: \"");
        String _completeText_1 = survey.getCompleteText();
        _builder.append(_completeText_1, "\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      boolean _isHideNavigationButtons = survey.isHideNavigationButtons();
      boolean _equals = (_isHideNavigationButtons == true);
      if (_equals) {
        _builder.append("showNavigationButtons: false,");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      boolean _isHidePageNumbers = survey.isHidePageNumbers();
      boolean _equals_1 = (_isHidePageNumbers == true);
      if (_equals_1) {
        _builder.append("showPageNumbers: false,");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      boolean _isHidePageTitles = survey.isHidePageTitles();
      boolean _equals_2 = (_isHidePageTitles == true);
      if (_equals_2) {
        _builder.append("showPageTitles: false,");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      boolean _isHideQuestionNumbers = survey.isHideQuestionNumbers();
      boolean _equals_3 = (_isHideQuestionNumbers == true);
      if (_equals_3) {
        _builder.append("showQuestionNumbers: \"off\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      ProgressBarLocation _showProgressBar = survey.getShowProgressBar();
      String _name = _showProgressBar.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _equals_4 = _lowerCase.equals("off");
      if (_equals_4) {
        _builder.append("showProgressBar: \"off\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      } else {
        ProgressBarLocation _showProgressBar_1 = survey.getShowProgressBar();
        String _name_1 = _showProgressBar_1.getName();
        String _lowerCase_1 = _name_1.toLowerCase();
        boolean _equals_5 = _lowerCase_1.equals("bottom");
        if (_equals_5) {
          _builder.append("showProgressBar: \"bottom\",");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
        } else {
          _builder.append("showProgressBar: \"top\",");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("\t\t");
    {
      TitleLocation _questionTitleLocation = survey.getQuestionTitleLocation();
      boolean _equals_6 = Objects.equal(_questionTitleLocation, Integer.valueOf(TitleLocation.BOTTOM));
      if (_equals_6) {
        _builder.append("questionTitleLocation: \"bottom\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      } else {
        _builder.append("questionTitleLocation: \"top\",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    this.initializePages(survey);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("pages: [");
    _builder.newLine();
    {
      boolean _hasElements = false;
      for(final Page p : this.pages) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t\t\t");
        }
        _builder.append("\t\t\t");
        CharSequence _processPage = this.processPage(p);
        _builder.append(_processPage, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$(\"#surveyElement\").Survey({model:survey});");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processPage(final Page p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    {
      String _title = p.getTitle();
      boolean _notEquals = (!Objects.equal(_title, null));
      if (_notEquals) {
        _builder.append("title: \"");
        String _title_1 = p.getTitle();
        _builder.append(_title_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _visibleIf = p.getVisibleIf();
      boolean _notEquals_1 = (!Objects.equal(_visibleIf, null));
      if (_notEquals_1) {
        _builder.append("visibleIf: \",");
        String _visibleIf_1 = p.getVisibleIf();
        _builder.append(_visibleIf_1, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    this.initializeQuestions(p);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("questions: [");
    _builder.newLine();
    {
      boolean _hasElements = false;
      for(final Question q : this.questions) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        CharSequence _processQuestion = this.processQuestion(q);
        _builder.append(_processQuestion, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence processQuestion(final Question q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    {
      boolean _isIsRequired = q.isIsRequired();
      boolean _equals = (_isIsRequired == true);
      if (_equals) {
        _builder.append("isRequired: true,");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      TextInputType _inputType = q.getInputType();
      String _name = _inputType.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _equals_1 = _lowerCase.equals("text");
      boolean _not = (!_equals_1);
      if (_not) {
        _builder.append("inputType: \"");
        TextInputType _inputType_1 = q.getInputType();
        _builder.append(_inputType_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _visibleIf = q.getVisibleIf();
      boolean _notEquals = (!Objects.equal(_visibleIf, null));
      if (_notEquals) {
        _builder.append("visibleIf: \"");
        String _visibleIf_1 = q.getVisibleIf();
        _builder.append(_visibleIf_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _placeholder = q.getPlaceholder();
      boolean _notEquals_1 = (!Objects.equal(_placeholder, null));
      if (_notEquals_1) {
        _builder.append("placeholder: \"");
        String _placeholder_1 = q.getPlaceholder();
        _builder.append(_placeholder_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _and = false;
      EList _choices = q.getChoices();
      boolean _isEmpty = _choices.isEmpty();
      boolean _not_1 = (!_isEmpty);
      if (!_not_1) {
        _and = false;
      } else {
        EList _choices_1 = q.getChoices();
        int _size = _choices_1.size();
        boolean _greaterThan = (_size > 0);
        _and = _greaterThan;
      }
      if (_and) {
        _builder.append("choices: [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        this.initialzeChoices(q);
        _builder.newLineIfNotEmpty();
        {
          boolean _hasElements = false;
          for(final String c : this.choices) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"");
            _builder.append(c, "\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("],");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    {
      int _colCount = q.getColCount();
      boolean _notEquals_2 = (_colCount != 0);
      if (_notEquals_2) {
        _builder.append("colCount: ");
        int _colCount_1 = q.getColCount();
        _builder.append(_colCount_1, "\t");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _questionName = q.getQuestionName();
      boolean _notEquals_3 = (!Objects.equal(_questionName, null));
      if (_notEquals_3) {
        _builder.append("name: \"");
        String _questionName_1 = q.getQuestionName();
        _builder.append(_questionName_1, "\t");
        _builder.append("\",");
      } else {
        _builder.append("name: \"fakeName");
        int _incNameCounter = this.incNameCounter();
        _builder.append(_incNameCounter, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      int _rows = q.getRows();
      boolean _notEquals_4 = (_rows != 0);
      if (_notEquals_4) {
        _builder.append("rows: ");
        int _rows_1 = q.getRows();
        _builder.append(_rows_1, "\t");
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _mininumRateDescription = q.getMininumRateDescription();
      boolean _notEquals_5 = (!Objects.equal(_mininumRateDescription, null));
      if (_notEquals_5) {
        _builder.append("mininumRateDescription: \"");
        String _mininumRateDescription_1 = q.getMininumRateDescription();
        _builder.append(_mininumRateDescription_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _maximumRateDescription = q.getMaximumRateDescription();
      boolean _notEquals_6 = (!Objects.equal(_maximumRateDescription, null));
      if (_notEquals_6) {
        _builder.append("maximumRateDescription: \"");
        String _maximumRateDescription_1 = q.getMaximumRateDescription();
        _builder.append(_maximumRateDescription_1, "\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList _matrixRows = q.getMatrixRows();
      boolean _isEmpty_1 = _matrixRows.isEmpty();
      boolean _not_2 = (!_isEmpty_1);
      if (_not_2) {
        _builder.append("rows: [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        this.initializeRows(q);
        _builder.newLineIfNotEmpty();
        {
          boolean _hasElements_1 = false;
          for(final TextValue tv : this.rows) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("text: \"");
            String _text = tv.getText();
            _builder.append(_text, "\t\t\t");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            {
              String _value = tv.getValue();
              boolean _notEquals_7 = (!Objects.equal(_value, null));
              if (_notEquals_7) {
                _builder.append("value: \"");
                String _value_1 = tv.getValue();
                _builder.append(_value_1, "\t\t\t");
                _builder.append("\"");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("],");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    {
      EList _matrixColumns = q.getMatrixColumns();
      boolean _isEmpty_2 = _matrixColumns.isEmpty();
      boolean _not_3 = (!_isEmpty_2);
      if (_not_3) {
        _builder.append("columns: [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        this.initializeColumns(q);
        _builder.newLineIfNotEmpty();
        {
          boolean _hasElements_2 = false;
          for(final TextValue tv_1 : this.columns) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("text: \"");
            String _text_1 = tv_1.getText();
            _builder.append(_text_1, "\t\t\t");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            {
              String _value_2 = tv_1.getValue();
              boolean _notEquals_8 = (!Objects.equal(_value_2, null));
              if (_notEquals_8) {
                _builder.append("value: \"");
                String _value_3 = tv_1.getValue();
                _builder.append(_value_3, "\t\t\t");
                _builder.append("\"");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("],");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    {
      EList _multiTextItems = q.getMultiTextItems();
      boolean _isEmpty_3 = _multiTextItems.isEmpty();
      boolean _not_4 = (!_isEmpty_3);
      if (_not_4) {
        _builder.append("items: [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        this.initializeMultiTextItems(q);
        _builder.newLineIfNotEmpty();
        {
          boolean _hasElements_3 = false;
          for(final MultiTextItem mti : this.multiTextItems) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("title: \"");
            String _title = mti.getTitle();
            _builder.append(_title, "\t\t\t");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("name: \"fakeName");
            int _incNameCounter_1 = this.incNameCounter();
            _builder.append(_incNameCounter_1, "\t\t\t");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("],");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("title: \"");
    String _title_1 = q.getTitle();
    _builder.append(_title_1, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("type: \"");
    QuestionType _type = q.getType();
    String _name_1 = _type.getName();
    String _lowerCase_1 = _name_1.toLowerCase();
    _builder.append(_lowerCase_1, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
