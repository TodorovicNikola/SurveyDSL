package queryIT.generator.convert;

import gsl.generate.generator.SurveyGenerator;
import queryIT.generator.utilities.QueryITToXMIConverter;

public class QueryITToXMI {
	private static final String PATH_TO_REPO_SOURCE = "file:/C:/Users/Todorovic/Desktop/NKL/Predmeti koje slusam/DOMiJ/runtime-EclipseApplication/beforeGenerating/";
	private static final String PATH_TO_REPO_DESTINATION = "file:/C:/Users/Todorovic/Desktop/NKL/Predmeti koje slusam/DOMiJ/Surveys/";
	private static final String GENERATED_PATH = "C:/Users/Todorovic/Desktop/NKL/Predmeti koje slusam/DOMiJ/Surveys/";
	
	private static final String XMI_NAME_1 = "sample1.xmi";
	private static final String QIT_NAME_1 = "sample1.qit";
	
	private static final String QUERY_IT_XMI_M = PATH_TO_REPO_DESTINATION + XMI_NAME_1;
	private static final String QUERY_IT_M = PATH_TO_REPO_SOURCE + QIT_NAME_1;
	
	//private static final String GSL_M = "";
	//private static final String XMI_DIR = "";
	
	public static void main(String[] args) {
		//convert queryITs to xmi as an entry point of the transformation
		QueryITToXMIConverter.convertERDSLtoXMI(QUERY_IT_M, QUERY_IT_XMI_M);

		//generate code
		SurveyGenerator.generateAll(QUERY_IT_XMI_M, GENERATED_PATH);
		
	}
	

}
