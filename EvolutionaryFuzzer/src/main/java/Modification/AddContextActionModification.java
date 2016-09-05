/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0 http://www.apache.org/licenses/LICENSE-2.0
 */
package Modification;

import de.rub.nds.tlsattacker.tls.workflow.action.TLSAction;

/**
 * 
 * @author Robert Merget - robert.merget@rub.de
 */
public class AddContextActionModification extends Modification {
    private final TLSAction action;

    public AddContextActionModification(ModificationType type, TLSAction action) {
	super(type);
	this.action = action;
    }

    public TLSAction getAction() {
	return action;
    }

}
