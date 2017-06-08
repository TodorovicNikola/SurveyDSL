package gsl.generate.generator

import queryIT.Survey

class HTMLGenerator {
  def generate(Survey s, String fileName) {
    '''
<html>
	<head>
		<script src="resources/jquery-3.2.1.js"></script>
	
		<link rel="stylesheet" type="text/css" href="resources/survey.css">
		<link rel="stylesheet" type="text/css" href="resources/bootstrap.css">
		<script src="resources/bootstrap.js"></script>

		<script src="resources/survey.jquery.js"></script>
		
		<script src="«fileName».js"></script>
		
	<head>

	<body>	
		<div class="container">
	
			<div id="surveyElement"></div>
		
		</div>
	</body>
</html>
    '''  
  }
  
}
