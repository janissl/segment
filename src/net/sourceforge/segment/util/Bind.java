package net.sourceforge.segment.util;

import static net.sourceforge.segment.util.Util.getFileInputStream;
import static net.sourceforge.segment.util.Util.getFileOutputStream;
import static net.sourceforge.segment.util.Util.getReader;
import static net.sourceforge.segment.util.Util.getWriter;
import static net.sourceforge.segment.util.Util.getXmlReader;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;

import org.xml.sax.InputSource;

public class Bind {

	private Marshaller marshaller;

	private Unmarshaller unmarshaller;

	public Bind(JAXBContext context, Schema schema) {
		try {
			unmarshaller = context.createUnmarshaller();
			unmarshaller.setEventHandler(new LoggingValidationEventHandler());
			unmarshaller.setSchema(schema);
			marshaller = context.createMarshaller();
			marshaller.setSchema(schema);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (JAXBException e) {
			throw new XmlException("JAXB error", e);
		}
	}

	public void marshal(Writer writer, Object object) {
		try {
			marshaller.marshal(object, writer);
		} catch (JAXBException e) {
			throw new XmlException("JAXB marshalling error", e);
		}
	}

	public void marshal(String fileName, Object object) {
		try {
			Writer writer = getWriter(getFileOutputStream(fileName));
			marshal(writer, object);
			writer.close();
		} catch (IOException e) {
			throw new IORuntimeException(e);
		}
	}

	public Object unmarshal(Reader reader) {
		try {
			Source source = new SAXSource(getXmlReader(), new InputSource(
					reader));
			return unmarshaller.unmarshal(source);
		} catch (JAXBException e) {
			throw new XmlException("JAXB unmarshalling error", e);
		}
	}

	public Object unmarshal(String fileName) {
		try {
			Reader reader = getReader(getFileInputStream(fileName));
			Object object = unmarshal(reader);
			reader.close();
			return object;
		} catch (IOException e) {
			throw new IORuntimeException(e);
		}
	}

}