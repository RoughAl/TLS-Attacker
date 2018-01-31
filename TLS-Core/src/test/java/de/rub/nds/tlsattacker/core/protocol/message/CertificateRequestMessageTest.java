/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2017 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.core.protocol.message;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CertificateRequestMessageTest {
    CertificateRequestMessage message;

    @Before
    public void setUp() {
        message = new CertificateRequestMessage();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class CertificateRequestMessage.
     */
    @Test
    public void testToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCertificateRequestMessage:");
        sb.append("\n  Certificate Types Count: ").append("null");
        sb.append("\n  Certificate Types: ").append("null");
        sb.append("\n  Signature Hash Algorithms Length: ").append("null");
        sb.append("\n  Signature Hash Algorithms: ").append("null");
        sb.append("\n  Distinguished Names Length: ").append("null");
        assertEquals(message.toString(), sb.toString());
    }

}
