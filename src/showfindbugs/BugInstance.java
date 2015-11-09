
package showfindbugs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Alex
 */
@XmlType(name = "BugInstance")
@XmlAccessorType(XmlAccessType.FIELD)
public class BugInstance {
	@XmlAttribute
	private String type;

	@XmlAttribute
	private String message;

	@XmlAttribute
	private String lineNumber;

	@Override
	public String toString() {
		return " type = " + type + "\n lineNumber = " + lineNumber + "\n" 
				+ " message = " + message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
}

