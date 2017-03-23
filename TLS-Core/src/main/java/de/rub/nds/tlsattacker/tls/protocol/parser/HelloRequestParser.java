/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.tls.protocol.parser;

import de.rub.nds.tlsattacker.tls.constants.HandshakeMessageType;
import de.rub.nds.tlsattacker.tls.constants.ProtocolVersion;
import de.rub.nds.tlsattacker.tls.protocol.message.HelloRequestMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Robert Merget - robert.merget@rub.de
 */
public class HelloRequestParser extends HandshakeMessageParser<HelloRequestMessage> {

    private static final Logger LOGGER = LogManager.getLogger("PARSER");

     /**
     * Constructor for the Parser class
     *
     * @param pointer 
     *            Position in the array where the HandshakeMessageParser is supposed
     *            to start parsing
     * @param array
     *            The byte[] which the HandshakeMessageParser is supposed to parse
     * @param version
     *            Version of the Protocol
     */ 
    public HelloRequestParser(int pointer, byte[] array, ProtocolVersion version) {
        super(pointer, array, HandshakeMessageType.HELLO_REQUEST, version);
    }

    /**
     * Reads the next bytes as the HandshakeMessageContent and writes them in the message
     *
     * @param msg
     *            Message to write in
     */
    @Override
    protected void parseHandshakeMessageContent(HelloRequestMessage msg) {
        if (msg.getLength().getValue() != 0) {
            LOGGER.warn("Parsed HelloRequest with non-zero length! Not parsing payload.");
        }
    }

    @Override
    protected HelloRequestMessage createHandshakeMessage() {
        return new HelloRequestMessage();
    }

}
