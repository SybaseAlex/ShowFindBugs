
package showfindbugs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alex
 */
@XmlRootElement(name = "BugCollection")
@XmlAccessorType(XmlAccessType.FIELD)
public class BugCollection {

	@XmlElement
	private FileBug file;

	public FileBug getFile() {
		return file;
	}

	public void setFile(FileBug file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return file.toString();
	}

}

