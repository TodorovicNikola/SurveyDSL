$( document ).ready(function() {
	Survey.defaultBootstrapCss.navigationButton = "btn btn-primary";
	Survey.Survey.cssType = "bootstrap";
	
	var survey = new Survey.Model({
		title: "Test Survey",
		completedMessage: "Thank You for participating!",
		showProgressBar: "top",
		questionTitleLocation: "top",
		pages: [
			{
				title: "Test Page 1",
				
				questions: [
				{
					name: "fakeName1",
					rows: [
						{
							text: "Product is affordable",
							value: "affordable"
						},
						{
							text: "Product does what it claims",
							value: "does what it claims"
						},
						{
							text: "Product is better than other products on the market",
							value: "better then others"
						},
						{
							text: "Product is easy to use",
							value: "easy to use"
						}
					],
					columns: [
						{
							text: "Strongly Disagree",
							value: "1"
						},
						{
							text: "Disagree",
							value: "2"
						},
						{
							text: "Neutral",
							value: "3"
						},
						{
							text: "Agree",
							value: "4"
						},
						{
							text: "Strongly Agree",
							value: "5"
						}
					],
						title: "Please indicate if you agree or disagree with the following statements",
					type: "matrix"
				},
				{
					isRequired: true,
					name: "satisfaction",
					mininumRateDescription: "Not Satisfied",
					maximumRateDescription: "Completely satisfied",
								title: "How satisfied are you with the Product?",
					type: "rating"
				},
				{
					visibleIf: "{satisfaction} > 3",
					name: "fakeName2",
					mininumRateDescription: "Will not recommend",
					maximumRateDescription: "I will recommend",
								title: "How likely are you to recommend the Product to a friend or co-worker?",
					type: "rating"
				},
				{
					name: "fakeName3",
					rows: 5,
								title: "What would make you more satisfied with the Product?",
					type: "comment"
				},
				{
					choices: [
						"Friends",
						"Family",
						"None",
						"Colleagues",
						"Other..."
					],
					colCount: 2,
					name: "recommended",
								title: "Who recommended this product to You?",
					type: "radiogroup"
				},
				{
					visibleIf: "{recommended} = 'Other...'",
					name: "fakeName4",
								title: "We would appreciate if you told us to which group those 'Other...' fall in...",
					type: "comment"
				}
					
				]
			},
			{
				
				questions: [
				{
					choices: [
						"Less expensive",
						"Priced about the same",
						"More expensive",
						"Not sure"
					],
					name: "fakeName5",
								title: "Compared to our competitors, do you feel the Product is",
					type: "dropdown"
				},
				{
					choices: [
						"correct|Yes, the price is about right",
						"low|No, the price is too low for your product",
						"high|No, the price is too high for your product"
					],
					name: "fakeName6",
								title: "Do you feel our current price is merited by our product?",
					type: "radiogroup"
				},
				{
						colCount: 2,
					name: "fakeName7",
							items: [
						{
							title: "Most amount you would every pay for a product like ours",
							name: "fakeName8"
						},
						{
							title: "The least amount you would feel comfortable paying",
							name: "fakeName9"
						}
					],
					title: "What is the...",
					type: "multipletext"
				}
					
				]
			},
			{
				
				questions: [
				{
					inputType: "email",
					name: "fakeName10",
								title: "Thank you for taking our survey. Your survey is almost complete, please enter your email address in the box below if you wish to participate in our drawing, then press the 'Submit' button.",
					type: "text"
				}
					
				]
			}
		]
	});
	
	$("#surveyElement").Survey({model:survey});
	
});
