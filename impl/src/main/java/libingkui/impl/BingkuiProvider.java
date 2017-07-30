/*
 * Copyright © 2016 libingkui and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package libingkui.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BingkuiProvider {

    private static final Logger LOG = LoggerFactory.getLogger(BingkuiProvider.class);

    private final DataBroker dataBroker;

    public BingkuiProvider(final DataBroker dataBroker) {
        this.dataBroker = dataBroker;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
        LOG.info("BingkuiProvider Session Initiated");
        System.out.println("hi libingkui!");
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
        LOG.info("BingkuiProvider Closed");
    }
}