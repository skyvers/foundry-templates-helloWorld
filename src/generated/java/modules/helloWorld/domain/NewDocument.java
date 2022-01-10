package modules.helloWorld.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.impl.domain.AbstractPersistentBean;

/**
 * New Document
 * 
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class NewDocument extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "helloWorld";

	/** @hidden */
	public static final String DOCUMENT_NAME = "NewDocument";

	/** @hidden */
	public static final String textToEchoPropertyName = "textToEcho";

	/** @hidden */
	public static final String echoedTextPropertyName = "echoedText";

	/**
	 * Text to Echo
	 **/
	private String textToEcho;

	/**
	 * Echoed Text
	 **/
	private String echoedText;

	@Override
	@XmlTransient
	public String getBizModule() {
		return NewDocument.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return NewDocument.DOCUMENT_NAME;
	}

	public static NewDocument newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("New Document", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof NewDocument) && 
					this.getBizId().equals(((NewDocument) o).getBizId()));
	}

	/**
	 * {@link #textToEcho} accessor.
	 * @return	The value.
	 **/
	public String getTextToEcho() {
		return textToEcho;
	}

	/**
	 * {@link #textToEcho} mutator.
	 * @param textToEcho	The new value.
	 **/
	@XmlElement
	public void setTextToEcho(String textToEcho) {
		preset(textToEchoPropertyName, textToEcho);
		this.textToEcho = textToEcho;
	}

	/**
	 * {@link #echoedText} accessor.
	 * @return	The value.
	 **/
	public String getEchoedText() {
		return echoedText;
	}

	/**
	 * {@link #echoedText} mutator.
	 * @param echoedText	The new value.
	 **/
	@XmlElement
	public void setEchoedText(String echoedText) {
		preset(echoedTextPropertyName, echoedText);
		this.echoedText = echoedText;
	}
}
