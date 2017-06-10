# SurveyDSL
SurveyDSL is a domain specific language (DSL) designed for specifying survey structures using user-friendly textual syntax; after specifying a structure, a web-based survey is generated (.js file + .html file). 

# Development Environment
[Eclipse Modeling Tools](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/neon3)

# Getting Started
1. Download all projects and import them in the above mentioned development environment,
2. Run xtext.QueryIT as an Eclipse Application for specifying a survey structure,
3. Create new General Project in the newly opened Eclipse Platform (File -> New -> Other -> General -> Project),
4. Create new .qit file in the newly created project,
5. Populate the .qit file with a survey structure (the example of a structure can be seen in the Example.qit file, and the whole language specification can be seen in the SurveyDSL.pdf),
6. After specifying the structure, locate the QueryITToXMI.java file (QueryITToXmi project, src folder), and change the following variables:
  a) PATH_TO_REPO_SOURCE,
  b) PATH_TO_REPO_DESTINATION and
  c) QIT_NAME;
 7. Run the QueryITToXMI.java file as Java Application and the generated .js and .html files should be placed in the folder specified in the PATH_TO_REPO_DESTINATION variable.
 
 # Technologies and Legal Notice
[Eclipse Modeling Framework (EMF)](https://eclipse.org/modeling/emf/)
[Xtext - Language Engineering For Everyone](https://eclipse.org/Xtext/)
[Xtend - Modernized Java](http://www.eclipse.org/xtend/)
[Survey.js - The JavaScript JSON based Survey Library](http://surveyjs.org/)
 
 All product names, trademarks and registered trademarks are property of their respective owners. All company, product and service names used in this project are for identification purposes only. Use of these names, trademarks and brands does not imply endorsement. 
 
 Special thanks to the development team of the Survey.js library (http://surveyjs.org/)
 
 # Example
 Example Survey structure:
 ![Survey Structure](https://github.com/TodorovicNikola/SurveyDSL/blob/master/ExampleStructure.jpg "Example - Survey Structure")
 
 
 Example - Generated web page:
 ![Survey web page](https://github.com/TodorovicNikola/SurveyDSL/blob/master/ExampleWebPage.jpg "Example - Survey web page")
