package gsl.generate.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import queryIT.QueryITPackage;
import queryIT.Survey;
import gsl.generate.generator.HTMLGenerator;

public class SurveyGenerator {

	public static void generateAll(String inputPath, String outputPath) {
		
		//open directory chooser
		//Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//		DirectoryDialog dirDialog = new DirectoryDialog(shell);
//		dirDialog.setText("Select generation directory");
//		dirDialog.setMessage("Please select directory where you want to put generated files.");
//		String selectedDir = dirDialog.open();
		if (outputPath != null) {
			Survey survey = loadSurveyModel(inputPath);
			
			String fileNameBasis = "generated_" + generateISOExtension();
			
			HTMLGenerator html = new HTMLGenerator();
			CharSequence cs = html.generate(survey, fileNameBasis);
			saveFile(outputPath + fileNameBasis + ".html", cs);
			
			JQueryGenerator jquery = new JQueryGenerator();
			cs = jquery.generate(survey);
			saveFile(outputPath + fileNameBasis + ".js", cs);
		}
		
	}

	private static Survey loadSurveyModel(String modulePath) {
		// Initialize the model
		QueryITPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		//Resource resource = resSet.getResource(URI.createFileURI(modulePath), true);
		Resource resource = resSet.getResource(URI.createURI(modulePath), true);

		// Get the first model element and cast it to the right type, in my
		// example everything is included in this first node
		Survey s = (Survey) resource.getContents().get(0);

		return s;
	}
	
	private static String generateISOExtension(){
		TimeZone tz = TimeZone.getTimeZone("CET");
		DateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm"); // Quoted "Z" to indicate UTC, no timezone offset
		df.setTimeZone(tz);
		String nowAsISO = df.format(new Date());
		
		return nowAsISO;
	}

	private static void saveFile(String path, CharSequence cs) {
		File output = new File(path);
		PrintWriter pw = null;
		try {
			if (output.getParentFile() != null) {
				output.getParentFile().mkdirs();
			}			
			
			System.out.println(path);
			
			output.createNewFile();
			pw = new PrintWriter(new FileOutputStream(output));
			pw.print(cs);

			System.out.println("saved " + path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

}
