
package showfindbugs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Alex
 */
@XmlType(name = "file")
@XmlAccessorType(XmlAccessType.FIELD)
public class FileBug {
	@XmlAttribute
	private String classname;

	@XmlElement(name = "BugInstance")
	private BugInstance bugInstance;

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public BugInstance getBugInstance() {
		return bugInstance;
	}

	public void setBugInstance(BugInstance bugInstance) {
		this.bugInstance = bugInstance;
	}

	@Override
	public String toString() {
		return " classname = " + classname + "\n"
				+ bugInstance.toString() + "\n";
	}
}
