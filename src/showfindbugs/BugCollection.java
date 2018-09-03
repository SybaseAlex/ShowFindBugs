
package showfindbugs;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * bug collection @author Alex
 */
@XmlRootElement(name = "BugCollection")
@XmlAccessorType(XmlAccessType.FIELD)
public class BugCollection {

	@XmlElement
	private List<FileBug> file;

	public List<FileBug> getFile() {
		return file;
	}

	public void setFile(List<FileBug> file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return file.toString();
	}

}

