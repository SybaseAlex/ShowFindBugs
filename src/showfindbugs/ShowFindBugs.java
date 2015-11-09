
package showfindbugs;

import java.io.File;
import javax.xml.bind.JAXB;

/**
 *
 * @author Alex
 */
public class ShowFindBugs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File projectFolder;
        if(args != null && args.length > 0){
          projectFolder = new File(args[0]); 
          searchFiles(projectFolder);
        } else {
            System.out.println("empty parameter, please enter the path to project folder");
        }
    }
    
    private static void searchFiles(File mainFolder) {
		if (mainFolder.isDirectory()) {
			for (File file : mainFolder.listFiles()) {
				if (file.isDirectory()) {
					searchFiles(file);
				} else if (file.isFile()
						&& "findbugs.xml".equalsIgnoreCase(file.getName())) {					
					BugCollection bug = JAXB.unmarshal(file,
							BugCollection.class);
					if (bug.getFile() != null
							&& bug.getFile().getClassname() != null
							&& !bug.getFile().getClassname().isEmpty()) {
						System.out.println(" file name = " + file.getPath());
						System.out.println(bug.toString());
					}
				}
			}
		}
	}
    
}
