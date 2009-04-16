package net.sourceforge.segment.srx;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import net.sourceforge.segment.TextIterator;

public class SrxTextIteratorTest extends AbstractSrxTextIteratorTest {
	
	protected List<TextIterator> getTextIteratorList(String text,
			SrxDocument document, String languageCode) {
		List<TextIterator> textIteratorList = new ArrayList<TextIterator>();
		
		textIteratorList.add(new SrxTextIterator(document, languageCode, text));

		StringReader reader = new StringReader(text);
		textIteratorList.add(new SrxTextIterator(document, languageCode, reader));

		return textIteratorList;
	}

}
