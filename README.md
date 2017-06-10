# SurveyDSL
SurveyDSL is a domain specific language (DSL) for specifying survey structures using user-friendly textual syntax;

# Getting started
1. Download all projects and import them in Eclipse IDE,
2. Run xtext.QueryIT as an Eclipse Application for specifying a survey structure,
3. Create new General Project in the newly opened Eclipse Platform (File -> New -> Other -> General -> Project),
4. Create new .qit file in the newly created project,
5. Populate the .qit file with a survey structure (the example of a structure can be seen in the Example.qit file, and the whole language specification can be seen in the SurveyDSL.pdf),
6. After specifying the structure, locate the QueryITToXMI.java file (QueryITToXmi project, src folder), and change the following variables:
  a) PATH_TO_REPO_SOURCE,
  b) PATH_TO_REPO_DESTINATION and
  c) QIT_NAME;
 7. Run the QueryITToXMI.java file as Java Application and the generated .js and .html files should be placed in the folder specified in the PATH_TO_REPO_DESTINATION variable.
 
 # Legal notice
 All product names, trademarks and registered trademarks are property of their respective owners. All company, product and service names used in this project are for identification purposes only. Use of these names, trademarks and brands does not imply endorsement.
 
 Special thanks to the development team of the Survey.js library (http://surveyjs.org/)
