package mist.relgen.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import gsl.generate.generator.SurveyGenerator;

public class GenerateATLHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		TreeSelection selection = (TreeSelection) HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		Object firstElement = selection.getFirstElement();
		
		if (firstElement instanceof IAdaptable)
        {
            IFile file = (IFile)((IAdaptable)firstElement).getAdapter(IFile.class);
            IPath path = file.getLocation();
            
            try {
            	//TODO fix
				SurveyGenerator.generateAll(path.toOSString(), path.toOSString());
				MessageDialog.openInformation(shell, "Success", "Code was generated successfully");
			} catch (Exception e) {
				//MessageDialog.openError(shell, "Error", e.getMessage());
				e.printStackTrace();
			}
        }
		return null;
	}

}
