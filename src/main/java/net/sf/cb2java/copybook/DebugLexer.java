/*************************************************************
 * This file is part of CB2XML.  
 * See the file "LICENSE" for copyright information and the
 * terms and conditions for copying, distribution and
 * modification of CB2XML.
 *************************************************************
 */

package net.sf.cb2java.copybook;

import java.io.PushbackReader;

import net.sf.cb2xml.sablecc.lexer.Lexer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * extension of Lexer to enable better error reporting
 * 
 * @author Peter Thomas
 */

// Made this class and its constructor public 
// This will enable project Record-Editor to invoke this class. JFG
public class DebugLexer extends Lexer {
	private static final Logger logger = LoggerFactory.getLogger(DebugLexer.class);

	private StringBuffer buffer = new StringBuffer();
	
	public StringBuffer getBuffer() {
		return buffer;
	}
	
	public DebugLexer(PushbackReader reader) {
		super(reader);
	}

	protected void filter() {
		buffer.append(token.getText());
		if (logger.isDebugEnabled()) {
			logger.debug(String.format("%s , state : %s, text : [%s]",
					token.getClass(), state.id(),
					token.getText() + "]"));
		}
	}
}