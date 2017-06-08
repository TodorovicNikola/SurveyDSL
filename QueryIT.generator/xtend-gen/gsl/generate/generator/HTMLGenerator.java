package gsl.generate.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import queryIT.Survey;

@SuppressWarnings("all")
public class HTMLGenerator {
  public CharSequence generate(final Survey s, final String fileName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"resources/jquery-3.2.1.js\"></script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/survey.css\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/bootstrap.css\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"resources/bootstrap.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"resources/survey.jquery.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"");
    _builder.append(fileName, "\t\t");
    _builder.append(".js\"></script>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div id=\"surveyElement\"></div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
